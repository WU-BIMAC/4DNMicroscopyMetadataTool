package edu.umassmed.microscopyMetadataTool.data.piezoelectricFocusingGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class PiezoelectricObjectiveFocusing extends PiezoelectricFocusingGroup {
	
	private static Integer TIER = 4;
	private static Double PERCENT_WIDTH = 0.1037497571;
	private static Double PERCENT_HEIGHT = 0.05984068389;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "PiezoelectricFocusingObjective.png");
	private static final Image img = new Image(
			PiezoelectricObjectiveFocusing.path.toUri().toString());

	public PiezoelectricObjectiveFocusing(final Double positionX,
			final Double positionY) {
		super("New PiezoelectricObjectiveFocusing",
				PiezoelectricObjectiveFocusing.TIER, positionX, positionY);
		
		this.setPercentSizeWidth(PiezoelectricObjectiveFocusing.PERCENT_WIDTH);
		this.setPercentSizeHeight(PiezoelectricObjectiveFocusing.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}

	@Override
	public Image getImage() {
		return PiezoelectricObjectiveFocusing.img;
	}

	public static Integer getStaticTier() {
		return PiezoelectricObjectiveFocusing.TIER;
	}
}
