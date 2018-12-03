package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class FilamentFlourescence extends LightSourceFluorescenceGroup {

	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.2333398096;
	private static Double PERCENT_HEIGHT = 0.09928113464;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Fluorescence_Filament.png");
	private static final Image img = new Image(FilamentFlourescence.path
			.toUri().toString());
	
	private final String type;

	public FilamentFlourescence(final Double positionX, final Double positionY) {
		super("New FilamentFlourescence", FilamentFlourescence.TIER, positionX,
				positionY);

		this.type = "type";

		this.setPercentSizeWidth(FilamentFlourescence.PERCENT_WIDTH);
		this.setPercentSizeHeight(FilamentFlourescence.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 3);
		tiers.put("model", 3);
		tiers.put("type", 3);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return FilamentFlourescence.img;
	}
}
