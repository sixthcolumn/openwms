
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Curve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Curve">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="curveStyle" type="{cpsm_V4.1_Release}CurveStyle" minOccurs="0"/>
 *         &lt;element name="xUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="y1Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="y2Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPoints" type="{cpsm_V4.1_Release}DataPoints" minOccurs="0"/>
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
@XmlType(name = "Curve", propOrder = {
    "curveStyle",
    "xUnit",
    "y1Unit",
    "y2Unit",
    "dataPoints"
})
@XmlSeeAlso({
    ReactiveCapabilityCurve.class,
    GrossToNetActivePowerCurve.class
})
public class Curve
    extends MspCIMObject
{

    protected CurveStyle curveStyle;
    protected String xUnit;
    protected String y1Unit;
    protected String y2Unit;
    protected DataPoints dataPoints;

    /**
     * Gets the value of the curveStyle property.
     * 
     * @return
     *     possible object is
     *     {@link CurveStyle }
     *     
     */
    public CurveStyle getCurveStyle() {
        return curveStyle;
    }

    /**
     * Sets the value of the curveStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveStyle }
     *     
     */
    public void setCurveStyle(CurveStyle value) {
        this.curveStyle = value;
    }

    /**
     * Gets the value of the xUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXUnit() {
        return xUnit;
    }

    /**
     * Sets the value of the xUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXUnit(String value) {
        this.xUnit = value;
    }

    /**
     * Gets the value of the y1Unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY1Unit() {
        return y1Unit;
    }

    /**
     * Sets the value of the y1Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY1Unit(String value) {
        this.y1Unit = value;
    }

    /**
     * Gets the value of the y2Unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY2Unit() {
        return y2Unit;
    }

    /**
     * Sets the value of the y2Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY2Unit(String value) {
        this.y2Unit = value;
    }

    /**
     * Gets the value of the dataPoints property.
     * 
     * @return
     *     possible object is
     *     {@link DataPoints }
     *     
     */
    public DataPoints getDataPoints() {
        return dataPoints;
    }

    /**
     * Sets the value of the dataPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPoints }
     *     
     */
    public void setDataPoints(DataPoints value) {
        this.dataPoints = value;
    }

}
