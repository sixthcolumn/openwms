
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspLoadGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspLoadGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="billRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadSections" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfLoadSection" minOccurs="0"/>
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
@XmlType(name = "mspLoadGroup", propOrder = {
    "billRef",
    "loadSections"
})
public abstract class MspLoadGroup
    extends MspObject
{

    protected String billRef;
    protected ArrayOfLoadSection loadSections;

    /**
     * Gets the value of the billRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRef() {
        return billRef;
    }

    /**
     * Sets the value of the billRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRef(String value) {
        this.billRef = value;
    }

    /**
     * Gets the value of the loadSections property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLoadSection }
     *     
     */
    public ArrayOfLoadSection getLoadSections() {
        return loadSections;
    }

    /**
     * Sets the value of the loadSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLoadSection }
     *     
     */
    public void setLoadSections(ArrayOfLoadSection value) {
        this.loadSections = value;
    }

}
