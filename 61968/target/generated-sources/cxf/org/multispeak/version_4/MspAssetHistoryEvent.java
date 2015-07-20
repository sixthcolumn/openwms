
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mspAssetHistoryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspAssetHistoryEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actionTaken" type="{http://www.multispeak.org/Version_4.1_Release}actionTaken" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="informationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString" minOccurs="0"/>
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
@XmlType(name = "mspAssetHistoryEvent", propOrder = {
    "eventTime",
    "actionTaken",
    "informationList"
})
@XmlSeeAlso({
    AssetHistoryEvent.class,
    MeterHistoryEvent.class
})
public abstract class MspAssetHistoryEvent
    extends MspPointObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected List<ActionTaken> actionTaken;
    protected ArrayOfString informationList;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionTaken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionTaken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionTaken }
     * 
     * 
     */
    public List<ActionTaken> getActionTaken() {
        if (actionTaken == null) {
            actionTaken = new ArrayList<ActionTaken>();
        }
        return this.actionTaken;
    }

    /**
     * Gets the value of the informationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getInformationList() {
        return informationList;
    }

    /**
     * Sets the value of the informationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setInformationList(ArrayOfString value) {
        this.informationList = value;
    }

}
