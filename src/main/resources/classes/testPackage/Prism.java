
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WavelengthRange" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PrismID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Reflecting"/>
 *             &lt;enumeration value="Polarizing"/>
 *             &lt;enumeration value="Refracting"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Geometry">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Right-Angle"/>
 *             &lt;enumeration value="Porro"/>
 *             &lt;enumeration value="Dove"/>
 *             &lt;enumeration value="Amici"/>
 *             &lt;enumeration value="Penta"/>
 *             &lt;enumeration value="Romboid"/>
 *             &lt;enumeration value="Nicol"/>
 *             &lt;enumeration value="Glan-Thompson"/>
 *             &lt;enumeration value="Wollaston"/>
 *             &lt;enumeration value="Rochon"/>
 *             &lt;enumeration value="Senarmont"/>
 *             &lt;enumeration value="Triangular"/>
 *             &lt;enumeration value="Abbe prism"/>
 *             &lt;enumeration value="Pellin–Broca"/>
 *             &lt;enumeration value="Grim"/>
 *             &lt;enumeration value="Compound"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Reflectance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PrismAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PrismAngleUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsAngle" />
 *       &lt;attribute name="IncidenceAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="IncidenceAngleUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsAngle" />
 *       &lt;attribute name="DeviationAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="DevianceAngleUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsAngle" />
 *       &lt;attribute name="MaterialName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Calcium Fluoride"/>
 *             &lt;enumeration value="F2 (Flint)"/>
 *             &lt;enumeration value="N-BK7 (Borosilicate Crown)"/>
 *             &lt;enumeration value="N-SF11 (Dense Flint)"/>
 *             &lt;enumeration value="Rutile (TiO2)"/>
 *             &lt;enumeration value="UV-Grade Fused Silica (UVFS)"/>
 *             &lt;enumeration value="Yttrium Orthovanadate (YVO4)"/>
 *             &lt;enumeration value="Zinc Selenide (ZnSe)"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GlassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefractiveIndex" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AbbeNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Density" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="DensityUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsDensity" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wavelengthRange",
    "annotationRef"
})
@XmlRootElement(name = "Prism")
public class Prism
    extends ManufacturerSpec
{

    @XmlElement(name = "WavelengthRange", required = true)
    protected List<WavelengthRange> wavelengthRange;
    @XmlElement(name = "AnnotationRef", required = true)
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Geometry")
    protected String geometry;
    @XmlAttribute(name = "Reflectance")
    protected Float reflectance;
    @XmlAttribute(name = "PrismAngle")
    protected Float prismAngle;
    @XmlAttribute(name = "PrismAngleUnit")
    protected UnitsAngle prismAngleUnit;
    @XmlAttribute(name = "IncidenceAngle")
    protected Float incidenceAngle;
    @XmlAttribute(name = "IncidenceAngleUnit")
    protected UnitsAngle incidenceAngleUnit;
    @XmlAttribute(name = "DeviationAngle")
    protected Float deviationAngle;
    @XmlAttribute(name = "DevianceAngleUnit")
    protected UnitsAngle devianceAngleUnit;
    @XmlAttribute(name = "MaterialName")
    protected String materialName;
    @XmlAttribute(name = "GlassCode")
    protected String glassCode;
    @XmlAttribute(name = "RefractiveIndex")
    @XmlSchemaType(name = "anySimpleType")
    protected String refractiveIndex;
    @XmlAttribute(name = "AbbeNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String abbeNumber;
    @XmlAttribute(name = "Density")
    protected Float density;
    @XmlAttribute(name = "DensityUnit")
    protected UnitsDensity densityUnit;

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
     * Gets the value of the reflectance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReflectance() {
        return reflectance;
    }

    /**
     * Sets the value of the reflectance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReflectance(Float value) {
        this.reflectance = value;
    }

    /**
     * Gets the value of the prismAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrismAngle() {
        return prismAngle;
    }

    /**
     * Sets the value of the prismAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrismAngle(Float value) {
        this.prismAngle = value;
    }

    /**
     * Gets the value of the prismAngleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsAngle }
     *     
     */
    public UnitsAngle getPrismAngleUnit() {
        return prismAngleUnit;
    }

    /**
     * Sets the value of the prismAngleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsAngle }
     *     
     */
    public void setPrismAngleUnit(UnitsAngle value) {
        this.prismAngleUnit = value;
    }

    /**
     * Gets the value of the incidenceAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIncidenceAngle() {
        return incidenceAngle;
    }

    /**
     * Sets the value of the incidenceAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIncidenceAngle(Float value) {
        this.incidenceAngle = value;
    }

    /**
     * Gets the value of the incidenceAngleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsAngle }
     *     
     */
    public UnitsAngle getIncidenceAngleUnit() {
        return incidenceAngleUnit;
    }

    /**
     * Sets the value of the incidenceAngleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsAngle }
     *     
     */
    public void setIncidenceAngleUnit(UnitsAngle value) {
        this.incidenceAngleUnit = value;
    }

    /**
     * Gets the value of the deviationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeviationAngle() {
        return deviationAngle;
    }

    /**
     * Sets the value of the deviationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeviationAngle(Float value) {
        this.deviationAngle = value;
    }

    /**
     * Gets the value of the devianceAngleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsAngle }
     *     
     */
    public UnitsAngle getDevianceAngleUnit() {
        return devianceAngleUnit;
    }

    /**
     * Sets the value of the devianceAngleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsAngle }
     *     
     */
    public void setDevianceAngleUnit(UnitsAngle value) {
        this.devianceAngleUnit = value;
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
     * Gets the value of the glassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlassCode() {
        return glassCode;
    }

    /**
     * Sets the value of the glassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlassCode(String value) {
        this.glassCode = value;
    }

    /**
     * Gets the value of the refractiveIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefractiveIndex() {
        return refractiveIndex;
    }

    /**
     * Sets the value of the refractiveIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefractiveIndex(String value) {
        this.refractiveIndex = value;
    }

    /**
     * Gets the value of the abbeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbeNumber() {
        return abbeNumber;
    }

    /**
     * Sets the value of the abbeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbeNumber(String value) {
        this.abbeNumber = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDensity(Float value) {
        this.density = value;
    }

    /**
     * Gets the value of the densityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsDensity }
     *     
     */
    public UnitsDensity getDensityUnit() {
        return densityUnit;
    }

    /**
     * Sets the value of the densityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsDensity }
     *     
     */
    public void setDensityUnit(UnitsDensity value) {
        this.densityUnit = value;
    }

}
