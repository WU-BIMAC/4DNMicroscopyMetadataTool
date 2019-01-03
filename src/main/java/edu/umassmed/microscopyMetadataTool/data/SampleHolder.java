package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class SampleHolder extends MicroscopeComponent {

	private static Integer TIER = 3;
	private static Double PERCENT_WIDTH = 0.1657276083;
	private static Double PERCENT_HEIGHT = 0.02953176608;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "SampleHolder.png");
	private static final Image img = new Image(SampleHolder.path.toUri()
			.toString());

	private final String type;
	private final String maxVelocity;
	private final String xAxisTravelRange;
	private final String yAxisTravelRange;
	private final String zAxisTravelRange;
	private final String annotationRef;
	
	public SampleHolder(final Double positionX, final Double positionY) {
		super("New SampleHolder", SampleHolder.TIER, positionX, positionY);

		this.type = "type";
		this.maxVelocity = "maxVelocity";
		this.xAxisTravelRange = "xAxisTravelRange";
		this.yAxisTravelRange = "yAxisTravelRange";
		this.zAxisTravelRange = "zAxisTravelRange";
		this.annotationRef = "annotationRef";

		this.setPercentSizeWidth(SampleHolder.PERCENT_WIDTH);
		this.setPercentSizeHeight(SampleHolder.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 5);
		tiers.put("maxVelocity", 5);
		tiers.put("xAxisTravelRange", 5);
		tiers.put("yAxisTravelRange", 5);
		tiers.put("zAxisTravelRange", 5);
		tiers.put("annotationRef", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return SampleHolder.img;
	}

	public static Integer getStaticTier() {
		return SampleHolder.TIER;
	}
}
