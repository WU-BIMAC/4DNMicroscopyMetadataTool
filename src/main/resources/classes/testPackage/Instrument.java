
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Microscope" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MicroscopeTable" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceCouplingGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}SampleHolder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FocusingGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AutoFucus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Objective" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Lens" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Prism" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PolarizationOptics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Filter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MirrorGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}InstrumentID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "microscope",
    "microscopeTable",
    "lightSourceGroup",
    "lightSourceCouplingGroup",
    "sampleHolder",
    "focusingGroup",
    "autoFucus",
    "objective",
    "lens",
    "prism",
    "polarizationOptics",
    "filterSet",
    "filter",
    "mirrorGroup",
    "detectorGroup",
    "annotationRef"
})
@XmlRootElement(name = "Instrument")
public class Instrument
    extends MicroscopeComponent
{

    @XmlElement(name = "Microscope")
    protected Microscope microscope;
    @XmlElement(name = "MicroscopeTable")
    protected MicroscopeTable microscopeTable;
    @XmlElementRef(name = "LightSourceGroup", namespace = "http://www.openmicroscopy.org/Schemas/OME/2016-06", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends LightSource>> lightSourceGroup;
    @XmlElementRef(name = "LightSourceCouplingGroup", namespace = "http://www.openmicroscopy.org/Schemas/OME/2016-06", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends LightSourceCoupling>> lightSourceCouplingGroup;
    @XmlElement(name = "SampleHolder")
    protected List<SampleHolder> sampleHolder;
    @XmlElementRef(name = "FocusingGroup", namespace = "http://www.openmicroscopy.org/Schemas/OME/2016-06", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Focusing>> focusingGroup;
    @XmlElement(name = "AutoFucus")
    protected List<AutoFucus> autoFucus;
    @XmlElement(name = "Objective")
    protected List<Objective> objective;
    @XmlElement(name = "Lens")
    protected List<Lens> lens;
    @XmlElement(name = "Prism")
    protected List<Prism> prism;
    @XmlElement(name = "PolarizationOptics")
    protected List<PolarizationOptics> polarizationOptics;
    @XmlElement(name = "FilterSet")
    protected List<FilterSet> filterSet;
    @XmlElement(name = "Filter")
    protected List<Filter> filter;
    @XmlElementRef(name = "MirrorGroup", namespace = "http://www.openmicroscopy.org/Schemas/OME/2016-06", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Mirror>> mirrorGroup;
    @XmlElementRef(name = "DetectorGroup", namespace = "http://www.openmicroscopy.org/Schemas/OME/2016-06", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Detector>> detectorGroup;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the microscope property.
     * 
     * @return
     *     possible object is
     *     {@link Microscope }
     *     
     */
    public Microscope getMicroscope() {
        return microscope;
    }

    /**
     * Sets the value of the microscope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Microscope }
     *     
     */
    public void setMicroscope(Microscope value) {
        this.microscope = value;
    }

    /**
     * Gets the value of the microscopeTable property.
     * 
     * @return
     *     possible object is
     *     {@link MicroscopeTable }
     *     
     */
    public MicroscopeTable getMicroscopeTable() {
        return microscopeTable;
    }

    /**
     * Sets the value of the microscopeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicroscopeTable }
     *     
     */
    public void setMicroscopeTable(MicroscopeTable value) {
        this.microscopeTable = value;
    }

    /**
     * Gets the value of the lightSourceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightSourceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightSourceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Laser }{@code >}
     * {@link JAXBElement }{@code <}{@link Filament }{@code >}
     * {@link JAXBElement }{@code <}{@link LightEmittingDiode }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericExcitationSource }{@code >}
     * {@link JAXBElement }{@code <}{@link Arc }{@code >}
     * {@link JAXBElement }{@code <}{@link LightSource }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends LightSource>> getLightSourceGroup() {
        if (lightSourceGroup == null) {
            lightSourceGroup = new ArrayList<JAXBElement<? extends LightSource>>();
        }
        return this.lightSourceGroup;
    }

    /**
     * Gets the value of the lightSourceCouplingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightSourceCouplingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightSourceCouplingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Direct }{@code >}
     * {@link JAXBElement }{@code <}{@link LightGuide }{@code >}
     * {@link JAXBElement }{@code <}{@link LightSourceCoupling }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends LightSourceCoupling>> getLightSourceCouplingGroup() {
        if (lightSourceCouplingGroup == null) {
            lightSourceCouplingGroup = new ArrayList<JAXBElement<? extends LightSourceCoupling>>();
        }
        return this.lightSourceCouplingGroup;
    }

    /**
     * Gets the value of the sampleHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SampleHolder }
     * 
     * 
     */
    public List<SampleHolder> getSampleHolder() {
        if (sampleHolder == null) {
            sampleHolder = new ArrayList<SampleHolder>();
        }
        return this.sampleHolder;
    }

    /**
     * Gets the value of the focusingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the focusingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFocusingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PiezoElectricGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link PiezoElectricStage }{@code >}
     * {@link JAXBElement }{@code <}{@link MechanicalStage }{@code >}
     * {@link JAXBElement }{@code <}{@link Focusing }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Focusing>> getFocusingGroup() {
        if (focusingGroup == null) {
            focusingGroup = new ArrayList<JAXBElement<? extends Focusing>>();
        }
        return this.focusingGroup;
    }

    /**
     * Gets the value of the autoFucus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoFucus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoFucus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoFucus }
     * 
     * 
     */
    public List<AutoFucus> getAutoFucus() {
        if (autoFucus == null) {
            autoFucus = new ArrayList<AutoFucus>();
        }
        return this.autoFucus;
    }

    /**
     * Gets the value of the objective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objective }
     * 
     * 
     */
    public List<Objective> getObjective() {
        if (objective == null) {
            objective = new ArrayList<Objective>();
        }
        return this.objective;
    }

    /**
     * Gets the value of the lens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lens }
     * 
     * 
     */
    public List<Lens> getLens() {
        if (lens == null) {
            lens = new ArrayList<Lens>();
        }
        return this.lens;
    }

    /**
     * Gets the value of the prism property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prism property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrism().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prism }
     * 
     * 
     */
    public List<Prism> getPrism() {
        if (prism == null) {
            prism = new ArrayList<Prism>();
        }
        return this.prism;
    }

    /**
     * Gets the value of the polarizationOptics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polarizationOptics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolarizationOptics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolarizationOptics }
     * 
     * 
     */
    public List<PolarizationOptics> getPolarizationOptics() {
        if (polarizationOptics == null) {
            polarizationOptics = new ArrayList<PolarizationOptics>();
        }
        return this.polarizationOptics;
    }

    /**
     * Gets the value of the filterSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterSet }
     * 
     * 
     */
    public List<FilterSet> getFilterSet() {
        if (filterSet == null) {
            filterSet = new ArrayList<FilterSet>();
        }
        return this.filterSet;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filter }
     * 
     * 
     */
    public List<Filter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<Filter>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the mirrorGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mirrorGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMirrorGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Dichroic }{@code >}
     * {@link JAXBElement }{@code <}{@link Reflector }{@code >}
     * {@link JAXBElement }{@code <}{@link BeamSplitter }{@code >}
     * {@link JAXBElement }{@code <}{@link Mirror }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Mirror>> getMirrorGroup() {
        if (mirrorGroup == null) {
            mirrorGroup = new ArrayList<JAXBElement<? extends Mirror>>();
        }
        return this.mirrorGroup;
    }

    /**
     * Gets the value of the detectorGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detectorGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetectorGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PhotoMultiplier }{@code >}
     * {@link JAXBElement }{@code <}{@link CMOS }{@code >}
     * {@link JAXBElement }{@code <}{@link IntensifiedCCD }{@code >}
     * {@link JAXBElement }{@code <}{@link CCD }{@code >}
     * {@link JAXBElement }{@code <}{@link AnalogVideo }{@code >}
     * {@link JAXBElement }{@code <}{@link Camera }{@code >}
     * {@link JAXBElement }{@code <}{@link Detector }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Detector>> getDetectorGroup() {
        if (detectorGroup == null) {
            detectorGroup = new ArrayList<JAXBElement<? extends Detector>>();
        }
        return this.detectorGroup;
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
