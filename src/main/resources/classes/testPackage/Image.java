
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="AcquisitionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimenterRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimenterGroupRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}InstrumentRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ROIRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MicrobeamManipulationRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TIRFSettingsRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimentRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImagingEnvironment" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MicroscopeSettings" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}StagePosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}SamplePosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ObjectiveSettings" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Pixels"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImageID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acquisitionDate",
    "description",
    "experimenterRef",
    "experimenterGroupRef",
    "instrumentRef",
    "roiRef",
    "microbeamManipulationRef",
    "tirfSettingsRef",
    "experimentRef",
    "imagingEnvironment",
    "microscopeSettings",
    "stagePosition",
    "samplePosition",
    "objectiveSettings",
    "pixels",
    "annotationRef"
})
@XmlRootElement(name = "Image")
public class Image
    extends MicroscopeComponent
{

    @XmlElement(name = "AcquisitionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acquisitionDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExperimenterRef")
    protected ExperimenterRef experimenterRef;
    @XmlElement(name = "ExperimenterGroupRef")
    protected ExperimenterGroupRef experimenterGroupRef;
    @XmlElement(name = "InstrumentRef")
    protected InstrumentRef instrumentRef;
    @XmlElement(name = "ROIRef")
    protected List<ROIRef> roiRef;
    @XmlElement(name = "MicrobeamManipulationRef")
    protected List<MicrobeamManipulationRef> microbeamManipulationRef;
    @XmlElement(name = "TIRFSettingsRef")
    protected List<TIRFSettingsRef> tirfSettingsRef;
    @XmlElement(name = "ExperimentRef")
    protected ExperimentRef experimentRef;
    @XmlElement(name = "ImagingEnvironment")
    protected ImagingEnvironment imagingEnvironment;
    @XmlElement(name = "MicroscopeSettings")
    protected MicroscopeSettings microscopeSettings;
    @XmlElement(name = "StagePosition")
    protected StagePosition stagePosition;
    @XmlElement(name = "SamplePosition")
    protected SamplePosition samplePosition;
    @XmlElement(name = "ObjectiveSettings")
    protected ObjectiveSettings objectiveSettings;
    @XmlElement(name = "Pixels", required = true)
    protected Pixels pixels;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the acquisitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Sets the value of the acquisitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionDate(XMLGregorianCalendar value) {
        this.acquisitionDate = value;
    }

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
     * Gets the value of the experimenterGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimenterGroupRef }
     *     
     */
    public ExperimenterGroupRef getExperimenterGroupRef() {
        return experimenterGroupRef;
    }

    /**
     * Sets the value of the experimenterGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimenterGroupRef }
     *     
     */
    public void setExperimenterGroupRef(ExperimenterGroupRef value) {
        this.experimenterGroupRef = value;
    }

    /**
     * Gets the value of the instrumentRef property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentRef }
     *     
     */
    public InstrumentRef getInstrumentRef() {
        return instrumentRef;
    }

    /**
     * Sets the value of the instrumentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentRef }
     *     
     */
    public void setInstrumentRef(InstrumentRef value) {
        this.instrumentRef = value;
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
     * Gets the value of the microbeamManipulationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbeamManipulationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobeamManipulationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrobeamManipulationRef }
     * 
     * 
     */
    public List<MicrobeamManipulationRef> getMicrobeamManipulationRef() {
        if (microbeamManipulationRef == null) {
            microbeamManipulationRef = new ArrayList<MicrobeamManipulationRef>();
        }
        return this.microbeamManipulationRef;
    }

    /**
     * Gets the value of the tirfSettingsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tirfSettingsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIRFSettingsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIRFSettingsRef }
     * 
     * 
     */
    public List<TIRFSettingsRef> getTIRFSettingsRef() {
        if (tirfSettingsRef == null) {
            tirfSettingsRef = new ArrayList<TIRFSettingsRef>();
        }
        return this.tirfSettingsRef;
    }

    /**
     * This element describes the type of experiment.  
     * The required Type attribute must contain one or more entries from the following list:
     * FRET, Time-lapse, 4D+, HightThroughputScreen, FISH, Electrophysiology, Ion-Imaging, Co-localization, PGI/Documentation FRAP, Photo-ablation, Optical-Trapping, Photo-activation, Fluorescence-Lifetime, Spectral-Imaging, Other
     * The required LabellingMethod attribute must contain one or more entries from the following list:
     * FluorescentProtein, CASFISH, FISH, Single-Molecule-FISH, Indirect-Immunofluorescene, Immunocytochemistry, None, Other
     * PGI/Documentation is not a 'data' image.
     * The optional Description element may contain free text to further describe the experiment.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentRef }
     *     
     */
    public ExperimentRef getExperimentRef() {
        return experimentRef;
    }

    /**
     * Sets the value of the experimentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentRef }
     *     
     */
    public void setExperimentRef(ExperimentRef value) {
        this.experimentRef = value;
    }

    /**
     * Gets the value of the imagingEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingEnvironment }
     *     
     */
    public ImagingEnvironment getImagingEnvironment() {
        return imagingEnvironment;
    }

    /**
     * Sets the value of the imagingEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingEnvironment }
     *     
     */
    public void setImagingEnvironment(ImagingEnvironment value) {
        this.imagingEnvironment = value;
    }

    /**
     * Gets the value of the microscopeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link MicroscopeSettings }
     *     
     */
    public MicroscopeSettings getMicroscopeSettings() {
        return microscopeSettings;
    }

    /**
     * Sets the value of the microscopeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicroscopeSettings }
     *     
     */
    public void setMicroscopeSettings(MicroscopeSettings value) {
        this.microscopeSettings = value;
    }

    /**
     * StagePosition used to be called StateLabel. It is used to specify a name and location for a stage position in the microscope's reference frame.
     * 
     * @return
     *     possible object is
     *     {@link StagePosition }
     *     
     */
    public StagePosition getStagePosition() {
        return stagePosition;
    }

    /**
     * Sets the value of the stagePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StagePosition }
     *     
     */
    public void setStagePosition(StagePosition value) {
        this.stagePosition = value;
    }

    /**
     * Gets the value of the samplePosition property.
     * 
     * @return
     *     possible object is
     *     {@link SamplePosition }
     *     
     */
    public SamplePosition getSamplePosition() {
        return samplePosition;
    }

    /**
     * Sets the value of the samplePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplePosition }
     *     
     */
    public void setSamplePosition(SamplePosition value) {
        this.samplePosition = value;
    }

    /**
     * Gets the value of the objectiveSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectiveSettings }
     *     
     */
    public ObjectiveSettings getObjectiveSettings() {
        return objectiveSettings;
    }

    /**
     * Sets the value of the objectiveSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectiveSettings }
     *     
     */
    public void setObjectiveSettings(ObjectiveSettings value) {
        this.objectiveSettings = value;
    }

    /**
     * Gets the value of the pixels property.
     * 
     * @return
     *     possible object is
     *     {@link Pixels }
     *     
     */
    public Pixels getPixels() {
        return pixels;
    }

    /**
     * Sets the value of the pixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pixels }
     *     
     */
    public void setPixels(Pixels value) {
        this.pixels = value;
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

}
