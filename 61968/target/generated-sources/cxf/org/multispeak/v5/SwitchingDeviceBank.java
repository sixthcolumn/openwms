
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for switchingDeviceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingDeviceBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="switchingDeviceList" type="{http://www.multispeak.org/V5.0}switchingDeviceList" minOccurs="0"/>
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
@XmlType(name = "switchingDeviceBank", propOrder = {
    "materialManagementAssemblyID",
    "switchingDeviceList"
})
public class SwitchingDeviceBank
    extends MspSwitchingBank
{

    protected ObjectID materialManagementAssemblyID;
    protected SwitchingDeviceList switchingDeviceList;

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

    /**
     * Gets the value of the switchingDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingDeviceList }
     *     
     */
    public SwitchingDeviceList getSwitchingDeviceList() {
        return switchingDeviceList;
    }

    /**
     * Sets the value of the switchingDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingDeviceList }
     *     
     */
    public void setSwitchingDeviceList(SwitchingDeviceList value) {
        this.switchingDeviceList = value;
    }

}
