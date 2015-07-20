
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import _1_release.cpsm_v4.Discrete;


/**
 * <p>Java class for measurementItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurementItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analog" type="{http://www.multispeak.org/Version_4.1_Release}scadaAnalog" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accumulator" type="{http://www.multispeak.org/Version_4.1_Release}accumulatedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="discrete" type="{cpsm_V4.1_Release}Discrete" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measurementItems", propOrder = {
    "analog",
    "accumulator",
    "discrete"
})
public class MeasurementItems {

    protected List<ScadaAnalog> analog;
    protected List<AccumulatedValue> accumulator;
    protected List<Discrete> discrete;

    /**
     * Gets the value of the analog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScadaAnalog }
     * 
     * 
     */
    public List<ScadaAnalog> getAnalog() {
        if (analog == null) {
            analog = new ArrayList<ScadaAnalog>();
        }
        return this.analog;
    }

    /**
     * Gets the value of the accumulator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccumulatedValue }
     * 
     * 
     */
    public List<AccumulatedValue> getAccumulator() {
        if (accumulator == null) {
            accumulator = new ArrayList<AccumulatedValue>();
        }
        return this.accumulator;
    }

    /**
     * Gets the value of the discrete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discrete }
     * 
     * 
     */
    public List<Discrete> getDiscrete() {
        if (discrete == null) {
            discrete = new ArrayList<Discrete>();
        }
        return this.discrete;
    }

}
