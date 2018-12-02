package edu.umassmed.microscopyMetadataTool.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import edu.umassmed.microscopyMetadataTool.data.GenericElement;
import edu.umassmed.microscopyMetadataTool.data.Microscope;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;
import edu.umassmed.microscopyMetadataTool.gui.MMTActionStage;
import edu.umassmed.microscopyMetadataTool.gui.MMTMicroscopeViewStage;
import edu.umassmed.microscopyMetadataTool.gui.MMTOpenMicroscopeStage;

public class MMTApplication extends Application {
	
	private Stage primaryStage;
	
	private final MMTActionStage actionStage;
	private final MMTOpenMicroscopeStage newMicroscopeStage;
	private final MMTOpenMicroscopeStage openMicroscopeStage;
	private final MMTMicroscopeViewStage microscopeViewStage;
	// private final MicroscopeSetupStage microscopeSetupStage;
	
	private boolean started;
	
	final List<MicroscopeComponent> elements;
	
	private final MicroscopeExporter exporter;
	private final MicroscopeImporter importer;
	
	private static final String CREATE_NEW = "Create from scratch";
	
	// private static int SEP_COUNTER = 0;
	// private static int CONN_COUNTER = 0;
	
	private Map<String, String> defaultMicroscopesPaths;
	private Map<String, String> loadableMicroscopesPaths;
	
	private Microscope microscope;
	
	private Integer selectedTier;
	
	public MMTApplication() {
		
		this.actionStage = new MMTActionStage(this);
		this.newMicroscopeStage = new MMTOpenMicroscopeStage(this, true);
		this.openMicroscopeStage = new MMTOpenMicroscopeStage(this, false);
		this.microscopeViewStage = new MMTMicroscopeViewStage(this);
		
		this.started = true;
		
		this.elements = new ArrayList<MicroscopeComponent>();
		
		// this.savedMicroscopesNames = this.loadSavedMicroscopesNames();
		
		this.microscope = null;
		
		this.exporter = new MicroscopeExporter();
		this.importer = new MicroscopeImporter();
		// this.initDebug();
		
		// this.newMicroscopeStage.setLoadableMicroscopes(defaultMicroscopesPaths);
		
		// this.openMicroscopeStage.setLoadableMicroscopes(loadableMicroscopes);
	}
	
	public void export() {
		this.exporter.exportMicroscope(this.microscope, this.elements);
	}
	
	private Map<String, String> loadSavedMicroscopes(final String folder)
			throws IOException {
		final Map<String, String> microscopesNames = new LinkedHashMap<String, String>();
		final File dir = new File(System.getProperty("user.dir")
				+ File.separator + folder);
		for (final File micDir : dir.listFiles()) {
			for (final File f : micDir.listFiles()) {
				final int index = f.getName().lastIndexOf(".");
				final String fileName = f.getName().substring(0, index);
				if (!micDir.getName().equals(fileName)) {
					continue;
				}
				String micName = null;
				final FileReader fr = new FileReader(f);
				final BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				while (line != null) {
					if (line.isEmpty()) {
						line = br.readLine();
						continue;
					}
					final String[] tokens = line.split("=");
					final String key = tokens[0];
					final String value = tokens[1];
					if (key.equals("name")) {
						micName = value;
					}
					line = br.readLine();
				}
				br.close();
				fr.close();
				microscopesNames.put(micName, micDir.getAbsolutePath());
			}
		}
		return microscopesNames;
	}
	
	public List<Class<? extends GenericElement>> getAvailableComponents() {
		final List<Class<? extends GenericElement>> availableComponents = new ArrayList<Class<? extends GenericElement>>();
		
		final List<Class<? extends MicroscopeComponent>> classes = ClassUtils
				.getAllComponentsClasses();
		for (final Class<? extends MicroscopeComponent> clazz : classes) {
			Field field = null;
			try {
				field = clazz.getDeclaredField("TIER");
			} catch (final Exception ex) {
				
			}
			if (field != null) {
				field.setAccessible(true);
				Object value = null;
				try {
					value = field.get(clazz);
				} catch (final IllegalArgumentException ex) {
					
				} catch (final IllegalAccessException ex) {
					
				}
				final String valS = String.valueOf(value);
				final Integer val = Integer.valueOf(valS);
				if (val <= this.selectedTier) {
					availableComponents.add(clazz);
				}
			}
		}
		
		return availableComponents;
	}
	
	public Stage getPrimaryStage() {
		return this.primaryStage;
	}
	
