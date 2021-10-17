
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
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Well" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}AnnotationRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PlateAcquisition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PlateID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ColumnNamingConvention" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NamingConvention" />
 *       &lt;attribute name="RowNamingConvention" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NamingConvention" />
 *       &lt;attribute name="WellOriginX" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="WellOriginXUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="WellOriginY" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="WellOriginYUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" default="reference frame" />
 *       &lt;attribute name="Rows" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="Columns" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}PositiveInt" />
 *       &lt;attribute name="FieldIndex" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}NonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "well",
    "annotationRef",
    "plateAcquisition"
})
@XmlRootElement(name = "Plate")
public class Plate
    extends MicroscopeComponent
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Well")
    protected List<Well> well;
    @XmlElement(name = "AnnotationRef")
    protected List<AnnotationRef> annotationRef;
    @XmlElement(name = "PlateAcquisition")
    protected List<PlateAcquisition> plateAcquisition;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ExternalIdentifier")
    protected String externalIdentifier;
    @XmlAttribute(name = "ColumnNamingConvention")
    protected NamingConvention columnNamingConvention;
    @XmlAttribute(name = "RowNamingConvention")
    protected NamingConvention rowNamingConvention;
    @XmlAttribute(name = "WellOriginX")
    protected Float wellOriginX;
    @XmlAttribute(name = "WellOriginXUnit")
    protected String wellOriginXUnit;
    @XmlAttribute(name = "WellOriginY")
    protected Float wellOriginY;
    @XmlAttribute(name = "WellOriginYUnit")
    protected String wellOriginYUnit;
    @XmlAttribute(name = "Rows")
    protected Integer rows;
    @XmlAttribute(name = "Columns")
    protected Integer columns;
    @XmlAttribute(name = "FieldIndex")
    protected Integer fieldIndex;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the well property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the well property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Well }
     * 
     * 
     */
    public List<Well> getWell() {
        if (well == null) {
            well = new ArrayList<Well>();
        }
        return this.well;
    }

    /**
     * Gets the value of the annotationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationRef }
     * 
     * 
     */
    public List<AnnotationRef> getAnnotationRef() {
        if (annotationRef == null) {
            annotationRef = new ArrayList<AnnotationRef>();
        }
        return this.annotationRef;
    }

    /**
     * Gets the value of the plateAcquisition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plateAcquisition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlateAcquisition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlateAcquisition }
     * 
     * 
     */
    public List<PlateAcquisition> getPlateAcquisition() {
        if (plateAcquisition == null) {
            plateAcquisition = new ArrayList<PlateAcquisition>();
        }
        return this.plateAcquisition;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the externalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIdentifier(String value) {
        this.externalIdentifier = value;
    }

    /**
     * Gets the value of the columnNamingConvention property.
     * 
     * @return
     *     possible object is
     *     {@link NamingConvention }
     *     
     */
    public NamingConvention getColumnNamingConvention() {
        return columnNamingConvention;
    }

    /**
     * Sets the value of the columnNamingConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingConvention }
     *     
     */
    public void setColumnNamingConvention(NamingConvention value) {
        this.columnNamingConvention = value;
    }

    /**
     * Gets the value of the rowNamingConvention property.
     * 
     * @return
     *     possible object is
     *     {@link NamingConvention }
     *     
     */
    public NamingConvention getRowNamingConvention() {
        return rowNamingConvention;
    }

    /**
     * Sets the value of the rowNamingConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingConvention }
     *     
     */
    public void setRowNamingConvention(NamingConvention value) {
        this.rowNamingConvention = value;
    }

    /**
     * Gets the value of the wellOriginX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWellOriginX() {
        return wellOriginX;
    }

    /**
     * Sets the value of the wellOriginX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWellOriginX(Float value) {
        this.wellOriginX = value;
    }

    /**
     * Gets the value of the wellOriginXUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellOriginXUnit() {
        if (wellOriginXUnit == null) {
            return "reference frame";
        } else {
            return wellOriginXUnit;
        }
    }

    /**
     * Sets the value of the wellOriginXUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellOriginXUnit(String value) {
        this.wellOriginXUnit = value;
    }

    /**
     * Gets the value of the wellOriginY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWellOriginY() {
        return wellOriginY;
    }

    /**
     * Sets the value of the wellOriginY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWellOriginY(Float value) {
        this.wellOriginY = value;
    }

    /**
     * Gets the value of the wellOriginYUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellOriginYUnit() {
        if (wellOriginYUnit == null) {
            return "reference frame";
        } else {
            return wellOriginYUnit;
        }
    }

    /**
     * Sets the value of the wellOriginYUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellOriginYUnit(String value) {
        this.wellOriginYUnit = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRows(Integer value) {
        this.rows = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumns(Integer value) {
        this.columns = value;
    }

    /**
     * Gets the value of the fieldIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldIndex() {
        return fieldIndex;
    }

    /**
     * Sets the value of the fieldIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldIndex(Integer value) {
        this.fieldIndex = value;
    }

}
