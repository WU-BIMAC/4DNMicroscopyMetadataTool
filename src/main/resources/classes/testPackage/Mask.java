
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Shape">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}BinData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "binData"
})
public class Mask
    extends Shape
{

    @XmlElement(name = "BinData", required = true)
    protected BinData binData;
    @XmlAttribute(name = "X", required = true)
    protected float x;
    @XmlAttribute(name = "Y", required = true)
    protected float y;
    @XmlAttribute(name = "Width", required = true)
    protected float width;
    @XmlAttribute(name = "Height", required = true)
    protected float height;

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
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(float value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

}
