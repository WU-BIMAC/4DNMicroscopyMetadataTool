
package testPackage;

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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LensID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Biconvex"/>
 *             &lt;enumeration value="Biconcave"/>
 *             &lt;enumeration value="Plano Convex"/>
 *             &lt;enumeration value="Plano Concave"/>
 *             &lt;enumeration value="Convex Meniscus"/>
 *             &lt;enumeration value="Concave Meniscus"/>
 *             &lt;enumeration value="Equiconvex"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Geometry">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Spherical"/>
 *             &lt;enumeration value="Aspherical"/>
 *             &lt;enumeration value="Cylindrical"/>
 *             &lt;enumeration value="Ball"/>
 *             &lt;enumeration value="Hemispheric-ball"/>
 *             &lt;enumeration value="Cone"/>
 *             &lt;enumeration value="Drum"/>
 *             &lt;enumeration value="Rod"/>
 *             &lt;enumeration value="Toric"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Construction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Simple"/>
 *             &lt;enumeration value="Composite"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Magnification" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="AttenuationCoefficient" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RadiusOfCurvature" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RadiusOfCurvatureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="ObjectFocalDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ObjectFocalDistanceUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="ImageFocalDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ImageFocalDistanceUnits" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="FocalLength" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="FocalLengthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="MaterialName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="alpha-Barium Borate"/>
 *             &lt;enumeration value="N-BK7 (Borosilicate Crown)"/>
 *             &lt;enumeration value="Calcium Fluoride"/>
 *             &lt;enumeration value="UV-Grade Fused Silica (UVFS)"/>
 *             &lt;enumeration value="Germanium"/>
 *             &lt;enumeration value="Magnesium Fluoride"/>
 *             &lt;enumeration value="N-SF11 (Dense Flint)"/>
 *             &lt;enumeration value="Polytetrafluoroethylene (PFTE)"/>
 *             &lt;enumeration value="Zinc Selenide (ZnSe)"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GlassCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="RefractiveIndex" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AbbeNumber" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Density" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="DensityUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsDensity" />
 *       &lt;attribute name="Diameter" type="{http://www.w3.org/2001/XMLSchema}float" />
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
    "annotationRef"
})
@XmlRootElement(name = "Lens")
public class Lens
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
    @XmlAttribute(name = "Construction")
    protected String construction;
    @XmlAttribute(name = "Magnification")
    protected Integer magnification;
    @XmlAttribute(name = "AttenuationCoefficient")
    protected Float attenuationCoefficient;
    @XmlAttribute(name = "RadiusOfCurvature")
    protected Float radiusOfCurvature;
    @XmlAttribute(name = "RadiusOfCurvatureUnit")
    protected String radiusOfCurvatureUnit;
    @XmlAttribute(name = "ObjectFocalDistance")
    protected Float objectFocalDistance;
    @XmlAttribute(name = "ObjectFocalDistanceUnit")
    protected String objectFocalDistanceUnit;
    @XmlAttribute(name = "ImageFocalDistance")
    protected Float imageFocalDistance;
    @XmlAttribute(name = "ImageFocalDistanceUnits")
    protected String imageFocalDistanceUnits;
    @XmlAttribute(name = "FocalLength")
    protected Float focalLength;
    @XmlAttribute(name = "FocalLengthUnit")
    protected String focalLengthUnit;
    @XmlAttribute(name = "MaterialName")
    protected String materialName;
    @XmlAttribute(name = "GlassCode")
    protected Short glassCode;
    @XmlAttribute(name = "RefractiveIndex")
    protected Float refractiveIndex;
    @XmlAttribute(name = "AbbeNumber")
    protected Float abbeNumber;
    @XmlAttribute(name = "Density")
    protected Float density;
    @XmlAttribute(name = "DensityUnit")
    protected UnitsDensity densityUnit;
    @XmlAttribute(name = "Diameter")
    protected Float diameter;
    @XmlAttribute(name = "DiameterUnit")
    protected String diameterUnit;

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
     * Gets the value of the magnification property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMagnification() {
        return magnification;
    }

    /**
     * Sets the value of the magnification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMagnification(Integer value) {
        this.magnification = value;
    }

    /**
     * Gets the value of the attenuationCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAttenuationCoefficient() {
        return attenuationCoefficient;
    }

    /**
     * Sets the value of the attenuationCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAttenuationCoefficient(Float value) {
        this.attenuationCoefficient = value;
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
     * Gets the value of the objectFocalDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getObjectFocalDistance() {
        return objectFocalDistance;
    }

    /**
     * Sets the value of the objectFocalDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setObjectFocalDistance(Float value) {
        this.objectFocalDistance = value;
    }

    /**
     * Gets the value of the objectFocalDistanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectFocalDistanceUnit() {
        return objectFocalDistanceUnit;
    }

    /**
     * Sets the value of the objectFocalDistanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectFocalDistanceUnit(String value) {
        this.objectFocalDistanceUnit = value;
    }

    /**
     * Gets the value of the imageFocalDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImageFocalDistance() {
        return imageFocalDistance;
    }

    /**
     * Sets the value of the imageFocalDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImageFocalDistance(Float value) {
        this.imageFocalDistance = value;
    }

    /**
     * Gets the value of the imageFocalDistanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFocalDistanceUnits() {
        return imageFocalDistanceUnits;
    }

    /**
     * Sets the value of the imageFocalDistanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFocalDistanceUnits(String value) {
        this.imageFocalDistanceUnits = value;
    }

    /**
     * Gets the value of the focalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFocalLength() {
        return focalLength;
    }

    /**
     * Sets the value of the focalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFocalLength(Float value) {
        this.focalLength = value;
    }

    /**
     * Gets the value of the focalLengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocalLengthUnit() {
        return focalLengthUnit;
    }

    /**
     * Sets the value of the focalLengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocalLengthUnit(String value) {
        this.focalLengthUnit = value;
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
     *     {@link Short }
     *     
     */
    public Short getGlassCode() {
        return glassCode;
    }

    /**
     * Sets the value of the glassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGlassCode(Short value) {
        this.glassCode = value;
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
     * Gets the value of the abbeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAbbeNumber() {
        return abbeNumber;
    }

    /**
     * Sets the value of the abbeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAbbeNumber(Float value) {
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

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiameter(Float value) {
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
