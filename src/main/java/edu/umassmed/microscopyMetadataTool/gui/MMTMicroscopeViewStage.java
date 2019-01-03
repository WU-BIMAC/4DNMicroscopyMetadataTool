package edu.umassmed.microscopyMetadataTool.gui;

import java.util.List;

import javafx.scene.Scene;
import javafx.stage.Stage;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;
import edu.umassmed.microscopyMetadataTool.data.Microscope;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public class MMTMicroscopeViewStage extends Stage {
	
	private static final String STAGE_NAME = "MMT - Edit the microscope";
	
	private final MMTMicroscopeViewPane microscopeViewPane;
	
	public MMTMicroscopeViewStage(final MMTApplication app) {

		this.setTitle(MMTMicroscopeViewStage.STAGE_NAME);

		this.microscopeViewPane = new MMTMicroscopeViewPane(app);

		this.setScene(new Scene(this.microscopeViewPane));
	}
	
	public void configurePane(final List<MicroscopeComponent> elements) {
		this.microscopeViewPane.configurePane(elements);
	}

	public void setMicroscope(final Microscope mic) {
		this.microscopeViewPane.setMicroscope(mic);
	}
}
