
package testPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openmicroscopy.org/Schemas/OME/2016-06}ManufacturerSpec">
 *       &lt;attribute name="ID" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}LSID" />
 *       &lt;attribute name="Name" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}Denomination" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Simple Bench"/>
 *             &lt;enumeration value="Non-isolating Frame"/>
 *             &lt;enumeration value="Active Air"/>
 *             &lt;enumeration value="Passive Air"/>
 *             &lt;enumeration value="Stone"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TableWidth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TableWidthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *       &lt;attribute name="TableDepth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="TableDepthUnit" type="{http://www.openmicroscopy.org/Schemas/OME/2016-06}UnitsLength" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MicroscopeTable")
public class MicroscopeTable
    extends ManufacturerSpec
{

    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TableWidth")
    protected Float tableWidth;
    @XmlAttribute(name = "TableWidthUnit")
    protected String tableWidthUnit;
    @XmlAttribute(name = "TableDepth")
    protected Float tableDepth;
    @XmlAttribute(name = "TableDepthUnit")
    protected String tableDepthUnit;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the tableWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTableWidth() {
        return tableWidth;
    }

    /**
     * Sets the value of the tableWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTableWidth(Float value) {
        this.tableWidth = value;
    }

    /**
     * Gets the value of the tableWidthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableWidthUnit() {
        return tableWidthUnit;
    }

    /**
     * Sets the value of the tableWidthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableWidthUnit(String value) {
        this.tableWidthUnit = value;
    }

    /**
     * Gets the value of the tableDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTableDepth() {
        return tableDepth;
    }

    /**
     * Sets the value of the tableDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTableDepth(Float value) {
        this.tableDepth = value;
    }

    /**
     * Gets the value of the tableDepthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableDepthUnit() {
        return tableDepthUnit;
    }

    /**
     * Sets the value of the tableDepthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableDepthUnit(String value) {
        this.tableDepthUnit = value;
    }

}
