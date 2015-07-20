
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatialFeatureGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatialFeatureGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="anchor" type="{http://www.multispeak.org/Version_4.1_Release}anchor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capacitorBank" type="{http://www.multispeak.org/Version_4.1_Release}capacitorBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CDDevice" type="{http://www.multispeak.org/Version_4.1_Release}CDDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="electricMeter" type="{http://www.multispeak.org/Version_4.1_Release}electricMeter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gasMeter" type="{http://www.multispeak.org/Version_4.1_Release}gasMeter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guy" type="{http://www.multispeak.org/Version_4.1_Release}guy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inductionMachine" type="{http://www.multispeak.org/Version_4.1_Release}inductionMachine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inHomeDisplay" type="{http://www.multispeak.org/Version_4.1_Release}inHomeDisplay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loadManagementDevice" type="{http://www.multispeak.org/Version_4.1_Release}loadManagementDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measurementDevice" type="{http://www.multispeak.org/Version_4.1_Release}measurementDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="meterBase" type="{http://www.multispeak.org/Version_4.1_Release}meterBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="module" type="{http://www.multispeak.org/Version_4.1_Release}module" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ohPrimaryLine" type="{http://www.multispeak.org/Version_4.1_Release}ohPrimaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ohSecondaryLine" type="{http://www.multispeak.org/Version_4.1_Release}ohSecondaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ohTransmissionLine" type="{http://www.multispeak.org/Version_4.1_Release}ohTransmissionLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outageDetectionDevice" type="{http://www.multispeak.org/Version_4.1_Release}outageDetectionDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overCurrentDeviceBank" type="{http://www.multispeak.org/Version_4.1_Release}overcurrentDeviceBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parcel" type="{http://www.multispeak.org/Version_4.1_Release}parcel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pole" type="{http://www.multispeak.org/Version_4.1_Release}pole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="powerMonitor" type="{http://www.multispeak.org/Version_4.1_Release}powerMonitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="powerSystemDevice" type="{http://www.multispeak.org/Version_4.1_Release}powerSystemDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premise" type="{http://www.multispeak.org/Version_4.1_Release}premise" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaryCabinet" type="{http://www.multispeak.org/Version_4.1_Release}primaryCabinet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/Version_4.1_Release}propaneMeter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regulatorBank" type="{http://www.multispeak.org/Version_4.1_Release}regulatorBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riser" type="{http://www.multispeak.org/Version_4.1_Release}riser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secondaryJunctionBox" type="{http://www.multispeak.org/Version_4.1_Release}secondaryJunctionBox" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="securityLight" type="{http://www.multispeak.org/Version_4.1_Release}securityLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceLocation" type="{http://www.multispeak.org/Version_4.1_Release}serviceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spanGuy" type="{http://www.multispeak.org/Version_4.1_Release}spanGuy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="streetLight" type="{http://www.multispeak.org/Version_4.1_Release}streetLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substation" type="{http://www.multispeak.org/Version_4.1_Release}substation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="switchingDeviceBank" type="{http://www.multispeak.org/Version_4.1_Release}switchingDeviceBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="synchronousMachine" type="{http://www.multispeak.org/Version_4.1_Release}synchronousMachine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trafficLight" type="{http://www.multispeak.org/Version_4.1_Release}trafficLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transformerBank" type="{http://www.multispeak.org/Version_4.1_Release}transformerBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ugPrimaryLine" type="{http://www.multispeak.org/Version_4.1_Release}ugPrimaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ugSecondaryLine" type="{http://www.multispeak.org/Version_4.1_Release}ugSecondaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ugTransmissionLine" type="{http://www.multispeak.org/Version_4.1_Release}ugTransmissionLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waterMeter" type="{http://www.multispeak.org/Version_4.1_Release}waterMeter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CIMObjectList" type="{http://www.multispeak.org/Version_4.1_Release}CIMObjectList" minOccurs="0"/>
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
@XmlType(name = "spatialFeatureGroup", propOrder = {
    "anchor",
    "capacitorBank",
    "cdDevice",
    "electricMeter",
    "gasMeter",
    "guy",
    "inductionMachine",
    "inHomeDisplay",
    "loadManagementDevice",
    "measurementDevice",
    "meterBase",
    "module",
    "ohPrimaryLine",
    "ohSecondaryLine",
    "ohTransmissionLine",
    "outageDetectionDevice",
    "overCurrentDeviceBank",
    "parcel",
    "pole",
    "powerMonitor",
    "powerSystemDevice",
    "premise",
    "primaryCabinet",
    "propaneMeter",
    "regulatorBank",
    "riser",
    "secondaryJunctionBox",
    "securityLight",
    "serviceLocation",
    "spanGuy",
    "streetLight",
    "substation",
    "switchingDeviceBank",
    "synchronousMachine",
    "trafficLight",
    "transformerBank",
    "ugPrimaryLine",
    "ugSecondaryLine",
    "ugTransmissionLine",
    "waterMeter",
    "cimObjectList"
})
public class SpatialFeatureGroup
    extends MspPointObject
{

    protected List<Anchor> anchor;
    protected List<CapacitorBank> capacitorBank;
    @XmlElement(name = "CDDevice")
    protected List<CDDevice> cdDevice;
    protected List<ElectricMeter> electricMeter;
    protected List<GasMeter> gasMeter;
    protected List<Guy> guy;
    protected List<InductionMachine> inductionMachine;
    protected List<InHomeDisplay> inHomeDisplay;
    protected List<LoadManagementDevice> loadManagementDevice;
    protected List<MeasurementDevice> measurementDevice;
    protected List<MeterBase> meterBase;
    protected List<Module> module;
    protected List<OhPrimaryLine> ohPrimaryLine;
    protected List<OhSecondaryLine> ohSecondaryLine;
    protected List<OhTransmissionLine> ohTransmissionLine;
    protected List<OutageDetectionDevice> outageDetectionDevice;
    protected List<OvercurrentDeviceBank> overCurrentDeviceBank;
    protected List<Parcel> parcel;
    protected List<Pole> pole;
    protected List<PowerMonitor> powerMonitor;
    protected List<PowerSystemDevice> powerSystemDevice;
    protected List<Premise> premise;
    protected List<PrimaryCabinet> primaryCabinet;
    protected List<PropaneMeter> propaneMeter;
    protected List<RegulatorBank> regulatorBank;
    protected List<Riser> riser;
    protected List<SecondaryJunctionBox> secondaryJunctionBox;
    protected List<SecurityLight> securityLight;
    protected List<ServiceLocation> serviceLocation;
    protected List<SpanGuy> spanGuy;
    protected List<StreetLight> streetLight;
    protected List<Substation> substation;
    protected List<SwitchingDeviceBank> switchingDeviceBank;
    protected List<SynchronousMachine> synchronousMachine;
    protected List<TrafficLight> trafficLight;
    protected List<TransformerBank> transformerBank;
    protected List<UgPrimaryLine> ugPrimaryLine;
    protected List<UgSecondaryLine> ugSecondaryLine;
    protected List<UgTransmissionLine> ugTransmissionLine;
    protected List<WaterMeter> waterMeter;
    @XmlElement(name = "CIMObjectList")
    protected CIMObjectList cimObjectList;

    /**
     * Gets the value of the anchor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnchor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Anchor }
     * 
     * 
     */
    public List<Anchor> getAnchor() {
        if (anchor == null) {
            anchor = new ArrayList<Anchor>();
        }
        return this.anchor;
    }

    /**
     * Gets the value of the capacitorBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capacitorBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapacitorBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapacitorBank }
     * 
     * 
     */
    public List<CapacitorBank> getCapacitorBank() {
        if (capacitorBank == null) {
            capacitorBank = new ArrayList<CapacitorBank>();
        }
        return this.capacitorBank;
    }

    /**
     * Gets the value of the cdDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDDevice }
     * 
     * 
     */
    public List<CDDevice> getCDDevice() {
        if (cdDevice == null) {
            cdDevice = new ArrayList<CDDevice>();
        }
        return this.cdDevice;
    }

    /**
     * Gets the value of the electricMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricMeter }
     * 
     * 
     */
    public List<ElectricMeter> getElectricMeter() {
        if (electricMeter == null) {
            electricMeter = new ArrayList<ElectricMeter>();
        }
        return this.electricMeter;
    }

    /**
     * Gets the value of the gasMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gasMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGasMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GasMeter }
     * 
     * 
     */
    public List<GasMeter> getGasMeter() {
        if (gasMeter == null) {
            gasMeter = new ArrayList<GasMeter>();
        }
        return this.gasMeter;
    }

    /**
     * Gets the value of the guy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guy }
     * 
     * 
     */
    public List<Guy> getGuy() {
        if (guy == null) {
            guy = new ArrayList<Guy>();
        }
        return this.guy;
    }

    /**
     * Gets the value of the inductionMachine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inductionMachine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInductionMachine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InductionMachine }
     * 
     * 
     */
    public List<InductionMachine> getInductionMachine() {
        if (inductionMachine == null) {
            inductionMachine = new ArrayList<InductionMachine>();
        }
        return this.inductionMachine;
    }

    /**
     * Gets the value of the inHomeDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inHomeDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInHomeDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InHomeDisplay }
     * 
     * 
     */
    public List<InHomeDisplay> getInHomeDisplay() {
        if (inHomeDisplay == null) {
            inHomeDisplay = new ArrayList<InHomeDisplay>();
        }
        return this.inHomeDisplay;
    }

    /**
     * Gets the value of the loadManagementDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadManagementDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadManagementDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadManagementDevice }
     * 
     * 
     */
    public List<LoadManagementDevice> getLoadManagementDevice() {
        if (loadManagementDevice == null) {
            loadManagementDevice = new ArrayList<LoadManagementDevice>();
        }
        return this.loadManagementDevice;
    }

    /**
     * Gets the value of the measurementDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementDevice }
     * 
     * 
     */
    public List<MeasurementDevice> getMeasurementDevice() {
        if (measurementDevice == null) {
            measurementDevice = new ArrayList<MeasurementDevice>();
        }
        return this.measurementDevice;
    }

    /**
     * Gets the value of the meterBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterBase }
     * 
     * 
     */
    public List<MeterBase> getMeterBase() {
        if (meterBase == null) {
            meterBase = new ArrayList<MeterBase>();
        }
        return this.meterBase;
    }

    /**
     * Gets the value of the module property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the module property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Module }
     * 
     * 
     */
    public List<Module> getModule() {
        if (module == null) {
            module = new ArrayList<Module>();
        }
        return this.module;
    }

    /**
     * Gets the value of the ohPrimaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ohPrimaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOhPrimaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OhPrimaryLine }
     * 
     * 
     */
    public List<OhPrimaryLine> getOhPrimaryLine() {
        if (ohPrimaryLine == null) {
            ohPrimaryLine = new ArrayList<OhPrimaryLine>();
        }
        return this.ohPrimaryLine;
    }

    /**
     * Gets the value of the ohSecondaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ohSecondaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOhSecondaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OhSecondaryLine }
     * 
     * 
     */
    public List<OhSecondaryLine> getOhSecondaryLine() {
        if (ohSecondaryLine == null) {
            ohSecondaryLine = new ArrayList<OhSecondaryLine>();
        }
        return this.ohSecondaryLine;
    }

    /**
     * Gets the value of the ohTransmissionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ohTransmissionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOhTransmissionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OhTransmissionLine }
     * 
     * 
     */
    public List<OhTransmissionLine> getOhTransmissionLine() {
        if (ohTransmissionLine == null) {
            ohTransmissionLine = new ArrayList<OhTransmissionLine>();
        }
        return this.ohTransmissionLine;
    }

    /**
     * Gets the value of the outageDetectionDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageDetectionDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageDetectionDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageDetectionDevice }
     * 
     * 
     */
    public List<OutageDetectionDevice> getOutageDetectionDevice() {
        if (outageDetectionDevice == null) {
            outageDetectionDevice = new ArrayList<OutageDetectionDevice>();
        }
        return this.outageDetectionDevice;
    }

    /**
     * Gets the value of the overCurrentDeviceBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overCurrentDeviceBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverCurrentDeviceBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvercurrentDeviceBank }
     * 
     * 
     */
    public List<OvercurrentDeviceBank> getOverCurrentDeviceBank() {
        if (overCurrentDeviceBank == null) {
            overCurrentDeviceBank = new ArrayList<OvercurrentDeviceBank>();
        }
        return this.overCurrentDeviceBank;
    }

    /**
     * Gets the value of the parcel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parcel }
     * 
     * 
     */
    public List<Parcel> getParcel() {
        if (parcel == null) {
            parcel = new ArrayList<Parcel>();
        }
        return this.parcel;
    }

    /**
     * Gets the value of the pole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pole }
     * 
     * 
     */
    public List<Pole> getPole() {
        if (pole == null) {
            pole = new ArrayList<Pole>();
        }
        return this.pole;
    }

    /**
     * Gets the value of the powerMonitor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerMonitor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerMonitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerMonitor }
     * 
     * 
     */
    public List<PowerMonitor> getPowerMonitor() {
        if (powerMonitor == null) {
            powerMonitor = new ArrayList<PowerMonitor>();
        }
        return this.powerMonitor;
    }

    /**
     * Gets the value of the powerSystemDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerSystemDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSystemDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSystemDevice }
     * 
     * 
     */
    public List<PowerSystemDevice> getPowerSystemDevice() {
        if (powerSystemDevice == null) {
            powerSystemDevice = new ArrayList<PowerSystemDevice>();
        }
        return this.powerSystemDevice;
    }

    /**
     * Gets the value of the premise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premise }
     * 
     * 
     */
    public List<Premise> getPremise() {
        if (premise == null) {
            premise = new ArrayList<Premise>();
        }
        return this.premise;
    }

    /**
     * Gets the value of the primaryCabinet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryCabinet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryCabinet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryCabinet }
     * 
     * 
     */
    public List<PrimaryCabinet> getPrimaryCabinet() {
        if (primaryCabinet == null) {
            primaryCabinet = new ArrayList<PrimaryCabinet>();
        }
        return this.primaryCabinet;
    }

    /**
     * Gets the value of the propaneMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propaneMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropaneMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropaneMeter }
     * 
     * 
     */
    public List<PropaneMeter> getPropaneMeter() {
        if (propaneMeter == null) {
            propaneMeter = new ArrayList<PropaneMeter>();
        }
        return this.propaneMeter;
    }

    /**
     * Gets the value of the regulatorBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatorBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatorBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatorBank }
     * 
     * 
     */
    public List<RegulatorBank> getRegulatorBank() {
        if (regulatorBank == null) {
            regulatorBank = new ArrayList<RegulatorBank>();
        }
        return this.regulatorBank;
    }

    /**
     * Gets the value of the riser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Riser }
     * 
     * 
     */
    public List<Riser> getRiser() {
        if (riser == null) {
            riser = new ArrayList<Riser>();
        }
        return this.riser;
    }

    /**
     * Gets the value of the secondaryJunctionBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryJunctionBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryJunctionBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryJunctionBox }
     * 
     * 
     */
    public List<SecondaryJunctionBox> getSecondaryJunctionBox() {
        if (secondaryJunctionBox == null) {
            secondaryJunctionBox = new ArrayList<SecondaryJunctionBox>();
        }
        return this.secondaryJunctionBox;
    }

    /**
     * Gets the value of the securityLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityLight }
     * 
     * 
     */
    public List<SecurityLight> getSecurityLight() {
        if (securityLight == null) {
            securityLight = new ArrayList<SecurityLight>();
        }
        return this.securityLight;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocation }
     * 
     * 
     */
    public List<ServiceLocation> getServiceLocation() {
        if (serviceLocation == null) {
            serviceLocation = new ArrayList<ServiceLocation>();
        }
        return this.serviceLocation;
    }

    /**
     * Gets the value of the spanGuy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spanGuy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpanGuy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpanGuy }
     * 
     * 
     */
    public List<SpanGuy> getSpanGuy() {
        if (spanGuy == null) {
            spanGuy = new ArrayList<SpanGuy>();
        }
        return this.spanGuy;
    }

    /**
     * Gets the value of the streetLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetLight }
     * 
     * 
     */
    public List<StreetLight> getStreetLight() {
        if (streetLight == null) {
            streetLight = new ArrayList<StreetLight>();
        }
        return this.streetLight;
    }

    /**
     * Gets the value of the substation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Substation }
     * 
     * 
     */
    public List<Substation> getSubstation() {
        if (substation == null) {
            substation = new ArrayList<Substation>();
        }
        return this.substation;
    }

    /**
     * Gets the value of the switchingDeviceBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingDeviceBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingDeviceBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingDeviceBank }
     * 
     * 
     */
    public List<SwitchingDeviceBank> getSwitchingDeviceBank() {
        if (switchingDeviceBank == null) {
            switchingDeviceBank = new ArrayList<SwitchingDeviceBank>();
        }
        return this.switchingDeviceBank;
    }

    /**
     * Gets the value of the synchronousMachine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronousMachine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronousMachine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynchronousMachine }
     * 
     * 
     */
    public List<SynchronousMachine> getSynchronousMachine() {
        if (synchronousMachine == null) {
            synchronousMachine = new ArrayList<SynchronousMachine>();
        }
        return this.synchronousMachine;
    }

    /**
     * Gets the value of the trafficLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficLight }
     * 
     * 
     */
    public List<TrafficLight> getTrafficLight() {
        if (trafficLight == null) {
            trafficLight = new ArrayList<TrafficLight>();
        }
        return this.trafficLight;
    }

    /**
     * Gets the value of the transformerBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformerBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformerBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformerBank }
     * 
     * 
     */
    public List<TransformerBank> getTransformerBank() {
        if (transformerBank == null) {
            transformerBank = new ArrayList<TransformerBank>();
        }
        return this.transformerBank;
    }

    /**
     * Gets the value of the ugPrimaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ugPrimaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUgPrimaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UgPrimaryLine }
     * 
     * 
     */
    public List<UgPrimaryLine> getUgPrimaryLine() {
        if (ugPrimaryLine == null) {
            ugPrimaryLine = new ArrayList<UgPrimaryLine>();
        }
        return this.ugPrimaryLine;
    }

    /**
     * Gets the value of the ugSecondaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ugSecondaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUgSecondaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UgSecondaryLine }
     * 
     * 
     */
    public List<UgSecondaryLine> getUgSecondaryLine() {
        if (ugSecondaryLine == null) {
            ugSecondaryLine = new ArrayList<UgSecondaryLine>();
        }
        return this.ugSecondaryLine;
    }

    /**
     * Gets the value of the ugTransmissionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ugTransmissionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUgTransmissionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UgTransmissionLine }
     * 
     * 
     */
    public List<UgTransmissionLine> getUgTransmissionLine() {
        if (ugTransmissionLine == null) {
            ugTransmissionLine = new ArrayList<UgTransmissionLine>();
        }
        return this.ugTransmissionLine;
    }

    /**
     * Gets the value of the waterMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterMeter }
     * 
     * 
     */
    public List<WaterMeter> getWaterMeter() {
        if (waterMeter == null) {
            waterMeter = new ArrayList<WaterMeter>();
        }
        return this.waterMeter;
    }

    /**
     * Gets the value of the cimObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link CIMObjectList }
     *     
     */
    public CIMObjectList getCIMObjectList() {
        return cimObjectList;
    }

    /**
     * Sets the value of the cimObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIMObjectList }
     *     
     */
    public void setCIMObjectList(CIMObjectList value) {
        this.cimObjectList = value;
    }

}
