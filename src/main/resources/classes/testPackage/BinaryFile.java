
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}External"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}BinData"/>
 *       &lt;/choice>
 *       &lt;attribute name="FileName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Size" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeLong" />
 *       &lt;attribute name="MIMEType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "external",
    "binData"
})
@XmlRootElement(name = "BinaryFile")
public class BinaryFile
    extends MicroscopeComponent
{

    @XmlElement(name = "External")
    protected External external;
    @XmlElement(name = "BinData")
    protected BinData binData;
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    @XmlAttribute(name = "Size", required = true)
    protected long size;
    @XmlAttribute(name = "MIMEType")
    protected String mimeType;

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link External }
     *     
     */
    public External getExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link External }
     *     
     */
    public void setExternal(External value) {
        this.external = value;
    }

    /**
     * Gets the value of the binData property.
     * 
     * @return
     *     possible object is
     *     {@link BinData }
     *     
     */
    public BinData getBinData() {
        return binData;
    }

    /**
     * Sets the value of the binData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinData }
     *     
     */
    public void setBinData(BinData value) {
        this.binData = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEType(String value) {
        this.mimeType = value;
    }

}
