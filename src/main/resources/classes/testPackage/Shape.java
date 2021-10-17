
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;


/**
 * 
 *         The shape element contains a single specific ROI shape and links
 *         that to any channels, and a timepoint and a z-section. It also
 *         records any transform applied to the ROI shape.
 *       
 * 
 * <p>Java class for Shape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transform" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AffineTransform" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FillColor" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Color" />
 *       &lt;attribute name="FillRule">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="EvenOdd"/>
 *             &lt;enumeration value="NonZero"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StrokeColor" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Color" />
 *       &lt;attribute name="StrokeWidth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="StrokeWidthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="pixel" />
 *       &lt;attribute name="StrokeDashArray" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FontFamily">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="serif"/>
 *             &lt;enumeration value="sans-serif"/>
 *             &lt;enumeration value="cursive"/>
 *             &lt;enumeration value="fantasy"/>
 *             &lt;enumeration value="monospace"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FontSize" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="FontSizeUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="pt" />
 *       &lt;attribute name="FontStyle">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Bold"/>
 *             &lt;enumeration value="BoldItalic"/>
 *             &lt;enumeration value="Italic"/>
 *             &lt;enumeration value="Normal"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ShapeID" />
 *       &lt;attribute name="TheZ" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="TheT" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="TheC" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shape", propOrder = {
    "transform",
    "annotationRef"
})
@XmlSeeAlso({
    Rectangle.class,
    Mask.class,
    Point.class,
    Ellipse.class,
    Line.class,
    Polyline.class,
    Polygon.class,
    Label.class
})
public class Shape
    extends MicroscopeComponent
{

    @XmlElement(name = "Transform")
    protected AffineTransform transform;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "FillColor")
    protected Integer fillColor;
    @XmlAttribute(name = "FillRule")
    protected String fillRule;
    @XmlAttribute(name = "StrokeColor")
    protected Integer strokeColor;
    @XmlAttribute(name = "StrokeWidth")
    protected Float strokeWidth;
    @XmlAttribute(name = "StrokeWidthUnit")
    protected String strokeWidthUnit;
    @XmlAttribute(name = "StrokeDashArray")
    protected String strokeDashArray;
    @XmlAttribute(name = "Text")
    protected String text;
    @XmlAttribute(name = "FontFamily")
    protected String fontFamily;
    @XmlAttribute(name = "FontSize")
    protected Integer fontSize;
    @XmlAttribute(name = "FontSizeUnit")
    protected String fontSizeUnit;
    @XmlAttribute(name = "FontStyle")
    protected String fontStyle;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "TheZ")
    protected Integer theZ;
    @XmlAttribute(name = "TheT")
    protected Integer theT;
    @XmlAttribute(name = "TheC")
    protected Integer theC;

    /**
     * Gets the value of the transform property.
     * 
     * @return
     *     possible object is
     *     {@link AffineTransform }
     *     
     */
    public AffineTransform getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffineTransform }
     *     
     */
    public void setTransform(AffineTransform value) {
        this.transform = value;
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
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFillColor(Integer value) {
        this.fillColor = value;
    }

    /**
     * Gets the value of the fillRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillRule() {
        return fillRule;
    }

    /**
     * Sets the value of the fillRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillRule(String value) {
        this.fillRule = value;
    }

    /**
     * Gets the value of the strokeColor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrokeColor() {
        return strokeColor;
    }

    /**
     * Sets the value of the strokeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrokeColor(Integer value) {
        this.strokeColor = value;
    }

    /**
     * Gets the value of the strokeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the value of the strokeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStrokeWidth(Float value) {
        this.strokeWidth = value;
    }

    /**
     * Gets the value of the strokeWidthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeWidthUnit() {
        if (strokeWidthUnit == null) {
            return "pixel";
        } else {
            return strokeWidthUnit;
        }
    }

    /**
     * Sets the value of the strokeWidthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeWidthUnit(String value) {
        this.strokeWidthUnit = value;
    }

    /**
     * Gets the value of the strokeDashArray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeDashArray() {
        return strokeDashArray;
    }

    /**
     * Sets the value of the strokeDashArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeDashArray(String value) {
        this.strokeDashArray = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontSizeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeUnit() {
        if (fontSizeUnit == null) {
            return "pt";
        } else {
            return fontSizeUnit;
        }
    }

    /**
     * Sets the value of the fontSizeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeUnit(String value) {
        this.fontSizeUnit = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyle(String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
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
     * Gets the value of the theZ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTheZ() {
        return theZ;
    }

    /**
     * Sets the value of the theZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTheZ(Integer value) {
        this.theZ = value;
    }

    /**
     * Gets the value of the theT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTheT() {
        return theT;
    }

    /**
     * Sets the value of the theT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTheT(Integer value) {
        this.theT = value;
    }

    /**
     * Gets the value of the theC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTheC() {
        return theC;
    }

    /**
     * Sets the value of the theC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTheC(Integer value) {
        this.theC = value;
    }

}
