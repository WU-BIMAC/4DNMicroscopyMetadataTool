package edu.umassmed.microscopyMetadataTool.data.piezoelectricFocusingGroup;

import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public abstract class PiezoelectricFocusingGroup extends MicroscopeComponent {
	
	private final String type;
	private final String annotationRef;

	public PiezoelectricFocusingGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);

		this.type = "type";
		this.annotationRef = "annotationRef";
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("model", 5);
		tiers.put("type", 4);
		tiers.put("annotationRef", 5);
		return tiers;
	}
}
