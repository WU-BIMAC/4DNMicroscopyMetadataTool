
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;


/**
 * 
 *         A matrix used to transform the shape.
 *         \u23a1 A00, A01, A02 \u23a4
 *         \u23a2 A10, A11, A12 \u23a5
 *         \u23a3 0,   0,   1   \u23a6
 *       
 * 
 * <p>Java class for AffineTransform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffineTransform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="A00" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="A10" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="A01" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="A11" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="A02" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="A12" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffineTransform")
public class AffineTransform
    extends MicroscopeComponent
{

    @XmlAttribute(name = "A00", required = true)
    protected float a00;
    @XmlAttribute(name = "A10", required = true)
    protected float a10;
    @XmlAttribute(name = "A01", required = true)
    protected float a01;
    @XmlAttribute(name = "A11", required = true)
    protected float a11;
    @XmlAttribute(name = "A02", required = true)
    protected float a02;
    @XmlAttribute(name = "A12", required = true)
    protected float a12;

    /**
     * Gets the value of the a00 property.
     * 
     */
    public float getA00() {
        return a00;
    }

    /**
     * Sets the value of the a00 property.
     * 
     */
    public void setA00(float value) {
        this.a00 = value;
    }

    /**
     * Gets the value of the a10 property.
     * 
     */
    public float getA10() {
        return a10;
    }

    /**
     * Sets the value of the a10 property.
     * 
     */
    public void setA10(float value) {
        this.a10 = value;
    }

    /**
     * Gets the value of the a01 property.
     * 
     */
    public float getA01() {
        return a01;
    }

    /**
     * Sets the value of the a01 property.
     * 
     */
    public void setA01(float value) {
        this.a01 = value;
    }

    /**
     * Gets the value of the a11 property.
     * 
     */
    public float getA11() {
        return a11;
    }

    /**
     * Sets the value of the a11 property.
     * 
     */
    public void setA11(float value) {
        this.a11 = value;
    }

    /**
     * Gets the value of the a02 property.
     * 
     */
    public float getA02() {
        return a02;
    }

    /**
     * Sets the value of the a02 property.
     * 
     */
    public void setA02(float value) {
        this.a02 = value;
    }

    /**
     * Gets the value of the a12 property.
     * 
     */
    public float getA12() {
        return a12;
    }

    /**
     * Sets the value of the a12 property.
     * 
     */
    public void setA12(float value) {
        this.a12 = value;
    }

}
