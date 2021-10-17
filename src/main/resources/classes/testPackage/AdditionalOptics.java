
package testPackage;

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
 *         &lt;element name="AdditionalLensRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LensRef"/>
 *         &lt;element name="PrimsRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PrismRef"/>
 *         &lt;element name="PolarizationOpticsRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PolarizationOpticsRef"/>
 *         &lt;element name="AdditionalFilterRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FilterRef"/>
 *         &lt;element name="AdditionalMirrorRef" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MirrorRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LSID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "additionalLensRef",
    "primsRef",
    "polarizationOpticsRef",
    "additionalFilterRef",
    "additionalMirrorRef"
})
@XmlRootElement(name = "AdditionalOptics")
public class AdditionalOptics
    extends MicroscopeComponent
{

    @XmlElement(name = "AdditionalLensRef", required = true)
    protected LensRef additionalLensRef;
    @XmlElement(name = "PrimsRef", required = true)
    protected PrismRef primsRef;
    @XmlElement(name = "PolarizationOpticsRef", required = true)
    protected PolarizationOpticsRef polarizationOpticsRef;
    @XmlElement(name = "AdditionalFilterRef", required = true)
    protected FilterRef additionalFilterRef;
    @XmlElement(name = "AdditionalMirrorRef", required = true)
    protected MirrorRef additionalMirrorRef;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the additionalLensRef property.
     * 
     * @return
     *     possible object is
     *     {@link LensRef }
     *     
     */
    public LensRef getAdditionalLensRef() {
        return additionalLensRef;
    }

    /**
     * Sets the value of the additionalLensRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LensRef }
     *     
     */
    public void setAdditionalLensRef(LensRef value) {
        this.additionalLensRef = value;
    }

    /**
     * Gets the value of the primsRef property.
     * 
     * @return
     *     possible object is
     *     {@link PrismRef }
     *     
     */
    public PrismRef getPrimsRef() {
        return primsRef;
    }

    /**
     * Sets the value of the primsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrismRef }
     *     
     */
    public void setPrimsRef(PrismRef value) {
        this.primsRef = value;
    }

    /**
     * Gets the value of the polarizationOpticsRef property.
     * 
     * @return
     *     possible object is
     *     {@link PolarizationOpticsRef }
     *     
     */
    public PolarizationOpticsRef getPolarizationOpticsRef() {
        return polarizationOpticsRef;
    }

    /**
     * Sets the value of the polarizationOpticsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarizationOpticsRef }
     *     
     */
    public void setPolarizationOpticsRef(PolarizationOpticsRef value) {
        this.polarizationOpticsRef = value;
    }

    /**
     * Gets the value of the additionalFilterRef property.
     * 
     * @return
     *     possible object is
     *     {@link FilterRef }
     *     
     */
    public FilterRef getAdditionalFilterRef() {
        return additionalFilterRef;
    }

    /**
     * Sets the value of the additionalFilterRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterRef }
     *     
     */
    public void setAdditionalFilterRef(FilterRef value) {
        this.additionalFilterRef = value;
    }

    /**
     * Gets the value of the additionalMirrorRef property.
     * 
     * @return
     *     possible object is
     *     {@link MirrorRef }
     *     
     */
    public MirrorRef getAdditionalMirrorRef() {
        return additionalMirrorRef;
    }

    /**
     * Sets the value of the additionalMirrorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MirrorRef }
     *     
     */
    public void setAdditionalMirrorRef(MirrorRef value) {
        this.additionalMirrorRef = value;
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

}
