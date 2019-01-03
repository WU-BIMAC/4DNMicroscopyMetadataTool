package edu.umassmed.microscopyMetadataTool.data.subElements;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WavelenghtRange extends ComponentSubElement {

	private final String waveLengthAtPeak;
	private final String lumenPower;
	private final String lowerWavelengthAtHalfPeak;
	private final String upperWavelengthAtHalfPeak;

	public WavelenghtRange() {
		this.waveLengthAtPeak = "waveLengthAtPeak";
		this.lumenPower = "lumenPower";
		this.lowerWavelengthAtHalfPeak = "lowerWavelengthAtHalfPeak";
		this.upperWavelengthAtHalfPeak = "upperWavelengthAtHalfPeak";
	}

	@Override
	public Map<String, Integer> getTiers(final Integer parentTier) {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("waveLengthAtPeak", 2);
		tiers.put("lumenPower", 3);
		tiers.put("lowerWavelengthAtHalfPeak", 5);
		tiers.put("upperWavelengthAtHalfPeak", 5);
		return tiers;
	}

	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = new ArrayList<String>();
		return notEditableField;
	}
}
