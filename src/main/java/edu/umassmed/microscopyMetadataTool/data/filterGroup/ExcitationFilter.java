package edu.umassmed.microscopyMetadataTool.data.filterGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;

public class ExcitationFilter extends FilterGroup {
	
	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.00310860696;
	private static Double PERCENT_HEIGHT = 0.02389741597;

	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "ExcitationFilter.png");
	private static final Image img = new Image(ExcitationFilter.path.toUri()
			.toString());
	
	public ExcitationFilter(final Double positionX, final Double positionY) {
		super("New ExcitationFilter", ExcitationFilter.TIER, positionX,
				positionY);

		this.setPercentSizeWidth(ExcitationFilter.PERCENT_WIDTH);
		this.setPercentSizeHeight(ExcitationFilter.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		return tiers;
	}

	@Override
	public Image getImage() {
		return ExcitationFilter.img;
	}
}
