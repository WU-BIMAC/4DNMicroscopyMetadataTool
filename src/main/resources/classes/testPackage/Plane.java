
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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;choice minOccurs="0">
 *           &lt;element name="HashSHA1" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Hex40"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TheZ" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="TheT" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="TheC" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="DeltaT" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="DeltaTUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTime" default="s" />
 *       &lt;attribute name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ExposureTimeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTime" default="s" />
 *       &lt;attribute name="PositionX" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PositionXUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="PositionY" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PositionYUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="PositionZ" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PositionZUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hashSHA1",
    "annotationRef"
})
@XmlRootElement(name = "Plane")
public class Plane
    extends MicroscopeComponent
{

    @XmlElement(name = "HashSHA1", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] hashSHA1;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "TheZ", required = true)
    protected int theZ;
    @XmlAttribute(name = "TheT", required = true)
    protected int theT;
    @XmlAttribute(name = "TheC", required = true)
    protected int theC;
    @XmlAttribute(name = "DeltaT")
    protected Float deltaT;
    @XmlAttribute(name = "DeltaTUnit")
    protected String deltaTUnit;
    @XmlAttribute(name = "ExposureTime")
    protected Float exposureTime;
    @XmlAttribute(name = "ExposureTimeUnit")
    protected String exposureTimeUnit;
    @XmlAttribute(name = "PositionX")
    protected Float positionX;
    @XmlAttribute(name = "PositionXUnit")
    protected String positionXUnit;
    @XmlAttribute(name = "PositionY")
    protected Float positionY;
    @XmlAttribute(name = "PositionYUnit")
    protected String positionYUnit;
    @XmlAttribute(name = "PositionZ")
    protected Float positionZ;
    @XmlAttribute(name = "PositionZUnit")
    protected String positionZUnit;

    /**
     * Gets the value of the hashSHA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getHashSHA1() {
        return hashSHA1;
    }

    /**
     * Sets the value of the hashSHA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashSHA1(byte[] value) {
        this.hashSHA1 = value;
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
     * Gets the value of the theZ property.
     * 
     */
    public int getTheZ() {
        return theZ;
    }

    /**
     * Sets the value of the theZ property.
     * 
     */
    public void setTheZ(int value) {
        this.theZ = value;
    }

    /**
     * Gets the value of the theT property.
     * 
     */
    public int getTheT() {
        return theT;
    }

    /**
     * Sets the value of the theT property.
     * 
     */
    public void setTheT(int value) {
        this.theT = value;
    }

    /**
     * Gets the value of the theC property.
     * 
     */
    public int getTheC() {
        return theC;
    }

    /**
     * Sets the value of the theC property.
     * 
     */
    public void setTheC(int value) {
        this.theC = value;
    }

    /**
     * Gets the value of the deltaT property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeltaT() {
        return deltaT;
    }

    /**
     * Sets the value of the deltaT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeltaT(Float value) {
        this.deltaT = value;
    }

    /**
     * Gets the value of the deltaTUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltaTUnit() {
        if (deltaTUnit == null) {
            return "s";
        } else {
            return deltaTUnit;
        }
    }

    /**
     * Sets the value of the deltaTUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltaTUnit(String value) {
        this.deltaTUnit = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExposureTime(Float value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the exposureTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposureTimeUnit() {
        if (exposureTimeUnit == null) {
            return "s";
        } else {
            return exposureTimeUnit;
        }
    }

    /**
     * Sets the value of the exposureTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposureTimeUnit(String value) {
        this.exposureTimeUnit = value;
    }

    /**
     * Gets the value of the positionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositionX() {
        return positionX;
    }

    /**
     * Sets the value of the positionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositionX(Float value) {
        this.positionX = value;
    }

    /**
     * Gets the value of the positionXUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionXUnit() {
        if (positionXUnit == null) {
            return "reference frame";
        } else {
            return positionXUnit;
        }
    }

    /**
     * Sets the value of the positionXUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionXUnit(String value) {
        this.positionXUnit = value;
    }

    /**
     * Gets the value of the positionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositionY() {
        return positionY;
    }

    /**
     * Sets the value of the positionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositionY(Float value) {
        this.positionY = value;
    }

    /**
     * Gets the value of the positionYUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionYUnit() {
        if (positionYUnit == null) {
            return "reference frame";
        } else {
            return positionYUnit;
        }
    }

    /**
     * Sets the value of the positionYUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionYUnit(String value) {
        this.positionYUnit = value;
    }

    /**
     * Gets the value of the positionZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositionZ() {
        return positionZ;
    }

    /**
     * Sets the value of the positionZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositionZ(Float value) {
        this.positionZ = value;
    }

    /**
     * Gets the value of the positionZUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionZUnit() {
        if (positionZUnit == null) {
            return "reference frame";
        } else {
            return positionZUnit;
        }
    }

    /**
     * Sets the value of the positionZUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionZUnit(String value) {
        this.positionZUnit = value;
    }

}
