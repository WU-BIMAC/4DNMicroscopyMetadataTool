
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Sample"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MicrobeamManipulation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TIRFSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimentID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;list>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="FRET"/>
 *                 &lt;enumeration value="TimeLapse"/>
 *                 &lt;enumeration value="FourDPlus"/>
 *                 &lt;enumeration value="HightThroughputScreen"/>
 *                 &lt;enumeration value="Electrophysiology"/>
 *                 &lt;enumeration value="IonImaging"/>
 *                 &lt;enumeration value="Co-localization"/>
 *                 &lt;enumeration value="PGI-Documentation"/>
 *                 &lt;enumeration value="FRAP"/>
 *                 &lt;enumeration value="FLIM"/>
 *                 &lt;enumeration value="SpectralImaging"/>
 *                 &lt;enumeration value="OpticalTrapping"/>
 *                 &lt;enumeration value="PhotoAblation"/>
 *                 &lt;enumeration value="PhotoActivation"/>
 *                 &lt;enumeration value="SPIM"/>
 *                 &lt;enumeration value="Other"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/list>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LabellingMethod">
 *         &lt;simpleType>
 *           &lt;list>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="FluorescentProtein"/>
 *                 &lt;enumeration value="FISH"/>
 *                 &lt;enumeration value="SingleMoleculeFISH"/>
 *                 &lt;enumeration value="CASFISH"/>
 *                 &lt;enumeration value="ImmunoFluorescence"/>
 *                 &lt;enumeration value="Immunocytochemistry"/>
 *                 &lt;enumeration value="None"/>
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
    "sample",
    "microbeamManipulation",
    "tirfSettings",
    "annotationRef"
})
@XmlRootElement(name = "Experiment")
public class Experiment
    extends MicroscopeComponent
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExperimenterRef", required = true)
    protected ExperimenterRef experimenterRef;
    @XmlElement(name = "Sample", required = true)
    protected Sample sample;
    @XmlElement(name = "MicrobeamManipulation")
    protected List<MicrobeamManipulation> microbeamManipulation;
    @XmlElement(name = "TIRFSettings")
    protected List<TIRFSettings> tirfSettings;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected List<String> type;
    @XmlAttribute(name = "LabellingMethod")
    protected List<String> labellingMethod;

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
     * 
     *               This is a link to the Experimenter who conducted the experiment
     *             
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
     * Gets the value of the sample property.
     * 
     * @return
     *     possible object is
     *     {@link Sample }
     *     
     */
    public Sample getSample() {
        return sample;
    }

    /**
     * Sets the value of the sample property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sample }
     *     
     */
    public void setSample(Sample value) {
        this.sample = value;
    }

    /**
     * Gets the value of the microbeamManipulation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbeamManipulation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobeamManipulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrobeamManipulation }
     * 
     * 
     */
    public List<MicrobeamManipulation> getMicrobeamManipulation() {
        if (microbeamManipulation == null) {
            microbeamManipulation = new ArrayList<MicrobeamManipulation>();
        }
        return this.microbeamManipulation;
    }

    /**
     * Gets the value of the tirfSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tirfSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIRFSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIRFSettings }
     * 
     * 
     */
    public List<TIRFSettings> getTIRFSettings() {
        if (tirfSettings == null) {
            tirfSettings = new ArrayList<TIRFSettings>();
        }
        return this.tirfSettings;
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

    /**
     * Gets the value of the labellingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labellingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabellingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLabellingMethod() {
        if (labellingMethod == null) {
            labellingMethod = new ArrayList<String>();
        }
        return this.labellingMethod;
    }

}
