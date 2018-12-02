package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Prism extends MicroscopeComponent {

	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.03341752477;
	private static Double PERCENT_HEIGHT = 0.1045269089;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Prism.png");
	private static final Image img = new Image(Prism.path.toUri().toString());
	
	private final String geometry;
	private final String wavelengthRange;
	private final String baseLength;
	private final String topLength;
	private final String heigth;
	private final String width;
	private final String incidenceAngle;
	private final String crystallographicOrientation;
	private final String opticalMaterial;

	public Prism(final Double positionX, final Double positionY) {
		super("New Lens", Prism.TIER, positionX, positionY);
		
		this.geometry = "geometry";
		this.wavelengthRange = "wavelengthRange";
		this.baseLength = "baseLength";
		this.topLength = "topLength";
		this.heigth = "heigth";
		this.width = "width";
		this.incidenceAngle = "incidenceAngle";
		this.crystallographicOrientation = "crystallographicOrientation";
		this.opticalMaterial = "opticalMaterial";

		this.setPercentSizeWidth(Prism.PERCENT_WIDTH);
		this.setPercentSizeHeight(Prism.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("geometry", 5);
		tiers.put("wavelengthRange", 5);
		tiers.put("baseLength", 5);
		tiers.put("topLength", 5);
		tiers.put("heigth", 5);
		tiers.put("width", 5);
		tiers.put("incidenceAngle", 5);
		tiers.put("crystallographicOrientation", 5);
		tiers.put("opticalMaterial", 5);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return Prism.img;
	}
}
