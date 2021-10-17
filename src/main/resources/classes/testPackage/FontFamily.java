
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontFamily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FontFamily">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="serif"/>
 *     &lt;enumeration value="sans-serif"/>
 *     &lt;enumeration value="cursive"/>
 *     &lt;enumeration value="fantasy"/>
 *     &lt;enumeration value="monospace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontFamily")
@XmlEnum
public enum FontFamily {


    /**
     * serif.
     * 
     */
    @XmlEnumValue("serif")
    SERIF("serif"),

    /**
     * sans-serif.
     * 
     */
    @XmlEnumValue("sans-serif")
    SANS_SERIF("sans-serif"),

    /**
     * cursive.
     * 
     */
    @XmlEnumValue("cursive")
    CURSIVE("cursive"),

    /**
     * fantasy.
     * 
     */
    @XmlEnumValue("fantasy")
    FANTASY("fantasy"),

    /**
     * monospace.
     * 
     */
    @XmlEnumValue("monospace")
    MONOSPACE("monospace");
    private final String value;

    FontFamily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontFamily fromValue(String v) {
        for (FontFamily c: FontFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
