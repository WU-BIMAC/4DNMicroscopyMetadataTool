
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
 *         &lt;element name="ExcitationFilterRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DichroicRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmissionFilterRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterSetID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "excitationFilterRef",
    "dichroicRef",
    "emissionFilterRef",
    "annotationRef"
})
@XmlRootElement(name = "FilterSet")
public class FilterSet
    extends ManufacturerSpec
{

    @XmlElement(name = "ExcitationFilterRef")
    protected List<FilterRef> excitationFilterRef;
    @XmlElement(name = "DichroicRef")
    protected List<DichroicRef> dichroicRef;
    @XmlElement(name = "EmissionFilterRef")
    protected List<FilterRef> emissionFilterRef;
    @XmlElement(name = "AnnotationRef")
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the excitationFilterRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excitationFilterRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcitationFilterRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterRef }
     * 
     * 
     */
    public List<FilterRef> getExcitationFilterRef() {
        if (excitationFilterRef == null) {
            excitationFilterRef = new ArrayList<FilterRef>();
        }
        return this.excitationFilterRef;
    }

    /**
     * This empty element has a reference (the Mirror ID attribute) to the Mirror/Dichroic placed in the light path.Gets the value of the dichroicRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dichroicRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDichroicRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DichroicRef }
     * 
     * 
     */
    public List<DichroicRef> getDichroicRef() {
        if (dichroicRef == null) {
            dichroicRef = new ArrayList<DichroicRef>();
        }
        return this.dichroicRef;
    }

    /**
     * Gets the value of the emissionFilterRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emissionFilterRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmissionFilterRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterRef }
     * 
     * 
     */
    public List<FilterRef> getEmissionFilterRef() {
        if (emissionFilterRef == null) {
            emissionFilterRef = new ArrayList<FilterRef>();
        }
        return this.emissionFilterRef;
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

}
