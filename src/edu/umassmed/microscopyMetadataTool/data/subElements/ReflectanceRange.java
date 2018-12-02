package edu.umassmed.microscopyMetadataTool.data.subElements;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReflectanceRange extends ComponentSubElement {
	
	private final String cutOn;
	private final String cutOff;
	private final String cutOnTolerance;
	private final String cutOffTolerance;
	
	public ReflectanceRange() {
		this.cutOn = "cutOn";
		this.cutOff = "cutOff";
		this.cutOnTolerance = "cutOnTolerance";
		this.cutOffTolerance = "cutOffTolerance";
	}
	
	@Override
	public Map<String, Integer> getTiers(final Integer parentTier) {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("cutOn", 3);
		tiers.put("cutOff", 3);
		tiers.put("cutOnTolerance", 5);
		tiers.put("cutOffTolerance", 5);
		return tiers;
	}
	
	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = new ArrayList<String>();
		// notEditableField.add("positionX");
		// notEditableField.add("positionY");
		return notEditableField;
	}
}
