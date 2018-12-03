package edu.umassmed.microscopyMetadataTool.data.subElements;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TransmittanceRange extends ComponentSubElement {

	private final String cutIn;
	private final String cutOut;
	private final String cutInTolerance;
	private final String cutOutTolerance;
	private final String transmittance;
	
	public TransmittanceRange() {
		this.cutIn = "cutIn";
		this.cutOut = "cutOut";
		this.cutInTolerance = "cutInTolerance";
		this.cutOutTolerance = "cutOutTolerance";
		this.transmittance = "transmittance";
	}
	
	@Override
	public Map<String, Integer> getTiers(final Integer parentTier) {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("cutIn", 3);
		tiers.put("cutOut", 5);
		tiers.put("cutInTolerance", 5);
		tiers.put("cutOutTolerance", 5);
		tiers.put("transmittance", 3);
		return tiers;
	}

	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = new ArrayList<String>();
		// notEditableField.add("positionX");
		// notEditableField.add("positionY");
		return notEditableField;
	}
}
