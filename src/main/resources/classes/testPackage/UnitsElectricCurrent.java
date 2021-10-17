
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsElectricCurrent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsElectricCurrent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value=" e-/pixel/sec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsElectricCurrent")
@XmlEnum
public enum UnitsElectricCurrent {

    A("A"),
    @XmlEnumValue(" e-/pixel/sec")
    E_PIXEL_SEC(" e-/pixel/sec");
    private final String value;

    UnitsElectricCurrent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsElectricCurrent fromValue(String v) {
        for (UnitsElectricCurrent c: UnitsElectricCurrent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
