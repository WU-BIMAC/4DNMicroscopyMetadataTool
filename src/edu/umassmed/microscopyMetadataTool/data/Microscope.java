package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.image.Image;

public class Microscope extends GenericElement {
	
	private static Integer TIER = 1;

	private String type;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "Microscope_with Knobs_BackPort_Fluorescence Beam.png");
	private static final Image img = new Image(Microscope.path.toUri()
			.toString());
	
	public Microscope() {
		super("New Microscope", Microscope.TIER);
		
		this.type = "type";
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(final String type) {
		this.type = type;
	}
	
	public Image getImage() {
		return Microscope.img;
	}

	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = super.getNotEditableFields();
		notEditableField.add("tier");
		return notEditableField;
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("id", 1);
		tiers.put("name", 1);
		tiers.put("tier", 1);
		tiers.put("manufacturer", 1);
		tiers.put("model", 2);
		tiers.put("serialNumber", 5);
		tiers.put("lotNumber", 5);
		tiers.put("specsFile", 5);
		tiers.put("type", 1);
		return tiers;
	}
}
