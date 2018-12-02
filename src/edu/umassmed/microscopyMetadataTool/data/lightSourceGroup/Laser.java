package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.util.Map;

public class Laser extends LightSourceFluorescenceGroup {

	private static Integer TIER = 1;
	
	private final String type;
	private final String laserMedium;
	private final String wavelength;
	private final String frequencyMultiplication;
	private final String tuneable;
	private final String pulse;
	private final String pockelCell;
	private final String repetitionRate;

	public Laser(final Double positionX, final Double positionY) {
		super("New Laser", Laser.TIER, positionX, positionY);
		
		this.type = "type";
		this.laserMedium = "laserMedium";
		this.wavelength = "wavelength";
		this.frequencyMultiplication = "frequencyMultiplication";
		this.tuneable = "tuneable";
		this.pulse = "pulse";
		this.pockelCell = "pockelCell";
		this.repetitionRate = "repetitionRate";
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("tier", 3);
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("type", 5);
		tiers.put("laserMedium", 5);
		tiers.put("wavelength", 2);
		tiers.put("frequencyMultiplication", 5);
		tiers.put("tuneable", 5);
		tiers.put("pulse", 5);
		tiers.put("pockelCell", 2);
		tiers.put("repetitionRate", 5);
		return tiers;
	}
}
