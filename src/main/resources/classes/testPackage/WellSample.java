
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ImageRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WellSampleID" />
 *       &lt;attribute name="PositionX" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PositionXUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="PositionY" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PositionYUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="Timepoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Index" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imageRef"
})
@XmlRootElement(name = "WellSample")
public class WellSample
    extends MicroscopeComponent
{

    @XmlElement(name = "ImageRef")
    protected ImageRef imageRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "PositionX")
    protected Float positionX;
    @XmlAttribute(name = "PositionXUnit")
    protected String positionXUnit;
    @XmlAttribute(name = "PositionY")
    protected Float positionY;
    @XmlAttribute(name = "PositionYUnit")
    protected String positionYUnit;
    @XmlAttribute(name = "Timepoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timepoint;
    @XmlAttribute(name = "Index", required = true)
    protected int index;

    /**
     * 
     *               This is the main link to the core Image element
     *             
     * 
     * @return
     *     possible object is
     *     {@link ImageRef }
     *     
     */
    public ImageRef getImageRef() {
        return imageRef;
    }

    /**
     * Sets the value of the imageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageRef }
     *     
     */
    public void setImageRef(ImageRef value) {
        this.imageRef = value;
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
     * Gets the value of the timepoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimepoint() {
        return timepoint;
    }

    /**
     * Sets the value of the timepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimepoint(XMLGregorianCalendar value) {
        this.timepoint = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
