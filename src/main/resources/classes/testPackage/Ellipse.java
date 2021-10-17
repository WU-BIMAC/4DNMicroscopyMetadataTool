
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RadiusX" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RadiusY" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Ellipse
    extends Shape
{

    @XmlAttribute(name = "X", required = true)
    protected float x;
    @XmlAttribute(name = "Y", required = true)
    protected float y;
    @XmlAttribute(name = "RadiusX", required = true)
    protected float radiusX;
    @XmlAttribute(name = "RadiusY", required = true)
    protected float radiusY;

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
     * Gets the value of the radiusX property.
     * 
     */
    public float getRadiusX() {
        return radiusX;
    }

    /**
     * Sets the value of the radiusX property.
     * 
     */
    public void setRadiusX(float value) {
        this.radiusX = value;
    }

    /**
     * Gets the value of the radiusY property.
     * 
     */
    public float getRadiusY() {
        return radiusY;
    }

    /**
     * Sets the value of the radiusY property.
     * 
     */
    public void setRadiusY(float value) {
        this.radiusY = value;
    }

}
