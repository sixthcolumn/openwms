
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReasonContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageReasonList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOutageReasonItem" minOccurs="0"/>
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
@XmlType(name = "outageReasonContainer", propOrder = {
    "outageReasonList"
})
public class OutageReasonContainer
    extends MspObject
{

    protected ArrayOfOutageReasonItem outageReasonList;

    /**
     * Gets the value of the outageReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageReasonItem }
     *     
     */
    public ArrayOfOutageReasonItem getOutageReasonList() {
        return outageReasonList;
    }

    /**
     * Sets the value of the outageReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageReasonItem }
     *     
     */
    public void setOutageReasonList(ArrayOfOutageReasonItem value) {
        this.outageReasonList = value;
    }

}
