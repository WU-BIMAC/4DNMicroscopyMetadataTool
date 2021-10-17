
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
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Settings">
 *       &lt;sequence>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightPath"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ExperimenterRef"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TIRFSettingsID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "lightPath",
    "experimenterRef",
    "annotationRef"
})
@XmlRootElement(name = "TIRFSettings")
public class TIRFSettings
    extends Settings
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LightPath", required = true)
    protected LightPath lightPath;
    @XmlElement(name = "ExperimenterRef", required = true)
    protected ExperimenterRef experimenterRef;
    @XmlElement(name = "AnnotationRef")
    protected AnnotationRef annotationRef;
    @XmlAttribute(name = "ID")
    protected String id;

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
     * Gets the value of the lightPath property.
     * 
     * @return
     *     possible object is
     *     {@link LightPath }
     *     
     */
    public LightPath getLightPath() {
        return lightPath;
    }

    /**
     * Sets the value of the lightPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightPath }
     *     
     */
    public void setLightPath(LightPath value) {
        this.lightPath = value;
    }

    /**
     * Gets the value of the experimenterRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimenterRef }
     *     
     */
    public ExperimenterRef getExperimenterRef() {
        return experimenterRef;
    }

    /**
     * Sets the value of the experimenterRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimenterRef }
     *     
     */
    public void setExperimenterRef(ExperimenterRef value) {
        this.experimenterRef = value;
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

}
