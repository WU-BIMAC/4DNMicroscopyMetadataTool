package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Lens extends MicroscopeComponent {
	
	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.03341752477;
	private static Double PERCENT_HEIGHT = 0.1045269089;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Lens.png");
	private static final Image img = new Image(Lens.path.toUri().toString());

	private final String geometry;
	private final String magnification;
	private final String diameter;
	private final String glass;
	private final String attenuationCoefficient;
	private final String inputFocalDistance;
	private final String outputFocalDistance;
	
	public Lens(final Double positionX, final Double positionY) {
		super("New Lens", Lens.TIER, positionX, positionY);

		this.geometry = "geometry";
		this.magnification = "magnification";
		this.diameter = "diameter";
		this.glass = "glass";
		this.attenuationCoefficient = "attenuationCoefficient";
		this.inputFocalDistance = "inputFocalDistance";
		this.outputFocalDistance = "outputFocalDistance";
		
		this.setPercentSizeWidth(Lens.PERCENT_WIDTH);
		this.setPercentSizeHeight(Lens.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("geometry", 5);
		tiers.put("magnification", 3);
		tiers.put("diameter", 5);
		tiers.put("glass", 5);
		tiers.put("attenuationCoefficient", 5);
		tiers.put("inputFocalDistance", 5);
		tiers.put("outputFocalDistance", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return Lens.img;
	}
}
