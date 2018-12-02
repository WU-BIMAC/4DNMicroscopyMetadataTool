package edu.umassmed.microscopyMetadataTool.gui;

import java.util.List;

import javafx.scene.Scene;
import javafx.stage.Stage;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;

public class MMTOpenMicroscopeStage extends Stage {

	private static final String STAGE_NAME = "MMT - Create new microscope";

	private final MMTOpenMicroscopePane newMicPane;

	public MMTOpenMicroscopeStage(final MMTApplication app, final boolean isNew) {

		this.setTitle(MMTOpenMicroscopeStage.STAGE_NAME);

		this.newMicPane = new MMTOpenMicroscopePane(app, isNew);
		
		// final int width = (MMTGUIConstants.FIELD_WIDTH_LARGE * 2)
		// + (MMTGUIConstants.PADDING * 2) + (MMTGUIConstants.GAP);
		// this.actionPane.setPrefWidth(width);
		this.setScene(new Scene(this.newMicPane));
	}

	public void setLoadableMicroscopes(final List<String> loadableMicroscopes) {
		this.newMicPane.setLoadableMicroscopes(loadableMicroscopes);
	}
}
