
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
 *         &lt;element name="FlatFieldImageRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *                 &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImageID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetectorDarkMapRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *                 &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorDarkMapID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetectorReadMapRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *                 &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorReadMapID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultiColorBeadsImageRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Multi-ColorBeads"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImageID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PSFJReportRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *                 &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PSFJReportID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LSID" />
 *       &lt;attribute name="LightPowerAtMicroscope" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="LightPowerAtMicroscopeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsPower" />
 *       &lt;attribute name="DarkValue" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PhotometricConversion" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ReadNoise" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="IlluminationIntensity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TestTubeSettings_1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TestTubeSettings_2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TestTubeSettings_3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ImagingStandard">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Argolight"/>
 *             &lt;enumeration value="Geller MRS4"/>
 *             &lt;enumeration value="DNA origami"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
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
    "flatFieldImageRef",
    "detectorDarkMapRef",
    "detectorReadMapRef",
    "multiColorBeadsImageRef",
    "psfjReportRef",
    "annotationRef"
})
@XmlRootElement(name = "Calibration")
public class Calibration
    extends MicroscopeComponent
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FlatFieldImageRef")
    protected List<Calibration.FlatFieldImageRef> flatFieldImageRef;
    @XmlElement(name = "DetectorDarkMapRef")
    protected Calibration.DetectorDarkMapRef detectorDarkMapRef;
    @XmlElement(name = "DetectorReadMapRef")
    protected Calibration.DetectorReadMapRef detectorReadMapRef;
    @XmlElement(name = "MultiColorBeadsImageRef")
    protected List<Calibration.MultiColorBeadsImageRef> multiColorBeadsImageRef;
    @XmlElement(name = "PSFJReportRef")
    protected List<Calibration.PSFJReportRef> psfjReportRef;
    @XmlElement(name = "AnnotationRef")
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "LightPowerAtMicroscope")
    protected Float lightPowerAtMicroscope;
    @XmlAttribute(name = "LightPowerAtMicroscopeUnit")
    protected UnitsPower lightPowerAtMicroscopeUnit;
    @XmlAttribute(name = "DarkValue")
    protected Float darkValue;
    @XmlAttribute(name = "PhotometricConversion")
    protected Float photometricConversion;
    @XmlAttribute(name = "ReadNoise")
    protected Float readNoise;
    @XmlAttribute(name = "IlluminationIntensity")
    protected Float illuminationIntensity;
    @XmlAttribute(name = "TestTubeSettings_1")
    protected String testTubeSettings1;
    @XmlAttribute(name = "TestTubeSettings_2")
    protected String testTubeSettings2;
    @XmlAttribute(name = "TestTubeSettings_3")
    protected String testTubeSettings3;
    @XmlAttribute(name = "ImagingStandard")
    protected String imagingStandard;

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
     * Gets the value of the flatFieldImageRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flatFieldImageRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlatFieldImageRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Calibration.FlatFieldImageRef }
     * 
     * 
     */
    public List<Calibration.FlatFieldImageRef> getFlatFieldImageRef() {
        if (flatFieldImageRef == null) {
            flatFieldImageRef = new ArrayList<Calibration.FlatFieldImageRef>();
        }
        return this.flatFieldImageRef;
    }

    /**
     * Gets the value of the detectorDarkMapRef property.
     * 
     * @return
     *     possible object is
     *     {@link Calibration.DetectorDarkMapRef }
     *     
     */
    public Calibration.DetectorDarkMapRef getDetectorDarkMapRef() {
        return detectorDarkMapRef;
    }

    /**
     * Sets the value of the detectorDarkMapRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calibration.DetectorDarkMapRef }
     *     
     */
    public void setDetectorDarkMapRef(Calibration.DetectorDarkMapRef value) {
        this.detectorDarkMapRef = value;
    }

    /**
     * Gets the value of the detectorReadMapRef property.
     * 
     * @return
     *     possible object is
     *     {@link Calibration.DetectorReadMapRef }
     *     
     */
    public Calibration.DetectorReadMapRef getDetectorReadMapRef() {
        return detectorReadMapRef;
    }

    /**
     * Sets the value of the detectorReadMapRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calibration.DetectorReadMapRef }
     *     
     */
    public void setDetectorReadMapRef(Calibration.DetectorReadMapRef value) {
        this.detectorReadMapRef = value;
    }

    /**
     * Gets the value of the multiColorBeadsImageRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiColorBeadsImageRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiColorBeadsImageRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Calibration.MultiColorBeadsImageRef }
     * 
     * 
     */
    public List<Calibration.MultiColorBeadsImageRef> getMultiColorBeadsImageRef() {
        if (multiColorBeadsImageRef == null) {
            multiColorBeadsImageRef = new ArrayList<Calibration.MultiColorBeadsImageRef>();
        }
        return this.multiColorBeadsImageRef;
    }

    /**
     * Gets the value of the psfjReportRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psfjReportRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSFJReportRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Calibration.PSFJReportRef }
     * 
     * 
     */
    public List<Calibration.PSFJReportRef> getPSFJReportRef() {
        if (psfjReportRef == null) {
            psfjReportRef = new ArrayList<Calibration.PSFJReportRef>();
        }
        return this.psfjReportRef;
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
     * Gets the value of the lightPowerAtMicroscope property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLightPowerAtMicroscope() {
        return lightPowerAtMicroscope;
    }

    /**
     * Sets the value of the lightPowerAtMicroscope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLightPowerAtMicroscope(Float value) {
        this.lightPowerAtMicroscope = value;
    }

    /**
     * Gets the value of the lightPowerAtMicroscopeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsPower }
     *     
     */
    public UnitsPower getLightPowerAtMicroscopeUnit() {
        return lightPowerAtMicroscopeUnit;
    }

    /**
     * Sets the value of the lightPowerAtMicroscopeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsPower }
     *     
     */
    public void setLightPowerAtMicroscopeUnit(UnitsPower value) {
        this.lightPowerAtMicroscopeUnit = value;
    }

    /**
     * Gets the value of the darkValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDarkValue() {
        return darkValue;
    }

    /**
     * Sets the value of the darkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDarkValue(Float value) {
        this.darkValue = value;
    }

    /**
     * Gets the value of the photometricConversion property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPhotometricConversion() {
        return photometricConversion;
    }

    /**
     * Sets the value of the photometricConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPhotometricConversion(Float value) {
        this.photometricConversion = value;
    }

    /**
     * Gets the value of the readNoise property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReadNoise() {
        return readNoise;
    }

    /**
     * Sets the value of the readNoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReadNoise(Float value) {
        this.readNoise = value;
    }

    /**
     * Gets the value of the illuminationIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIlluminationIntensity() {
        return illuminationIntensity;
    }

    /**
     * Sets the value of the illuminationIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIlluminationIntensity(Float value) {
        this.illuminationIntensity = value;
    }

    /**
     * Gets the value of the testTubeSettings1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestTubeSettings1() {
        return testTubeSettings1;
    }

    /**
     * Sets the value of the testTubeSettings1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestTubeSettings1(String value) {
        this.testTubeSettings1 = value;
    }

    /**
     * Gets the value of the testTubeSettings2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestTubeSettings2() {
        return testTubeSettings2;
    }

    /**
     * Sets the value of the testTubeSettings2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestTubeSettings2(String value) {
        this.testTubeSettings2 = value;
    }

    /**
     * Gets the value of the testTubeSettings3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestTubeSettings3() {
        return testTubeSettings3;
    }

    /**
     * Sets the value of the testTubeSettings3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestTubeSettings3(String value) {
        this.testTubeSettings3 = value;
    }

    /**
     * Gets the value of the imagingStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagingStandard() {
        return imagingStandard;
    }

    /**
     * Sets the value of the imagingStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagingStandard(String value) {
        this.imagingStandard = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
     *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorDarkMapID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DetectorDarkMapRef
        extends Reference
    {

        @XmlAttribute(name = "ID")
        protected String id;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
     *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorReadMapID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DetectorReadMapRef
        extends Reference
    {

        @XmlAttribute(name = "ID")
        protected String id;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
     *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImageID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlatFieldImageRef
        extends Reference
    {

        @XmlAttribute(name = "ID")
        protected String id;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Multi-ColorBeads"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImageID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "multiColorBeads"
    })
    public static class MultiColorBeadsImageRef
        extends Reference
    {

        @XmlElement(name = "Multi-ColorBeads", required = true)
        protected MultiColorBeads multiColorBeads;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the multiColorBeads property.
         * 
         * @return
         *     possible object is
         *     {@link MultiColorBeads }
         *     
         */
        public MultiColorBeads getMultiColorBeads() {
            return multiColorBeads;
        }

        /**
         * Sets the value of the multiColorBeads property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiColorBeads }
         *     
         */
        public void setMultiColorBeads(MultiColorBeads value) {
            this.multiColorBeads = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
     *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PSFJReportID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PSFJReportRef
        extends Reference
    {

        @XmlAttribute(name = "ID")
        protected String id;

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

    }

}
