package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class MicroscopeTable extends MicroscopeComponent {

	private static Integer TIER = 4;
	private static Double PERCENT_WIDTH = 1.0;
	private static Double PERCENT_HEIGHT = 0.05848066835;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "MicroscopeTable.png");
	private static final Image img = new Image(MicroscopeTable.path.toUri()
			.toString());
	
	private final String type;
	private final String tableWidth;
	private final String tableDepth;
	
	public MicroscopeTable(final Double positionX, final Double positionY) {
		super("New MicroscopeTable", MicroscopeTable.TIER, positionX, positionY);
		
		this.type = "type";
		this.tableWidth = "tableWidth";
		this.tableDepth = "tableDepth";

		this.setPercentSizeWidth(MicroscopeTable.PERCENT_WIDTH);
		this.setPercentSizeHeight(MicroscopeTable.PERCENT_HEIGHT);
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("model", 5);
		tiers.put("type", 4);
		tiers.put("tableWidth", 5);
		tiers.put("tableDepth", 5);
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return MicroscopeTable.img;
	}

	public static Integer getStaticTier() {
		return MicroscopeTable.TIER;
	}
}
