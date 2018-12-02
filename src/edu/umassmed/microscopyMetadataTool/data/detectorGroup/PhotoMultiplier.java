package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class PhotoMultiplier extends DetectorGroup {
	
	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.1632018652;
	private static Double PERCENT_HEIGHT = 0.1179327764;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "PMT.png");
	private static final Image img = new Image(PhotoMultiplier.path.toUri()
			.toString());

	private final String type;
	private final String radiantSensitivityAtPeakWavelength;
	
	public PhotoMultiplier(final Double positionX, final Double positionY) {
		super("New PhotoMultiplier", PhotoMultiplier.TIER, positionX, positionY);
		
		this.type = "type";
		this.radiantSensitivityAtPeakWavelength = "radiantSensitivityAtPeakWavelength";

		this.setPercentSizeWidth(PhotoMultiplier.PERCENT_WIDTH);
		this.setPercentSizeHeight(PhotoMultiplier.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 3);
		tiers.put("radiantSensitivityAtPeakWavelength", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return PhotoMultiplier.img;
	}

	public static Integer getStaticTier() {
		return PhotoMultiplier.TIER;
	}
}
