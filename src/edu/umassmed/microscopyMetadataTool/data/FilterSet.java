package edu.umassmed.microscopyMetadataTool.data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;
import edu.umassmed.microscopyMetadataTool.data.filterGroup.EmissionFilter;
import edu.umassmed.microscopyMetadataTool.data.filterGroup.ExcitationFilter;
import edu.umassmed.microscopyMetadataTool.data.mirrorGroup.Dichroic;

public class FilterSet extends MicroscopeComponent {

	private static Integer TIER = 2;
	private static Double PERCENT_WIDTH = 0.03652613173;
	private static Double PERCENT_HEIGHT = 0.03866329901;
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "FilterSet_transparent.png");
	private static final Image img = new Image(FilterSet.path.toUri()
			.toString());
	
	private final EmissionFilter emissionFilter;
	private final Dichroic dichroic;
	private final ExcitationFilter excitationFilter;
	
	public FilterSet(final Double positionX, final Double positionY) {
		super("New FilterSet", FilterSet.TIER, positionX, positionY);

		this.excitationFilter = new ExcitationFilter(null, null);
		this.dichroic = new Dichroic(null, null);
		this.emissionFilter = new EmissionFilter(null, null);

		this.setPercentSizeWidth(FilterSet.PERCENT_WIDTH);
		this.setPercentSizeHeight(FilterSet.PERCENT_HEIGHT);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("model", 3);
		tiers.putAll(this.excitationFilter.getTiers());
		tiers.putAll(this.dichroic.getTiers());
		tiers.putAll(this.emissionFilter.getTiers());
		return tiers;
	}

	@Override
	public Image getImage() {
		return FilterSet.img;
	}
}
