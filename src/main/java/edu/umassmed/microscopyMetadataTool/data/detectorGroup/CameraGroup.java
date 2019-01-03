package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public abstract class CameraGroup extends DetectorGroup {

	private static Double PERCENT_WIDTH = 0.2220711094;
	private static Double PERCENT_HEIGHT = 0.1455216631;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "Detector_Camera_Generic.png");
	private static final Image img = new Image(CameraGroup.path.toUri()
			.toString());

	private final String illumination;
	private final String arrayWidth;
	private final String arrayHeight;
	private final String pixelWidth;
	private final String pixelHeight;
	private final String imageWidth;
	private final String imageHeight;
	private final String pixelWellCapacity;
	private final String registerWellCapacity;
	private final String verticalClockSpeed;
	private final String maximumReadoutRate;

	public CameraGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);

		this.illumination = "illumination";
		this.arrayWidth = "arrayWidth";
		this.arrayHeight = "arrayHeight";
		this.pixelWidth = "pixelWidth";
		this.pixelHeight = "pixelHeight";
		this.imageWidth = "imageWidth";
		this.imageHeight = "imageHeight";
		this.pixelWellCapacity = "pixelWellCapacity";
		this.registerWellCapacity = "registerWellCapacity";
		this.verticalClockSpeed = "verticalClockSpeed";
		this.maximumReadoutRate = "maximumReadoutRate";

		this.setPercentSizeWidth(CameraGroup.PERCENT_WIDTH);
		this.setPercentSizeHeight(CameraGroup.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("illumination", 3);
		tiers.put("arrayWidth", 3);
		tiers.put("arrayHeight", 3);
		tiers.put("pixelWidth", 3);
		tiers.put("pixelHeight", 3);
		tiers.put("imageWidth", 3);
		tiers.put("imageHeight", 3);
		tiers.put("pixelWellCapacity", 5);
		tiers.put("registerWellCapacity", 5);
		tiers.put("verticalClockSpeed", 5);
		tiers.put("maximumReadoutRate", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return CameraGroup.img;
	}
}
