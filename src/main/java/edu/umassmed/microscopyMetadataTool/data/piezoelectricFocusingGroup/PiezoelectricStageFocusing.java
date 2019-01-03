package edu.umassmed.microscopyMetadataTool.data.piezoelectricFocusingGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class PiezoelectricStageFocusing extends PiezoelectricFocusingGroup {
	
	private static Integer TIER = 4;
	private static Double PERCENT_WIDTH = 0.1771905965;
	private static Double PERCENT_HEIGHT = 0.01632018652;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "PiezoelectricStageFocusing.png");
	private static final Image img = new Image(PiezoelectricStageFocusing.path
			.toUri().toString());
	
	public PiezoelectricStageFocusing(final Double positionX,
			final Double positionY) {
		super("New PiezoelectricObjectiveFocusing",
				PiezoelectricStageFocusing.TIER, positionX, positionY);

		this.setPercentSizeWidth(PiezoelectricStageFocusing.PERCENT_WIDTH);
		this.setPercentSizeHeight(PiezoelectricStageFocusing.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return PiezoelectricStageFocusing.img;
	}

	public static Integer getStaticTier() {
		return PiezoelectricStageFocusing.TIER;
	}
}
