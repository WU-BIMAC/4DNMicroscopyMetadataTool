
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PixelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PixelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="int8"/>
 *     &lt;enumeration value="int16"/>
 *     &lt;enumeration value="int32"/>
 *     &lt;enumeration value="uint8"/>
 *     &lt;enumeration value="uint16"/>
 *     &lt;enumeration value="uint32"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="complex"/>
 *     &lt;enumeration value="double-complex"/>
 *     &lt;enumeration value="bit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PixelType")
@XmlEnum
public enum PixelType {


    /**
     *  8 bit signed integer.
     * 
     */
    @XmlEnumValue("int8")
    INT_8("int8"),

    /**
     *  16 bit signed integer.
     * 
     */
    @XmlEnumValue("int16")
    INT_16("int16"),

    /**
     *  32 bit signed integer.
     * 
     */
    @XmlEnumValue("int32")
    INT_32("int32"),

    /**
     *  8 bit unsigned integer.
     * 
     */
    @XmlEnumValue("uint8")
    UINT_8("uint8"),

    /**
     *  16 bit unsigned integer.
     * 
     */
    @XmlEnumValue("uint16")
    UINT_16("uint16"),

    /**
     *  32 bit unsigned integer.
     * 
     */
    @XmlEnumValue("uint32")
    UINT_32("uint32"),

    /**
     * single-precision floating point.
     * 
     */
    @XmlEnumValue("float")
    FLOAT("float"),

    /**
     * double-precision floating point.
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double"),

    /**
     * complex single-precision floating point.
     * 
     */
    @XmlEnumValue("complex")
    COMPLEX("complex"),

    /**
     * complex double-precision floating point.
     * 
     */
    @XmlEnumValue("double-complex")
    DOUBLE_COMPLEX("double-complex"),

    /**
     * bit mask.
     * 
     */
    @XmlEnumValue("bit")
    BIT("bit");
    private final String value;

    PixelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PixelType fromValue(String v) {
        for (PixelType c: PixelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
