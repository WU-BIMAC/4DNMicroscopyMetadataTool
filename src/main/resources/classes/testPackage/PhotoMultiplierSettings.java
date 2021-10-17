
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DetectorSettings">
 *       &lt;attribute name="PMTGain" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PMTVoltage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PMTVoltageUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsElectricPotential" default="V" />
 *       &lt;attribute name="EffectiveZoom" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PhotoMultiplierSettings
    extends DetectorSettings
{

    @XmlAttribute(name = "PMTGain")
    protected Float pmtGain;
    @XmlAttribute(name = "PMTVoltage")
    protected Float pmtVoltage;
    @XmlAttribute(name = "PMTVoltageUnit")
    protected UnitsElectricPotential pmtVoltageUnit;
    @XmlAttribute(name = "EffectiveZoom")
    protected Float effectiveZoom;

    /**
     * Gets the value of the pmtGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPMTGain() {
        return pmtGain;
    }

    /**
     * Sets the value of the pmtGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPMTGain(Float value) {
        this.pmtGain = value;
    }

    /**
     * Gets the value of the pmtVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPMTVoltage() {
        return pmtVoltage;
    }

    /**
     * Sets the value of the pmtVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPMTVoltage(Float value) {
        this.pmtVoltage = value;
    }

    /**
     * Gets the value of the pmtVoltageUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsElectricPotential }
     *     
     */
    public UnitsElectricPotential getPMTVoltageUnit() {
        if (pmtVoltageUnit == null) {
            return UnitsElectricPotential.V;
        } else {
            return pmtVoltageUnit;
        }
    }

    /**
     * Sets the value of the pmtVoltageUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsElectricPotential }
     *     
     */
    public void setPMTVoltageUnit(UnitsElectricPotential value) {
        this.pmtVoltageUnit = value;
    }

    /**
     * Gets the value of the effectiveZoom property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEffectiveZoom() {
        return effectiveZoom;
    }

    /**
     * Sets the value of the effectiveZoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEffectiveZoom(Float value) {
        this.effectiveZoom = value;
    }

}
