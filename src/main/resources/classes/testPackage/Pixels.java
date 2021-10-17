
package testPackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Channel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}BinData" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}TiffData" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}MetadataOnly"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Plane" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PixelsID" />
 *       &lt;attribute name="DimensionOrder" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="XYZCT"/>
 *             &lt;enumeration value="XYZTC"/>
 *             &lt;enumeration value="XYCTZ"/>
 *             &lt;enumeration value="XYCZT"/>
 *             &lt;enumeration value="XYTCZ"/>
 *             &lt;enumeration value="XYTZC"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Type" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PixelType" />
 *       &lt;attribute name="SignificantBits" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="Interleaved" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BigEndian" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SizeX" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="SizeY" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="SizeZ" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="SizeC" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="SizeT" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="PhysicalSizeX" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="PhysicalSizeXUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="PhysicalSizeY" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="PhysicalSizeYUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="PhysicalSizeZ" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveFloat" />
 *       &lt;attribute name="PhysicalSizeZUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="µm" />
 *       &lt;attribute name="TimeIncrement" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TimeIncrementUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsTime" default="s" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "channel",
    "binData",
    "tiffData",
    "metadataOnly",
    "plane"
})
@XmlRootElement(name = "Pixels")
public class Pixels
    extends MicroscopeComponent
{

    @XmlElement(name = "Channel")
    protected List<Channel> channel;
    @XmlElement(name = "BinData")
    protected List<BinData> binData;
    @XmlElement(name = "TiffData")
    protected List<TiffData> tiffData;
    @XmlElement(name = "MetadataOnly")
    protected Object metadataOnly;
    @XmlElement(name = "Plane")
    protected List<Plane> plane;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "DimensionOrder", required = true)
    protected String dimensionOrder;
    @XmlAttribute(name = "Type", required = true)
    protected PixelType type;
    @XmlAttribute(name = "SignificantBits")
    protected Integer significantBits;
    @XmlAttribute(name = "Interleaved")
    protected Boolean interleaved;
    @XmlAttribute(name = "BigEndian")
    protected Boolean bigEndian;
    @XmlAttribute(name = "SizeX", required = true)
    protected int sizeX;
    @XmlAttribute(name = "SizeY", required = true)
    protected int sizeY;
    @XmlAttribute(name = "SizeZ", required = true)
    protected int sizeZ;
    @XmlAttribute(name = "SizeC", required = true)
    protected int sizeC;
    @XmlAttribute(name = "SizeT", required = true)
    protected int sizeT;
    @XmlAttribute(name = "PhysicalSizeX")
    protected Float physicalSizeX;
    @XmlAttribute(name = "PhysicalSizeXUnit")
    protected String physicalSizeXUnit;
    @XmlAttribute(name = "PhysicalSizeY")
    protected Float physicalSizeY;
    @XmlAttribute(name = "PhysicalSizeYUnit")
    protected String physicalSizeYUnit;
    @XmlAttribute(name = "PhysicalSizeZ")
    protected Float physicalSizeZ;
    @XmlAttribute(name = "PhysicalSizeZUnit")
    protected String physicalSizeZUnit;
    @XmlAttribute(name = "TimeIncrement")
    protected Float timeIncrement;
    @XmlAttribute(name = "TimeIncrementUnit")
    protected String timeIncrementUnit;

    /**
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel }
     * 
     * 
     */
    public List<Channel> getChannel() {
        if (channel == null) {
            channel = new ArrayList<Channel>();
        }
        return this.channel;
    }

    /**
     * Gets the value of the binData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinData }
     * 
     * 
     */
    public List<BinData> getBinData() {
        if (binData == null) {
            binData = new ArrayList<BinData>();
        }
        return this.binData;
    }

    /**
     * Gets the value of the tiffData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiffData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiffData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiffData }
     * 
     * 
     */
    public List<TiffData> getTiffData() {
        if (tiffData == null) {
            tiffData = new ArrayList<TiffData>();
        }
        return this.tiffData;
    }

    /**
     * Gets the value of the metadataOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMetadataOnly() {
        return metadataOnly;
    }

    /**
     * Sets the value of the metadataOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMetadataOnly(Object value) {
        this.metadataOnly = value;
    }

    /**
     * Gets the value of the plane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plane }
     * 
     * 
     */
    public List<Plane> getPlane() {
        if (plane == null) {
            plane = new ArrayList<Plane>();
        }
        return this.plane;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dimensionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionOrder() {
        return dimensionOrder;
    }

    /**
     * Sets the value of the dimensionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionOrder(String value) {
        this.dimensionOrder = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PixelType }
     *     
     */
    public PixelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelType }
     *     
     */
    public void setType(PixelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the significantBits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignificantBits() {
        return significantBits;
    }

    /**
     * Sets the value of the significantBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignificantBits(Integer value) {
        this.significantBits = value;
    }

    /**
     * Gets the value of the interleaved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterleaved() {
        return interleaved;
    }

    /**
     * Sets the value of the interleaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterleaved(Boolean value) {
        this.interleaved = value;
    }

    /**
     * Gets the value of the bigEndian property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBigEndian() {
        return bigEndian;
    }

    /**
     * Sets the value of the bigEndian property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBigEndian(Boolean value) {
        this.bigEndian = value;
    }

    /**
     * Gets the value of the sizeX property.
     * 
     */
    public int getSizeX() {
        return sizeX;
    }

    /**
     * Sets the value of the sizeX property.
     * 
     */
    public void setSizeX(int value) {
        this.sizeX = value;
    }

    /**
     * Gets the value of the sizeY property.
     * 
     */
    public int getSizeY() {
        return sizeY;
    }

    /**
     * Sets the value of the sizeY property.
     * 
     */
    public void setSizeY(int value) {
        this.sizeY = value;
    }

    /**
     * Gets the value of the sizeZ property.
     * 
     */
    public int getSizeZ() {
        return sizeZ;
    }

    /**
     * Sets the value of the sizeZ property.
     * 
     */
    public void setSizeZ(int value) {
        this.sizeZ = value;
    }

    /**
     * Gets the value of the sizeC property.
     * 
     */
    public int getSizeC() {
        return sizeC;
    }

    /**
     * Sets the value of the sizeC property.
     * 
     */
    public void setSizeC(int value) {
        this.sizeC = value;
    }

    /**
     * Gets the value of the sizeT property.
     * 
     */
    public int getSizeT() {
        return sizeT;
    }

    /**
     * Sets the value of the sizeT property.
     * 
     */
    public void setSizeT(int value) {
        this.sizeT = value;
    }

    /**
     * Gets the value of the physicalSizeX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPhysicalSizeX() {
        return physicalSizeX;
    }

    /**
     * Sets the value of the physicalSizeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPhysicalSizeX(Float value) {
        this.physicalSizeX = value;
    }

    /**
     * Gets the value of the physicalSizeXUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalSizeXUnit() {
        if (physicalSizeXUnit == null) {
            return "\u00b5m";
        } else {
            return physicalSizeXUnit;
        }
    }

    /**
     * Sets the value of the physicalSizeXUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalSizeXUnit(String value) {
        this.physicalSizeXUnit = value;
    }

    /**
     * Gets the value of the physicalSizeY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPhysicalSizeY() {
        return physicalSizeY;
    }

    /**
     * Sets the value of the physicalSizeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPhysicalSizeY(Float value) {
        this.physicalSizeY = value;
    }

    /**
     * Gets the value of the physicalSizeYUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalSizeYUnit() {
        if (physicalSizeYUnit == null) {
            return "\u00b5m";
        } else {
            return physicalSizeYUnit;
        }
    }

    /**
     * Sets the value of the physicalSizeYUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalSizeYUnit(String value) {
        this.physicalSizeYUnit = value;
    }

    /**
     * Gets the value of the physicalSizeZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPhysicalSizeZ() {
        return physicalSizeZ;
    }

    /**
     * Sets the value of the physicalSizeZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPhysicalSizeZ(Float value) {
        this.physicalSizeZ = value;
    }

    /**
     * Gets the value of the physicalSizeZUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalSizeZUnit() {
        if (physicalSizeZUnit == null) {
            return "\u00b5m";
        } else {
            return physicalSizeZUnit;
        }
    }

    /**
     * Sets the value of the physicalSizeZUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalSizeZUnit(String value) {
        this.physicalSizeZUnit = value;
    }

    /**
     * Gets the value of the timeIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeIncrement() {
        return timeIncrement;
    }

    /**
     * Sets the value of the timeIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeIncrement(Float value) {
        this.timeIncrement = value;
    }

    /**
     * Gets the value of the timeIncrementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIncrementUnit() {
        if (timeIncrementUnit == null) {
            return "s";
        } else {
            return timeIncrementUnit;
        }
    }

    /**
     * Sets the value of the timeIncrementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIncrementUnit(String value) {
        this.timeIncrementUnit = value;
    }

}
