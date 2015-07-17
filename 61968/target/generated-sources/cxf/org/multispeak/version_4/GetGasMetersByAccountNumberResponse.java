
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetGasMetersByAccountNumberResult" type="{http://www.multispeak.org/Version_4.1_Release}gasMeters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getGasMetersByAccountNumberResult"
})
@XmlRootElement(name = "GetGasMetersByAccountNumberResponse")
public class GetGasMetersByAccountNumberResponse {

    @XmlElement(name = "GetGasMetersByAccountNumberResult")
    protected GasMeters getGasMetersByAccountNumberResult;

    /**
     * Gets the value of the getGasMetersByAccountNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeters }
     *     
     */
    public GasMeters getGetGasMetersByAccountNumberResult() {
        return getGasMetersByAccountNumberResult;
    }

    /**
     * Sets the value of the getGasMetersByAccountNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeters }
     *     
     */
    public void setGetGasMetersByAccountNumberResult(GasMeters value) {
        this.getGasMetersByAccountNumberResult = value;
    }

}
