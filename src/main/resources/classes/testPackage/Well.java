
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
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WellSample" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ReagentRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}WellID" />
 *       &lt;attribute name="Column" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="Row" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *       &lt;attribute name="ExternalDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Color" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Color" default="-1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wellSample",
    "reagentRef",
    "annotationRef"
})
@XmlRootElement(name = "Well")
public class Well
    extends MicroscopeComponent
{

    @XmlElement(name = "WellSample")
    protected List<WellSample> wellSample;
    @XmlElement(name = "ReagentRef")
    protected ReagentRef reagentRef;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Column", required = true)
    protected int column;
    @XmlAttribute(name = "Row", required = true)
    protected int row;
    @XmlAttribute(name = "ExternalDescription")
    protected String externalDescription;
    @XmlAttribute(name = "ExternalIdentifier")
    protected String externalIdentifier;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Color")
    protected Integer color;

    /**
     * Gets the value of the wellSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellSample }
     * 
     * 
     */
    public List<WellSample> getWellSample() {
        if (wellSample == null) {
            wellSample = new ArrayList<WellSample>();
        }
        return this.wellSample;
    }

    /**
     * Gets the value of the reagentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReagentRef }
     *     
     */
    public ReagentRef getReagentRef() {
        return reagentRef;
    }

    /**
     * Sets the value of the reagentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReagentRef }
     *     
     */
    public void setReagentRef(ReagentRef value) {
        this.reagentRef = value;
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
     * Gets the value of the column property.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * Gets the value of the row property.
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

    /**
     * Gets the value of the externalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDescription() {
        return externalDescription;
    }

    /**
     * Sets the value of the externalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDescription(String value) {
        this.externalDescription = value;
    }

    /**
     * Gets the value of the externalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIdentifier(String value) {
        this.externalIdentifier = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getColor() {
        if (color == null) {
            return -1;
        } else {
            return color;
        }
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColor(Integer value) {
        this.color = value;
    }

}
