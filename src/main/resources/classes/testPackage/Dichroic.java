
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Mirror">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TransmittanceRange" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ReflectanceRange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FilterWheel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Polarization" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transmittanceRange",
    "reflectanceRange"
})
public class Dichroic
    extends Mirror
{

    @XmlElement(name = "TransmittanceRange", required = true)
    protected List<TransmittanceRange> transmittanceRange;
    @XmlElement(name = "ReflectanceRange", required = true)
    protected List<ReflectanceRange> reflectanceRange;
    @XmlAttribute(name = "FilterWheel")
    protected String filterWheel;
    @XmlAttribute(name = "Polarization")
    @XmlSchemaType(name = "anySimpleType")
    protected String polarization;

    /**
     * Gets the value of the transmittanceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transmittanceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransmittanceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransmittanceRange }
     * 
     * 
     */
    public List<TransmittanceRange> getTransmittanceRange() {
        if (transmittanceRange == null) {
            transmittanceRange = new ArrayList<TransmittanceRange>();
        }
        return this.transmittanceRange;
    }

    /**
     * Gets the value of the reflectanceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflectanceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflectanceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectanceRange }
     * 
     * 
     */
    public List<ReflectanceRange> getReflectanceRange() {
        if (reflectanceRange == null) {
            reflectanceRange = new ArrayList<ReflectanceRange>();
        }
        return this.reflectanceRange;
    }

    /**
     * Gets the value of the filterWheel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterWheel() {
        return filterWheel;
    }

    /**
     * Sets the value of the filterWheel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterWheel(String value) {
        this.filterWheel = value;
    }

    /**
     * Gets the value of the polarization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarization() {
        return polarization;
    }

    /**
     * Sets the value of the polarization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarization(String value) {
        this.polarization = value;
    }

}
