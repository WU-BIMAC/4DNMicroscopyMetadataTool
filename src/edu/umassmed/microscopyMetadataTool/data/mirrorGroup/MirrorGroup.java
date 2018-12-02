package edu.umassmed.microscopyMetadataTool.data.mirrorGroup;

import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public abstract class MirrorGroup extends MicroscopeComponent {
	
	private final String geometry;
	private final String shape;
	private final String reflectance;
	private final String reflectionAngle;
	private final String annotationRef;
	
	public MirrorGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);
		
		this.geometry = "geometry";
		this.shape = "shape";
		this.reflectance = "reflectance";
		this.reflectionAngle = "reflectionAngle";
		this.annotationRef = "annotationRef";
		
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("geometry", 5);
		tiers.put("shape", 5);
		tiers.put("reflectance", 4);
		tiers.put("reflectionAngle", 5);
		tiers.put("annotationRef", 5);
		return tiers;
	}
}
