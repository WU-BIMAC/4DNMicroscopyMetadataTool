
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
 *       &lt;attribute name="Points" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
public class Polyline
    extends Shape
{

    @XmlAttribute(name = "Points", required = true)
    protected String points;
    @XmlAttribute(name = "MarkerStart")
    protected Marker markerStart;
    @XmlAttribute(name = "MarkerEnd")
    protected Marker markerEnd;

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoints(String value) {
        this.points = value;
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
