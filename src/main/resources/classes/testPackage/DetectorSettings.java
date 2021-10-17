
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetectorSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Settings">
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorID" />
 *       &lt;attribute name="Integration" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="EffectiveOffset" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetectorSettings")
@XmlSeeAlso({
    CameraSettings.class,
    PhotoMultiplierSettings.class
})
public class DetectorSettings
    extends Settings
{

    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Integration")
    protected Integer integration;
    @XmlAttribute(name = "EffectiveOffset")
    protected Float effectiveOffset;

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
     * Gets the value of the integration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * Sets the value of the integration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegration(Integer value) {
        this.integration = value;
    }

    /**
     * Gets the value of the effectiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEffectiveOffset() {
        return effectiveOffset;
    }

    /**
     * Sets the value of the effectiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEffectiveOffset(Float value) {
        this.effectiveOffset = value;
    }

}
