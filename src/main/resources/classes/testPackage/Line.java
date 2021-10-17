
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
 *       &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="MarkerStart" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Marker" />
 *       &lt;attribute name="MarkerEnd" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Marker" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Line
    extends Shape
{

    @XmlAttribute(name = "X1", required = true)
    protected float x1;
    @XmlAttribute(name = "Y1", required = true)
    protected float y1;
    @XmlAttribute(name = "X2", required = true)
    protected float x2;
    @XmlAttribute(name = "Y2", required = true)
    protected float y2;
    @XmlAttribute(name = "MarkerStart")
    protected Marker markerStart;
    @XmlAttribute(name = "MarkerEnd")
    protected Marker markerEnd;

    /**
     * Gets the value of the x1 property.
     * 
     */
    public float getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     */
    public void setX1(float value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the y1 property.
     * 
     */
    public float getY1() {
        return y1;
    }

    /**
     * Sets the value of the y1 property.
     * 
     */
    public void setY1(float value) {
        this.y1 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     */
    public float getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     */
    public void setX2(float value) {
        this.x2 = value;
    }

    /**
     * Gets the value of the y2 property.
     * 
     */
    public float getY2() {
        return y2;
    }

    /**
     * Sets the value of the y2 property.
     * 
     */
    public void setY2(float value) {
        this.y2 = value;
    }

    /**
     * Gets the value of the markerStart property.
     * 
     * @return
     *     possible object is
     *     {@link Marker }
     *     
     */
    public Marker getMarkerStart() {
        return markerStart;
    }

    /**
     * Sets the value of the markerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Marker }
     *     
     */
    public void setMarkerStart(Marker value) {
        this.markerStart = value;
    }

    /**
     * Gets the value of the markerEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Marker }
     *     
     */
    public Marker getMarkerEnd() {
        return markerEnd;
    }

    /**
     * Sets the value of the markerEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Marker }
     *     
     */
    public void setMarkerEnd(Marker value) {
        this.markerEnd = value;
    }

}
