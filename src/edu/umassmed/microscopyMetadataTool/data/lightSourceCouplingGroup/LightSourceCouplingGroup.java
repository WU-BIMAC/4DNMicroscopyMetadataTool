package edu.umassmed.microscopyMetadataTool.data.lightSourceCouplingGroup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javafx.scene.image.Image;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public abstract class LightSourceCouplingGroup extends MicroscopeComponent {
	
	private static final Path path = Paths.get(System.getProperty("user.dir")
			+ File.separator + "images" + File.separator
			+ "LightSourceCoupling.png");
	private static final Image img = new Image(LightSourceCouplingGroup.path
			.toUri().toString());

	private final String lensRef;
	private final String transmittance;
	
	public LightSourceCouplingGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);

		this.lensRef = "lensRef";
		this.transmittance = "transmittance";
	}

	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = super.getTiers();
		tiers.put("lensRef", 5);
		tiers.put("transmittance", 5);
		return tiers;
	}

	@Override
	public Image getImage() {
		return LightSourceCouplingGroup.img;
	}
}
