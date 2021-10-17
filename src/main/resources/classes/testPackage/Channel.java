
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceSettings" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceCouplingRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightPath" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorSettingsGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ChannelID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SamplesPerPixel" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="IlluminationType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Transmitted"/>
 *             &lt;enumeration value="Epifluorescence"/>
 *             &lt;enumeration value="Oblique"/>
 *             &lt;enumeration value="NonLinear"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PinholeSize" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PinholeSizeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="AcquisitionMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="WideField"/>
 *             &lt;enumeration value="LaserScanningConfocalMicroscopy"/>
 *             &lt;enumeration value="SpinningDiskConfocal"/>
 *             &lt;enumeration value="SlitScanConfocal"/>
 *             &lt;enumeration value="MultiPhotonMicroscopy"/>
 *             &lt;enumeration value="StructuredIllumination"/>
 *             &lt;enumeration value="SingleMoleculeImaging"/>
 *             &lt;enumeration value="TotalInternalReflection"/>
 *             &lt;enumeration value="FluorescenceLifetime"/>
 *             &lt;enumeration value="SpectralImaging"/>
 *             &lt;enumeration value="FluorescenceCorrelationSpectroscopy"/>
 *             &lt;enumeration value="NearFieldScanningOpticalMicroscopy"/>
 *             &lt;enumeration value="SecondHarmonicGenerationImaging"/>
 *             &lt;enumeration value="PALM"/>
 *             &lt;enumeration value="STORM"/>
 *             &lt;enumeration value="STED"/>
 *             &lt;enumeration value="TIRF"/>
 *             &lt;enumeration value="FSM"/>
 *             &lt;enumeration value="LCM"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="BrightField"/>
 *             &lt;enumeration value="SweptFieldConfocal"/>
 *             &lt;enumeration value="SPIM"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ContrastMethod">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Brightfield"/>
 *             &lt;enumeration value="Phase"/>
 *             &lt;enumeration value="DIC"/>
 *             &lt;enumeration value="HoffmanModulation"/>
 *             &lt;enumeration value="ObliqueIllumination"/>
 *             &lt;enumeration value="PolarizedLight"/>
 *             &lt;enumeration value="Darkfield"/>
 *             &lt;enumeration value="Fluorescence"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ExcitationWavelength" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="ExcitationWavelengthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="EmissionWavelength" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="EmissionWavelengthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="Fluorophore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NDFilter" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PockelCellSetting" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Color" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Color" default="-1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lightSourceSettings",
    "lightSourceCouplingRef",
    "lightPath",
    "detectorSettingsGroup",
    "annotationRef"
})
@XmlRootElement(name = "Channel")
public class Channel
    extends MicroscopeComponent
{

    @XmlElement(name = "LightSourceSettings")
    protected LightSourceSettings lightSourceSettings;
    @XmlElement(name = "LightSourceCouplingRef")
    protected LightSourceCouplingRef lightSourceCouplingRef;
    @XmlElement(name = "LightPath")
    protected LightPath lightPath;
    @XmlElementRef(name = "DetectorSettingsGroup", namespace = "http://www.openmicroscopy.org/Schemas/OME/2016-06", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DetectorSettings> detectorSettingsGroup;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "SamplesPerPixel")
    protected Integer samplesPerPixel;
    @XmlAttribute(name = "IlluminationType")
    protected String illuminationType;
    @XmlAttribute(name = "PinholeSize")
    protected Float pinholeSize;
    @XmlAttribute(name = "PinholeSizeUnit")
    protected String pinholeSizeUnit;
    @XmlAttribute(name = "AcquisitionMode")
    protected String acquisitionMode;
    @XmlAttribute(name = "ContrastMethod")
    protected String contrastMethod;
    @XmlAttribute(name = "ExcitationWavelength")
    protected Float excitationWavelength;
    @XmlAttribute(name = "ExcitationWavelengthUnit")
    protected String excitationWavelengthUnit;
    @XmlAttribute(name = "EmissionWavelength")
    protected Float emissionWavelength;
    @XmlAttribute(name = "EmissionWavelengthUnit")
    protected String emissionWavelengthUnit;
    @XmlAttribute(name = "Fluorophore")
    protected String fluorophore;
    @XmlAttribute(name = "NDFilter")
    protected Float ndFilter;
    @XmlAttribute(name = "PockelCellSetting")
    protected Integer pockelCellSetting;
    @XmlAttribute(name = "Color")
    protected Integer color;

    /**
     * This holds the setting applied to a LightSource e as well as a reference to the LightSource (the ID attribute) in question. The ID referes to the LightSource used in this case.
     * 
     * @return
     *     possible object is
     *     {@link LightSourceSettings }
     *     
     */
    public LightSourceSettings getLightSourceSettings() {
        return lightSourceSettings;
    }

    /**
     * Sets the value of the lightSourceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightSourceSettings }
     *     
     */
    public void setLightSourceSettings(LightSourceSettings value) {
        this.lightSourceSettings = value;
    }

    /**
     * This empty element can be used (via the required LightSourceCouplingID attribute) to refer to a LightSourceCoupling element defined within OME.
     * 
     * @return
     *     possible object is
     *     {@link LightSourceCouplingRef }
     *     
     */
    public LightSourceCouplingRef getLightSourceCouplingRef() {
        return lightSourceCouplingRef;
    }

    /**
     * Sets the value of the lightSourceCouplingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightSourceCouplingRef }
     *     
     */
    public void setLightSourceCouplingRef(LightSourceCouplingRef value) {
        this.lightSourceCouplingRef = value;
    }

    /**
     * Gets the value of the lightPath property.
     * 
     * @return
     *     possible object is
     *     {@link LightPath }
     *     
     */
    public LightPath getLightPath() {
        return lightPath;
    }

    /**
     * Sets the value of the lightPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightPath }
     *     
     */
    public void setLightPath(LightPath value) {
        this.lightPath = value;
    }

    /**
     * Gets the value of the detectorSettingsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhotoMultiplierSettings }{@code >}
     *     {@link JAXBElement }{@code <}{@link CameraSettings }{@code >}
     *     {@link JAXBElement }{@code <}{@link DetectorSettings }{@code >}
     *     
     */
    public JAXBElement<? extends DetectorSettings> getDetectorSettingsGroup() {
        return detectorSettingsGroup;
    }

    /**
     * Sets the value of the detectorSettingsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhotoMultiplierSettings }{@code >}
     *     {@link JAXBElement }{@code <}{@link CameraSettings }{@code >}
     *     {@link JAXBElement }{@code <}{@link DetectorSettings }{@code >}
     *     
     */
    public void setDetectorSettingsGroup(JAXBElement<? extends DetectorSettings> value) {
        this.detectorSettingsGroup = value;
    }

    /**
     * Gets the value of the annotationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationRef }
     * 
     * 
     */
    public List<AnnotationRef> getAnnotationRef() {
        if (annotationRef == null) {
            annotationRef = new ArrayList<AnnotationRef>();
        }
        return this.annotationRef;
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
     * Gets the value of the samplesPerPixel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSamplesPerPixel() {
        return samplesPerPixel;
    }

    /**
     * Sets the value of the samplesPerPixel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSamplesPerPixel(Integer value) {
        this.samplesPerPixel = value;
    }

    /**
     * Gets the value of the illuminationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlluminationType() {
        return illuminationType;
    }

    /**
     * Sets the value of the illuminationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlluminationType(String value) {
        this.illuminationType = value;
    }

    /**
     * Gets the value of the pinholeSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPinholeSize() {
        return pinholeSize;
    }

    /**
     * Sets the value of the pinholeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPinholeSize(Float value) {
        this.pinholeSize = value;
    }

    /**
     * Gets the value of the pinholeSizeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinholeSizeUnit() {
        if (pinholeSizeUnit == null) {
            return "\u00b5m";
        } else {
            return pinholeSizeUnit;
        }
    }

    /**
     * Sets the value of the pinholeSizeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinholeSizeUnit(String value) {
        this.pinholeSizeUnit = value;
    }

    /**
     * Gets the value of the acquisitionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionMode() {
        return acquisitionMode;
    }

    /**
     * Sets the value of the acquisitionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionMode(String value) {
        this.acquisitionMode = value;
    }

    /**
     * Gets the value of the contrastMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrastMethod() {
        return contrastMethod;
    }

    /**
     * Sets the value of the contrastMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrastMethod(String value) {
        this.contrastMethod = value;
    }

    /**
     * Gets the value of the excitationWavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExcitationWavelength() {
        return excitationWavelength;
    }

    /**
     * Sets the value of the excitationWavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExcitationWavelength(Float value) {
        this.excitationWavelength = value;
    }

    /**
     * Gets the value of the excitationWavelengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcitationWavelengthUnit() {
        if (excitationWavelengthUnit == null) {
            return "nm";
        } else {
            return excitationWavelengthUnit;
        }
    }

    /**
     * Sets the value of the excitationWavelengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcitationWavelengthUnit(String value) {
        this.excitationWavelengthUnit = value;
    }

    /**
     * Gets the value of the emissionWavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEmissionWavelength() {
        return emissionWavelength;
    }

    /**
     * Sets the value of the emissionWavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEmissionWavelength(Float value) {
        this.emissionWavelength = value;
    }

    /**
     * Gets the value of the emissionWavelengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissionWavelengthUnit() {
        if (emissionWavelengthUnit == null) {
            return "nm";
        } else {
            return emissionWavelengthUnit;
        }
    }

    /**
     * Sets the value of the emissionWavelengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissionWavelengthUnit(String value) {
        this.emissionWavelengthUnit = value;
    }

    /**
     * Gets the value of the fluorophore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluorophore() {
        return fluorophore;
    }

    /**
     * Sets the value of the fluorophore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluorophore(String value) {
        this.fluorophore = value;
    }

    /**
     * Gets the value of the ndFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNDFilter() {
        return ndFilter;
    }

    /**
     * Sets the value of the ndFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNDFilter(Float value) {
        this.ndFilter = value;
    }

    /**
     * Gets the value of the pockelCellSetting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPockelCellSetting() {
        return pockelCellSetting;
    }

    /**
     * Sets the value of the pockelCellSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPockelCellSetting(Integer value) {
        this.pockelCellSetting = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getColor() {
        if (color == null) {
            return -1;
        } else {
            return color;
        }
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColor(Integer value) {
        this.color = value;
    }

}
