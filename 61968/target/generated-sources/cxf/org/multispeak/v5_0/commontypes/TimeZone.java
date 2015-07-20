
package org.multispeak.v5_0.commontypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is the time zone for this location.  The time zone designator goes in the element, the attributes optioanlly give additional information about this time zone.  For instance the time zine for Denver, Colorado, USA is MT (Mountain Time).  Daylight savings time is enabled in Denver, so DSTEnabled = 1 or true.  The MT time zone is UTC - 7.00 hours when DST is not in effect, so the UTCOffest would be "-7.00".  On the other hand, Phoenix is also in the Moutain Time zone, but DST is not employed in Arizona.  For the case of Phoenix, all of the settings would be the same as for Denver, except that DSTEnabled would be false.  The standard civilian time zones (e.g., AT,ET,CT, MT, PT, and AKT for North America) are included for all global locations as are the military time zone designations (e.g. Z, A, B...). 
 * 
 * <p>Java class for timeZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeZone">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="DSTEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UTCOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeZone", propOrder = {
    "value"
})
public class TimeZone {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DSTEnabled")
    protected Boolean dstEnabled;
    @XmlAttribute(name = "UTCOffset", required = true)
    protected BigDecimal utcOffset;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "comment")
    protected String comment;

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
     * Gets the value of the dstEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDSTEnabled() {
        return dstEnabled;
    }

    /**
     * Sets the value of the dstEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDSTEnabled(Boolean value) {
        this.dstEnabled = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUTCOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUTCOffset(BigDecimal value) {
        this.utcOffset = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}