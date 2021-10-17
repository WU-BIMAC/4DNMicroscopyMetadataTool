
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ManufacturerSpec">
 *       &lt;attribute name="MovementAxes" default="Z">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Z"/>
 *             &lt;enumeration value="XYZ"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="XTravelRange" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="XTravelRangeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="YTravelRange" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="YTravelRangeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="ZTravelRange" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ZTravelRangeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="MaxVelocity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="MaxVelocityUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsVelocity" default="nm/s" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stage")
@XmlSeeAlso({
    Focusing.class,
    SampleHolder.class
})
public class Stage
    extends ManufacturerSpec
{

    @XmlAttribute(name = "MovementAxes")
    protected String movementAxes;
    @XmlAttribute(name = "XTravelRange")
    protected Float xTravelRange;
    @XmlAttribute(name = "XTravelRangeUnit")
    protected String xTravelRangeUnit;
    @XmlAttribute(name = "YTravelRange")
    protected Float yTravelRange;
    @XmlAttribute(name = "YTravelRangeUnit")
    protected String yTravelRangeUnit;
    @XmlAttribute(name = "ZTravelRange")
    protected Float zTravelRange;
    @XmlAttribute(name = "ZTravelRangeUnit")
    protected String zTravelRangeUnit;
    @XmlAttribute(name = "MaxVelocity")
    protected Float maxVelocity;
    @XmlAttribute(name = "MaxVelocityUnit")
    protected UnitsVelocity maxVelocityUnit;

    /**
     * Gets the value of the movementAxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementAxes() {
        if (movementAxes == null) {
            return "Z";
        } else {
            return movementAxes;
        }
    }

    /**
     * Sets the value of the movementAxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementAxes(String value) {
        this.movementAxes = value;
    }

    /**
     * Gets the value of the xTravelRange property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXTravelRange() {
        return xTravelRange;
    }

    /**
     * Sets the value of the xTravelRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXTravelRange(Float value) {
        this.xTravelRange = value;
    }

    /**
     * Gets the value of the xTravelRangeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXTravelRangeUnit() {
        if (xTravelRangeUnit == null) {
            return "\u00b5m";
        } else {
            return xTravelRangeUnit;
        }
    }

    /**
     * Sets the value of the xTravelRangeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXTravelRangeUnit(String value) {
        this.xTravelRangeUnit = value;
    }

    /**
     * Gets the value of the yTravelRange property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYTravelRange() {
        return yTravelRange;
    }

    /**
     * Sets the value of the yTravelRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYTravelRange(Float value) {
        this.yTravelRange = value;
    }

    /**
     * Gets the value of the yTravelRangeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYTravelRangeUnit() {
        if (yTravelRangeUnit == null) {
            return "\u00b5m";
        } else {
            return yTravelRangeUnit;
        }
    }

    /**
     * Sets the value of the yTravelRangeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYTravelRangeUnit(String value) {
        this.yTravelRangeUnit = value;
    }

    /**
     * Gets the value of the zTravelRange property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZTravelRange() {
        return zTravelRange;
    }

    /**
     * Sets the value of the zTravelRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZTravelRange(Float value) {
        this.zTravelRange = value;
    }

    /**
     * Gets the value of the zTravelRangeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZTravelRangeUnit() {
        if (zTravelRangeUnit == null) {
            return "\u00b5m";
        } else {
            return zTravelRangeUnit;
        }
    }

    /**
     * Sets the value of the zTravelRangeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZTravelRangeUnit(String value) {
        this.zTravelRangeUnit = value;
    }

    /**
     * Gets the value of the maxVelocity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxVelocity() {
        return maxVelocity;
    }

    /**
     * Sets the value of the maxVelocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxVelocity(Float value) {
        this.maxVelocity = value;
    }

    /**
     * Gets the value of the maxVelocityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsVelocity }
     *     
     */
    public UnitsVelocity getMaxVelocityUnit() {
        if (maxVelocityUnit == null) {
            return UnitsVelocity.NM_S;
        } else {
            return maxVelocityUnit;
        }
    }

    /**
     * Sets the value of the maxVelocityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsVelocity }
     *     
     */
    public void setMaxVelocityUnit(UnitsVelocity value) {
        this.maxVelocityUnit = value;
    }

}
