
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Rights" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Project" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Dataset" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Folder" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Experiment" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Plate" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Screen" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Experimenter" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimenterGroup" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Instrument" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Image" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}StructuredAnnotations" minOccurs="0"/>
 *             &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ROI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="BinaryOnly">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="MetadataFile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="UUID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UniversallyUniqueIdentifier" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="UUID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UniversallyUniqueIdentifier" />
 *       &lt;attribute name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rights",
    "project",
    "dataset",
    "folder",
    "experiment",
    "plate",
    "screen",
    "experimenter",
    "experimenterGroup",
    "instrument",
    "image",
    "structuredAnnotations",
    "roi",
    "binaryOnly"
})
@XmlRootElement(name = "OME")
public class OME
    extends MicroscopeComponent
{

    @XmlElement(name = "Rights")
    protected Rights rights;
    @XmlElement(name = "Project")
    protected List<Project> project;
    @XmlElement(name = "Dataset")
    protected List<Dataset> dataset;
    @XmlElement(name = "Folder")
    protected List<Folder> folder;
    @XmlElement(name = "Experiment")
    protected List<Experiment> experiment;
    @XmlElement(name = "Plate")
    protected List<Plate> plate;
    @XmlElement(name = "Screen")
    protected List<Screen> screen;
    @XmlElement(name = "Experimenter")
    protected List<Experimenter> experimenter;
    @XmlElement(name = "ExperimenterGroup")
    protected List<ExperimenterGroup> experimenterGroup;
    @XmlElement(name = "Instrument")
    protected List<Instrument> instrument;
    @XmlElement(name = "Image")
    protected List<Image> image;
    @XmlElement(name = "StructuredAnnotations")
    protected StructuredAnnotations structuredAnnotations;
    @XmlElement(name = "ROI")
    protected List<ROI> roi;
    @XmlElement(name = "BinaryOnly")
    protected OME.BinaryOnly binaryOnly;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "Creator")
    protected String creator;

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link Rights }
     *     
     */
    public Rights getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rights }
     *     
     */
    public void setRights(Rights value) {
        this.rights = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the project property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project }
     * 
     * 
     */
    public List<Project> getProject() {
        if (project == null) {
            project = new ArrayList<Project>();
        }
        return this.project;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataset }
     * 
     * 
     */
    public List<Dataset> getDataset() {
        if (dataset == null) {
            dataset = new ArrayList<Dataset>();
        }
        return this.dataset;
    }

    /**
     * Gets the value of the folder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Folder }
     * 
     * 
     */
    public List<Folder> getFolder() {
        if (folder == null) {
            folder = new ArrayList<Folder>();
        }
        return this.folder;
    }

    /**
     * Gets the value of the experiment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experiment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperiment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Experiment }
     * 
     * 
     */
    public List<Experiment> getExperiment() {
        if (experiment == null) {
            experiment = new ArrayList<Experiment>();
        }
        return this.experiment;
    }

    /**
     * Gets the value of the plate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plate }
     * 
     * 
     */
    public List<Plate> getPlate() {
        if (plate == null) {
            plate = new ArrayList<Plate>();
        }
        return this.plate;
    }

    /**
     * Gets the value of the screen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Screen }
     * 
     * 
     */
    public List<Screen> getScreen() {
        if (screen == null) {
            screen = new ArrayList<Screen>();
        }
        return this.screen;
    }

    /**
     * Gets the value of the experimenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Experimenter }
     * 
     * 
     */
    public List<Experimenter> getExperimenter() {
        if (experimenter == null) {
            experimenter = new ArrayList<Experimenter>();
        }
        return this.experimenter;
    }

    /**
     * Gets the value of the experimenterGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimenterGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimenterGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimenterGroup }
     * 
     * 
     */
    public List<ExperimenterGroup> getExperimenterGroup() {
        if (experimenterGroup == null) {
            experimenterGroup = new ArrayList<ExperimenterGroup>();
        }
        return this.experimenterGroup;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instrument }
     * 
     * 
     */
    public List<Instrument> getInstrument() {
        if (instrument == null) {
            instrument = new ArrayList<Instrument>();
        }
        return this.instrument;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * 
     * 
     */
    public List<Image> getImage() {
        if (image == null) {
            image = new ArrayList<Image>();
        }
        return this.image;
    }

    /**
     * Gets the value of the structuredAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredAnnotations }
     *     
     */
    public StructuredAnnotations getStructuredAnnotations() {
        return structuredAnnotations;
    }

    /**
     * Sets the value of the structuredAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredAnnotations }
     *     
     */
    public void setStructuredAnnotations(StructuredAnnotations value) {
        this.structuredAnnotations = value;
    }

    /**
     * Gets the value of the roi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROI }
     * 
     * 
     */
    public List<ROI> getROI() {
        if (roi == null) {
            roi = new ArrayList<ROI>();
        }
        return this.roi;
    }

    /**
     * Gets the value of the binaryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link OME.BinaryOnly }
     *     
     */
    public OME.BinaryOnly getBinaryOnly() {
        return binaryOnly;
    }

    /**
     * Sets the value of the binaryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link OME.BinaryOnly }
     *     
     */
    public void setBinaryOnly(OME.BinaryOnly value) {
        this.binaryOnly = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="MetadataFile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UUID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UniversallyUniqueIdentifier" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BinaryOnly
        extends MicroscopeComponent
    {

        @XmlAttribute(name = "MetadataFile", required = true)
        protected String metadataFile;
        @XmlAttribute(name = "UUID", required = true)
        protected String uuid;

        /**
         * Gets the value of the metadataFile property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadataFile() {
            return metadataFile;
        }

        /**
         * Sets the value of the metadataFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadataFile(String value) {
            this.metadataFile = value;
        }

        /**
         * Gets the value of the uuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUUID() {
            return uuid;
        }

        /**
         * Sets the value of the uuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUUID(String value) {
            this.uuid = value;
        }

    }

}
