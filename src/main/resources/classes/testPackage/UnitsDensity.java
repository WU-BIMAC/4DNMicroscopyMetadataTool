
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsDensity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsDensity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kg/m3"/>
 *     &lt;enumeration value="g/ml"/>
 *     &lt;enumeration value="mg/µg"/>
 *     &lt;enumeration value="µg/ng"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsDensity")
@XmlEnum
public enum UnitsDensity {

    @XmlEnumValue("kg/m3")
    KG_M_3("kg/m3"),
    @XmlEnumValue("g/ml")
    G_ML("g/ml"),
    @XmlEnumValue("mg/\u00b5g")
    MG_\u039cG("mg/\u00b5g"),
    @XmlEnumValue("\u00b5g/ng")
    \u039cG_NG("\u00b5g/ng");
    private final String value;

    UnitsDensity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsDensity fromValue(String v) {
        for (UnitsDensity c: UnitsDensity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
