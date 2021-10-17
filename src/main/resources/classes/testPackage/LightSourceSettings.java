
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
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceID" />
 *       &lt;attribute name="Attenuation" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PercentFraction" />
 *       &lt;attribute name="Wavelength" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="WavelengthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LightSourceSettings")
public class LightSourceSettings
    extends Settings
{

    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Attenuation")
    protected Float attenuation;
    @XmlAttribute(name = "Wavelength")
    protected Float wavelength;
    @XmlAttribute(name = "WavelengthUnit")
    protected String wavelengthUnit;

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
     * Gets the value of the attenuation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAttenuation() {
        return attenuation;
    }

    /**
     * Sets the value of the attenuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAttenuation(Float value) {
        this.attenuation = value;
    }

    /**
     * Gets the value of the wavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWavelength(Float value) {
        this.wavelength = value;
    }

    /**
     * Gets the value of the wavelengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWavelengthUnit() {
        if (wavelengthUnit == null) {
            return "nm";
        } else {
            return wavelengthUnit;
        }
    }

    /**
     * Sets the value of the wavelengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWavelengthUnit(String value) {
        this.wavelengthUnit = value;
    }

}
