package edu.umassmed.microscopyMetadataTool.gui;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Window;
import edu.umassmed.microscopyMetadataTool.core.MMTApplication;
import edu.umassmed.microscopyMetadataTool.data.Microscope;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;
import edu.umassmed.microscopyMetadataTool.data.piezoelectricFocusingGroup.PiezoelectricObjectiveFocusing;

public class MMTMicroscopeConfigurationViewPane extends StackPane {
	
	private final MMTApplication app;
	private final MMTMicroscopeViewPane viewPane;
	
	private Microscope microscope;
	
	private Double mouseClickPositionX, mouseClickPositionY;
	private Double orgSceneX, orgSceneY;
	
	public MMTMicroscopeConfigurationViewPane(final MMTApplication app,
			final MMTMicroscopeViewPane viewPane) {
		this.app = app;
		this.microscope = null;
		this.viewPane = viewPane;
		this.setPadding(new Insets(MMTGUIConstants.PADDING));
		// this.setVgap(MMTGUIConstants.GAP);
		// this.setHgap(MMTGUIConstants.GAP);
		this.setMinHeight(670);
		this.setMinWidth(784);
		this.setPrefHeight(670);
		this.setPrefWidth(784);
		this.setMaxHeight(670);
		this.setMaxWidth(784);
		if (this.microscope != null) {
			final Image img = this.microscope.getImage();
			final BackgroundSize bgSize = new BackgroundSize(100, 100, true,
					true, true, false);
			final BackgroundImage bg = new BackgroundImage(img,
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.CENTER, bgSize);
			this.setBackground(new Background(bg));
		}
		
		this.mouseClickPositionX = null;
		this.mouseClickPositionY = null;
		this.orgSceneX = null;
		this.orgSceneY = null;
		
		final ContextMenu contextMenu = new ContextMenu();
		final MenuItem addNewElement = new MenuItem("Add element");
		addNewElement.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent event) {
				viewPane.addElement(
						MMTMicroscopeConfigurationViewPane.this.mouseClickPositionX,
						MMTMicroscopeConfigurationViewPane.this.mouseClickPositionY);
			}
		});
		contextMenu.getItems().addAll(addNewElement);
		
		this.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
			@Override
			public void handle(final ContextMenuEvent event) {
				// System.out.println("setOnContextMenuRequested pane");
				final Window window = MMTMicroscopeConfigurationViewPane.this
						.getScene().getWindow();
				contextMenu.show(window, event.getScreenX(), event.getScreenY());
				MMTMicroscopeConfigurationViewPane.this.mouseClickPositionX = event
						.getX();
				MMTMicroscopeConfigurationViewPane.this.mouseClickPositionY = event
						.getY();
				event.consume();
			}
		});
	}
	
	public void configurePane(final List<MicroscopeComponent> elements) {
		// System.out.println("CONFIGURE PANE");
		this.getChildren().clear();
		Double width = this.getWidth();
		Double height = this.getHeight();
		if (width < 0.0) {
			width = 0.0;
		}
		if (height < 0.0) {
			height = 0.0;
		}
		for (final MicroscopeComponent element : elements) {
			final Double x = element.getPositionX();
			final Double y = element.getPositionY();
			final Button b = new Button("");
			final double w = width * element.getPercentSizeWidth();
			final double h = height * element.getPercentSizeHeight();
			final BackgroundSize bgSize = new BackgroundSize(w, h, false,
					false, true, false);
			final BackgroundImage bg = new BackgroundImage(element.getImage(),
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.CENTER, bgSize);
			b.setPrefSize(w, h);
			b.setBackground(new Background(bg));
			b.setOpacity(0.8);
			final ContextMenu contextMenu = new ContextMenu();
			final MenuItem removeElement = new MenuItem("Remove element");
			removeElement.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(final ActionEvent event) {
					MMTMicroscopeConfigurationViewPane.this.viewPane
							.removeElement(element);
				}
			});
			contextMenu.getItems().addAll(removeElement);
			b.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
				@Override
				public void handle(final ContextMenuEvent event) {
					// System.out.println("setOnContextMenuRequested button");
					final Window window = MMTMicroscopeConfigurationViewPane.this
							.getScene().getWindow();
					contextMenu.show(window, event.getScreenX(),
							event.getScreenY());
					event.consume();
				}
			});
			final Double y1 = height - y - b.getPrefHeight();
			final Double x1 = width - x - b.getPrefWidth();
			// FIXME workaround to set Objective in front of Piezo
			if (element instanceof PiezoelectricObjectiveFocusing) {
				this.getChildren().add(0, b);
			} else {
				this.getChildren().add(b);
			}
			final Insets insets = new Insets(y, x1, y1, x);
			StackPane.setMargin(b, insets);
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(final ActionEvent evt) {
					// System.out.println("setOnAction");
					if ((b.getUserData() == null)
							|| !((boolean) b.getUserData())) {
						MMTMicroscopeConfigurationViewPane.this.viewPane
								.editElement(element);
					}
				}
			});
			b.setOnMouseEntered(new EventHandler<MouseEvent>() {
				@Override
				public void handle(final MouseEvent event) {
					b.setOpacity(0.4);
				}

			});
			b.setOnMouseExited(new EventHandler<MouseEvent>() {
				@Override
				public void handle(final MouseEvent event) {
					b.setOpacity(0.8);
				}
			});
			b.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(final MouseEvent mouseEvent) {
					if ((mouseEvent.getButton() == MouseButton.SECONDARY)
							|| ((mouseEvent.getButton() == MouseButton.PRIMARY) && mouseEvent
									.isControlDown())) {
						
					} else {
						// System.out.println("setOnMousePressed");
						b.setBorder(new Border(new BorderStroke(Color.BLACK,
								BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
								BorderWidths.DEFAULT)));
						MMTMicroscopeConfigurationViewPane.this.orgSceneX = mouseEvent
								.getSceneX();
						MMTMicroscopeConfigurationViewPane.this.orgSceneY = mouseEvent
								.getSceneY();
						b.setCursor(Cursor.CLOSED_HAND);
						b.toFront();
					}
				}
			});
			b.setOnMouseReleased(new EventHandler<MouseEvent>() {
				@Override
				public void handle(final MouseEvent mouseEvent) {
					// System.out.println("setOnMouseReleased");
					b.setUserData(false);
					b.setBorder(null);
					b.setCursor(Cursor.HAND);
					b.toFront();
					final Double offsetX = b.getTranslateX();
					final Double offsetY = b.getTranslateY();
					if ((offsetX != 0) || (offsetY != 0)) {
						MMTMicroscopeConfigurationViewPane.this.viewPane
								.movedElement(element, b.getTranslateX(),
										b.getTranslateY());
					}
					MMTMicroscopeConfigurationViewPane.this.orgSceneX = null;
					MMTMicroscopeConfigurationViewPane.this.orgSceneY = null;
				}
			});
			b.setOnMouseDragged(new EventHandler<MouseEvent>() {
				@Override
				public void handle(final MouseEvent mouseEvent) {
					// System.out.println("setOnMouseDragged");
					if ((MMTMicroscopeConfigurationViewPane.this.orgSceneX == null)
							|| (MMTMicroscopeConfigurationViewPane.this.orgSceneY == null))
						return;
					b.setUserData(true);
					final double offsetX = mouseEvent.getSceneX()
							- MMTMicroscopeConfigurationViewPane.this.orgSceneX;
					final double offsetY = mouseEvent.getSceneY()
							- MMTMicroscopeConfigurationViewPane.this.orgSceneY;
					b.setTranslateX(offsetX);
					b.setTranslateY(offsetY);
				}
			});
			// DragResizer.makeResizable(b);
		}
	}
	
	public void setMicroscope(final Microscope mic) {
		this.microscope = mic;
		if (this.microscope != null) {
			final Image img = this.microscope.getImage();
			final BackgroundSize bgSize = new BackgroundSize(100, 100, true,
					true, true, false);
			final BackgroundImage bg = new BackgroundImage(img,
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.CENTER, bgSize);
			this.setBackground(new Background(bg));
		}
	}
}
