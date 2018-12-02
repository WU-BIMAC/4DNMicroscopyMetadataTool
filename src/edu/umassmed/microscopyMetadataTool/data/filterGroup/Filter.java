package edu.umassmed.microscopyMetadataTool.data.filterGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class Filter extends FilterGroup {

	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.03341752477;
	private static Double PERCENT_HEIGHT = 0.1045269089;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator + "Filter.png");
	private static final Image img = new Image(Filter.path.toUri().toString());

	public Filter(final Double positionX, final Double positionY) {
		super("New Filter", Filter.TIER, positionX, positionY);

		this.setPercentSizeWidth(Filter.PERCENT_WIDTH);
		this.setPercentSizeHeight(Filter.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}
	
	@Override
	public Image getImage() {
		return Filter.img;
	}
}
