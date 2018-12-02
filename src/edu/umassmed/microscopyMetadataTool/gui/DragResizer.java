package edu.umassmed.microscopyMetadataTool.gui;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

/**
 * BORROWED FROM:
 * http://andrewtill.blogspot.com/2012/12/dragging-to-resize-javafx-region.html
 * Modified to support all side resizing (no edges)
 *
 * <p>
 * <p>
 * {@link DragResizer} can be used to add mouse listeners to a {@link Region}
 * and make it resizable by the user by clicking and dragging the border in the
 * same way as a window.
 * <p>
 * Only height resizing is currently implemented. Usage:
 *
 * <pre>
 * DragResizer.makeResizable(myAnchorPane);
 * </pre>
 *
 * @author atill, hitchcock9307
 */
public class DragResizer {
	
	/**
	 * The margin around the control that a user can click in to start resizing
	 * the region.
	 */
	private static final int RESIZE_MARGIN = 2;
	
	private final Region region;
	
	private double y, x;
	
	private boolean initMinHeight;
	
	private short dragging = 0;
	
	private final short NOTDRAGGING = 0;
	private final short NORTH = 1;
	private final short SOUTH = 2;
	private final short EAST = 3;
	private final short WEST = 4;
	
	private DragResizer(final Region aRegion) {
		this.region = aRegion;
	}
	
	public static void makeResizable(final Region region) {
		final DragResizer resizer = new DragResizer(region);
		
		region.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(final MouseEvent event) {
				resizer.mousePressed(event);
			}
		});
		region.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(final MouseEvent event) {
				resizer.mouseDragged(event);
			}
		});
		region.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(final MouseEvent event) {
				resizer.mouseOver(event);
			}
		});
		region.setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(final MouseEvent event) {
				resizer.mouseReleased(event);
			}
		});
	}
	
	protected void mouseReleased(final MouseEvent event) {
		this.initMinHeight = false; // Reset each time
		this.dragging = this.NOTDRAGGING;
		this.region.setCursor(Cursor.DEFAULT);
	}
	
	protected void mouseOver(final MouseEvent event) {
		if (this.isInDraggableZoneS(event) || (this.dragging == this.SOUTH)) {
			this.region.setCursor(Cursor.S_RESIZE);
		} else if (this.isInDraggableZoneE(event)
				|| (this.dragging == this.EAST)) {
			this.region.setCursor(Cursor.E_RESIZE);
		} else if (this.isInDraggableZoneN(event)
				|| (this.dragging == this.NORTH)) {
			this.region.setCursor(Cursor.N_RESIZE);
		} else if (this.isInDraggableZoneW(event)
				|| (this.dragging == this.WEST)) {
			this.region.setCursor(Cursor.W_RESIZE);
		} else {
			this.region.setCursor(Cursor.DEFAULT);
		}
	}
	
	private boolean isInDraggableZoneN(final MouseEvent event) {
		return event.getY() < DragResizer.RESIZE_MARGIN;
	}
	
	private boolean isInDraggableZoneW(final MouseEvent event) {
		return event.getX() < DragResizer.RESIZE_MARGIN;
	}
	
	private boolean isInDraggableZoneS(final MouseEvent event) {
		return event.getY() > (this.region.getHeight() - DragResizer.RESIZE_MARGIN);
	}
	
	private boolean isInDraggableZoneE(final MouseEvent event) {
		return event.getX() > (this.region.getWidth() - DragResizer.RESIZE_MARGIN);
	}
	
	private void mouseDragged(final MouseEvent event) {
		if (this.dragging == this.SOUTH) {
			this.region.setMinHeight(event.getY());
		} else if (this.dragging == this.EAST) {
			this.region.setMinWidth(event.getX());
		} else if (this.dragging == this.NORTH) {
			final double prevMin = this.region.getMinHeight();
			this.region.setMinHeight(this.region.getMinHeight() - event.getY());
			if (this.region.getMinHeight() < this.region.getPrefHeight()) {
				this.region.setMinHeight(this.region.getPrefHeight());
				this.region.setTranslateY(this.region.getTranslateY()
						- (this.region.getPrefHeight() - prevMin));
				return;
			}
			if ((this.region.getMinHeight() > this.region.getPrefHeight())
					|| (event.getY() < 0)) {
				this.region.setTranslateY(this.region.getTranslateY()
						+ event.getY());
			}
		} else if (this.dragging == this.WEST) {
			final double prevMin = this.region.getMinWidth();
			this.region.setMinWidth(this.region.getMinWidth() - event.getX());
			if (this.region.getMinWidth() < this.region.getPrefWidth()) {
				this.region.setMinWidth(this.region.getPrefWidth());
				this.region.setTranslateX(this.region.getTranslateX()
						- (this.region.getPrefWidth() - prevMin));
				return;
			}
			if ((this.region.getMinWidth() > this.region.getPrefWidth())
					|| (event.getX() < 0)) {
				this.region.setTranslateX(this.region.getTranslateX()
						+ event.getX());
			}
		}
		
	}
	
	private void mousePressed(final MouseEvent event) {
		// ignore clicks outside of the draggable margin
		if (this.isInDraggableZoneE(event)) {
			this.dragging = this.EAST;
		} else if (this.isInDraggableZoneS(event)) {
			this.dragging = this.SOUTH;
		} else if (this.isInDraggableZoneN(event)) {
			this.dragging = this.NORTH;
		} else if (this.isInDraggableZoneW(event)) {
			this.dragging = this.WEST;
		} else
			return;
		
		// make sure that the minimum height is set to the current height once,
		// setting a min height that is smaller than the current height will
		// have no effect
		if (!this.initMinHeight) {
			this.region.setMinHeight(this.region.getHeight());
			this.region.setMinWidth(this.region.getWidth());
			this.initMinHeight = true;
		}
		
	}
}