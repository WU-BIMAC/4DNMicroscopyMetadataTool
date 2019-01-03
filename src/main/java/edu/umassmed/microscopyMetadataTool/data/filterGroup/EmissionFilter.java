package edu.umassmed.microscopyMetadataTool.data.filterGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class EmissionFilter extends FilterGroup {
	
	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.0235088401;
	private static Double PERCENT_HEIGHT = 0.00272003109;
	
	private static final Path path = Paths
			.get(System.getProperty("user.dir") + File.separator + "images"
					+ File.separator + "EmissionFilter.png");
	private static final Image img = new Image(EmissionFilter.path.toUri()
			.toString());
	
	public EmissionFilter(final Double positionX, final Double positionY) {
		super("New EmissionFilter", EmissionFilter.TIER, positionX, positionY);
		
		this.setPercentSizeWidth(EmissionFilter.PERCENT_WIDTH);
		this.setPercentSizeHeight(EmissionFilter.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return EmissionFilter.img;
	}
}
