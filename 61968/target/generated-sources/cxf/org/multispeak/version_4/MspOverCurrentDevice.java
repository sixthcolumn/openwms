
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mspOverCurrentDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspOverCurrentDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspSwitchingDevice">
 *       &lt;sequence>
 *         &lt;element name="bypassExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastService" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspOverCurrentDevice", propOrder = {
    "bypassExists",
    "lastService"
})
@XmlSeeAlso({
    Recloser.class,
    Fuse.class,
    Sectionalizer.class,
    Breaker.class
})
public abstract class MspOverCurrentDevice
    extends MspSwitchingDevice
{

    protected Boolean bypassExists;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastService;

    /**
     * Gets the value of the bypassExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassExists() {
        return bypassExists;
    }

    /**
     * Sets the value of the bypassExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassExists(Boolean value) {
        this.bypassExists = value;
    }

    /**
     * Gets the value of the lastService property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastService() {
        return lastService;
    }

    /**
     * Sets the value of the lastService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastService(XMLGregorianCalendar value) {
        this.lastService = value;
    }

}
