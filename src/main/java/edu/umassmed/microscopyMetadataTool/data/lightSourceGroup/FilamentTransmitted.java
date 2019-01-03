package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class FilamentTransmitted extends LightSourceTransmittedGroup {

	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.1297843404;
	private static Double PERCENT_HEIGHT = 0.1418301923;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Transmitted_Filament.png");
	private static final Image img = new Image(FilamentTransmitted.path.toUri()
			.toString());
	
	private final String type;

	public FilamentTransmitted(final Double positionX, final Double positionY) {
		super("New FilamentTransmitted", FilamentTransmitted.TIER, positionX,
				positionY);
		
		this.type = "type";

		this.setPercentSizeWidth(FilamentTransmitted.PERCENT_WIDTH);
		this.setPercentSizeHeight(FilamentTransmitted.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 2);
		tiers.put("model", 2);
		tiers.put("type", 3);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return FilamentTransmitted.img;
	}
}
