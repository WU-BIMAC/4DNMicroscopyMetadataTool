package edu.umassmed.microscopyMetadataTool.data;

import java.util.List;
import java.util.Map;

import javafx.scene.image.Image;
import edu.umassmed.microscopyMetadataTool.data.subElements.GraphicOptions;

public abstract class MicroscopeComponent extends GenericElement {

	private final GraphicOptions graphicOptions;

	public MicroscopeComponent(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier);

		this.graphicOptions = new GraphicOptions(positionX, positionY);
	}

	public abstract Image getImage();

	public Double getPercentSizeWidth() {
		return this.graphicOptions.getPercentSizeWidth();
	}

	public void setPercentSizeWidth(final Double percentSizeWidth) {
		this.graphicOptions.setPercentSizeWidth(percentSizeWidth);
	}

	public Double getPercentSizeHeight() {
		return this.graphicOptions.getPercentSizeHeight();
	}

	public void setPercentSizeHeight(final Double percentSizeHeight) {
		this.graphicOptions.setPercentSizeHeight(percentSizeHeight);
	}

	public Double getPositionX() {
		return this.graphicOptions.getPositionX();
	}

	public void setPositionX(final Double positionX) {
		this.graphicOptions.setPositionX(positionX);
	}

	public Double getPositionY() {
		return this.graphicOptions.getPositionY();
	}

	public void setPositionY(final Double positionY) {
		this.graphicOptions.setPositionY(positionY);
		;
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.putAll(this.graphicOptions.getTiers(this.getTier()));
		return tiers;
	}

	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = super.getNotEditableFields();
		this.graphicOptions.getNotEditableFields();
		return notEditableField;
	}
}
