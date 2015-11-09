
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5.MspObject;
import org.multispeak.v5.ReceivedCDDevices;
import org.multispeak.v5.ReceivedElectricMeters;
import org.multispeak.v5.ReceivedGasMeters;
import org.multispeak.v5.ReceivedLoadManagementDevices;
import org.multispeak.v5.ReceivedModules;
import org.multispeak.v5.ReceivedPremisesDisplays;
import org.multispeak.v5.ReceivedPropaneMeters;
import org.multispeak.v5.ReceivedWaterMeters;
import org.multispeak.v5.TransponderIDRange;
import org.multispeak.v5_0.commontypes.Address;


/**
 * <p>Java class for endDeviceShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceShipment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippedDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="shippedToAddress" type="{http://www.multispeak.org/V5.0/commonTypes}address" minOccurs="0"/>
 *         &lt;element name="receivedDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="receivedGasMeters" type="{http://www.multispeak.org/V5.0}receivedGasMeters" minOccurs="0"/>
 *         &lt;element name="receivedElectricMeters" type="{http://www.multispeak.org/V5.0}receivedElectricMeters" minOccurs="0"/>
 *         &lt;element name="receivedLoadManagementDevices" type="{http://www.multispeak.org/V5.0}receivedLoadManagementDevices" minOccurs="0"/>
 *         &lt;element name="receivedCDDevices" type="{http://www.multispeak.org/V5.0}receivedCDDevices" minOccurs="0"/>
 *         &lt;element name="receivedWaterMeters" type="{http://www.multispeak.org/V5.0}receivedWaterMeters" minOccurs="0"/>
 *         &lt;element name="receivedModules" type="{http://www.multispeak.org/V5.0}receivedModules" minOccurs="0"/>
 *         &lt;element name="receivedPremisesDisplays" type="{http://www.multispeak.org/V5.0}receivedPremisesDisplays" minOccurs="0"/>
 *         &lt;element name="receivedPropaneMeters" type="{http://www.multispeak.org/V5.0}receivedPropaneMeters" minOccurs="0"/>
 *         &lt;element name="transponderIDRange" type="{http://www.multispeak.org/V5.0}transponderIDRange" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceShipment", propOrder = {
    "rest"
})
public class EndDeviceShipment
    extends MspObject
{

    @XmlElementRefs({
        @XmlElementRef(name = "receivedWaterMeters", type = JAXBElement.class),
        @XmlElementRef(name = "shippedToAddress", type = JAXBElement.class),
        @XmlElementRef(name = "recipient", type = JAXBElement.class),
        @XmlElementRef(name = "receivedPremisesDisplays", type = JAXBElement.class),
        @XmlElementRef(name = "receivedModules", type = JAXBElement.class),
        @XmlElementRef(name = "utility", type = JAXBElement.class),
        @XmlElementRef(name = "poReferenceNumber", type = JAXBElement.class),
        @XmlElementRef(name = "shippingTicketNumber", type = JAXBElement.class),
        @XmlElementRef(name = "receivedElectricMeters", type = JAXBElement.class),
        @XmlElementRef(name = "manufacturer", type = JAXBElement.class),
        @XmlElementRef(name = "transponderIDRange", type = JAXBElement.class),
        @XmlElementRef(name = "shippedDate", type = JAXBElement.class),
        @XmlElementRef(name = "receivedPropaneMeters", type = JAXBElement.class),
        @XmlElementRef(name = "receivedDate", type = JAXBElement.class),
        @XmlElementRef(name = "receivedGasMeters", type = JAXBElement.class),
        @XmlElementRef(name = "receivedLoadManagementDevices", type = JAXBElement.class),
        @XmlElementRef(name = "receivedCDDevices", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Utility" is used by two different parts of a schema. See: 
     * line 227 of file:/Users/BenGoodwin/git/openwms/DER/wsdl/SandBox.xsd
     * line 8422 of file:/Users/BenGoodwin/git/openwms/DER/wsdl/MultiSpeak.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReceivedWaterMeters }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedPremisesDisplays }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedModules }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedElectricMeters }{@code >}
     * {@link JAXBElement }{@code <}{@link TransponderIDRange }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedPropaneMeters }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedLoadManagementDevices }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedGasMeters }{@code >}
     * {@link JAXBElement }{@code <}{@link ReceivedCDDevices }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
