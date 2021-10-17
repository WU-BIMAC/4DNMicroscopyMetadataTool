
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MicTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MicTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Upright"/>
 *     &lt;enumeration value="Inverted"/>
 *     &lt;enumeration value="Dissection"/>
 *     &lt;enumeration value="Electrophysiology"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MicTypeEnum")
@XmlEnum
public enum MicTypeEnum {

    @XmlEnumValue("Upright")
    UPRIGHT("Upright"),
    @XmlEnumValue("Inverted")
    INVERTED("Inverted"),
    @XmlEnumValue("Dissection")
    DISSECTION("Dissection"),
    @XmlEnumValue("Electrophysiology")
    ELECTROPHYSIOLOGY("Electrophysiology"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MicTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MicTypeEnum fromValue(String v) {
        for (MicTypeEnum c: MicTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
