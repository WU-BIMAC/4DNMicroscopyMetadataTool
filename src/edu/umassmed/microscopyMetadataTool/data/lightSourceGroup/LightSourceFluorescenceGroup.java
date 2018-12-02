package edu.umassmed.microscopyMetadataTool.data.lightSourceGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public abstract class LightSourceFluorescenceGroup extends LightSourceGroup {
	
	private static Double PERCENT_WIDTH = 0.2333398096;
	private static Double PERCENT_HEIGHT = 0.09928113464;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSource_Fluorescence.png");
	private static final Image img = new Image(
			LightSourceFluorescenceGroup.path.toUri().toString());
	
	public LightSourceFluorescenceGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);

		this.setPercentSizeWidth(LightSourceFluorescenceGroup.PERCENT_WIDTH);
		this.setPercentSizeHeight(LightSourceFluorescenceGroup.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}

	@Override
	public Image getImage() {
		return LightSourceFluorescenceGroup.img;
	}
}
