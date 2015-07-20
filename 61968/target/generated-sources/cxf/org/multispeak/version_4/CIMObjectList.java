
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.cpsm_v4.Bay;
import _1_release.cpsm_v4.BusbarSection;
import _1_release.cpsm_v4.Connector;
import _1_release.cpsm_v4.GeneratingUnit;
import _1_release.cpsm_v4.HydroGeneratingUnit;
import _1_release.cpsm_v4.StaticVarCompensator;
import _1_release.cpsm_v4.TapChanger;
import _1_release.cpsm_v4.ThermalGeneratingUnit;
import _1_release.cpsm_v4.TransformerWinding;


/**
 * <p>Java class for CIMObjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMObjectList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_4.1_Release}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfExtensionsItem" minOccurs="0"/>
 *         &lt;element name="Bay" type="{cpsm_V4.1_Release}Bay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusbarSection" type="{cpsm_V4.1_Release}BusbarSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Connector" type="{cpsm_V4.1_Release}Connector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GeneratingUnit" type="{cpsm_V4.1_Release}GeneratingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HydroGeneratingUnit" type="{cpsm_V4.1_Release}HydroGeneratingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThermalGeneratingUnit" type="{cpsm_V4.1_Release}ThermalGeneratingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StaticVarCompensator" type="{cpsm_V4.1_Release}StaticVarCompensator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TapChanger" type="{cpsm_V4.1_Release}TapChanger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransformerWinding" type="{cpsm_V4.1_Release}TransformerWinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMObjectList", propOrder = {
    "extensions",
    "extensionsList",
    "bay",
    "busbarSection",
    "connector",
    "generatingUnit",
    "hydroGeneratingUnit",
    "thermalGeneratingUnit",
    "staticVarCompensator",
    "tapChanger",
    "transformerWinding"
})
public class CIMObjectList {

    protected Extensions extensions;
    protected ArrayOfExtensionsItem extensionsList;
    @XmlElement(name = "Bay")
    protected List<Bay> bay;
    @XmlElement(name = "BusbarSection")
    protected List<BusbarSection> busbarSection;
    @XmlElement(name = "Connector")
    protected List<Connector> connector;
    @XmlElement(name = "GeneratingUnit")
    protected List<GeneratingUnit> generatingUnit;
    @XmlElement(name = "HydroGeneratingUnit")
    protected List<HydroGeneratingUnit> hydroGeneratingUnit;
    @XmlElement(name = "ThermalGeneratingUnit")
    protected List<ThermalGeneratingUnit> thermalGeneratingUnit;
    @XmlElement(name = "StaticVarCompensator")
    protected List<StaticVarCompensator> staticVarCompensator;
    @XmlElement(name = "TapChanger")
    protected List<TapChanger> tapChanger;
    @XmlElement(name = "TransformerWinding")
    protected List<TransformerWinding> transformerWinding;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public ArrayOfExtensionsItem getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public void setExtensionsList(ArrayOfExtensionsItem value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the bay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bay }
     * 
     * 
     */
    public List<Bay> getBay() {
        if (bay == null) {
            bay = new ArrayList<Bay>();
        }
        return this.bay;
    }

    /**
     * Gets the value of the busbarSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busbarSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusbarSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusbarSection }
     * 
     * 
     */
    public List<BusbarSection> getBusbarSection() {
        if (busbarSection == null) {
            busbarSection = new ArrayList<BusbarSection>();
        }
        return this.busbarSection;
    }

    /**
     * Gets the value of the connector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connector }
     * 
     * 
     */
    public List<Connector> getConnector() {
        if (connector == null) {
            connector = new ArrayList<Connector>();
        }
        return this.connector;
    }

    /**
     * Gets the value of the generatingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generatingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneratingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneratingUnit }
     * 
     * 
     */
    public List<GeneratingUnit> getGeneratingUnit() {
        if (generatingUnit == null) {
            generatingUnit = new ArrayList<GeneratingUnit>();
        }
        return this.generatingUnit;
    }

    /**
     * Gets the value of the hydroGeneratingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydroGeneratingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHydroGeneratingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HydroGeneratingUnit }
     * 
     * 
     */
    public List<HydroGeneratingUnit> getHydroGeneratingUnit() {
        if (hydroGeneratingUnit == null) {
            hydroGeneratingUnit = new ArrayList<HydroGeneratingUnit>();
        }
        return this.hydroGeneratingUnit;
    }

    /**
     * Gets the value of the thermalGeneratingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thermalGeneratingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThermalGeneratingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThermalGeneratingUnit }
     * 
     * 
     */
    public List<ThermalGeneratingUnit> getThermalGeneratingUnit() {
        if (thermalGeneratingUnit == null) {
            thermalGeneratingUnit = new ArrayList<ThermalGeneratingUnit>();
        }
        return this.thermalGeneratingUnit;
    }

    /**
     * Gets the value of the staticVarCompensator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticVarCompensator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticVarCompensator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaticVarCompensator }
     * 
     * 
     */
    public List<StaticVarCompensator> getStaticVarCompensator() {
        if (staticVarCompensator == null) {
            staticVarCompensator = new ArrayList<StaticVarCompensator>();
        }
        return this.staticVarCompensator;
    }

    /**
     * Gets the value of the tapChanger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tapChanger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTapChanger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TapChanger }
     * 
     * 
     */
    public List<TapChanger> getTapChanger() {
        if (tapChanger == null) {
            tapChanger = new ArrayList<TapChanger>();
        }
        return this.tapChanger;
    }

    /**
     * Gets the value of the transformerWinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformerWinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformerWinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformerWinding }
     * 
     * 
     */
    public List<TransformerWinding> getTransformerWinding() {
        if (transformerWinding == null) {
            transformerWinding = new ArrayList<TransformerWinding>();
        }
        return this.transformerWinding;
    }

}
