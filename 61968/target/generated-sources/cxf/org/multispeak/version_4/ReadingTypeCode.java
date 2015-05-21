
package org.multispeak.version_4;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Java class for readingTypeCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingTypeCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accumulationBehavior" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flowDirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UOMCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="measurementCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phaseIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitsMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayableUOM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingTypeCode", propOrder = {
    "value"
})
public class ReadingTypeCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "timeAttribute")
    protected String timeAttribute;
    @XmlAttribute(name = "dataQualifier")
    protected String dataQualifier;
    @XmlAttribute(name = "accumulationBehavior")
    protected String accumulationBehavior;
    @XmlAttribute(name = "flowDirection")
    protected String flowDirection;
    @XmlAttribute(name = "UOMCategory")
    protected String uomCategory;
    @XmlAttribute(name = "measurementCategory")
    protected String measurementCategory;
    @XmlAttribute(name = "phaseIndex")
    protected String phaseIndex;
    @XmlAttribute(name = "unitsMultiplier")
    protected String unitsMultiplier;
    @XmlAttribute(name = "displayableUOM")
    protected String displayableUOM;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
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
     * Gets the value of the timeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAttribute() {
        return timeAttribute;
    }

    /**
     * Sets the value of the timeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAttribute(String value) {
        this.timeAttribute = value;
    }

    /**
     * Gets the value of the dataQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataQualifier() {
        return dataQualifier;
    }

    /**
     * Sets the value of the dataQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataQualifier(String value) {
        this.dataQualifier = value;
    }

    /**
     * Gets the value of the accumulationBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulationBehavior() {
        return accumulationBehavior;
    }

    /**
     * Sets the value of the accumulationBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulationBehavior(String value) {
        this.accumulationBehavior = value;
    }

    /**
     * Gets the value of the flowDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowDirection() {
        return flowDirection;
    }

    /**
     * Sets the value of the flowDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowDirection(String value) {
        this.flowDirection = value;
    }

    /**
     * Gets the value of the uomCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMCategory() {
        return uomCategory;
    }

    /**
     * Sets the value of the uomCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMCategory(String value) {
        this.uomCategory = value;
    }

    /**
     * Gets the value of the measurementCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementCategory() {
        return measurementCategory;
    }

    /**
     * Sets the value of the measurementCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementCategory(String value) {
        this.measurementCategory = value;
    }

    /**
     * Gets the value of the phaseIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseIndex() {
        return phaseIndex;
    }

    /**
     * Sets the value of the phaseIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseIndex(String value) {
        this.phaseIndex = value;
    }

    /**
     * Gets the value of the unitsMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsMultiplier() {
        return unitsMultiplier;
    }

    /**
     * Sets the value of the unitsMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsMultiplier(String value) {
        this.unitsMultiplier = value;
    }

    /**
     * Gets the value of the displayableUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayableUOM() {
        return displayableUOM;
    }

    /**
     * Sets the value of the displayableUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayableUOM(String value) {
        this.displayableUOM = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
