
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsPower.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsPower">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YW"/>
 *     &lt;enumeration value="ZW"/>
 *     &lt;enumeration value="EW"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="kW"/>
 *     &lt;enumeration value="hW"/>
 *     &lt;enumeration value="daW"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="dW"/>
 *     &lt;enumeration value="cW"/>
 *     &lt;enumeration value="mW"/>
 *     &lt;enumeration value="µW"/>
 *     &lt;enumeration value="nW"/>
 *     &lt;enumeration value="pW"/>
 *     &lt;enumeration value="fW"/>
 *     &lt;enumeration value="aW"/>
 *     &lt;enumeration value="zW"/>
 *     &lt;enumeration value="yW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsPower")
@XmlEnum
public enum UnitsPower {


    /**
     * yottawatt unit.
     * 
     */
    YW("YW"),

    /**
     * zettawatt unit.
     * 
     */
    ZW("ZW"),

    /**
     * exawatt unit.
     * 
     */
    EW("EW"),

    /**
     * petawatt unit.
     * 
     */
    PW("PW"),

    /**
     * terawatt unit.
     * 
     */
    TW("TW"),

    /**
     * gigawatt unit.
     * 
     */
    GW("GW"),

    /**
     * megawatt unit.
     * 
     */
    MW("MW"),

    /**
     * kilowatt unit.
     * 
     */
    @XmlEnumValue("kW")
    K_W("kW"),

    /**
     * hectowatt unit.
     * 
     */
    @XmlEnumValue("hW")
    H_W("hW"),

    /**
     * decawatt unit.
     * 
     */
    @XmlEnumValue("daW")
    DA_W("daW"),

    /**
     * watt unit.
     * 
     */
    W("W"),

    /**
     * deciwatt unit.
     * 
     */
    @XmlEnumValue("dW")
    D_W("dW"),

    /**
     * centiwatt unit.
     * 
     */
    @XmlEnumValue("cW")
    C_W("cW"),

    /**
     * milliwatt unit.
     * 
     */
    @XmlEnumValue("mW")
    M_W("mW"),

    /**
     * microwatt unit.
     * 
     */
    @XmlEnumValue("\u00b5W")
    \u039c_W("\u00b5W"),

    /**
     * nanowatt unit.
     * 
     */
    @XmlEnumValue("nW")
    N_W("nW"),

    /**
     * picowatt unit.
     * 
     */
    @XmlEnumValue("pW")
    P_W("pW"),

    /**
     * femtowatt unit.
     * 
     */
    @XmlEnumValue("fW")
    F_W("fW"),

    /**
     * attowatt unit.
     * 
     */
    @XmlEnumValue("aW")
    A_W("aW"),

    /**
     * zeptowatt unit.
     * 
     */
    @XmlEnumValue("zW")
    Z_W("zW"),

    /**
     * yoctowatt unit.
     * 
     */
    @XmlEnumValue("yW")
    Y_W("yW");
    private final String value;

    UnitsPower(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsPower fromValue(String v) {
        for (UnitsPower c: UnitsPower.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
