package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public abstract class LightSourceTransmittedGroup extends LightSourceGroup {
	
	private static Double PERCENT_WIDTH = 0.1297843404;
	private static Double PERCENT_HEIGHT = 0.1418301923;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Transmitted_Generic.png");
	private static final Image img = new Image(LightSourceTransmittedGroup.path
			.toUri().toString());

	public LightSourceTransmittedGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);
		
		this.setPercentSizeWidth(LightSourceTransmittedGroup.PERCENT_WIDTH);
		this.setPercentSizeHeight(LightSourceTransmittedGroup.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return LightSourceTransmittedGroup.img;
	}
}
