package edu.umassmed.microscopyMetadataTool.data.subElements;

import java.util.List;
import java.util.Map;

public abstract class ComponentSubElement {
	public abstract Map<String, Integer> getTiers(final Integer parentTier);
	
	public abstract List<String> getNotEditableFields();
}
