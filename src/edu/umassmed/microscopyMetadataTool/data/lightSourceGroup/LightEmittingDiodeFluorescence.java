package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class LightEmittingDiodeFluorescence extends
		LightSourceFluorescenceGroup {

	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.2333398096;
	private static Double PERCENT_HEIGHT = 0.09928113464;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Fluorescence_LightEmittingDiode.png");
	private static final Image img = new Image(
			LightEmittingDiodeFluorescence.path.toUri().toString());
	
	private final String type;
	private final String projectionAngle;
	
	// private final String wavelengthRange;
	// TODO This is a element that contains all the following field
	private final String waveLengthAtPeak;
	private final String lumenPower;
	private final String lowerWavelengthAtHalfPeak;
	private final String upperWavelengthAtHalfPeak;
	
	// All this fields

	public LightEmittingDiodeFluorescence(final Double positionX,
			final Double positionY) {
		super("New LightEmittingDiodeFluorescence",
				LightEmittingDiodeFluorescence.TIER, positionX, positionY);
		
		this.type = "type";
		// this.wavelengthRange = "NA";
		this.projectionAngle = "projectionAngle";
		this.waveLengthAtPeak = "waveLengthAtPeak";
		this.lumenPower = "lumenPower";
		this.lowerWavelengthAtHalfPeak = "lowerWavelengthAtHalfPeak";
		this.upperWavelengthAtHalfPeak = "upperWavelengthAtHalfPeak";
		
		this.setPercentSizeWidth(LightEmittingDiodeFluorescence.PERCENT_WIDTH);
		this.setPercentSizeHeight(LightEmittingDiodeFluorescence.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 2);
		tiers.put("model", 2);
		tiers.put("type", 3);
		// tiers.put("wavelengthRange", 2);
		tiers.put("projectionAngle", 5);
		tiers.put("waveLengthAtPeak", 2);
		tiers.put("lumenPower", 3);
		tiers.put("lowerWavelengthAtHalfPeak", 5);
		tiers.put("upperWavelengthAtHalfPeak", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return LightEmittingDiodeFluorescence.img;
	}
}
