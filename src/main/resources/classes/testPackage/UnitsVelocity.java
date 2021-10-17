
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsVelocity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsVelocity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="m/s"/>
 *     &lt;enumeration value="mm/s"/>
 *     &lt;enumeration value="µm/s"/>
 *     &lt;enumeration value="nm/s"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsVelocity")
@XmlEnum
public enum UnitsVelocity {


    /**
     * m/s SI unit.
     * 
     */
    @XmlEnumValue("m/s")
    M_S("m/s"),
    @XmlEnumValue("mm/s")
    MM_S("mm/s"),
    @XmlEnumValue("\u00b5m/s")
    \u039cM_S("\u00b5m/s"),
    @XmlEnumValue("nm/s")
    NM_S("nm/s"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UnitsVelocity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsVelocity fromValue(String v) {
        for (UnitsVelocity c: UnitsVelocity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
