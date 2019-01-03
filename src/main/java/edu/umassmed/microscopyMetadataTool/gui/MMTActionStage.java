package edu.umassmed.microscopyMetadataTool.gui;

import javafx.scene.Scene;
import javafx.stage.Stage;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;

public class MMTActionStage extends Stage {

	private static final String STAGE_NAME = "Microscopy Metadata Tool";

	private final MMTActionPane actionPane;

	public MMTActionStage(final MMTApplication app) {

		this.setTitle(MMTActionStage.STAGE_NAME);

		this.actionPane = new MMTActionPane(app);
		
		// final int width = (MMTGUIConstants.FIELD_WIDTH_LARGE * 2)
		// + (MMTGUIConstants.PADDING * 2) + (MMTGUIConstants.GAP);
		// this.actionPane.setPrefWidth(width);
		this.setScene(new Scene(this.actionPane));
	}
}
