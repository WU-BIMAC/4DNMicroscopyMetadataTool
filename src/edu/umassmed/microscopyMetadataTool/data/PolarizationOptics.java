package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class PolarizationOptics extends MicroscopeComponent {
	
	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.03341752477;
	private static Double PERCENT_HEIGHT = 0.1045269089;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Polarizer.png");
	private static final Image img = new Image(PolarizationOptics.path.toUri()
			.toString());

	private final String function;
	private final String construction;
	private final String retardation;
	private final String wavelengthCorrection;
	private final String fabrication;
	private final String opticalMaterial;
	private final String annotationRef;
	
	public PolarizationOptics(final Double positionX, final Double positionY) {
		super("New Lens", PolarizationOptics.TIER, positionX, positionY);

		this.function = "function";
		this.construction = "construction";
		this.retardation = "retardation";
		this.wavelengthCorrection = "wavelengthCorrection";
		this.fabrication = "fabrication";
		this.opticalMaterial = "opticalMaterial";
		this.annotationRef = "annotationRef";
		
		this.setPercentSizeWidth(PolarizationOptics.PERCENT_WIDTH);
		this.setPercentSizeHeight(PolarizationOptics.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("function", 2);
		tiers.put("construction", 2);
		tiers.put("retardation", 3);
		tiers.put("wavelengthCorrection", 3);
		tiers.put("fabrication", 5);
		tiers.put("opticalMaterial", 5);
		tiers.put("annotationRef", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return PolarizationOptics.img;
	}
}
