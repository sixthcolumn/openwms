
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVLLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVLLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="vehicleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVLStateList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAVLState" minOccurs="0"/>
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
@XmlType(name = "AVLLog", propOrder = {
    "vehicleID",
    "avlid",
    "avlStateList"
})
public class AVLLog
    extends MspObject
{

    protected String vehicleID;
    @XmlElement(name = "AVLID")
    protected String avlid;
    @XmlElement(name = "AVLStateList")
    protected ArrayOfAVLState avlStateList;

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the avlid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVLID() {
        return avlid;
    }

    /**
     * Sets the value of the avlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVLID(String value) {
        this.avlid = value;
    }

    /**
     * Gets the value of the avlStateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAVLState }
     *     
     */
    public ArrayOfAVLState getAVLStateList() {
        return avlStateList;
    }

    /**
     * Sets the value of the avlStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAVLState }
     *     
     */
    public void setAVLStateList(ArrayOfAVLState value) {
        this.avlStateList = value;
    }

}
