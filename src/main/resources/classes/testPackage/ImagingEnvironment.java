
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
 *         &lt;element name="Map" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Map" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Temperature" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TemperatureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTemperature" default="°C" />
 *       &lt;attribute name="AirPressure" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AirPressureUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsPressure" default="mbar" />
 *       &lt;attribute name="Humidity" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PercentFraction" />
 *       &lt;attribute name="CO2Percent" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PercentFraction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "map"
})
@XmlRootElement(name = "ImagingEnvironment")
public class ImagingEnvironment
    extends MicroscopeComponent
{

    @XmlElement(name = "Map")
    protected Map map;
    @XmlAttribute(name = "Temperature")
    protected Float temperature;
    @XmlAttribute(name = "TemperatureUnit")
    protected UnitsTemperature temperatureUnit;
    @XmlAttribute(name = "AirPressure")
    protected Float airPressure;
    @XmlAttribute(name = "AirPressureUnit")
    protected String airPressureUnit;
    @XmlAttribute(name = "Humidity")
    protected Float humidity;
    @XmlAttribute(name = "CO2Percent")
    protected Float co2Percent;

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemperature(Float value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the temperatureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsTemperature }
     *     
     */
    public UnitsTemperature getTemperatureUnit() {
        if (temperatureUnit == null) {
            return UnitsTemperature.C;
        } else {
            return temperatureUnit;
        }
    }

    /**
     * Sets the value of the temperatureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsTemperature }
     *     
     */
    public void setTemperatureUnit(UnitsTemperature value) {
        this.temperatureUnit = value;
    }

    /**
     * Gets the value of the airPressure property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAirPressure() {
        return airPressure;
    }

    /**
     * Sets the value of the airPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAirPressure(Float value) {
        this.airPressure = value;
    }

    /**
     * Gets the value of the airPressureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPressureUnit() {
        if (airPressureUnit == null) {
            return "mbar";
        } else {
            return airPressureUnit;
        }
    }

    /**
     * Sets the value of the airPressureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPressureUnit(String value) {
        this.airPressureUnit = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHumidity(Float value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the co2Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCO2Percent() {
        return co2Percent;
    }

    /**
     * Sets the value of the co2Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCO2Percent(Float value) {
        this.co2Percent = value;
    }

}
