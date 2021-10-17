
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An abstract Basic Annotation from which some others are derived.
 *       
 * 
 * <p>Java class for BasicAnnotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicAnnotation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Annotation">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicAnnotation")
@XmlSeeAlso({
    TermAnnotation.class,
    TimestampAnnotation.class,
    BooleanAnnotation.class,
    NumericAnnotation.class
})
public class BasicAnnotation
    extends Annotation
{


}
