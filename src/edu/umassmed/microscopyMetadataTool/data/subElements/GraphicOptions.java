package edu.umassmed.microscopyMetadataTool.data.subElements;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GraphicOptions extends ComponentSubElement {
	
	private Double percentSizeWidth, percentSizeHeight;
	private Double positionX, positionY;
	
	public GraphicOptions(final Double positionX, final Double positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.percentSizeWidth = 0.2;
		this.percentSizeHeight = 0.2;
	}
	
	public Double getPercentSizeWidth() {
		return this.percentSizeWidth;
	}
	
	public void setPercentSizeWidth(final Double percentSizeWidth) {
		this.percentSizeWidth = percentSizeWidth;
	}
	
	public Double getPercentSizeHeight() {
		return this.percentSizeHeight;
	}
	
	public void setPercentSizeHeight(final Double percentSizeHeight) {
		this.percentSizeHeight = percentSizeHeight;
	}
	
	public Double getPositionX() {
		return this.positionX;
	}
	
	public void setPositionX(final Double positionX) {
		this.positionX = positionX;
	}
	
	public Double getPositionY() {
		return this.positionY;
	}
	
	public void setPositionY(final Double positionY) {
		this.positionY = positionY;
	}

	public Map<String, Integer> getTiers(final Integer parentTier) {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("positionX", parentTier);
		tiers.put("positionY", parentTier);
		tiers.put("percentSizeWidth", parentTier);
		tiers.put("percentSizeHeight", parentTier);
		return tiers;
	}

	public List<String> getNotEditableFields() {
		final List<String> notEditableField = new ArrayList<String>();
		// notEditableField.add("positionX");
		// notEditableField.add("positionY");
		return notEditableField;
	}
}
