package edu.umassmed.microscopyMetadataTool.data.lightSourceCouplingGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Direct extends LightSourceCouplingGroup {

	private static Integer TIER = 4;
	private static Double PERCENT_WIDTH = 0.2220711094;
	private static Double PERCENT_HEIGHT = 0.1455216631;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Direct.png");
	private static final Image img = new Image(Direct.path.toUri().toString());
	
	private final String type;
	private final String mount;
	
	public Direct(final Double positionX, final Double positionY) {
		super("New Direct", Direct.TIER, positionX, positionY);
		
		this.type = "type";
		this.mount = "mount";

		this.setPercentSizeWidth(Direct.PERCENT_WIDTH);
		this.setPercentSizeHeight(Direct.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 5);
		tiers.put("mount", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return Direct.img;
	}
	
	public static Integer getStaticTier() {
		return Direct.TIER;
	}
}
