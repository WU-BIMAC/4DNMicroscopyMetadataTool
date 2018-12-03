package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class IntensifiedCCD extends CameraGroup {
	
	private static Integer TIER = 3;
	private static Double PERCENT_WIDTH = 0.2220711094;
	private static Double PERCENT_HEIGHT = 0.1455216631;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "Detector_Camera_IntensifiedCCD.png");
	private static final Image img = new Image(IntensifiedCCD.path.toUri()
			.toString());
	
	private final String type;
	
	public IntensifiedCCD(final Double positionX, final Double positionY) {
		super("New IntensifiedCCD", IntensifiedCCD.TIER, positionX, positionY);
		
		this.type = "type";

		this.setPercentSizeWidth(IntensifiedCCD.PERCENT_WIDTH);
		this.setPercentSizeHeight(IntensifiedCCD.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 3);
		return tiers;
	}

	public static Integer getStaticTier() {
		return IntensifiedCCD.TIER;
	}

	@Override
	public Image getImage() {
		return IntensifiedCCD.img;
	}
}
