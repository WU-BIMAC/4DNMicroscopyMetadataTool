
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
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reagent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlateRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *                 &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PlateID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ScreenID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProtocolIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProtocolDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReagentSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReagentSetIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "reagent",
    "plateRef",
    "annotationRef"
})
@XmlRootElement(name = "Screen")
public class Screen
    extends MicroscopeComponent
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Reagent")
    protected List<Reagent> reagent;
    @XmlElement(name = "PlateRef")
    protected List<Screen.PlateRef> plateRef;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ProtocolIdentifier")
    protected String protocolIdentifier;
    @XmlAttribute(name = "ProtocolDescription")
    protected String protocolDescription;
    @XmlAttribute(name = "ReagentSetDescription")
    protected String reagentSetDescription;
    @XmlAttribute(name = "ReagentSetIdentifier")
    protected String reagentSetIdentifier;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the reagent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reagent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReagent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reagent }
     * 
     * 
     */
    public List<Reagent> getReagent() {
        if (reagent == null) {
            reagent = new ArrayList<Reagent>();
        }
        return this.reagent;
    }

    /**
     * Gets the value of the plateRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plateRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlateRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Screen.PlateRef }
     * 
     * 
     */
    public List<Screen.PlateRef> getPlateRef() {
        if (plateRef == null) {
            plateRef = new ArrayList<Screen.PlateRef>();
        }
        return this.plateRef;
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
     * Gets the value of the protocolIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolIdentifier() {
        return protocolIdentifier;
    }

    /**
     * Sets the value of the protocolIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolIdentifier(String value) {
        this.protocolIdentifier = value;
    }

    /**
     * Gets the value of the protocolDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolDescription() {
        return protocolDescription;
    }

    /**
     * Sets the value of the protocolDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolDescription(String value) {
        this.protocolDescription = value;
    }

    /**
     * Gets the value of the reagentSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReagentSetDescription() {
        return reagentSetDescription;
    }

    /**
     * Sets the value of the reagentSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReagentSetDescription(String value) {
        this.reagentSetDescription = value;
    }

    /**
     * Gets the value of the reagentSetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReagentSetIdentifier() {
        return reagentSetIdentifier;
    }

    /**
     * Sets the value of the reagentSetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReagentSetIdentifier(String value) {
        this.reagentSetIdentifier = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
     *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PlateID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PlateRef
        extends Reference
    {

        @XmlAttribute(name = "ID", required = true)
        protected String id;

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

    }

}
