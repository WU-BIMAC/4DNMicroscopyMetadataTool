package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Stage extends MicroscopeComponent {

	private static Integer TIER = 3;
	private static Double PERCENT_WIDTH = 0.208470954;
	private static Double PERCENT_HEIGHT = 0.01981736934;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Stage.png");
	private static final Image img = new Image(Stage.path.toUri().toString());

	private final String type;
	private final String axesOfTravel;
	private final String maxVelocity;
	private final String rotationAngle;
	private final String xAxisTravelRange;
	private final String yAxisTravelRange;
	private final String zAxisTravelRange;
	private final String annotationRef;

	public Stage(final Double positionX, final Double positionY) {
		super("New Stage", Stage.TIER, positionX, positionY);

		this.type = "type";
		this.axesOfTravel = "axesOfTravel";
		this.maxVelocity = "maxVelocity";
		this.rotationAngle = "rotationAngle";
		this.xAxisTravelRange = "xAxisTravelRange";
		this.yAxisTravelRange = "yAxisTravelRange";
		this.zAxisTravelRange = "zAxisTravelRange";
		this.annotationRef = "annotationRef";
		
		this.setPercentSizeWidth(Stage.PERCENT_WIDTH);
		this.setPercentSizeHeight(Stage.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 5);
		tiers.put("axesOfTravel", 5);
		tiers.put("maxVelocity", 5);
		tiers.put("rotationAngle", 5);
		tiers.put("xAxisTravelRange", 5);
		tiers.put("yAxisTravelRange", 5);
		tiers.put("zAxisTravelRange", 5);
		tiers.put("annotationRef", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return Stage.img;
	}
	
	public static Integer getStaticTier() {
		return Stage.TIER;
	}
}
