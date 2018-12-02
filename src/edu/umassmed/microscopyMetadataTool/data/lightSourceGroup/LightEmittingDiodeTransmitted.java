package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.util.Map;

public class LightEmittingDiodeTransmitted extends LightSourceTransmittedGroup {
	
	private static Integer TIER = 1;
	
	private final String type;
	// private final String wavelengthRange;
	private final String projectionAngle;
	private final String waveLengthAtPeak;
	private final String lumenPower;
	private final String lowerWavelengthAtHalfPeak;
	private final String upperWavelengthAtHalfPeak;
	
	public LightEmittingDiodeTransmitted(final Double positionX,
			final Double positionY) {
		super("New LightEmittingDiodeTransmitted",
				LightEmittingDiodeTransmitted.TIER, positionX, positionY);

		this.type = "type";
		// this.wavelengthRange = "NA";
		this.projectionAngle = "projectionAngle";
		this.waveLengthAtPeak = "waveLengthAtPeak";
		this.lumenPower = "lumenPower";
		this.lowerWavelengthAtHalfPeak = "lowerWavelengthAtHalfPeak";
		this.upperWavelengthAtHalfPeak = "upperWavelengthAtHalfPeak";
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("type", 3);
		// tiers.put("wavelengthRange", 2);
		tiers.put("projectionAngle", 5);
		tiers.put("waveLengthAtPeak", 2);
		tiers.put("lumenPower", 3);
		tiers.put("LowerWavelengthAtHalfPeak", 5);
		tiers.put("UpperWavelengthAtHalfPeak", 5);
		return tiers;
	}
}
