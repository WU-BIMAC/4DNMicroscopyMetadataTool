package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class CCD extends CameraGroup {
	
	public static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.2220711094;
	private static Double PERCENT_HEIGHT = 0.1455216631;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "Detector_Camera_CCD.png");
	private static final Image img = new Image(CCD.path.toUri().toString());

	private final String type;

	public CCD(final Double positionX, final Double positionY) {
		super("New CCD", CCD.TIER, positionX, positionY);

		this.type = "type";

		this.setPercentSizeWidth(CCD.PERCENT_WIDTH);
		this.setPercentSizeHeight(CCD.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 3);
		return tiers;
	}

	public static Integer getStaticTier() {
		return CCD.TIER;
	}

	@Override
	public Image getImage() {
		return CCD.img;
	}
}
