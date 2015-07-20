
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for backSpan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="backSpan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lengthUnit" type="{http://www.multispeak.org/Version_3.0}lengthUnit" minOccurs="0"/>
 *         &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitAction" type="{http://www.multispeak.org/Version_3.0}unitActn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "backSpan", propOrder = {
    "length",
    "lengthUnit",
    "stationID",
    "unitAction"
})
public class BackSpan {

    protected Float length;
    protected LengthUnit lengthUnit;
    protected String stationID;
    protected UnitActn unitAction;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLength(Float value) {
        this.length = value;
    }

    /**
     * Gets the value of the lengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnit }
     *     
     */
    public LengthUnit getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Sets the value of the lengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnit }
     *     
     */
    public void setLengthUnit(LengthUnit value) {
        this.lengthUnit = value;
    }

    /**
     * Gets the value of the stationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationID() {
        return stationID;
    }

    /**
     * Sets the value of the stationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationID(String value) {
        this.stationID = value;
    }

    /**
     * Gets the value of the unitAction property.
     * 
     * @return
     *     possible object is
     *     {@link UnitActn }
     *     
     */
    public UnitActn getUnitAction() {
        return unitAction;
    }

    /**
     * Sets the value of the unitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitActn }
     *     
     */
    public void setUnitAction(UnitActn value) {
        this.unitAction = value;
    }

}
