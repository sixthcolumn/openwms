
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspSwitchingDevice">
 *       &lt;sequence>
 *         &lt;element name="lineSectionAffected" type="{http://www.multispeak.org/Version_4.1_Release}eaLoc" minOccurs="0"/>
 *         &lt;element name="actionTaken" type="{http://www.multispeak.org/Version_4.1_Release}cutAction" minOccurs="0"/>
 *         &lt;element name="timeOfAction" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "cut", propOrder = {
    "lineSectionAffected",
    "actionTaken",
    "timeOfAction"
})
public class Cut
    extends MspSwitchingDevice
{

    protected EaLoc lineSectionAffected;
    protected CutAction actionTaken;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfAction;

    /**
     * Gets the value of the lineSectionAffected property.
     * 
     * @return
     *     possible object is
     *     {@link EaLoc }
     *     
     */
    public EaLoc getLineSectionAffected() {
        return lineSectionAffected;
    }

    /**
     * Sets the value of the lineSectionAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaLoc }
     *     
     */
    public void setLineSectionAffected(EaLoc value) {
        this.lineSectionAffected = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link CutAction }
     *     
     */
    public CutAction getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutAction }
     *     
     */
    public void setActionTaken(CutAction value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the timeOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfAction() {
        return timeOfAction;
    }

    /**
     * Sets the value of the timeOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfAction(XMLGregorianCalendar value) {
        this.timeOfAction = value;
    }

}
