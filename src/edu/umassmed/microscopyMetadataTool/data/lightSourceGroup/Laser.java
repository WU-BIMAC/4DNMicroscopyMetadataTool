package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Laser extends LightSourceFluorescenceGroup {

	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.2333398096;
	private static Double PERCENT_HEIGHT = 0.09928113464;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Fluorescence_Laser.png");
	private static final Image img = new Image(Laser.path.toUri().toString());
	
	private final String type;
	private final String laserMedium;
	private final String wavelength;
	private final String frequencyMultiplication;
	private final String tuneable;
	private final String pulse;
	private final String pockelCell;
	private final String repetitionRate;

	public Laser(final Double positionX, final Double positionY) {
		super("New Laser", Laser.TIER, positionX, positionY);
		
		this.type = "type";
		this.laserMedium = "laserMedium";
		this.wavelength = "wavelength";
		this.frequencyMultiplication = "frequencyMultiplication";
		this.tuneable = "tuneable";
		this.pulse = "pulse";
		this.pockelCell = "pockelCell";
		this.repetitionRate = "repetitionRate";

		this.setPercentSizeWidth(Laser.PERCENT_WIDTH);
		this.setPercentSizeHeight(Laser.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("tier", 3);
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("type", 5);
		tiers.put("laserMedium", 5);
		tiers.put("wavelength", 2);
		tiers.put("frequencyMultiplication", 5);
		tiers.put("tuneable", 5);
		tiers.put("pulse", 5);
		tiers.put("pockelCell", 5);
		tiers.put("repetitionRate", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return Laser.img;
	}
}
