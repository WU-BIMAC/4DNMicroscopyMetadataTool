
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The lightsource for the instrument. An instrument may have several light sources. The type of lightsource is specified by one of the child-elements which are 'Laser', 'Filament', 'Arc' or 'LightEmittingDiode'. Each of the light source types has its own Type attribute to further differentiate the light source (eg, Nd-YAG for Laser or Hg for Arc).
 *       
 * 
 * <p>Java class for LightSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LightSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ManufacturerSpec">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Power" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PowerUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsPower" default="mW" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightSource", propOrder = {
    "annotationRef"
})
@XmlSeeAlso({
    Laser.class,
    Arc.class,
    Filament.class,
    LightEmittingDiode.class,
    GenericExcitationSource.class
})
public class LightSource
    extends ManufacturerSpec
{

    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Power")
    protected Float power;
    @XmlAttribute(name = "PowerUnit")
    protected UnitsPower powerUnit;

    /**
     * Gets the value of the annotationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationRef }
     * 
     * 
     */
    public List<AnnotationRef> getAnnotationRef() {
        if (annotationRef == null) {
            annotationRef = new ArrayList<AnnotationRef>();
        }
        return this.annotationRef;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPower(Float value) {
        this.power = value;
    }

    /**
     * Gets the value of the powerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsPower }
     *     
     */
    public UnitsPower getPowerUnit() {
        if (powerUnit == null) {
            return UnitsPower.M_W;
        } else {
            return powerUnit;
        }
    }

    /**
     * Sets the value of the powerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsPower }
     *     
     */
    public void setPowerUnit(UnitsPower value) {
        this.powerUnit = value;
    }

}
