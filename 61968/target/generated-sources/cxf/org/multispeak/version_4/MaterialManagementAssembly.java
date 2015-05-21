
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialManagementAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialManagementAssembly">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unMatCost" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="unType" type="{http://www.multispeak.org/Version_4.1_Release}unType" minOccurs="0"/>
 *         &lt;element name="CPRList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCPR" minOccurs="0"/>
 *         &lt;element name="materialComponentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMaterialComponent" minOccurs="0"/>
 *         &lt;element name="laborComponentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfLaborComponent" minOccurs="0"/>
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
@XmlType(name = "materialManagementAssembly", propOrder = {
    "unitCode",
    "unDescr",
    "unMatCost",
    "unType",
    "cprList",
    "materialComponentList",
    "laborComponentList"
})
public class MaterialManagementAssembly
    extends MspObject
{

    protected String unitCode;
    protected String unDescr;
    protected Money unMatCost;
    protected UnType unType;
    @XmlElement(name = "CPRList")
    protected ArrayOfCPR cprList;
    protected ArrayOfMaterialComponent materialComponentList;
    protected ArrayOfLaborComponent laborComponentList;

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnDescr() {
        return unDescr;
    }

    /**
     * Sets the value of the unDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnDescr(String value) {
        this.unDescr = value;
    }

    /**
     * Gets the value of the unMatCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnMatCost() {
        return unMatCost;
    }

    /**
     * Sets the value of the unMatCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnMatCost(Money value) {
        this.unMatCost = value;
    }

    /**
     * Gets the value of the unType property.
     * 
     * @return
     *     possible object is
     *     {@link UnType }
     *     
     */
    public UnType getUnType() {
        return unType;
    }

    /**
     * Sets the value of the unType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnType }
     *     
     */
    public void setUnType(UnType value) {
        this.unType = value;
    }

    /**
     * Gets the value of the cprList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCPR }
     *     
     */
    public ArrayOfCPR getCPRList() {
        return cprList;
    }

    /**
     * Sets the value of the cprList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCPR }
     *     
     */
    public void setCPRList(ArrayOfCPR value) {
        this.cprList = value;
    }

    /**
     * Gets the value of the materialComponentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaterialComponent }
     *     
     */
    public ArrayOfMaterialComponent getMaterialComponentList() {
        return materialComponentList;
    }

    /**
     * Sets the value of the materialComponentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaterialComponent }
     *     
     */
    public void setMaterialComponentList(ArrayOfMaterialComponent value) {
        this.materialComponentList = value;
    }

    /**
     * Gets the value of the laborComponentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLaborComponent }
     *     
     */
    public ArrayOfLaborComponent getLaborComponentList() {
        return laborComponentList;
    }

    /**
     * Sets the value of the laborComponentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLaborComponent }
     *     
     */
    public void setLaborComponentList(ArrayOfLaborComponent value) {
        this.laborComponentList = value;
    }

}
