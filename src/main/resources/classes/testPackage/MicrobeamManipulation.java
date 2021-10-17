
package testPackage;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimenterRef"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ROIRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MicrobeamManipulationID" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;list>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="FRAP"/>
 *                 &lt;enumeration value="FLIP"/>
 *                 &lt;enumeration value="InverseFRAP"/>
 *                 &lt;enumeration value="Photoablation"/>
 *                 &lt;enumeration value="Photoactivation"/>
 *                 &lt;enumeration value="Uncaging"/>
 *                 &lt;enumeration value="OpticalTrapping"/>
 *                 &lt;enumeration value="Other"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/list>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "experimenterRef",
    "roiRef",
    "lightSourceSettings",
    "annotationRef"
})
@XmlRootElement(name = "MicrobeamManipulation")
public class MicrobeamManipulation
    extends MicroscopeComponent
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExperimenterRef", required = true)
    protected ExperimenterRef experimenterRef;
    @XmlElement(name = "ROIRef", required = true)
    protected List<ROIRef> roiRef;
    @XmlElement(name = "LightSourceSettings")
    protected List<LightSourceSettings> lightSourceSettings;
    @XmlElement(name = "AnnotationRef", required = true)
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Type")
    protected List<String> type;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the experimenterRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimenterRef }
     *     
     */
    public ExperimenterRef getExperimenterRef() {
        return experimenterRef;
    }

    /**
     * Sets the value of the experimenterRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimenterRef }
     *     
     */
    public void setExperimenterRef(ExperimenterRef value) {
        this.experimenterRef = value;
    }

    /**
     * Gets the value of the roiRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roiRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROIRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROIRef }
     * 
     * 
     */
    public List<ROIRef> getROIRef() {
        if (roiRef == null) {
            roiRef = new ArrayList<ROIRef>();
        }
        return this.roiRef;
    }

    /**
     * This holds the setting applied to a LightSource e as well as a reference to the LightSource (the ID attribute) in question. The ID referes to the LightSource used in this case.Gets the value of the lightSourceSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightSourceSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightSourceSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightSourceSettings }
     * 
     * 
     */
    public List<LightSourceSettings> getLightSourceSettings() {
        if (lightSourceSettings == null) {
            lightSourceSettings = new ArrayList<LightSourceSettings>();
        }
        return this.lightSourceSettings;
    }

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
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

}
