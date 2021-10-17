
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
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MicroscopeID" />
 *       &lt;attribute name="OptovarMagnification" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TotalEffectiveMagnification" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MicroscopeSettings")
public class MicroscopeSettings
    extends Settings
{

    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "OptovarMagnification")
    protected Float optovarMagnification;
    @XmlAttribute(name = "TotalEffectiveMagnification")
    protected Float totalEffectiveMagnification;

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
     * Gets the value of the optovarMagnification property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOptovarMagnification() {
        return optovarMagnification;
    }

    /**
     * Sets the value of the optovarMagnification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOptovarMagnification(Float value) {
        this.optovarMagnification = value;
    }

    /**
     * Gets the value of the totalEffectiveMagnification property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalEffectiveMagnification() {
        return totalEffectiveMagnification;
    }

    /**
     * Sets the value of the totalEffectiveMagnification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalEffectiveMagnification(Float value) {
        this.totalEffectiveMagnification = value;
    }

}
