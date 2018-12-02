package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class AutoFocus extends MicroscopeComponent {
	
	public static Integer TIER = 3;
	private static Double PERCENT_WIDTH = 0.09889255877;
	private static Double PERCENT_HEIGHT = 0.04954342335;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "AutoFocus.png");
	private static final Image img = new Image(AutoFocus.path.toUri()
			.toString());
	
	private final String type;
	private final String description;
	private final String annotationRef;

	public AutoFocus(final Double positionX, final Double positionY) {
		super("New AutoFocus", AutoFocus.TIER, positionX, positionY);

		this.type = "type";
		this.description = "description";
		this.annotationRef = "annotationRef";

		this.setPercentSizeWidth(AutoFocus.PERCENT_WIDTH);
		this.setPercentSizeHeight(AutoFocus.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("type", 4);
		tiers.put("description", 5);
		tiers.put("annotationRef", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return AutoFocus.img;
	}
	
	public static Integer getStaticTier() {
		return AutoFocus.TIER;
	}
}
