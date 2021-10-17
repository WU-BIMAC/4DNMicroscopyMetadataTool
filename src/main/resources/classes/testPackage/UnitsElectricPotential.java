
package testPackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsElectricPotential.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsElectricPotential">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YV"/>
 *     &lt;enumeration value="ZV"/>
 *     &lt;enumeration value="EV"/>
 *     &lt;enumeration value="PV"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="GV"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="kV"/>
 *     &lt;enumeration value="hV"/>
 *     &lt;enumeration value="daV"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="dV"/>
 *     &lt;enumeration value="cV"/>
 *     &lt;enumeration value="mV"/>
 *     &lt;enumeration value="µV"/>
 *     &lt;enumeration value="nV"/>
 *     &lt;enumeration value="pV"/>
 *     &lt;enumeration value="fV"/>
 *     &lt;enumeration value="aV"/>
 *     &lt;enumeration value="zV"/>
 *     &lt;enumeration value="yV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsElectricPotential")
@XmlEnum
public enum UnitsElectricPotential {


    /**
     * yottavolt unit.
     * 
     */
    YV("YV"),

    /**
     * zettavolt unit.
     * 
     */
    ZV("ZV"),

    /**
     * exavolt unit.
     * 
     */
    EV("EV"),

    /**
     * petavolt unit.
     * 
     */
    PV("PV"),

    /**
     * teravolt unit.
     * 
     */
    TV("TV"),

    /**
     * gigavolt unit.
     * 
     */
    GV("GV"),

    /**
     * megavolt unit.
     * 
     */
    MV("MV"),

    /**
     * kilovolt unit.
     * 
     */
    @XmlEnumValue("kV")
    K_V("kV"),

    /**
     * hectovolt unit.
     * 
     */
    @XmlEnumValue("hV")
    H_V("hV"),

    /**
     * decavolt unit.
     * 
     */
    @XmlEnumValue("daV")
    DA_V("daV"),

    /**
     * volt unit.
     * 
     */
    V("V"),

    /**
     * decivolt unit.
     * 
     */
    @XmlEnumValue("dV")
    D_V("dV"),

    /**
     * centivolt unit.
     * 
     */
    @XmlEnumValue("cV")
    C_V("cV"),

    /**
     * millivolt unit.
     * 
     */
    @XmlEnumValue("mV")
    M_V("mV"),

    /**
     * microvolt unit.
     * 
     */
    @XmlEnumValue("\u00b5V")
    \u039c_V("\u00b5V"),

    /**
     * nanovolt unit.
     * 
     */
    @XmlEnumValue("nV")
    N_V("nV"),

    /**
     * picovolt unit.
     * 
     */
    @XmlEnumValue("pV")
    P_V("pV"),

    /**
     * femtovolt unit.
     * 
     */
    @XmlEnumValue("fV")
    F_V("fV"),

    /**
     * attovolt unit.
     * 
     */
    @XmlEnumValue("aV")
    A_V("aV"),

    /**
     * zeptovolt unit.
     * 
     */
    @XmlEnumValue("zV")
    Z_V("zV"),

    /**
     * yoctovolt unit.
     * 
     */
    @XmlEnumValue("yV")
    Y_V("yV");
    private final String value;

    UnitsElectricPotential(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsElectricPotential fromValue(String v) {
        for (UnitsElectricPotential c: UnitsElectricPotential.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
