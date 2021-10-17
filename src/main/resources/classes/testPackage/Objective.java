
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ManufacturerSpec">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ObjectiveID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Correction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="UV"/>
 *             &lt;enumeration value="PlanApo"/>
 *             &lt;enumeration value="PlanFluor"/>
 *             &lt;enumeration value="SuperFluor"/>
 *             &lt;enumeration value="VioletCorrected"/>
 *             &lt;enumeration value="Achro"/>
 *             &lt;enumeration value="Achromat"/>
 *             &lt;enumeration value="Fluor"/>
 *             &lt;enumeration value="Fl"/>
 *             &lt;enumeration value="Fluar"/>
 *             &lt;enumeration value="Neofluar"/>
 *             &lt;enumeration value="Fluotar"/>
 *             &lt;enumeration value="Apo"/>
 *             &lt;enumeration value="PlanNeofluar"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NominalImmersionMedium">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Air"/>
 *             &lt;enumeration value="Glycerol"/>
 *             &lt;enumeration value="Multi"/>
 *             &lt;enumeration value="Oil"/>
 *             &lt;enumeration value="Water"/>
 *             &lt;enumeration value="WaterDipping"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LensNA" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="NominalMagnification" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="CalibratedMagnification" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="WorkingDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="WorkingDistanceUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="FieldNumber" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="FieldNumberUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="mm" />
 *       &lt;attribute name="Iris" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "annotationRef"
})
@XmlRootElement(name = "Objective")
public class Objective
    extends ManufacturerSpec
{

    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Correction")
    protected String correction;
    @XmlAttribute(name = "NominalImmersionMedium")
    protected String nominalImmersionMedium;
    @XmlAttribute(name = "LensNA")
    protected Float lensNA;
    @XmlAttribute(name = "NominalMagnification")
    protected Float nominalMagnification;
    @XmlAttribute(name = "CalibratedMagnification")
    protected Float calibratedMagnification;
    @XmlAttribute(name = "WorkingDistance")
    protected Float workingDistance;
    @XmlAttribute(name = "WorkingDistanceUnit")
    protected String workingDistanceUnit;
    @XmlAttribute(name = "FieldNumber")
    protected Float fieldNumber;
    @XmlAttribute(name = "FieldNumberUnit")
    protected String fieldNumberUnit;
    @XmlAttribute(name = "Iris")
    protected Boolean iris;

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
     * Gets the value of the correction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrection(String value) {
        this.correction = value;
    }

    /**
     * Gets the value of the nominalImmersionMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalImmersionMedium() {
        return nominalImmersionMedium;
    }

    /**
     * Sets the value of the nominalImmersionMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalImmersionMedium(String value) {
        this.nominalImmersionMedium = value;
    }

    /**
     * Gets the value of the lensNA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLensNA() {
        return lensNA;
    }

    /**
     * Sets the value of the lensNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLensNA(Float value) {
        this.lensNA = value;
    }

    /**
     * Gets the value of the nominalMagnification property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominalMagnification() {
        return nominalMagnification;
    }

    /**
     * Sets the value of the nominalMagnification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNominalMagnification(Float value) {
        this.nominalMagnification = value;
    }

    /**
     * Gets the value of the calibratedMagnification property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCalibratedMagnification() {
        return calibratedMagnification;
    }

    /**
     * Sets the value of the calibratedMagnification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCalibratedMagnification(Float value) {
        this.calibratedMagnification = value;
    }

    /**
     * Gets the value of the workingDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWorkingDistance() {
        return workingDistance;
    }

    /**
     * Sets the value of the workingDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWorkingDistance(Float value) {
        this.workingDistance = value;
    }

    /**
     * Gets the value of the workingDistanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDistanceUnit() {
        if (workingDistanceUnit == null) {
            return "\u00b5m";
        } else {
            return workingDistanceUnit;
        }
    }

    /**
     * Sets the value of the workingDistanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDistanceUnit(String value) {
        this.workingDistanceUnit = value;
    }

    /**
     * Gets the value of the fieldNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFieldNumber() {
        return fieldNumber;
    }

    /**
     * Sets the value of the fieldNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFieldNumber(Float value) {
        this.fieldNumber = value;
    }

    /**
     * Gets the value of the fieldNumberUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNumberUnit() {
        if (fieldNumberUnit == null) {
            return "mm";
        } else {
            return fieldNumberUnit;
        }
    }

    /**
     * Sets the value of the fieldNumberUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNumberUnit(String value) {
        this.fieldNumberUnit = value;
    }

    /**
     * Gets the value of the iris property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIris(Boolean value) {
        this.iris = value;
    }

}
