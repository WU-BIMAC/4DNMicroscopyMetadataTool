package edu.umassmed.microscopyMetadataTool.gui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Window;
import javafx.util.Callback;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;
import edu.umassmed.microscopyMetadataTool.data.GenericElement;
import edu.umassmed.microscopyMetadataTool.data.Microscope;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public class MMTMicroscopeViewPane extends BorderPane {

	private static final String BACK_BUTTON = "Back";
	private static final String EDIT_ON_BUTTON = "Edit on";
	private static final String EDIT_OFF_BUTTON = "Edit off";
	private static final String SAVE_BUTTON = "Save";

	protected final MMTApplication app;
	private final MMTMicroscopeConfigurationViewPane configViewPane;

	private final Button backButton;
	// private final Button editButton;
	private final Button saveButton;

	private final List<MicroscopeComponent> elements;

	private Microscope mic;

	private final Map<String, Map<String, TextField>> micFieldsMap;

	public MMTMicroscopeViewPane(final MMTApplication app) {
		this.app = app;

		this.mic = null;

		this.elements = new ArrayList<MicroscopeComponent>();

		this.micFieldsMap = new LinkedHashMap<String, Map<String, TextField>>();
		;

		this.setPadding(new Insets(MMTGUIConstants.PADDING));

		final FlowPane tp = this.createMicroscopeTabPane();

		final GridPane bottomPane = new GridPane();
		// bottomPane.setBorder(new Border(new BorderStroke(Color.BLACK,
		// BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
		// BorderWidths.DEFAULT)));
		bottomPane.setPadding(new Insets(MMTGUIConstants.PADDING));
		bottomPane.setVgap(MMTGUIConstants.GAP);
		bottomPane.setHgap(MMTGUIConstants.GAP);
		this.backButton = new Button(MMTMicroscopeViewPane.BACK_BUTTON);
		this.backButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_SMALL);
		this.backButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent evt) {
				app.handleShowActionStage();
			}
		});
		bottomPane.add(this.backButton, 0, 0);

		final Pane spacer = new Pane();
		GridPane.setHgrow(spacer, Priority.ALWAYS);
		spacer.setMinWidth(MMTGUIConstants.FIELD_WIDTH_NORMAL);
		// spacer.setPrefWidth(MMTGUIConstants.BUTTON_WIDTH_NORMAL);
		bottomPane.add(spacer, 1, 0);

		// this.editButton = new Button(MMTMicroscopeViewPane.EDIT_ON_BUTTON);
		// this.editButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_SMALL);
		// this.editButton.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(final ActionEvent evt) {
		// if (MMTMicroscopeViewPane.this.editButton.getText().equals(
		// MMTMicroscopeViewPane.EDIT_OFF_BUTTON)) {
		// MMTMicroscopeViewPane.this.editButton
		// .setText(MMTMicroscopeViewPane.EDIT_ON_BUTTON);
		// app.handleShowMicroscopeViewStage(false);
		// } else {
		// MMTMicroscopeViewPane.this.editButton
		// .setText(MMTMicroscopeViewPane.EDIT_OFF_BUTTON);
		// app.handleShowMicroscopeViewStage(true);
		// }
		// }
		// });
		// bottomPane.add(this.editButton, 2, 0);

		this.saveButton = new Button(MMTMicroscopeViewPane.SAVE_BUTTON);
		this.saveButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_SMALL);
		this.saveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent evt) {
				final Map<String, Map<String, String>> results = new LinkedHashMap<String, Map<String, String>>();
				for (final String key : MMTMicroscopeViewPane.this.micFieldsMap
						.keySet()) {
					final Map<String, String> localResults = new LinkedHashMap<String, String>();
					final Map<String, TextField> localMicFieldsMap = MMTMicroscopeViewPane.this.micFieldsMap
							.get(key);
					for (final String desc : localMicFieldsMap.keySet()) {
						localResults.put(desc, localMicFieldsMap.get(desc)
								.getText());
					}
					results.put(key, localResults);
				}
				MMTMicroscopeViewPane.this.mic.setFields(results);
				app.export();
				final Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("MMT - Save complete");
				alert.setHeaderText(null);
				alert.setContentText("Microscope "
						+ MMTMicroscopeViewPane.this.mic.getName()
						+ " was succesfully saved");
				alert.showAndWait();
			}
		});
		bottomPane.add(this.saveButton, 2, 0);

		this.configViewPane = new MMTMicroscopeConfigurationViewPane(app, this);
		final ScrollPane sp = new ScrollPane();
		final BorderPane bp = new BorderPane();
		bp.setCenter(this.configViewPane);
		sp.setContent(bp);

		this.setTop(tp);
		this.setCenter(sp);
		this.setBottom(bottomPane);

		// final InvalidationListener listener = new InvalidationListener() {
		// @Override
		// public void invalidated(final Observable o) {
		// // MMTMicroscopeViewPane.this.createMicroscopeTabPane();
		// MMTMicroscopeViewPane.this.configViewPane.configurePane(
		// MMTMicroscopeViewPane.this.elements,
		// MMTMicroscopeViewPane.this.isEditing);
		// }
		// };
		// this.widthProperty().addListener(listener);
		// this.heightProperty().addListener(listener);
	}

	public void configurePane(final List<MicroscopeComponent> elements) {
		this.elements.clear();
		this.elements.addAll(elements);
		this.configViewPane.configurePane(elements);
	}

	// TODO maybe refactor below in app/core ?

	public void editElement(final MicroscopeComponent element) {
		final Window window = this.getScene().getWindow();
		final String title = "Edit " + element.getName();
		element.getFields();
		final Dialog<Map<String, Map<String, String>>> dialog = this
				.getEditDialog(window, title, element);
		dialog.showAndWait();
		final Map<String, Map<String, String>> results = dialog.getResult();
		if (results != null) {
			element.setFields(results);
			this.app.updateElementsAndPositions(MMTMicroscopeViewPane.this.elements);
		}
	}

	private Dialog<Map<String, Map<String, String>>> getEditDialog(
			final Window owner, final String title,
			final MicroscopeComponent element) {
		final Map<String, Integer> fieldTier = element.getTiers();
		final Map<String, Map<String, String>> contents = element.getFields();
		final Map<String, Map<String, TextField>> fields = new LinkedHashMap<String, Map<String, TextField>>();
		final Dialog<Map<String, Map<String, String>>> dialog = new Dialog<Map<String, Map<String, String>>>();
		dialog.setTitle(title);
		dialog.initOwner(owner);
		dialog.getDialogPane().getButtonTypes()
				.addAll(ButtonType.FINISH, ButtonType.CANCEL);
		final Integer tier = this.mic.getTier();
		final TabPane tabPane = new TabPane();
		
		for (final String key : contents.keySet()) {
			final Map<String, TextField> localFields = new LinkedHashMap<String, TextField>();
			final Map<String, String> contentsFields = contents.get(key);
			if (contentsFields.isEmpty()) {
				continue;
			}
			final ScrollPane sp = new ScrollPane();
			final FlowPane flowPane = new FlowPane();
			flowPane.setPrefWidth((((MMTGUIConstants.FIELD_WIDTH_XLARGE * 2) + 5) * 2) + 20);
			sp.setContent(flowPane);
			flowPane.setPadding(new Insets(MMTGUIConstants.PADDING));
			flowPane.setVgap(MMTGUIConstants.GAP);
			flowPane.setHgap(MMTGUIConstants.GAP);
			for (final String desc : contentsFields.keySet()) {
				if (fieldTier.containsKey(desc) && (fieldTier.get(desc) > tier)) {
					continue;
				}
				final String val = contentsFields.get(desc);
				final FlowPane fp = new FlowPane();
				fp.setPrefSize((MMTGUIConstants.FIELD_WIDTH_XLARGE * 2) + 5,
						MMTGUIConstants.FIELD_HEIGHT);
				String d1 = desc.substring(0, 1);
				final String d2 = desc.substring(1, desc.length());
				d1 = d1.toUpperCase();
				final String d = d1 + d2;
				final Label lbl = new Label(d + ": ");
				lbl.setPrefSize(MMTGUIConstants.FIELD_WIDTH_XLARGE,
						MMTGUIConstants.FIELD_HEIGHT);
				final TextField textField = new TextField(val);
				if (desc.contains("position") || desc.contains("percent")) {
					textField.focusedProperty().addListener(
							new ChangeListener<Boolean>() {
								@Override
								public void changed(
										final ObservableValue<? extends Boolean> observable,
										final Boolean oldValue,
										final Boolean newValue) {

									if (!newValue) {
										try {
											Double.valueOf(textField.getText());
										} catch (final Exception ex) {
											final String oldContent = (String) textField
													.getUserData();
											textField.setText(oldContent);
										}
									} else {
										textField.setUserData(textField
												.getText());
									}
								}
							});
				}
				if (element.getNotEditableFields().contains(desc)) {
					textField.setEditable(false);
				}
				textField.setPrefSize(MMTGUIConstants.FIELD_WIDTH_XLARGE,
						MMTGUIConstants.FIELD_HEIGHT);
				localFields.put(desc, textField);
				fp.getChildren().add(lbl);
				fp.getChildren().add(textField);
				flowPane.getChildren().add(fp);
			}
			fields.put(key, localFields);
			if (flowPane.getChildren().isEmpty()) {
				continue;
			}
			final Tab tab = new Tab();
			tab.setText(key);
			tab.setClosable(false);
			tab.setContent(sp);
			tabPane.getTabs().add(tab);
		}
		
		final double width = (((MMTGUIConstants.FIELD_WIDTH_XLARGE * 2) + 5) * 2) + 60;
		final double height = MMTGUIConstants.FIELD_HEIGHT * 13;
		tabPane.setPrefHeight(height);
		tabPane.setPrefWidth(width);
		
		dialog.getDialogPane().setContent(tabPane);
		dialog.setResultConverter(new Callback<ButtonType, Map<String, Map<String, String>>>() {
			@Override
			public Map<String, Map<String, String>> call(final ButtonType param) {
				if (param == ButtonType.FINISH) {
					final Map<String, Map<String, String>> results = new LinkedHashMap<String, Map<String, String>>();
					for (final String key : fields.keySet()) {
						final Map<String, String> localResults = new LinkedHashMap<String, String>();
						final Map<String, TextField> localFields = fields
								.get(key);
						for (final String desc : localFields.keySet()) {
							localResults.put(desc, localFields.get(desc)
									.getText());
						}
						results.put(key, localResults);
					}
					return results;
				}
				return null;
			}
		});
		return dialog;
	}

	public void movedElement(final MicroscopeComponent element,
			final Double movX, final Double movY) {
		final Double x = element.getPositionX() + movX;
		final Double y = element.getPositionY() + movY;
		// System.out.println(element.getPositionX() + " + " + movX + " - "
		// + element.getPositionY() + " + " + movY);
		element.setPositionX(x);
		element.setPositionY(y);
		this.app.updateElementsAndPositions(MMTMicroscopeViewPane.this.elements);
	}

	public void removeElement(final MicroscopeComponent element) {
		this.elements.remove(element);
		this.app.updateElementsAndPositions(MMTMicroscopeViewPane.this.elements);
	}

	public void addElement(final Double x, final Double y) {
		final Window window = this.getScene().getWindow();
		final String title = "Add new element";
		final Dialog<MicroscopeComponent> dialog = this.getNewElementDialog(
				window, title, x, y);
		dialog.showAndWait();
		final MicroscopeComponent result = dialog.getResult();

		if (result != null) {
			this.elements.add(result);
			this.app.updateElementsAndPositions(MMTMicroscopeViewPane.this.elements);
			this.editElement(result);
		}
	}

	private Dialog<MicroscopeComponent> getNewElementDialog(final Window owner,
			final String title, final Double x, final Double y) {
		final Dialog<MicroscopeComponent> dialog = new Dialog<MicroscopeComponent>();
		dialog.setTitle(title);
		dialog.initOwner(owner);
		dialog.getDialogPane().getButtonTypes()
				.addAll(ButtonType.FINISH, ButtonType.CANCEL);
		final FlowPane pane = new FlowPane();
		final ComboBox<String> combo = new ComboBox<String>();
		final List<Class<? extends GenericElement>> availableComponents = this.app
				.getAvailableComponents();
		for (final Class<? extends GenericElement> clazz : availableComponents) {
			combo.getItems().add(clazz.getSimpleName());
		}
		if (availableComponents.size() > 0) {
			combo.setValue(combo.getItems().get(0));
		}
		pane.getChildren().add(new Label("Select element to add: "));
		pane.getChildren().add(combo);
		dialog.getDialogPane().setContent(pane);
		dialog.setResultConverter(new Callback<ButtonType, MicroscopeComponent>() {
			@Override
			public MicroscopeComponent call(final ButtonType param) {
				if (param == ButtonType.FINISH) {
					for (final Class<? extends GenericElement> clazz : availableComponents) {
						if (clazz.getSimpleName().equals(combo.getValue())) {
							try {
								return (MicroscopeComponent) clazz
										.getConstructor(
												new Class[] { Double.class,
														Double.class })
										.newInstance(x, y);
							} catch (final Exception ex) {
								ex.printStackTrace();
							}
						}
					}
				}
				return null;
			}
		});
		return dialog;
	}

	public void setMicroscope(final Microscope mic) {
		this.mic = mic;
		final FlowPane tp = this.createMicroscopeTabPane();
		this.setTop(tp);
		this.setCenter(this.getCenter());
		this.setBottom(this.getBottom());
		this.configViewPane.setMicroscope(mic);
	}

	private FlowPane createMicroscopeTabPane() {
		final FlowPane flowPane = new FlowPane();
		flowPane.setPadding(new Insets(MMTGUIConstants.PADDING));
		flowPane.setVgap(MMTGUIConstants.GAP);
		flowPane.setHgap(MMTGUIConstants.GAP);
		this.micFieldsMap.clear();
		if (this.mic == null)
			return flowPane;
		final Map<String, Integer> fieldTier = this.mic.getTiers();
		final Map<String, Map<String, String>> localMicFields = this.mic
				.getFields();
		for (final String key : localMicFields.keySet()) {
			final Map<String, TextField> localMicFieldsMap = new LinkedHashMap<String, TextField>();
			final Map<String, String> contentsFields = localMicFields.get(key);
			for (final String desc : contentsFields.keySet()) {
				if (fieldTier.containsKey(desc)
						&& (fieldTier.get(desc) > this.mic.getTier())) {
					continue;
				}
				final String val = contentsFields.get(desc);
				final FlowPane fp = new FlowPane();
				fp.setPrefSize((MMTGUIConstants.FIELD_WIDTH_XLARGE * 2) + 5,
						MMTGUIConstants.FIELD_HEIGHT);
				String d1 = desc.substring(0, 1);
				final String d2 = desc.substring(1, desc.length());
				d1 = d1.toUpperCase();
				final String d = d1 + d2;
				final Label lbl = new Label(d + ": ");
				lbl.setPrefSize(MMTGUIConstants.FIELD_WIDTH_XLARGE,
						MMTGUIConstants.FIELD_HEIGHT);
				final TextField textField = new TextField(val);
				if (this.mic.getNotEditableFields().contains(desc)) {
					textField.setEditable(false);
				}
				textField.setPrefSize(MMTGUIConstants.FIELD_WIDTH_XLARGE,
						MMTGUIConstants.FIELD_HEIGHT);
				localMicFieldsMap.put(desc, textField);
				fp.getChildren().add(lbl);
				fp.getChildren().add(textField);
				flowPane.getChildren().add(fp);
			}
			this.micFieldsMap.put(key, localMicFieldsMap);
		}
		return flowPane;
	}
}
