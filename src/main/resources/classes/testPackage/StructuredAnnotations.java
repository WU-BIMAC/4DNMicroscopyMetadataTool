
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}XMLAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}FileAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ListAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LongAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}DoubleAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}CommentAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}BooleanAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TimestampAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TagAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TermAnnotation"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MapAnnotation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xmlAnnotationOrFileAnnotationOrListAnnotation"
})
@XmlRootElement(name = "StructuredAnnotations")
public class StructuredAnnotations
    extends MicroscopeComponent
{

    @XmlElements({
        @XmlElement(name = "XMLAnnotation", type = XMLAnnotation.class),
        @XmlElement(name = "FileAnnotation", type = FileAnnotation.class),
        @XmlElement(name = "ListAnnotation", type = ListAnnotation.class),
        @XmlElement(name = "LongAnnotation", type = LongAnnotation.class),
        @XmlElement(name = "DoubleAnnotation", type = DoubleAnnotation.class),
        @XmlElement(name = "CommentAnnotation", type = CommentAnnotation.class),
        @XmlElement(name = "BooleanAnnotation", type = BooleanAnnotation.class),
        @XmlElement(name = "TimestampAnnotation", type = TimestampAnnotation.class),
        @XmlElement(name = "TagAnnotation", type = TagAnnotation.class),
        @XmlElement(name = "TermAnnotation", type = TermAnnotation.class),
        @XmlElement(name = "MapAnnotation", type = MapAnnotation.class)
    })
    protected List<Annotation> xmlAnnotationOrFileAnnotationOrListAnnotation;

    /**
     * Gets the value of the xmlAnnotationOrFileAnnotationOrListAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlAnnotationOrFileAnnotationOrListAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXMLAnnotationOrFileAnnotationOrListAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLAnnotation }
     * {@link FileAnnotation }
     * {@link ListAnnotation }
     * {@link LongAnnotation }
     * {@link DoubleAnnotation }
     * {@link CommentAnnotation }
     * {@link BooleanAnnotation }
     * {@link TimestampAnnotation }
     * {@link TagAnnotation }
     * {@link TermAnnotation }
     * {@link MapAnnotation }
     * 
     * 
     */
    public List<Annotation> getXMLAnnotationOrFileAnnotationOrListAnnotation() {
        if (xmlAnnotationOrFileAnnotationOrListAnnotation == null) {
            xmlAnnotationOrFileAnnotationOrListAnnotation = new ArrayList<Annotation>();
        }
        return this.xmlAnnotationOrFileAnnotationOrListAnnotation;
    }

}
