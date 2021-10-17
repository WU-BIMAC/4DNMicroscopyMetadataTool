
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsTemperature.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsTemperature">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="°C"/>
 *     &lt;enumeration value="°F"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="°R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsTemperature")
@XmlEnum
public enum UnitsTemperature {


    /**
     * degree Celsius unit.
     * 
     */
    @XmlEnumValue("\u00b0C")
    C("\u00b0C"),

    /**
     * degree Fahrenheit unit.
     * 
     */
    @XmlEnumValue("\u00b0F")
    F("\u00b0F"),

    /**
     * Kelvin unit.
     * 
     */
    K("K"),

    /**
     * degree Rankine unit.
     * 
     */
    @XmlEnumValue("\u00b0R")
    R("\u00b0R");
    private final String value;

    UnitsTemperature(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsTemperature fromValue(String v) {
        for (UnitsTemperature c: UnitsTemperature.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
