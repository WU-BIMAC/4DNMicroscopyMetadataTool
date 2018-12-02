package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.util.Map;

public class FilamentFlourescence extends LightSourceFluorescenceGroup {

	private static Integer TIER = 1;
	
	private final String type;

	public FilamentFlourescence(final Double positionX, final Double positionY) {
		super("New FilamentFlourescence", FilamentFlourescence.TIER, positionX,
				positionY);

		this.type = "type";
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("type", 3);
		return tiers;
	}
}
