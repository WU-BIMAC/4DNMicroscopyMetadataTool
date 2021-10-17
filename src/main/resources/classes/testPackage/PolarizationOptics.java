
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WavelengthRange" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PolarizationOpticsID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Function">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Polarizer"/>
 *             &lt;enumeration value="Analyzer"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Construction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Achromatic"/>
 *             &lt;enumeration value="Zero Order"/>
 *             &lt;enumeration value="Multiple Order"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Fabrication">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Wire Grid"/>
 *             &lt;enumeration value="Film"/>
 *             &lt;enumeration value="Polarizing Beamsplitter"/>
 *             &lt;enumeration value="Polarizing BandPass"/>
 *             &lt;enumeration value="Variable"/>
 *             &lt;enumeration value="Birefringent"/>
 *             &lt;enumeration value="Polymer"/>
 *             &lt;enumeration value="Quarz"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Retardation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Half Wave"/>
 *             &lt;enumeration value="Quarter Wave"/>
 *             &lt;enumeration value="Full Wave"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MaterialName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="alpha-Barium Borate"/>
 *             &lt;enumeration value="Calcite"/>
 *             &lt;enumeration value="Calcium Fluoride"/>
 *             &lt;enumeration value="N-BK7 (Borosilicate Crown)"/>
 *             &lt;enumeration value="Rutile (TiO2)"/>
 *             &lt;enumeration value="Yttrium Orthovanadate (YVO4)"/>
 *             &lt;enumeration value="Zinc Selenide (ZnSe)"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GlassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "PolarizationOptics")
public class PolarizationOptics
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
    @XmlAttribute(name = "Function")
    protected String function;
    @XmlAttribute(name = "Construction")
    protected String construction;
    @XmlAttribute(name = "Fabrication")
    protected String fabrication;
    @XmlAttribute(name = "Retardation")
    protected String retardation;
    @XmlAttribute(name = "MaterialName")
    protected String materialName;
    @XmlAttribute(name = "GlassCode")
    protected String glassCode;

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
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstruction(String value) {
        this.construction = value;
    }

    /**
     * Gets the value of the fabrication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabrication() {
        return fabrication;
    }

    /**
     * Sets the value of the fabrication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabrication(String value) {
        this.fabrication = value;
    }

    /**
     * Gets the value of the retardation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetardation() {
        return retardation;
    }

    /**
     * Sets the value of the retardation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetardation(String value) {
        this.retardation = value;
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

}
