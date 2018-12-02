package edu.umassmed.microscopyMetadataTool.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;

public class MMTActionPane extends GridPane {
	
	private static final String CREATE_BUTTON = "Create a new Microscope";
	private static final String USE_BUTTON = "Use a Microscope";

	private final MMTApplication app;

	private final Button createButton, useButton;
	private final ComboBox<String> tiersCombo;

	public MMTActionPane(final MMTApplication app) {
		this.app = app;
		this.setPadding(new Insets(MMTGUIConstants.PADDING));
		this.setVgap(MMTGUIConstants.GAP);
		this.setHgap(MMTGUIConstants.GAP);
		
		this.tiersCombo = new ComboBox<String>();
		this.tiersCombo.getItems().add("Tier 1");
		this.tiersCombo.getItems().add("Tier 2");
		this.tiersCombo.getItems().add("Tier 3");
		this.tiersCombo.getItems().add("Tier 4");
		this.tiersCombo.getItems().add("Tier 5");
		this.tiersCombo.setPrefWidth((MMTGUIConstants.FIELD_WIDTH_XLARGE * 2)
				+ MMTGUIConstants.GAP);
		this.tiersCombo.setValue("Tier 1");
		this.add(this.tiersCombo, 0, 0, 2, 1);
		
		this.createButton = new Button(MMTActionPane.CREATE_BUTTON);
		this.createButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_XLARGE);
		this.createButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent evt) {
				final Integer tier = MMTActionPane.this.tiersCombo.getItems()
						.indexOf(MMTActionPane.this.tiersCombo.getValue()) + 1;
				app.setSelectedTier(tier);
				app.handleShowNewMicroscopeStage();
			}
		});
		this.add(this.createButton, 0, 1);
		
		this.useButton = new Button(MMTActionPane.USE_BUTTON);
		this.useButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_XLARGE);
		this.useButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent evt) {
				final Integer tier = MMTActionPane.this.tiersCombo.getItems()
						.indexOf(MMTActionPane.this.tiersCombo.getValue()) + 1;
				app.setSelectedTier(tier);
				app.handleShowOpenMicroscopeStage();
			}
		});
		this.add(this.useButton, 1, 1);
	}
}
