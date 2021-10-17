
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mirror complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mirror">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ManufacturerSpec">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MirrorID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Convex"/>
 *             &lt;enumeration value="Concave"/>
 *             &lt;enumeration value="Planar"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Geometry">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Spherical, , , , , "/>
 *             &lt;enumeration value="Aspherical"/>
 *             &lt;enumeration value="Cylindrical"/>
 *             &lt;enumeration value="Ellipsoidal"/>
 *             &lt;enumeration value="Hyeprboloidal"/>
 *             &lt;enumeration value="Paraboloidal"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Reflectance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ReflectionAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ReflectionAngleUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsAngle" />
 *       &lt;attribute name="RadiusOfCurvature" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RadiusOfCurvatureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="MaterialName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Calcium Fluoride"/>
 *             &lt;enumeration value="N-BK7 (Borosilicate Crown)"/>
 *             &lt;enumeration value="UV-Grade Fused Silica (UVFS)"/>
 *             &lt;enumeration value="Zerodur (Lithium Aluminum Ailicon Oxide)"/>
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
@XmlType(name = "Mirror", propOrder = {
    "annotationRef"
})
@XmlSeeAlso({
    Dichroic.class,
    BeamSplitter.class,
    Reflector.class
})
public class Mirror
    extends ManufacturerSpec
{

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
    @XmlAttribute(name = "ReflectionAngle")
    protected Float reflectionAngle;
    @XmlAttribute(name = "ReflectionAngleUnit")
    protected UnitsAngle reflectionAngleUnit;
    @XmlAttribute(name = "RadiusOfCurvature")
    protected Float radiusOfCurvature;
    @XmlAttribute(name = "RadiusOfCurvatureUnit")
    protected String radiusOfCurvatureUnit;
    @XmlAttribute(name = "MaterialName")
    protected String materialName;
    @XmlAttribute(name = "GlassCode")
    protected String glassCode;

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
     * Gets the value of the reflectionAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReflectionAngle() {
        return reflectionAngle;
    }

    /**
     * Sets the value of the reflectionAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReflectionAngle(Float value) {
        this.reflectionAngle = value;
    }

    /**
     * Gets the value of the reflectionAngleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsAngle }
     *     
     */
    public UnitsAngle getReflectionAngleUnit() {
        return reflectionAngleUnit;
    }

    /**
     * Sets the value of the reflectionAngleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsAngle }
     *     
     */
    public void setReflectionAngleUnit(UnitsAngle value) {
        this.reflectionAngleUnit = value;
    }

    /**
     * Gets the value of the radiusOfCurvature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRadiusOfCurvature() {
        return radiusOfCurvature;
    }

    /**
     * Sets the value of the radiusOfCurvature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRadiusOfCurvature(Float value) {
        this.radiusOfCurvature = value;
    }

    /**
     * Gets the value of the radiusOfCurvatureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusOfCurvatureUnit() {
        return radiusOfCurvatureUnit;
    }

    /**
     * Sets the value of the radiusOfCurvatureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusOfCurvatureUnit(String value) {
        this.radiusOfCurvatureUnit = value;
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
