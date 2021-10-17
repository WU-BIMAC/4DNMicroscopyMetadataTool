
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LightSource">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Pump" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Excimer"/>
 *             &lt;enumeration value="Gas"/>
 *             &lt;enumeration value="MetalVapor"/>
 *             &lt;enumeration value="SolidState"/>
 *             &lt;enumeration value="Dye"/>
 *             &lt;enumeration value="Semiconductor"/>
 *             &lt;enumeration value="FreeElectron"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LaserMedium">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Cu"/>
 *             &lt;enumeration value="Ag"/>
 *             &lt;enumeration value="ArFl"/>
 *             &lt;enumeration value="ArCl"/>
 *             &lt;enumeration value="KrFl"/>
 *             &lt;enumeration value="KrCl"/>
 *             &lt;enumeration value="XeFl"/>
 *             &lt;enumeration value="XeCl"/>
 *             &lt;enumeration value="XeBr"/>
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="Ar"/>
 *             &lt;enumeration value="Kr"/>
 *             &lt;enumeration value="Xe"/>
 *             &lt;enumeration value="HeNe"/>
 *             &lt;enumeration value="HeCd"/>
 *             &lt;enumeration value="CO"/>
 *             &lt;enumeration value="CO2"/>
 *             &lt;enumeration value="H2O"/>
 *             &lt;enumeration value="HFl"/>
 *             &lt;enumeration value="NdGlass"/>
 *             &lt;enumeration value="NdYAG"/>
 *             &lt;enumeration value="ErGlass"/>
 *             &lt;enumeration value="ErYAG"/>
 *             &lt;enumeration value="HoYLF"/>
 *             &lt;enumeration value="HoYAG"/>
 *             &lt;enumeration value="Ruby"/>
 *             &lt;enumeration value="TiSapphire"/>
 *             &lt;enumeration value="Alexandrite"/>
 *             &lt;enumeration value="Rhodamine6G"/>
 *             &lt;enumeration value="CoumarinC30"/>
 *             &lt;enumeration value="GaAs"/>
 *             &lt;enumeration value="GaAlAs"/>
 *             &lt;enumeration value="EMinus"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Wavelength" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="WavelengthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="nm" />
 *       &lt;attribute name="FrequencyMultiplication" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="Tuneable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Pulse">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="CW"/>
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="QSwitched"/>
 *             &lt;enumeration value="Repetitive"/>
 *             &lt;enumeration value="ModeLocked"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PockelCell" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RepetitionRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="RepetitionRateUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsFrequency" default="Hz" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pump"
})
public class Laser
    extends LightSource
{

    @XmlElement(name = "Pump")
    protected Pump pump;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "LaserMedium")
    protected String laserMedium;
    @XmlAttribute(name = "Wavelength")
    protected Float wavelength;
    @XmlAttribute(name = "WavelengthUnit")
    protected String wavelengthUnit;
    @XmlAttribute(name = "FrequencyMultiplication")
    protected Integer frequencyMultiplication;
    @XmlAttribute(name = "Tuneable")
    protected Boolean tuneable;
    @XmlAttribute(name = "Pulse")
    protected String pulse;
    @XmlAttribute(name = "PockelCell")
    protected Boolean pockelCell;
    @XmlAttribute(name = "RepetitionRate")
    protected Float repetitionRate;
    @XmlAttribute(name = "RepetitionRateUnit")
    protected String repetitionRateUnit;

    /**
     * 
     *                   The Laser element may contain a Pump sub-element which refers to
     *                   a LightSource used as a laser pump.
     *                 
     * 
     * @return
     *     possible object is
     *     {@link Pump }
     *     
     */
    public Pump getPump() {
        return pump;
    }

    /**
     * Sets the value of the pump property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pump }
     *     
     */
    public void setPump(Pump value) {
        this.pump = value;
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
     * Gets the value of the laserMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaserMedium() {
        return laserMedium;
    }

    /**
     * Sets the value of the laserMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaserMedium(String value) {
        this.laserMedium = value;
    }

    /**
     * Gets the value of the wavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWavelength(Float value) {
        this.wavelength = value;
    }

    /**
     * Gets the value of the wavelengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWavelengthUnit() {
        if (wavelengthUnit == null) {
            return "nm";
        } else {
            return wavelengthUnit;
        }
    }

    /**
     * Sets the value of the wavelengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWavelengthUnit(String value) {
        this.wavelengthUnit = value;
    }

    /**
     * Gets the value of the frequencyMultiplication property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyMultiplication() {
        return frequencyMultiplication;
    }

    /**
     * Sets the value of the frequencyMultiplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyMultiplication(Integer value) {
        this.frequencyMultiplication = value;
    }

    /**
     * Gets the value of the tuneable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuneable() {
        return tuneable;
    }

    /**
     * Sets the value of the tuneable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuneable(Boolean value) {
        this.tuneable = value;
    }

    /**
     * Gets the value of the pulse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPulse() {
        return pulse;
    }

    /**
     * Sets the value of the pulse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPulse(String value) {
        this.pulse = value;
    }

    /**
     * Gets the value of the pockelCell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPockelCell() {
        return pockelCell;
    }

    /**
     * Sets the value of the pockelCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPockelCell(Boolean value) {
        this.pockelCell = value;
    }

    /**
     * Gets the value of the repetitionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRepetitionRate() {
        return repetitionRate;
    }

    /**
     * Sets the value of the repetitionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRepetitionRate(Float value) {
        this.repetitionRate = value;
    }

    /**
     * Gets the value of the repetitionRateUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetitionRateUnit() {
        if (repetitionRateUnit == null) {
            return "Hz";
        } else {
            return repetitionRateUnit;
        }
    }

    /**
     * Sets the value of the repetitionRateUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetitionRateUnit(String value) {
        this.repetitionRateUnit = value;
    }

}
