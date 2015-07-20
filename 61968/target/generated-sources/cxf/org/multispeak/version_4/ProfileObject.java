
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="sourceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSource" minOccurs="0"/>
 *         &lt;element name="loadProfileList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfProfileType" minOccurs="0"/>
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
@XmlType(name = "profileObject", propOrder = {
    "sourceList",
    "loadProfileList"
})
public class ProfileObject
    extends MspObject
{

    protected ArrayOfSource sourceList;
    protected ArrayOfProfileType loadProfileList;

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSource }
     *     
     */
    public ArrayOfSource getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSource }
     *     
     */
    public void setSourceList(ArrayOfSource value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the loadProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileType }
     *     
     */
    public ArrayOfProfileType getLoadProfileList() {
        return loadProfileList;
    }

    /**
     * Sets the value of the loadProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileType }
     *     
     */
    public void setLoadProfileList(ArrayOfProfileType value) {
        this.loadProfileList = value;
    }

}
