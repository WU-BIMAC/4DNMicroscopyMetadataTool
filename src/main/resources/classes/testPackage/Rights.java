
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="RightsHolder" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RightsHeld" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rightsHolder",
    "rightsHeld"
})
@XmlRootElement(name = "Rights")
public class Rights
    extends MicroscopeComponent
{

    @XmlElement(name = "RightsHolder")
    protected String rightsHolder;
    @XmlElement(name = "RightsHeld")
    protected String rightsHeld;

    /**
     * Gets the value of the rightsHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsHolder() {
        return rightsHolder;
    }

    /**
     * Sets the value of the rightsHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsHolder(String value) {
        this.rightsHolder = value;
    }

    /**
     * Gets the value of the rightsHeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsHeld() {
        return rightsHeld;
    }

    /**
     * Sets the value of the rightsHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsHeld(String value) {
        this.rightsHeld = value;
    }

}
