
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}SampleHolderRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="XUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="YUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="Z" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ZUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sampleHolderRef"
})
@XmlRootElement(name = "SamplePosition")
public class SamplePosition
    extends MicroscopeComponent
{

    @XmlElement(name = "SampleHolderRef", required = true)
    protected SampleHolderRef sampleHolderRef;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "X")
    protected Float x;
    @XmlAttribute(name = "XUnit")
    protected String xUnit;
    @XmlAttribute(name = "Y")
    protected Float y;
    @XmlAttribute(name = "YUnit")
    protected String yUnit;
    @XmlAttribute(name = "Z")
    protected Float z;
    @XmlAttribute(name = "ZUnit")
    protected String zUnit;

    /**
     * Gets the value of the sampleHolderRef property.
     * 
     * @return
     *     possible object is
     *     {@link SampleHolderRef }
     *     
     */
    public SampleHolderRef getSampleHolderRef() {
        return sampleHolderRef;
    }

    /**
     * Sets the value of the sampleHolderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleHolderRef }
     *     
     */
    public void setSampleHolderRef(SampleHolderRef value) {
        this.sampleHolderRef = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setX(Float value) {
        this.x = value;
    }

    /**
     * Gets the value of the xUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXUnit() {
        if (xUnit == null) {
            return "reference frame";
        } else {
            return xUnit;
        }
    }

    /**
     * Sets the value of the xUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXUnit(String value) {
        this.xUnit = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setY(Float value) {
        this.y = value;
    }

    /**
     * Gets the value of the yUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYUnit() {
        if (yUnit == null) {
            return "reference frame";
        } else {
            return yUnit;
        }
    }

    /**
     * Sets the value of the yUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYUnit(String value) {
        this.yUnit = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZ(Float value) {
        this.z = value;
    }

    /**
     * Gets the value of the zUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUnit() {
        if (zUnit == null) {
            return "reference frame";
        } else {
            return zUnit;
        }
    }

    /**
     * Sets the value of the zUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUnit(String value) {
        this.zUnit = value;
    }

}
