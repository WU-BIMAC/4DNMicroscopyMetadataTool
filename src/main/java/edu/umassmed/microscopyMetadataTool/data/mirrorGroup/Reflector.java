package edu.umassmed.microscopyMetadataTool.data.mirrorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javafx.scene.image.Image;

public class Reflector extends MirrorGroup {

	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.03341752477;
	private static Double PERCENT_HEIGHT = 0.1045269089;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "GenericMirror.png");
	private static final Image img = new Image(Reflector.path.toUri()
			.toString());

	public Reflector(final Double positionX, final Double positionY) {
		super("New Reflector", Reflector.TIER, positionX, positionY);

		this.setPercentSizeWidth(Reflector.PERCENT_WIDTH);
		this.setPercentSizeHeight(Reflector.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("model", 3);
		return tiers;
	}
	
	@Override
	public List<String> getNotEditableFields() {
		final List<String> notEditableField = super.getNotEditableFields();
		return notEditableField;
	}

	@Override
	public Image getImage() {
		return Reflector.img;
	}
}
