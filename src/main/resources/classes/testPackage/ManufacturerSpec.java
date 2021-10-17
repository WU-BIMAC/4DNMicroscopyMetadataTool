
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;


/**
 * 
 *         This is the base from which many microscope components are extended. E.g Objective, Filter etc.
 *         Provides attributes for recording common properties of these components such as Manufacturer name, Model etc,
 *         all of which are optional.
 *       
 * 
 * <p>Java class for ManufacturerSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturerSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Model" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LotNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SpecsFile" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturerSpec")
@XmlSeeAlso({
    LightSource.class,
    LightSourceCoupling.class,
    Mirror.class,
    Detector.class,
    MultiColorBeads.class,
    Filter.class,
    FilterSet.class,
    PolarizationOptics.class,
    Prism.class,
    Lens.class,
    Objective.class,
    AutoFucus.class,
    Stage.class,
    MicroscopeTable.class,
    Microscope.class
})
public class ManufacturerSpec
    extends MicroscopeComponent
{

    @XmlAttribute(name = "Manufacturer")
    protected String manufacturer;
    @XmlAttribute(name = "Model")
    protected String model;
    @XmlAttribute(name = "SerialNumber")
    protected String serialNumber;
    @XmlAttribute(name = "LotNumber")
    protected String lotNumber;
    @XmlAttribute(name = "SpecsFile")
    @XmlSchemaType(name = "anyURI")
    protected String specsFile;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the specsFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecsFile() {
        return specsFile;
    }

    /**
     * Sets the value of the specsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecsFile(String value) {
        this.specsFile = value;
    }

}
