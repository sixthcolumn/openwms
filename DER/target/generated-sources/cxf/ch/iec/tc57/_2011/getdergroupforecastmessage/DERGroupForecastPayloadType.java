
package ch.iec.tc57._2011.getdergroupforecastmessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.schema.message.OperationSet;
import com.epri._2013.dergroupforecast.DERGroupForecasts;


/**
 * <p>Java class for DERGroupForecastPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupForecastPayloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.epri.com/2013/DERGroupForecast#}DERGroupForecasts" minOccurs="0"/>
 *         &lt;element name="OperationSet" type="{http://iec.ch/TC57/2011/schema/message}OperationSet" minOccurs="0"/>
 *         &lt;element name="Compressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupForecastPayloadType", propOrder = {
    "derGroupForecasts",
    "operationSet",
    "compressed",
    "format"
})
public class DERGroupForecastPayloadType {

    @XmlElement(name = "DERGroupForecasts", namespace = "http://www.epri.com/2013/DERGroupForecast#")
    protected DERGroupForecasts derGroupForecasts;
    @XmlElement(name = "OperationSet")
    protected OperationSet operationSet;
    @XmlElement(name = "Compressed")
    protected String compressed;
    @XmlElement(name = "Format")
    protected String format;

    /**
     * Gets the value of the derGroupForecasts property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupForecasts }
     *     
     */
    public DERGroupForecasts getDERGroupForecasts() {
        return derGroupForecasts;
    }

    /**
     * Sets the value of the derGroupForecasts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupForecasts }
     *     
     */
    public void setDERGroupForecasts(DERGroupForecasts value) {
        this.derGroupForecasts = value;
    }

    /**
     * Gets the value of the operationSet property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSet }
     *     
     */
    public OperationSet getOperationSet() {
        return operationSet;
    }

    /**
     * Sets the value of the operationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSet }
     *     
     */
    public void setOperationSet(OperationSet value) {
        this.operationSet = value;
    }

    /**
     * Gets the value of the compressed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressed() {
        return compressed;
    }

    /**
     * Sets the value of the compressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressed(String value) {
        this.compressed = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
