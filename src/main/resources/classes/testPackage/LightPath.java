
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterSetRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcitationFilterRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DichroicRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MirrorRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmissionFilterRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AdditionalOptics" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterSetRef",
    "excitationFilterRef",
    "dichroicRef",
    "emissionFilterRef",
    "additionalOptics",
    "annotationRef"
})
@XmlRootElement(name = "LightPath")
public class LightPath
    extends MicroscopeComponent
{

    @XmlElement(name = "FilterSetRef")
    protected List<FilterSetRef> filterSetRef;
    @XmlElement(name = "ExcitationFilterRef")
    protected List<FilterRef> excitationFilterRef;
    @XmlElement(name = "DichroicRef")
    protected List<MirrorRef> dichroicRef;
    @XmlElement(name = "EmissionFilterRef")
    protected List<FilterRef> emissionFilterRef;
    @XmlElement(name = "AdditionalOptics")
    protected AdditionalOptics additionalOptics;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;

    /**
     * Gets the value of the filterSetRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSetRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSetRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterSetRef }
     * 
     * 
     */
    public List<FilterSetRef> getFilterSetRef() {
        if (filterSetRef == null) {
            filterSetRef = new ArrayList<FilterSetRef>();
        }
        return this.filterSetRef;
    }

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
     * Gets the value of the dichroicRef property.
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
     * {@link MirrorRef }
     * 
     * 
     */
    public List<MirrorRef> getDichroicRef() {
        if (dichroicRef == null) {
            dichroicRef = new ArrayList<MirrorRef>();
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
     * Gets the value of the additionalOptics property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalOptics }
     *     
     */
    public AdditionalOptics getAdditionalOptics() {
        return additionalOptics;
    }

    /**
     * Sets the value of the additionalOptics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalOptics }
     *     
     */
    public void setAdditionalOptics(AdditionalOptics value) {
        this.additionalOptics = value;
    }

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

}
