package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public abstract class LightSourceGroup extends MicroscopeComponent {
	
	private final String power;
	private final String annotationRef;

	public LightSourceGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);
		
		this.power = "power";
		this.annotationRef = "annotationRef";
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("power", 3);
		tiers.put("annotationRef", 2);
		return tiers;
	}
}
