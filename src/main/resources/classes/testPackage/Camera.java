
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Camera complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Camera">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Detector">
 *       &lt;attribute name="Illumination">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Front"/>
 *             &lt;enumeration value="Back"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ArrayWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ArrayHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PixelWidth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PixelWidthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="PixelHeight" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PixelHeightUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ImageWidthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ImageHeightUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="PixelWellCapacity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RegisterWellCapacity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="VerticalClockSpeed" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VerticalClockSpeedUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTime" default="µs" />
 *       &lt;attribute name="MaximumReadoutRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Camera")
@XmlSeeAlso({
    CCD.class,
    IntensifiedCCD.class,
    AnalogVideo.class,
    CMOS.class
})
public class Camera
    extends Detector
{

    @XmlAttribute(name = "Illumination")
    protected String illumination;
    @XmlAttribute(name = "ArrayWidth")
    protected Integer arrayWidth;
    @XmlAttribute(name = "ArrayHeight")
    protected Integer arrayHeight;
    @XmlAttribute(name = "PixelWidth")
    protected Float pixelWidth;
    @XmlAttribute(name = "PixelWidthUnit")
    protected String pixelWidthUnit;
    @XmlAttribute(name = "PixelHeight")
    protected Float pixelHeight;
    @XmlAttribute(name = "PixelHeightUnit")
    protected String pixelHeightUnit;
    @XmlAttribute(name = "ImageWidth")
    protected Float imageWidth;
    @XmlAttribute(name = "ImageWidthUnit")
    protected String imageWidthUnit;
    @XmlAttribute(name = "ImageHeight")
    protected Float imageHeight;
    @XmlAttribute(name = "ImageHeightUnit")
    protected String imageHeightUnit;
    @XmlAttribute(name = "PixelWellCapacity")
    protected Integer pixelWellCapacity;
    @XmlAttribute(name = "RegisterWellCapacity")
    protected Integer registerWellCapacity;
    @XmlAttribute(name = "VerticalClockSpeed")
    @XmlSchemaType(name = "anySimpleType")
    protected String verticalClockSpeed;
    @XmlAttribute(name = "VerticalClockSpeedUnit")
    protected String verticalClockSpeedUnit;
    @XmlAttribute(name = "MaximumReadoutRate")
    @XmlSchemaType(name = "anySimpleType")
    protected String maximumReadoutRate;

    /**
     * Gets the value of the illumination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllumination() {
        return illumination;
    }

    /**
     * Sets the value of the illumination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllumination(String value) {
        this.illumination = value;
    }

    /**
     * Gets the value of the arrayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrayWidth() {
        return arrayWidth;
    }

    /**
     * Sets the value of the arrayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrayWidth(Integer value) {
        this.arrayWidth = value;
    }

    /**
     * Gets the value of the arrayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrayHeight() {
        return arrayHeight;
    }

    /**
     * Sets the value of the arrayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrayHeight(Integer value) {
        this.arrayHeight = value;
    }

    /**
     * Gets the value of the pixelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPixelWidth() {
        return pixelWidth;
    }

    /**
     * Sets the value of the pixelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPixelWidth(Float value) {
        this.pixelWidth = value;
    }

    /**
     * Gets the value of the pixelWidthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPixelWidthUnit() {
        if (pixelWidthUnit == null) {
            return "\u00b5m";
        } else {
            return pixelWidthUnit;
        }
    }

    /**
     * Sets the value of the pixelWidthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPixelWidthUnit(String value) {
        this.pixelWidthUnit = value;
    }

    /**
     * Gets the value of the pixelHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPixelHeight() {
        return pixelHeight;
    }

    /**
     * Sets the value of the pixelHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPixelHeight(Float value) {
        this.pixelHeight = value;
    }

    /**
     * Gets the value of the pixelHeightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPixelHeightUnit() {
        if (pixelHeightUnit == null) {
            return "\u00b5m";
        } else {
            return pixelHeightUnit;
        }
    }

    /**
     * Sets the value of the pixelHeightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPixelHeightUnit(String value) {
        this.pixelHeightUnit = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImageWidth(Float value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the imageWidthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageWidthUnit() {
        if (imageWidthUnit == null) {
            return "\u00b5m";
        } else {
            return imageWidthUnit;
        }
    }

    /**
     * Sets the value of the imageWidthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageWidthUnit(String value) {
        this.imageWidthUnit = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImageHeight(Float value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the imageHeightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHeightUnit() {
        if (imageHeightUnit == null) {
            return "\u00b5m";
        } else {
            return imageHeightUnit;
        }
    }

    /**
     * Sets the value of the imageHeightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHeightUnit(String value) {
        this.imageHeightUnit = value;
    }

    /**
     * Gets the value of the pixelWellCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPixelWellCapacity() {
        return pixelWellCapacity;
    }

    /**
     * Sets the value of the pixelWellCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPixelWellCapacity(Integer value) {
        this.pixelWellCapacity = value;
    }

    /**
     * Gets the value of the registerWellCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegisterWellCapacity() {
        return registerWellCapacity;
    }

    /**
     * Sets the value of the registerWellCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegisterWellCapacity(Integer value) {
        this.registerWellCapacity = value;
    }

    /**
     * Gets the value of the verticalClockSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalClockSpeed() {
        return verticalClockSpeed;
    }

    /**
     * Sets the value of the verticalClockSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalClockSpeed(String value) {
        this.verticalClockSpeed = value;
    }

    /**
     * Gets the value of the verticalClockSpeedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalClockSpeedUnit() {
        if (verticalClockSpeedUnit == null) {
            return "\u00b5s";
        } else {
            return verticalClockSpeedUnit;
        }
    }

    /**
     * Sets the value of the verticalClockSpeedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalClockSpeedUnit(String value) {
        this.verticalClockSpeedUnit = value;
    }

    /**
     * Gets the value of the maximumReadoutRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumReadoutRate() {
        return maximumReadoutRate;
    }

    /**
     * Sets the value of the maximumReadoutRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumReadoutRate(String value) {
        this.maximumReadoutRate = value;
    }

}
