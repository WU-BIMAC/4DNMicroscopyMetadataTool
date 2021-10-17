
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Settings">
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ObjectiveID" />
 *       &lt;attribute name="CorrectionCollar" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ImmersionMedium" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Air"/>
 *             &lt;enumeration value="Glycerol"/>
 *             &lt;enumeration value="Multi"/>
 *             &lt;enumeration value="Oil"/>
 *             &lt;enumeration value="Water"/>
 *             &lt;enumeration value="WaterDripping"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RefractiveIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="MeasuredRefractiveIndex" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Temperature" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TemperatureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTemperature" default="°C" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ObjectiveSettings")
public class ObjectiveSettings
    extends Settings
{

    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "CorrectionCollar")
    protected Float correctionCollar;
    @XmlAttribute(name = "ImmersionMedium", required = true)
    protected String immersionMedium;
    @XmlAttribute(name = "RefractiveIndex", required = true)
    protected float refractiveIndex;
    @XmlAttribute(name = "MeasuredRefractiveIndex")
    protected Float measuredRefractiveIndex;
    @XmlAttribute(name = "Temperature")
    protected Float temperature;
    @XmlAttribute(name = "TemperatureUnit")
    protected UnitsTemperature temperatureUnit;

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
     * Gets the value of the correctionCollar property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCorrectionCollar() {
        return correctionCollar;
    }

    /**
     * Sets the value of the correctionCollar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCorrectionCollar(Float value) {
        this.correctionCollar = value;
    }

    /**
     * Gets the value of the immersionMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmersionMedium() {
        return immersionMedium;
    }

    /**
     * Sets the value of the immersionMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmersionMedium(String value) {
        this.immersionMedium = value;
    }

    /**
     * Gets the value of the refractiveIndex property.
     * 
     */
    public float getRefractiveIndex() {
        return refractiveIndex;
    }

    /**
     * Sets the value of the refractiveIndex property.
     * 
     */
    public void setRefractiveIndex(float value) {
        this.refractiveIndex = value;
    }

    /**
     * Gets the value of the measuredRefractiveIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeasuredRefractiveIndex() {
        return measuredRefractiveIndex;
    }

    /**
     * Sets the value of the measuredRefractiveIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeasuredRefractiveIndex(Float value) {
        this.measuredRefractiveIndex = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemperature(Float value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the temperatureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsTemperature }
     *     
     */
    public UnitsTemperature getTemperatureUnit() {
        if (temperatureUnit == null) {
            return UnitsTemperature.C;
        } else {
            return temperatureUnit;
        }
    }

    /**
     * Sets the value of the temperatureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsTemperature }
     *     
     */
    public void setTemperatureUnit(UnitsTemperature value) {
        this.temperatureUnit = value;
    }

}
