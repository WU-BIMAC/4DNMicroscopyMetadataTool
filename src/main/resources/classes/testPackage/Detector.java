
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Detector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Detector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ManufacturerSpec">
 *       &lt;sequence>
 *         &lt;element name="RelayLensRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LensRef"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WavelengthRange" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Gain" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Offset" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Zoom" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ReadNoise" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NoiseModel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Poisson"/>
 *             &lt;enumeration value="Gaussian"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DarkCurrentRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="DarkCurrentRateUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsElectricCurrent" default=" e-/pixel/sec" />
 *       &lt;attribute name="PeakWavelength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PeakWavelenghtUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="QuantumEfficiency" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AmbientOperatingTemperature" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AmbientOperatingTemperatureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTemperature" default="°C" />
 *       &lt;attribute name="AmbientOperatingHumidity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detector", propOrder = {
    "relayLensRef",
    "wavelengthRange",
    "annotationRef"
})
@XmlSeeAlso({
    PhotoMultiplier.class,
    Camera.class
})
public class Detector
    extends ManufacturerSpec
{

    @XmlElement(name = "RelayLensRef", required = true)
    protected LensRef relayLensRef;
    @XmlElement(name = "WavelengthRange", required = true)
    protected List<WavelengthRange> wavelengthRange;
    @XmlElement(name = "AnnotationRef", required = true)
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Gain")
    protected Float gain;
    @XmlAttribute(name = "Offset")
    protected Float offset;
    @XmlAttribute(name = "Zoom")
    protected Float zoom;
    @XmlAttribute(name = "ReadNoise")
    @XmlSchemaType(name = "anySimpleType")
    protected String readNoise;
    @XmlAttribute(name = "NoiseModel")
    protected String noiseModel;
    @XmlAttribute(name = "DarkCurrentRate")
    protected Float darkCurrentRate;
    @XmlAttribute(name = "DarkCurrentRateUnit")
    protected UnitsElectricCurrent darkCurrentRateUnit;
    @XmlAttribute(name = "PeakWavelength")
    protected String peakWavelength;
    @XmlAttribute(name = "PeakWavelenghtUnit")
    protected String peakWavelenghtUnit;
    @XmlAttribute(name = "QuantumEfficiency")
    protected Float quantumEfficiency;
    @XmlAttribute(name = "AmbientOperatingTemperature")
    protected Float ambientOperatingTemperature;
    @XmlAttribute(name = "AmbientOperatingTemperatureUnit")
    protected UnitsTemperature ambientOperatingTemperatureUnit;
    @XmlAttribute(name = "AmbientOperatingHumidity")
    protected Float ambientOperatingHumidity;

    /**
     * Gets the value of the relayLensRef property.
     * 
     * @return
     *     possible object is
     *     {@link LensRef }
     *     
     */
    public LensRef getRelayLensRef() {
        return relayLensRef;
    }

    /**
     * Sets the value of the relayLensRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LensRef }
     *     
     */
    public void setRelayLensRef(LensRef value) {
        this.relayLensRef = value;
    }

    /**
     * Gets the value of the wavelengthRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wavelengthRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWavelengthRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WavelengthRange }
     * 
     * 
     */
    public List<WavelengthRange> getWavelengthRange() {
        if (wavelengthRange == null) {
            wavelengthRange = new ArrayList<WavelengthRange>();
        }
        return this.wavelengthRange;
    }

    /**
     * Gets the value of the annotationRef property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationRef }
     *     
     */
    public AnnotationRef getAnnotationRef() {
        return annotationRef;
    }

    /**
     * Sets the value of the annotationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationRef }
     *     
     */
    public void setAnnotationRef(AnnotationRef value) {
        this.annotationRef = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGain(Float value) {
        this.gain = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOffset(Float value) {
        this.offset = value;
    }

    /**
     * Gets the value of the zoom property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZoom(Float value) {
        this.zoom = value;
    }

    /**
     * Gets the value of the readNoise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadNoise() {
        return readNoise;
    }

    /**
     * Sets the value of the readNoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadNoise(String value) {
        this.readNoise = value;
    }

    /**
     * Gets the value of the noiseModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoiseModel() {
        return noiseModel;
    }

    /**
     * Sets the value of the noiseModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoiseModel(String value) {
        this.noiseModel = value;
    }

    /**
     * Gets the value of the darkCurrentRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDarkCurrentRate() {
        return darkCurrentRate;
    }

    /**
     * Sets the value of the darkCurrentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDarkCurrentRate(Float value) {
        this.darkCurrentRate = value;
    }

    /**
     * Gets the value of the darkCurrentRateUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsElectricCurrent }
     *     
     */
    public UnitsElectricCurrent getDarkCurrentRateUnit() {
        if (darkCurrentRateUnit == null) {
            return UnitsElectricCurrent.E_PIXEL_SEC;
        } else {
            return darkCurrentRateUnit;
        }
    }

    /**
     * Sets the value of the darkCurrentRateUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsElectricCurrent }
     *     
     */
    public void setDarkCurrentRateUnit(UnitsElectricCurrent value) {
        this.darkCurrentRateUnit = value;
    }

    /**
     * Gets the value of the peakWavelength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeakWavelength() {
        return peakWavelength;
    }

    /**
     * Sets the value of the peakWavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeakWavelength(String value) {
        this.peakWavelength = value;
    }

    /**
     * Gets the value of the peakWavelenghtUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeakWavelenghtUnit() {
        return peakWavelenghtUnit;
    }

    /**
     * Sets the value of the peakWavelenghtUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeakWavelenghtUnit(String value) {
        this.peakWavelenghtUnit = value;
    }

    /**
     * Gets the value of the quantumEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantumEfficiency() {
        return quantumEfficiency;
    }

    /**
     * Sets the value of the quantumEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantumEfficiency(Float value) {
        this.quantumEfficiency = value;
    }

    /**
     * Gets the value of the ambientOperatingTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmbientOperatingTemperature() {
        return ambientOperatingTemperature;
    }

    /**
     * Sets the value of the ambientOperatingTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmbientOperatingTemperature(Float value) {
        this.ambientOperatingTemperature = value;
    }

    /**
     * Gets the value of the ambientOperatingTemperatureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsTemperature }
     *     
     */
    public UnitsTemperature getAmbientOperatingTemperatureUnit() {
        if (ambientOperatingTemperatureUnit == null) {
            return UnitsTemperature.C;
        } else {
            return ambientOperatingTemperatureUnit;
        }
    }

    /**
     * Sets the value of the ambientOperatingTemperatureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsTemperature }
     *     
     */
    public void setAmbientOperatingTemperatureUnit(UnitsTemperature value) {
        this.ambientOperatingTemperatureUnit = value;
    }

    /**
     * Gets the value of the ambientOperatingHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmbientOperatingHumidity() {
        return ambientOperatingHumidity;
    }

    /**
     * Sets the value of the ambientOperatingHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmbientOperatingHumidity(Float value) {
        this.ambientOperatingHumidity = value;
    }

}
