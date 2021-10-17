
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Mirror">
 *       &lt;attribute name="Transmittance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TransmissionAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class BeamSplitter
    extends Mirror
{

    @XmlAttribute(name = "Transmittance")
    protected Float transmittance;
    @XmlAttribute(name = "TransmissionAngle")
    protected Float transmissionAngle;

    /**
     * Gets the value of the transmittance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransmittance() {
        return transmittance;
    }

    /**
     * Sets the value of the transmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransmittance(Float value) {
        this.transmittance = value;
    }

    /**
     * Gets the value of the transmissionAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransmissionAngle() {
        return transmissionAngle;
    }

    /**
     * Sets the value of the transmissionAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransmissionAngle(Float value) {
        this.transmissionAngle = value;
    }

}
