package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;
import edu.umassmed.microscopyMetadataTool.data.subElements.WavelenghtRange;

public class LightEmittingDiodeTransmitted extends LightSourceTransmittedGroup {
	
	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.1297843404;
	private static Double PERCENT_HEIGHT = 0.1418301923;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Transmitted_LightEmittingDiode.png");
	private static final Image img = new Image(
			LightEmittingDiodeTransmitted.path.toUri().toString());
	
	private final String type;
	private final String projectionAngle;

	private final WavelenghtRange wavelenghtRange;

	// All this fields
	
	public LightEmittingDiodeTransmitted(final Double positionX,
			final Double positionY) {
		super("New LightEmittingDiodeTransmitted",
				LightEmittingDiodeTransmitted.TIER, positionX, positionY);

		this.type = "type";
		this.projectionAngle = "projectionAngle";
		
		this.wavelenghtRange = new WavelenghtRange();

		this.setPercentSizeWidth(LightEmittingDiodeTransmitted.PERCENT_WIDTH);
		this.setPercentSizeHeight(LightEmittingDiodeTransmitted.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 2);
		tiers.put("model", 2);
		tiers.put("type", 3);
		tiers.put("projectionAngle", 5);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return LightEmittingDiodeTransmitted.img;
	}
}
