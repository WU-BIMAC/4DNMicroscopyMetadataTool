package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class CMOS extends CameraGroup {
	
	public static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.2220711094;
	private static Double PERCENT_HEIGHT = 0.1455216631;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "Detector_Camera_CMOS.png");
	private static final Image img = new Image(CMOS.path.toUri().toString());

	private final String type;
	
	public CMOS(final Double positionX, final Double positionY) {
		super("New CMOS", CMOS.TIER, positionX, positionY);
		
		this.type = "type";
		
		this.setPercentSizeWidth(CMOS.PERCENT_WIDTH);
		this.setPercentSizeHeight(CMOS.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 3);
		return tiers;
	}
	
	public static Integer getStaticTier() {
		return CMOS.TIER;
	}
	
	@Override
	public Image getImage() {
		return CMOS.img;
	}
}
