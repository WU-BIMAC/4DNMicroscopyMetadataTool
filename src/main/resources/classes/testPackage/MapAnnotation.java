
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Annotation">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Map"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "MapAnnotation")
public class MapAnnotation
    extends Annotation
{

    @XmlElement(name = "Value", required = true)
    protected Map value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setValue(Map value) {
        this.value = value;
    }

}
