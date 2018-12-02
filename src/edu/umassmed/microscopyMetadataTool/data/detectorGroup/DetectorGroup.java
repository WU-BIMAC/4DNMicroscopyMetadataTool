package edu.umassmed.microscopyMetadataTool.data.detectorGroup;

import java.util.LinkedHashMap;
import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public abstract class DetectorGroup extends MicroscopeComponent {
	
	private final String relayMagnification;
	private final String gain;
	private final String offset;
	private final String zoom;
	private final String readNoise;
	private final String noiseModel;
	private final String darkCurrentRate;
	private final String peakWavelength;
	private final String quantumEfficiencyAtPeakWavelength;
	private final String lowerWavelengthAtHalfPeak;
	private final String upperWavelengthAtHalfPeak;
	private final String ambientOperatingTemperature;
	private final String ambientOperatingHumidity;
	private final String annotationRef;
	
	public DetectorGroup(final String name, final Integer tier,
			final Double positionX, final Double positionY) {
		super(name, tier, positionX, positionY);

		this.relayMagnification = "relayMagnification";
		this.gain = "gain";
		this.offset = "offset";
		this.zoom = "zoom";
		this.readNoise = "readNoise";
		this.noiseModel = "noiseModel";
		this.darkCurrentRate = "darkCurrentRate";
		this.peakWavelength = "peakWavelength";
		this.quantumEfficiencyAtPeakWavelength = "quantumEfficiencyAtPeakWavelength";
		this.lowerWavelengthAtHalfPeak = "lowerWavelengthAtHalfPeak";
		this.upperWavelengthAtHalfPeak = "upperWavelengthAtHalfPeak";
		this.ambientOperatingTemperature = "ambientOperatingTemperature";
		this.ambientOperatingHumidity = "ambientOperatingHumidity";
		this.annotationRef = "annotationRef";

		this.setPercentSizeWidth(0.19);
		this.setPercentSizeHeight(0.46);
	}
	
	@Override
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("relayMagnification", 2);
		tiers.put("gain", 3);
		tiers.put("offset", 3);
		tiers.put("zoom", 3);
		tiers.put("readNoise", 5);
		tiers.put("noiseModel", 5);
		tiers.put("darkCurrentRate", 5);
		tiers.put("peakWavelength", 5);
		tiers.put("quantumEfficiencyatPeakWavelength", 5);
		tiers.put("lowerWavelengthAtHalfPeak", 5);
		tiers.put("upperWavelengthAtHalfPeak", 5);
		tiers.put("ambientOperatingTemperature", 5);
		tiers.put("ambientOperatingHumidity", 5);
		tiers.put("annotationRef", 5);
		return tiers;
	}
}
