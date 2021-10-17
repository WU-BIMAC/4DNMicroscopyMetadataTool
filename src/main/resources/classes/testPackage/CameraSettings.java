
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorSettings">
 *       &lt;attribute name="Binning" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Binning" />
 *       &lt;attribute name="AnalogToDigitalConverter" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EMGain" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ReadOutRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ReadOutRateUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsFrequency" default="Hz" />
 *       &lt;attribute name="FrameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="FrameRateUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsFrequency" default="fps" />
 *       &lt;attribute name="OperatingTemperature" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OperatingTemperatureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTemperature" default="°C" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CameraSettings
    extends DetectorSettings
{

    @XmlAttribute(name = "Binning")
    protected String binning;
    @XmlAttribute(name = "AnalogToDigitalConverter")
    @XmlSchemaType(name = "anySimpleType")
    protected String analogToDigitalConverter;
    @XmlAttribute(name = "EMGain")
    @XmlSchemaType(name = "anySimpleType")
    protected String emGain;
    @XmlAttribute(name = "ReadOutRate")
    protected Float readOutRate;
    @XmlAttribute(name = "ReadOutRateUnit")
    protected String readOutRateUnit;
    @XmlAttribute(name = "FrameRate")
    protected Float frameRate;
    @XmlAttribute(name = "FrameRateUnit")
    protected String frameRateUnit;
    @XmlAttribute(name = "OperatingTemperature")
    @XmlSchemaType(name = "anySimpleType")
    protected String operatingTemperature;
    @XmlAttribute(name = "OperatingTemperatureUnit")
    protected UnitsTemperature operatingTemperatureUnit;

    /**
     * Gets the value of the binning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinning() {
        return binning;
    }

    /**
     * Sets the value of the binning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinning(String value) {
        this.binning = value;
    }

    /**
     * Gets the value of the analogToDigitalConverter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogToDigitalConverter() {
        return analogToDigitalConverter;
    }

    /**
     * Sets the value of the analogToDigitalConverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogToDigitalConverter(String value) {
        this.analogToDigitalConverter = value;
    }

    /**
     * Gets the value of the emGain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMGain() {
        return emGain;
    }

    /**
     * Sets the value of the emGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMGain(String value) {
        this.emGain = value;
    }

    /**
     * Gets the value of the readOutRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReadOutRate() {
        return readOutRate;
    }

    /**
     * Sets the value of the readOutRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReadOutRate(Float value) {
        this.readOutRate = value;
    }

    /**
     * Gets the value of the readOutRateUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOutRateUnit() {
        if (readOutRateUnit == null) {
            return "Hz";
        } else {
            return readOutRateUnit;
        }
    }

    /**
     * Sets the value of the readOutRateUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOutRateUnit(String value) {
        this.readOutRateUnit = value;
    }

    /**
     * Gets the value of the frameRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFrameRate() {
        return frameRate;
    }

    /**
     * Sets the value of the frameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFrameRate(Float value) {
        this.frameRate = value;
    }

    /**
     * Gets the value of the frameRateUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameRateUnit() {
        if (frameRateUnit == null) {
            return "fps";
        } else {
            return frameRateUnit;
        }
    }

    /**
     * Sets the value of the frameRateUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameRateUnit(String value) {
        this.frameRateUnit = value;
    }

    /**
     * Gets the value of the operatingTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingTemperature() {
        return operatingTemperature;
    }

    /**
     * Sets the value of the operatingTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingTemperature(String value) {
        this.operatingTemperature = value;
    }

    /**
     * Gets the value of the operatingTemperatureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsTemperature }
     *     
     */
    public UnitsTemperature getOperatingTemperatureUnit() {
        if (operatingTemperatureUnit == null) {
            return UnitsTemperature.C;
        } else {
            return operatingTemperatureUnit;
        }
    }

    /**
     * Sets the value of the operatingTemperatureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsTemperature }
     *     
     */
    public void setOperatingTemperatureUnit(UnitsTemperature value) {
        this.operatingTemperatureUnit = value;
    }

}
