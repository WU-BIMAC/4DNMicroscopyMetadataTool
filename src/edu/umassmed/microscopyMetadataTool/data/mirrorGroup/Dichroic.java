package edu.umassmed.microscopyMetadataTool.data.mirrorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javafx.scene.image.Image;
import edu.umassmed.microscopyMetadataTool.data.subElements.ReflectanceRange;
import edu.umassmed.microscopyMetadataTool.data.subElements.TransmittanceRange;

public class Dichroic extends MirrorGroup {
	
	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.02933747814;
	private static Double PERCENT_HEIGHT = 0.03166893336;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Dichroic.png");
	private static final Image img = new Image(Dichroic.path.toUri().toString());
	
	private final String type;
	private final String polarization;
	private final String filterWheel;
	private final TransmittanceRange transmittanceRange;
	private final ReflectanceRange reflectanceRange;
	
	public Dichroic(final Double positionX, final Double positionY) {
		super("New Dichroic", Dichroic.TIER, positionX, positionY);
		this.type = "type";
		this.polarization = "polarization";
		this.filterWheel = "filterWheel";
		this.transmittanceRange = new TransmittanceRange();
		this.reflectanceRange = new ReflectanceRange();
		
		this.setPercentSizeWidth(Dichroic.PERCENT_WIDTH);
		this.setPercentSizeHeight(Dichroic.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("model", 3);
		tiers.put("type", 3);
		tiers.put("filterWheel", 4);
		tiers.put("polarization", 5);
		tiers.putAll(this.transmittanceRange.getTiers(this.getTier()));
		tiers.putAll(this.reflectanceRange.getTiers(this.getTier()));
		return tiers;
	}

	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = super.getNotEditableFields();
		notEditableField.addAll(this.transmittanceRange.getNotEditableFields());
		notEditableField.addAll(this.reflectanceRange.getNotEditableFields());
		return notEditableField;
	}
	
	@Override
	public Image getImage() {
		return Dichroic.img;
	}
}
