package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.util.Map;

public class FilamentTransmitted extends LightSourceTransmittedGroup {
	
	private static Integer TIER = 3;

	private final String type;
	
	public FilamentTransmitted(final Double positionX, final Double positionY) {
		super("New FilamentTransmitted", FilamentTransmitted.TIER, positionX,
				positionY);

		this.type = "type";
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 3);
		return tiers;
	}
}
