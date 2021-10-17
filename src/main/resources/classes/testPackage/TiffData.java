
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *       &lt;sequence>
 *         &lt;element name="UUID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.openmicroscopy.org/Schemas/OME/2016-06>UniversallyUniqueIdentifier">
 *                 &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="IFD" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" default="0" />
 *       &lt;attribute name="FirstZ" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" default="0" />
 *       &lt;attribute name="FirstT" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" default="0" />
 *       &lt;attribute name="FirstC" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" default="0" />
 *       &lt;attribute name="PlaneCount" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uuid"
})
@XmlRootElement(name = "TiffData")
public class TiffData
    extends MicroscopeComponent
{

    @XmlElement(name = "UUID")
    protected TiffData.UUID uuid;
    @XmlAttribute(name = "IFD")
    protected Integer ifd;
    @XmlAttribute(name = "FirstZ")
    protected Integer firstZ;
    @XmlAttribute(name = "FirstT")
    protected Integer firstT;
    @XmlAttribute(name = "FirstC")
    protected Integer firstC;
    @XmlAttribute(name = "PlaneCount")
    protected Integer planeCount;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link TiffData.UUID }
     *     
     */
    public TiffData.UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiffData.UUID }
     *     
     */
    public void setUUID(TiffData.UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the ifd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getIFD() {
        if (ifd == null) {
            return  0;
        } else {
            return ifd;
        }
    }

    /**
     * Sets the value of the ifd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIFD(Integer value) {
        this.ifd = value;
    }

    /**
     * Gets the value of the firstZ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFirstZ() {
        if (firstZ == null) {
            return  0;
        } else {
            return firstZ;
        }
    }

    /**
     * Sets the value of the firstZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstZ(Integer value) {
        this.firstZ = value;
    }

    /**
     * Gets the value of the firstT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFirstT() {
        if (firstT == null) {
            return  0;
        } else {
            return firstT;
        }
    }

    /**
     * Sets the value of the firstT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstT(Integer value) {
        this.firstT = value;
    }

    /**
     * Gets the value of the firstC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFirstC() {
        if (firstC == null) {
            return  0;
        } else {
            return firstC;
        }
    }

    /**
     * Sets the value of the firstC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstC(Integer value) {
        this.firstC = value;
    }

    /**
     * Gets the value of the planeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlaneCount() {
        return planeCount;
    }

    /**
     * Sets the value of the planeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlaneCount(Integer value) {
        this.planeCount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.openmicroscopy.org/Schemas/OME/2016-06>UniversallyUniqueIdentifier">
     *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UUID
        extends MicroscopeComponent
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FileName")
        protected String fileName;

        /**
         * 
         *         This is a unique ID for the file but does not conform to the ID pattern used in the rest of the file.
         *         The rest of the IDs are either an full LSID or an internal ID which is a string that is simply unique in this file.
         *         As the UniversallyUniqueIdentifier is used from outside this file to identify it having the same ID in another file could cause problems.
         *         A UUID is 32 hexadecimal digits, in 5 groups, 8-4-4-4-12, separated by hyphens
         *         e.g. urn:uuid:3e450fae-b8f2-4d35-aa54-702168b2487f
         *         There are methods to generate these in most modern languages.
         *         http://www.ietf.org/rfc/rfc4122.txt
         *       
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }

}
