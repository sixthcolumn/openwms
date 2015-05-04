
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DREventOptOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DREventOptOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbsoluteDate" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}AbsoluteDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbsoluteDateTime" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}AbsoluteDateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitMultiplier" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}UnitMultiplier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitSymbol" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}UnitSymbol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DREventOptOut", propOrder = {
    "absoluteDate",
    "absoluteDateTime",
    "string",
    "unitMultiplier",
    "unitSymbol"
})
public class DREventOptOut {

    @XmlElement(name = "AbsoluteDate")
    protected List<AbsoluteDate> absoluteDate;
    @XmlElement(name = "AbsoluteDateTime")
    protected List<AbsoluteDateTime> absoluteDateTime;
    @XmlElement(name = "String")
    protected List<String> string;
    @XmlElement(name = "UnitMultiplier")
    protected List<String> unitMultiplier;
    @XmlElement(name = "UnitSymbol")
    protected List<String> unitSymbol;

    /**
     * Gets the value of the absoluteDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absoluteDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsoluteDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsoluteDate }
     * 
     * 
     */
    public List<AbsoluteDate> getAbsoluteDate() {
        if (absoluteDate == null) {
            absoluteDate = new ArrayList<AbsoluteDate>();
        }
        return this.absoluteDate;
    }

    /**
     * Gets the value of the absoluteDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absoluteDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsoluteDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsoluteDateTime }
     * 
     * 
     */
    public List<AbsoluteDateTime> getAbsoluteDateTime() {
        if (absoluteDateTime == null) {
            absoluteDateTime = new ArrayList<AbsoluteDateTime>();
        }
        return this.absoluteDateTime;
    }

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getString() {
        if (string == null) {
            string = new ArrayList<String>();
        }
        return this.string;
    }

    /**
     * Gets the value of the unitMultiplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitMultiplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitMultiplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnitMultiplier() {
        if (unitMultiplier == null) {
            unitMultiplier = new ArrayList<String>();
        }
        return this.unitMultiplier;
    }

    /**
     * Gets the value of the unitSymbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSymbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnitSymbol() {
        if (unitSymbol == null) {
            unitSymbol = new ArrayList<String>();
        }
        return this.unitSymbol;
    }

}
