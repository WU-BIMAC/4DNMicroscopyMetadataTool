
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamingConvention.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamingConvention">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="letter"/>
 *     &lt;enumeration value="number"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamingConvention")
@XmlEnum
public enum NamingConvention {


    /**
     * 
     *             While the label type 'number' has a clear meaning the 'letter'
     *             type is more complex.
     * 
     *             If you have less than 26 values use letters A to Z.
     *             Once you get more than 26 values there are several different
     *             approaches in use.
     *             One we have see include:
     * 
     *             Single letter, then double letter each running A to Z, right first
     *             e.g. A, B, C, ... X, Y, Z, AA, AB, AC, ... AY, AZ, BA, BB, ...
     *             This is the format used by Microsoft Excel so users may be familiar with it.
     *             This is the approach we use in the OMERO client applications.
     * 
     *             CAPITALsmall, each running A to Z, small first
     *             e.g. Aa, Ab, Ac, ... Ax, Ay, Az, Ba, Bb, Bc, ... By, Bz, Ca, Cb, ...
     *             This is in use by some plate manufactures.
     * 
     *             Single letter, then double letter, then triple letter, and so on
     *             e.g. A, B, C, ... X, Y, Z, AA, BB, CC, ... YY, ZZ, AAA, BBB, ...
     *             This has the advantage that the first 26 are the same as the standard
     *             but has a problem an the labels get wider and wider leading to user
     *             interface problems.
     *           
     * 
     */
    @XmlEnumValue("letter")
    LETTER("letter"),

    /**
     * 
     *             1, 2, 3, ...
     *           
     * 
     */
    @XmlEnumValue("number")
    NUMBER("number");
    private final String value;

    NamingConvention(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamingConvention fromValue(String v) {
        for (NamingConvention c: NamingConvention.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
