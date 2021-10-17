
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
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TypeAnnotation">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}BinaryFile"/>
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
    "binaryFile"
})
@XmlRootElement(name = "FileAnnotation")
public class FileAnnotation
    extends TypeAnnotation
{

    @XmlElement(name = "BinaryFile", required = true)
    protected BinaryFile binaryFile;

    /**
     * Gets the value of the binaryFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryFile }
     *     
     */
    public BinaryFile getBinaryFile() {
        return binaryFile;
    }

    /**
     * Sets the value of the binaryFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryFile }
     *     
     */
    public void setBinaryFile(BinaryFile value) {
        this.binaryFile = value;
    }

}
