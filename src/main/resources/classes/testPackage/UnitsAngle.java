
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsAngle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsAngle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="deg"/>
 *     &lt;enumeration value="rad"/>
 *     &lt;enumeration value="gon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsAngle")
@XmlEnum
public enum UnitsAngle {


    /**
     * degree unit.
     * 
     */
    @XmlEnumValue("deg")
    DEG("deg"),

    /**
     * radian unit.
     * 
     */
    @XmlEnumValue("rad")
    RAD("rad"),

    /**
     * gradian unit.
     * 
     */
    @XmlEnumValue("gon")
    GON("gon");
    private final String value;

    UnitsAngle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsAngle fromValue(String v) {
        for (UnitsAngle c: UnitsAngle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
