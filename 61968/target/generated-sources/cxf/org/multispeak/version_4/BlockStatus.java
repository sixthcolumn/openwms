
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blockStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blockStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="testData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="DSTinEffect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="clockBackward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="clockForward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="configChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="longInterval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="manuallyEntered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="manuallyModified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="overflow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="partialInterval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="recorderStopped" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockStatus", propOrder = {
    "testDataOrDSTinEffectOrClockBackward"
})
public class BlockStatus {

    @XmlElementRefs({
        @XmlElementRef(name = "clockForward", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "manuallyModified", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "partialInterval", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "configChanged", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "clockBackward", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "DSTinEffect", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "invalid", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "manuallyEntered", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "testData", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "recorderStopped", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "overflow", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "longInterval", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class)
    })
    protected List<JAXBElement<Boolean>> testDataOrDSTinEffectOrClockBackward;
    @XmlAttribute(name = "intervalIndex", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long intervalIndex;

    /**
     * Gets the value of the testDataOrDSTinEffectOrClockBackward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testDataOrDSTinEffectOrClockBackward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestDataOrDSTinEffectOrClockBackward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Boolean>> getTestDataOrDSTinEffectOrClockBackward() {
        if (testDataOrDSTinEffectOrClockBackward == null) {
            testDataOrDSTinEffectOrClockBackward = new ArrayList<JAXBElement<Boolean>>();
        }
        return this.testDataOrDSTinEffectOrClockBackward;
    }

    /**
     * Gets the value of the intervalIndex property.
     * 
     */
    public long getIntervalIndex() {
        return intervalIndex;
    }

    /**
     * Sets the value of the intervalIndex property.
     * 
     */
    public void setIntervalIndex(long value) {
        this.intervalIndex = value;
    }

}
