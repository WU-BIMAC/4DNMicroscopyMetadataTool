
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Settings is an empty complex type that is contained and extended by all the *Settings elements. Each *Settings element defines an attribute named ID of simple type *ID and the other information that is needed. Each simple type *ID is restricted to the base type LSID with an appropriate pattern
 *       
 * 
 * <p>Java class for Settings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Settings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Reference">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Settings")
@XmlSeeAlso({
    DetectorSettings.class,
    ObjectiveSettings.class,
    MicroscopeSettings.class,
    TIRFSettings.class,
    LightSourceSettings.class
})
public class Settings
    extends Reference
{


}
