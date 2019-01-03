package edu.umassmed.microscopyMetadataTool.gui;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;

public class MMTOpenMicroscopePane extends GridPane {
	
	private static final String CREATE_BUTTON = "Create";
	private static final String OPEN_BUTTON = "Open";
	private static final String BACK_BUTTON = "Back";

	private final MMTApplication app;

	private final Button continueButton, backButton;
	private final ComboBox<String> startingPointCombo;

	private boolean isNew;

	public MMTOpenMicroscopePane(final MMTApplication app, final boolean isNew) {
		this.app = app;
		this.setPadding(new Insets(MMTGUIConstants.PADDING));
		this.setVgap(MMTGUIConstants.GAP);
		this.setHgap(MMTGUIConstants.GAP);
		
		this.startingPointCombo = new ComboBox<String>();
		this.startingPointCombo
				.setPrefWidth((MMTGUIConstants.FIELD_WIDTH_XLARGE * 2)
						+ MMTGUIConstants.GAP);
		this.add(this.startingPointCombo, 0, 0, 2, 1);
		
		this.backButton = new Button(MMTOpenMicroscopePane.BACK_BUTTON);
		this.backButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_SMALL);
		this.backButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent evt) {
				app.handleShowActionStage();
			}
		});
		this.add(this.backButton, 0, 1);
		
		this.isNew = isNew;
		String buttonText = MMTOpenMicroscopePane.CREATE_BUTTON;
		if (!isNew) {
			buttonText = MMTOpenMicroscopePane.OPEN_BUTTON;
		}
		this.continueButton = new Button(buttonText);
		this.continueButton.setPrefWidth(MMTGUIConstants.FIELD_WIDTH_SMALL);
		this.continueButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent evt) {
				if (MMTOpenMicroscopePane.this.startingPointCombo.getItems()
						.isEmpty())
					return;
				// TODO dialog error
				final String value = MMTOpenMicroscopePane.this.startingPointCombo
						.getValue();
				if (isNew) {
					app.createNewMicroscope(value);
				} else {
					app.openMicroscope(value);
				}
			}
		});
		this.add(this.continueButton, 1, 1);
	}

	public void setLoadableMicroscopes(final List<String> loadableMicroscopes) {
		this.startingPointCombo.getItems().clear();
		for (final String s : loadableMicroscopes) {
			this.startingPointCombo.getItems().add(s);
		}
		if (this.startingPointCombo.getItems().isEmpty())
			return;
		final String value = this.startingPointCombo.getItems().get(0);
		this.startingPointCombo.setValue(value);
	}
}
