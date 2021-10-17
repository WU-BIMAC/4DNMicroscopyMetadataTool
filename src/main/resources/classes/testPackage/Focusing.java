
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This element describes the objective lens and stage positioning device(s) available in this microscope. An instrument may have more than one of these devices. The type of focusing device is specified by one of the child-element which are 'MechanicalStage', 'PiezoElectricSate', or 'PiezoElectricObjective'. 
 * 
 * <p>Java class for Focusing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Focusing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Stage">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LSID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Resolution" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ResolutionUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="PositionLinearityError" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PositionLinearityErrorUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="SettingTime" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="SettlingTimeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTime" default="ms" />
 *       &lt;attribute name="Repetability" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RepeatabilityUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Focusing", propOrder = {
    "annotationRef"
})
@XmlSeeAlso({
    MechanicalStage.class,
    PiezoElectricStage.class,
    PiezoElectricGroup.class
})
public class Focusing
    extends Stage
{

    @XmlElement(name = "AnnotationRef", required = true)
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Resolution")
    protected Float resolution;
    @XmlAttribute(name = "ResolutionUnit")
    protected String resolutionUnit;
    @XmlAttribute(name = "PositionLinearityError")
    protected Float positionLinearityError;
    @XmlAttribute(name = "PositionLinearityErrorUnit")
    protected String positionLinearityErrorUnit;
    @XmlAttribute(name = "SettingTime")
    protected Float settingTime;
    @XmlAttribute(name = "SettlingTimeUnit")
    protected String settlingTimeUnit;
    @XmlAttribute(name = "Repetability")
    protected Float repetability;
    @XmlAttribute(name = "RepeatabilityUnit")
    protected String repeatabilityUnit;

    /**
     * Gets the value of the annotationRef property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationRef }
     *     
     */
    public AnnotationRef getAnnotationRef() {
        return annotationRef;
    }

    /**
     * Sets the value of the annotationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationRef }
     *     
     */
    public void setAnnotationRef(AnnotationRef value) {
        this.annotationRef = value;
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
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResolution(Float value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the resolutionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionUnit() {
        if (resolutionUnit == null) {
            return "nm";
        } else {
            return resolutionUnit;
        }
    }

    /**
     * Sets the value of the resolutionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionUnit(String value) {
        this.resolutionUnit = value;
    }

    /**
     * Gets the value of the positionLinearityError property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositionLinearityError() {
        return positionLinearityError;
    }

    /**
     * Sets the value of the positionLinearityError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositionLinearityError(Float value) {
        this.positionLinearityError = value;
    }

    /**
     * Gets the value of the positionLinearityErrorUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionLinearityErrorUnit() {
        if (positionLinearityErrorUnit == null) {
            return "nm";
        } else {
            return positionLinearityErrorUnit;
        }
    }

    /**
     * Sets the value of the positionLinearityErrorUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionLinearityErrorUnit(String value) {
        this.positionLinearityErrorUnit = value;
    }

    /**
     * Gets the value of the settingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSettingTime() {
        return settingTime;
    }

    /**
     * Sets the value of the settingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSettingTime(Float value) {
        this.settingTime = value;
    }

    /**
     * Gets the value of the settlingTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlingTimeUnit() {
        if (settlingTimeUnit == null) {
            return "ms";
        } else {
            return settlingTimeUnit;
        }
    }

    /**
     * Sets the value of the settlingTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlingTimeUnit(String value) {
        this.settlingTimeUnit = value;
    }

    /**
     * Gets the value of the repetability property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRepetability() {
        return repetability;
    }

    /**
     * Sets the value of the repetability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRepetability(Float value) {
        this.repetability = value;
    }

    /**
     * Gets the value of the repeatabilityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatabilityUnit() {
        if (repeatabilityUnit == null) {
            return "nm";
        } else {
            return repeatabilityUnit;
        }
    }

    /**
     * Sets the value of the repeatabilityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatabilityUnit(String value) {
        this.repeatabilityUnit = value;
    }

}