	public static void main(final String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(final Stage primaryStage) {
		if (this.started) {
			this.started = false;
			this.primaryStage = this.actionStage;
		} else {
			this.primaryStage.close();
			this.primaryStage = primaryStage;
		}
		this.primaryStage.show();
	}
	
	// public void center(final AutoFocus stage) {
	// final Screen screen = Screen.getPrimary();
	// final Rectangle2D bounds = screen.getVisualBounds();
	//
	// stage.setWidth(MMTGUIConstants.GUI_WIDTH);
	// stage.setHeight(MMTGUIConstants.GUI_HEIGHT);
	//
	// stage.setX((bounds.getWidth() / 2) - (MMTGUIConstants.GUI_WIDTH / 2));
	// stage.setY((bounds.getHeight() / 2) - (MMTGUIConstants.GUI_HEIGHT / 2));
	// }
	
	public void handleShowActionStage() {
		if (this.primaryStage != this.actionStage) {
			this.start(this.actionStage);
		}
	}
	
	public void handleShowNewMicroscopeStage() {
		if (this.primaryStage != this.newMicroscopeStage) {
			try {
				this.defaultMicroscopesPaths = this
						.loadSavedMicroscopes("templateMicroscopes");
			} catch (final IOException ex) {
				// TODO error
				this.defaultMicroscopesPaths = new LinkedHashMap<String, String>();
				// ex.printStackTrace();
			}
			final List<String> loadableMicroscopes = new ArrayList<String>();
			for (final String microscopeName : this.defaultMicroscopesPaths
					.keySet()) {
				loadableMicroscopes.add(microscopeName);
			}
			loadableMicroscopes.add(MMTApplication.CREATE_NEW);
			this.newMicroscopeStage.setLoadableMicroscopes(loadableMicroscopes);
			this.start(this.newMicroscopeStage);
		}
	}
	
	public void handleShowOpenMicroscopeStage() {
		if (this.primaryStage != this.openMicroscopeStage) {
			try {
				this.loadableMicroscopesPaths = this
						.loadSavedMicroscopes("savedMicroscopes");
			} catch (final IOException ex) {
				// TODO error
				this.loadableMicroscopesPaths = new LinkedHashMap<String, String>();
				// ex.printStackTrace();
			}
			final List<String> loadableMicroscopes = new ArrayList<String>();
			for (final String microscopeName : this.loadableMicroscopesPaths
					.keySet()) {
				loadableMicroscopes.add(microscopeName);
			}
			this.openMicroscopeStage
					.setLoadableMicroscopes(loadableMicroscopes);
			this.start(this.openMicroscopeStage);
		}
	}
	
	public void handleShowMicroscopeViewStage() {
		if ((this.primaryStage != this.microscopeViewStage)) {
			this.start(this.microscopeViewStage);
		} else {
			this.start(this.microscopeViewStage);
		}
		this.microscopeViewStage.configurePane(this.elements);
	}
	
	public void updateElementsAndPositions(
			final List<MicroscopeComponent> elements) {
		this.elements.clear();
		this.elements.addAll(elements);
		
		this.microscopeViewStage.configurePane(this.elements);
	}
	
	public void setSelectedTier(final int tier) {
		this.selectedTier = tier;
	}
	
	public void openMicroscope(final String value) {
		final String path = this.loadableMicroscopesPaths.get(value);
		final List<MicroscopeComponent> loadedElements = new ArrayList<MicroscopeComponent>();
		final Microscope loadedMic = this.importer.importMicroscope(path,
				loadedElements);
		this.elements.clear();
		if (loadedMic.getTier() != this.selectedTier) {
			final Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("MMT - Open microscope with different tier");
			alert.setHeaderText(null);
			alert.setContentText("Microscope " + loadedMic.getName()
					+ " has tier " + loadedMic.getTier()
					+ " while you have selected tier " + this.selectedTier
					+ ". Continue?");
			final Optional<ButtonType> result = alert.showAndWait();
			if (result.get() != ButtonType.OK)
				return;
			for (final MicroscopeComponent element : loadedElements) {
				if (element.getTier() <= this.selectedTier) {
					this.elements.add(element);
				}
			}
		} else {
			this.elements.addAll(loadedElements);
		}
		
		this.microscope = loadedMic;
		this.microscope.setTier(this.selectedTier);
		this.microscopeViewStage.setMicroscope(this.microscope);
		this.handleShowMicroscopeViewStage();
	}
	
	public void createNewMicroscope(final String value) {
		final List<MicroscopeComponent> loadedElements = new ArrayList<MicroscopeComponent>();
		Microscope loadedMic = null;
		if (value.equals(MMTApplication.CREATE_NEW)) {
			loadedMic = new Microscope();
			loadedMic.setTier(this.selectedTier);
		} else {
			final String path = this.defaultMicroscopesPaths.get(value);
			loadedMic = this.importer.importMicroscope(path, loadedElements);
		}
		this.elements.clear();
		if (loadedMic.getTier() != this.selectedTier) {
			final Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("MMT - Create microscope with different tier");
			alert.setHeaderText(null);
			alert.setContentText("Microscope " + loadedMic.getName()
					+ " has tier " + loadedMic.getTier()
					+ " while you have selected tier " + this.selectedTier
					+ ". Continue?");
			final Optional<ButtonType> result = alert.showAndWait();
			if (result.get() != ButtonType.OK)
				return;
			for (final MicroscopeComponent element : loadedElements) {
				if (element.getTier() <= this.selectedTier) {
					this.elements.add(element);
				}
			}
		} else {
			this.elements.addAll(loadedElements);
		}
		this.microscope = loadedMic;
		this.microscope.setTier(this.selectedTier);
		this.microscopeViewStage.setMicroscope(this.microscope);
		this.handleShowMicroscopeViewStage();
		
	}
}
