
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceAddress" type="{http://www.multispeak.org/Version_4.1_Release}address" minOccurs="0"/>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="graphicSymbolList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGraphicSymbol" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGenericAnnotationFeature" minOccurs="0"/>
 *         &lt;element name="network" type="{http://www.multispeak.org/Version_4.1_Release}network" minOccurs="0"/>
 *         &lt;element name="electricServiceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfElectricService" minOccurs="0"/>
 *         &lt;element name="waterServiceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWaterService" minOccurs="0"/>
 *         &lt;element name="gasServiceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGasService" minOccurs="0"/>
 *         &lt;element name="propaneServiceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPropaneService" minOccurs="0"/>
 *         &lt;element name="otherServiceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOtherService" minOccurs="0"/>
 *         &lt;element name="phoneList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPhoneNumber" minOccurs="0"/>
 *         &lt;element name="specialNeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder" minOccurs="0"/>
 *         &lt;element name="workList" type="{http://www.multispeak.org/Version_4.1_Release}workList" minOccurs="0"/>
 *         &lt;element name="workOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWorkOrder" minOccurs="0"/>
 *         &lt;element name="mantenanceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMaintenanceOrder" minOccurs="0"/>
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
@XmlType(name = "serviceLocation", propOrder = {
    "customerID",
    "description",
    "facilityName",
    "serviceAddress",
    "sic",
    "siteID",
    "graphicSymbolList",
    "annotationList",
    "network",
    "electricServiceList",
    "waterServiceList",
    "gasServiceList",
    "propaneServiceList",
    "otherServiceList",
    "phoneList",
    "specialNeeds",
    "serviceOrderList",
    "workList",
    "workOrderList",
    "mantenanceOrderList"
})
public class ServiceLocation
    extends MspPointObject
{

    protected String customerID;
    protected String description;
    protected String facilityName;
    protected Address serviceAddress;
    @XmlElement(name = "SIC")
    protected String sic;
    protected String siteID;
    protected ArrayOfGraphicSymbol graphicSymbolList;
    protected ArrayOfGenericAnnotationFeature annotationList;
    protected Network network;
    protected ArrayOfElectricService electricServiceList;
    protected ArrayOfWaterService waterServiceList;
    protected ArrayOfGasService gasServiceList;
    protected ArrayOfPropaneService propaneServiceList;
    protected ArrayOfOtherService otherServiceList;
    protected ArrayOfPhoneNumber phoneList;
    protected String specialNeeds;
    protected ArrayOfServiceOrder serviceOrderList;
    protected WorkList workList;
    protected ArrayOfWorkOrder workOrderList;
    protected ArrayOfMaintenanceOrder mantenanceOrderList;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setServiceAddress(Address value) {
        this.serviceAddress = value;
    }

    /**
     * Gets the value of the sic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the graphicSymbolList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGraphicSymbol }
     *     
     */
    public ArrayOfGraphicSymbol getGraphicSymbolList() {
        return graphicSymbolList;
    }

    /**
     * Sets the value of the graphicSymbolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGraphicSymbol }
     *     
     */
    public void setGraphicSymbolList(ArrayOfGraphicSymbol value) {
        this.graphicSymbolList = value;
    }

    /**
     * Gets the value of the annotationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public ArrayOfGenericAnnotationFeature getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public void setAnnotationList(ArrayOfGenericAnnotationFeature value) {
        this.annotationList = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the electricServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectricService }
     *     
     */
    public ArrayOfElectricService getElectricServiceList() {
        return electricServiceList;
    }

    /**
     * Sets the value of the electricServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectricService }
     *     
     */
    public void setElectricServiceList(ArrayOfElectricService value) {
        this.electricServiceList = value;
    }

    /**
     * Gets the value of the waterServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaterService }
     *     
     */
    public ArrayOfWaterService getWaterServiceList() {
        return waterServiceList;
    }

    /**
     * Sets the value of the waterServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaterService }
     *     
     */
    public void setWaterServiceList(ArrayOfWaterService value) {
        this.waterServiceList = value;
    }

    /**
     * Gets the value of the gasServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGasService }
     *     
     */
    public ArrayOfGasService getGasServiceList() {
        return gasServiceList;
    }

    /**
     * Sets the value of the gasServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGasService }
     *     
     */
    public void setGasServiceList(ArrayOfGasService value) {
        this.gasServiceList = value;
    }

    /**
     * Gets the value of the propaneServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropaneService }
     *     
     */
    public ArrayOfPropaneService getPropaneServiceList() {
        return propaneServiceList;
    }

    /**
     * Sets the value of the propaneServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropaneService }
     *     
     */
    public void setPropaneServiceList(ArrayOfPropaneService value) {
        this.propaneServiceList = value;
    }

    /**
     * Gets the value of the otherServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherService }
     *     
     */
    public ArrayOfOtherService getOtherServiceList() {
        return otherServiceList;
    }

    /**
     * Sets the value of the otherServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherService }
     *     
     */
    public void setOtherServiceList(ArrayOfOtherService value) {
        this.otherServiceList = value;
    }

    /**
     * Gets the value of the phoneList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumber }
     *     
     */
    public ArrayOfPhoneNumber getPhoneList() {
        return phoneList;
    }

    /**
     * Sets the value of the phoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumber }
     *     
     */
    public void setPhoneList(ArrayOfPhoneNumber value) {
        this.phoneList = value;
    }

    /**
     * Gets the value of the specialNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * Sets the value of the specialNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNeeds(String value) {
        this.specialNeeds = value;
    }

    /**
     * Gets the value of the serviceOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOrder }
     *     
     */
    public ArrayOfServiceOrder getServiceOrderList() {
        return serviceOrderList;
    }

    /**
     * Sets the value of the serviceOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOrder }
     *     
     */
    public void setServiceOrderList(ArrayOfServiceOrder value) {
        this.serviceOrderList = value;
    }

    /**
     * Gets the value of the workList property.
     * 
     * @return
     *     possible object is
     *     {@link WorkList }
     *     
     */
    public WorkList getWorkList() {
        return workList;
    }

    /**
     * Sets the value of the workList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkList }
     *     
     */
    public void setWorkList(WorkList value) {
        this.workList = value;
    }

    /**
     * Gets the value of the workOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkOrder }
     *     
     */
    public ArrayOfWorkOrder getWorkOrderList() {
        return workOrderList;
    }

    /**
     * Sets the value of the workOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkOrder }
     *     
     */
    public void setWorkOrderList(ArrayOfWorkOrder value) {
        this.workOrderList = value;
    }

    /**
     * Gets the value of the mantenanceOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaintenanceOrder }
     *     
     */
    public ArrayOfMaintenanceOrder getMantenanceOrderList() {
        return mantenanceOrderList;
    }

    /**
     * Sets the value of the mantenanceOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaintenanceOrder }
     *     
     */
    public void setMantenanceOrderList(ArrayOfMaintenanceOrder value) {
        this.mantenanceOrderList = value;
    }

}
