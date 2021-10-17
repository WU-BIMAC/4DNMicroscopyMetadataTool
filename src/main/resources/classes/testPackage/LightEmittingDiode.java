
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSource">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WavelengthRange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PeakWavelenght" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PeakWavelenghtUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="LumenPower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="LumenPowerUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsPower" />
 *       &lt;attribute name="ProjectionAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ProjectionAngleUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsAngle" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wavelengthRange"
})
public class LightEmittingDiode
    extends LightSource
{

    @XmlElement(name = "WavelengthRange", required = true)
    protected List<WavelengthRange> wavelengthRange;
    @XmlAttribute(name = "PeakWavelenght")
    protected Float peakWavelenght;
    @XmlAttribute(name = "PeakWavelenghtUnit")
    protected String peakWavelenghtUnit;
    @XmlAttribute(name = "LumenPower")
    protected Float lumenPower;
    @XmlAttribute(name = "LumenPowerUnit")
    protected UnitsPower lumenPowerUnit;
    @XmlAttribute(name = "ProjectionAngle")
    protected Float projectionAngle;
    @XmlAttribute(name = "ProjectionAngleUnit")
    protected UnitsAngle projectionAngleUnit;

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
     * Gets the value of the peakWavelenght property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeakWavelenght() {
        return peakWavelenght;
    }

    /**
     * Sets the value of the peakWavelenght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeakWavelenght(Float value) {
        this.peakWavelenght = value;
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
        if (peakWavelenghtUnit == null) {
            return "nm";
        } else {
            return peakWavelenghtUnit;
        }
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
     * Gets the value of the lumenPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLumenPower() {
        return lumenPower;
    }

    /**
     * Sets the value of the lumenPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLumenPower(Float value) {
        this.lumenPower = value;
    }

    /**
     * Gets the value of the lumenPowerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsPower }
     *     
     */
    public UnitsPower getLumenPowerUnit() {
        return lumenPowerUnit;
    }

    /**
     * Sets the value of the lumenPowerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsPower }
     *     
     */
    public void setLumenPowerUnit(UnitsPower value) {
        this.lumenPowerUnit = value;
    }

    /**
     * Gets the value of the projectionAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProjectionAngle() {
        return projectionAngle;
    }

    /**
     * Sets the value of the projectionAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProjectionAngle(Float value) {
        this.projectionAngle = value;
    }

    /**
     * Gets the value of the projectionAngleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsAngle }
     *     
     */
    public UnitsAngle getProjectionAngleUnit() {
        return projectionAngleUnit;
    }

    /**
     * Sets the value of the projectionAngleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsAngle }
     *     
     */
    public void setProjectionAngleUnit(UnitsAngle value) {
        this.projectionAngleUnit = value;
    }

}
