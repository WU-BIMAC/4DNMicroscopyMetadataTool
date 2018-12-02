package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.util.Map;

public class CMOS extends CameraGroup {

	public static Integer TIER = 2;

	private final String type;

	public CMOS(final Double positionX, final Double positionY) {
		super("New CMOS", CMOS.TIER, positionX, positionY);

		this.type = "type";

		this.setPercentSizeWidth(0.19);
		this.setPercentSizeHeight(0.46);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 3);
		return tiers;
	}

	public static Integer getStaticTier() {
		return CMOS.TIER;
	}
}
