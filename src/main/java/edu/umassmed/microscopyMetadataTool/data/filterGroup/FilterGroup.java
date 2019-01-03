package edu.umassmed.microscopyMetadataTool.data.filterGroup;

import java.util.List;
import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;
import edu.umassmed.microscopyMetadataTool.data.subElements.TransmittanceRange;

public abstract class FilterGroup extends MicroscopeComponent {
	
	private final String type;
	private final String filterWheel;
	private final String annotationRef;
	private final TransmittanceRange transmittanceRange;
	
	public FilterGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);

		this.type = "type";
		this.filterWheel = "filterWheel";
		this.annotationRef = "annotationRef";
		
		this.transmittanceRange = new TransmittanceRange();
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("model", 3);
		tiers.put("type", 3);
		tiers.put("filterWheel", 4);
		tiers.put("annotationRef", 4);
		tiers.putAll(this.transmittanceRange.getTiers(this.getTier()));
		return tiers;
	}

	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = super.getNotEditableFields();
		notEditableField.addAll(this.transmittanceRange.getNotEditableFields());
		return notEditableField;
	}
}
