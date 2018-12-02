package edu.umassmed.microscopyMetadataTool.data.lightSourceCouplingGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class LightGuide extends LightSourceCouplingGroup {
	
	private static Integer TIER = 4;
	private static Double PERCENT_WIDTH = 0.1653390324;
	private static Double PERCENT_HEIGHT = 0.2978434039;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "LightGuide.png");
	private static final Image img = new Image(LightGuide.path.toUri()
			.toString());
	
	private final String type;
	private final String geometry;
	private final String material;
	private final String wavelengthRange;
	private final String wavelengthAtPeak;
	private final String lowerWavelengthAtHalfPeak;
	private final String upperWavelengthAtHalfPeak;
	private final String singleMode;
	private final String waveguideMode;
	private final String acceptanceAngle;
	private final String NA;
	private final String diameter;
	private final String length;
	private final String bendRadius;
	private final String ferruleOuterDiameter;
	private final String ferruleMaterial;
	
	public LightGuide(final Double positionX, final Double positionY) {
		super("New LightGuide", LightGuide.TIER, positionX, positionY);
		
		this.type = "type";
		this.geometry = "geometry";
		this.material = "material";
		this.wavelengthRange = "wavelengthRange";
		this.wavelengthAtPeak = "wavelengthAtPeak";
		this.lowerWavelengthAtHalfPeak = "lowerWavelengthAtHalfPeak";
		this.upperWavelengthAtHalfPeak = "upperWavelengthAtHalfPeak";
		this.singleMode = "singleMode";
		this.waveguideMode = "waveguideMode";
		this.acceptanceAngle = "acceptanceAngle";
		this.NA = "NA";
		this.diameter = "diameter";
		this.length = "length";
		this.bendRadius = "bendRadius";
		this.ferruleOuterDiameter = "ferruleOuterDiameter";
		this.ferruleMaterial = "ferruleMaterial";

		this.setPercentSizeWidth(LightGuide.PERCENT_WIDTH);
		this.setPercentSizeHeight(LightGuide.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 5);
		tiers.put("geometry", 5);
		tiers.put("material", 5);
		tiers.put("wavelengthRange", 5);
		tiers.put("wavelengthAtPeak", 5);
		tiers.put("lowerWavelengthAtHalfPeak", 5);
		tiers.put("upperWavelengthAtHalfPeak", 5);
		tiers.put("singleMode", 5);
		tiers.put("waveguideMode", 5);
		tiers.put("acceptanceAngle", 5);
		tiers.put("NA", 5);
		tiers.put("diameter", 5);
		tiers.put("length", 5);
		tiers.put("bendRadius", 5);
		tiers.put("ferruleOuterDiameter", 5);
		tiers.put("ferruleMaterial", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return LightGuide.img;
	}

	public static Integer getStaticTier() {
		return LightGuide.TIER;
	}
}
