package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Objective extends MicroscopeComponent {

	private static Integer TIER = 1;
	private static Double PERCENT_WIDTH = 0.02933747814;
	private static Double PERCENT_HEIGHT = 0.02778317466;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Objective.png");
	private static final Image img = new Image(Objective.path.toUri()
			.toString());
	
	private final String correction;
	private final String immersionMedium;
	private final String lensNA;
	private final String nominalMagnification;
	private final String calibratedMagnification;
	private final String workingDistance;
	private final String fieldNumber;
	private final String iris;
	
	public Objective(final Double positionX, final Double positionY) {
		super("New Objective", Objective.TIER, positionX, positionY);

		this.correction = "correction";
		this.immersionMedium = "immersionMedium";
		this.lensNA = "lensNA";
		this.nominalMagnification = "nominalMagnification";
		this.calibratedMagnification = "calibratedMagnification";
		this.workingDistance = "workingDistance";
		this.fieldNumber = "fieldNumber";
		this.iris = "iris";

		this.setPercentSizeWidth(Objective.PERCENT_WIDTH);
		this.setPercentSizeHeight(Objective.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("manufacturer", 2);
		tiers.put("model", 2);
		tiers.put("correction", 2);
		tiers.put("immersionMedium", 2);
		tiers.put("lensNA", 1);
		tiers.put("nominalMagnification", 1);
		tiers.put("calibratedMagnification", 5);
		tiers.put("workingDistance", 3);
		tiers.put("fieldNumber", 3);
		tiers.put("iris", 4);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return Objective.img;
	}
	
	public static Integer getStaticTier() {
		return Objective.TIER;
	}
}
