
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSourceCoupling">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WavelengthRange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Fiber optics"/>
 *             &lt;enumeration value="Liquid"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Geometry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PeakWavelength" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PeakWavelengthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="SingleMode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WaveguideMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Transverse electromagnetic"/>
 *             &lt;enumeration value="Transverse electric"/>
 *             &lt;enumeration value="Transverse magnetic"/>
 *             &lt;enumeration value="Hybrid"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RefractiveIndex" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="NumericalAperture" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AcceptanceAngle" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AcceptanceAngleUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsAngle" />
 *       &lt;attribute name="Diameter" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DiameterUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wavelengthRange"
})
public class LightGuide
    extends LightSourceCoupling
{

    @XmlElement(name = "WavelengthRange", required = true)
    protected List<WavelengthRange> wavelengthRange;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Geometry")
    protected String geometry;
    @XmlAttribute(name = "MaterialName")
    protected String materialName;
    @XmlAttribute(name = "PeakWavelength")
    protected Float peakWavelength;
    @XmlAttribute(name = "PeakWavelengthUnit")
    protected String peakWavelengthUnit;
    @XmlAttribute(name = "SingleMode")
    protected Boolean singleMode;
    @XmlAttribute(name = "WaveguideMode")
    protected String waveguideMode;
    @XmlAttribute(name = "RefractiveIndex")
    protected Float refractiveIndex;
    @XmlAttribute(name = "NumericalAperture")
    @XmlSchemaType(name = "anySimpleType")
    protected String numericalAperture;
    @XmlAttribute(name = "AcceptanceAngle")
    @XmlSchemaType(name = "anySimpleType")
    protected String acceptanceAngle;
    @XmlAttribute(name = "AcceptanceAngleUnit")
    protected UnitsAngle acceptanceAngleUnit;
    @XmlAttribute(name = "Diameter")
    @XmlSchemaType(name = "anySimpleType")
    protected String diameter;
    @XmlAttribute(name = "DiameterUnit")
    protected String diameterUnit;

    /**
     * Gets the value of the wavelengthRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wavelengthRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWavelengthRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WavelengthRange }
     * 
     * 
     */
    public List<WavelengthRange> getWavelengthRange() {
        if (wavelengthRange == null) {
            wavelengthRange = new ArrayList<WavelengthRange>();
        }
        return this.wavelengthRange;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometry(String value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the materialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * Sets the value of the materialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialName(String value) {
        this.materialName = value;
    }

    /**
     * Gets the value of the peakWavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeakWavelength() {
        return peakWavelength;
    }

    /**
     * Sets the value of the peakWavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeakWavelength(Float value) {
        this.peakWavelength = value;
    }

    /**
     * Gets the value of the peakWavelengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeakWavelengthUnit() {
        if (peakWavelengthUnit == null) {
            return "nm";
        } else {
            return peakWavelengthUnit;
        }
    }

    /**
     * Sets the value of the peakWavelengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeakWavelengthUnit(String value) {
        this.peakWavelengthUnit = value;
    }

    /**
     * Gets the value of the singleMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleMode() {
        return singleMode;
    }

    /**
     * Sets the value of the singleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleMode(Boolean value) {
        this.singleMode = value;
    }

    /**
     * Gets the value of the waveguideMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaveguideMode() {
        return waveguideMode;
    }

    /**
     * Sets the value of the waveguideMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaveguideMode(String value) {
        this.waveguideMode = value;
    }

    /**
     * Gets the value of the refractiveIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefractiveIndex() {
        return refractiveIndex;
    }

    /**
     * Sets the value of the refractiveIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefractiveIndex(Float value) {
        this.refractiveIndex = value;
    }

    /**
     * Gets the value of the numericalAperture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericalAperture() {
        return numericalAperture;
    }

    /**
     * Sets the value of the numericalAperture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericalAperture(String value) {
        this.numericalAperture = value;
    }

    /**
     * Gets the value of the acceptanceAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceAngle() {
        return acceptanceAngle;
    }

    /**
     * Sets the value of the acceptanceAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceAngle(String value) {
        this.acceptanceAngle = value;
    }

    /**
     * Gets the value of the acceptanceAngleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsAngle }
     *     
     */
    public UnitsAngle getAcceptanceAngleUnit() {
        return acceptanceAngleUnit;
    }

    /**
     * Sets the value of the acceptanceAngleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsAngle }
     *     
     */
    public void setAcceptanceAngleUnit(UnitsAngle value) {
        this.acceptanceAngleUnit = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiameter(String value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the diameterUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiameterUnit() {
        return diameterUnit;
    }

    /**
     * Sets the value of the diameterUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiameterUnit(String value) {
        this.diameterUnit = value;
    }

}
