
package ch.iec.tc57._2011.getdergroupmessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.schema.message.OperationSet;
import com.epri._2013.dergroup.DERGroups;


/**
 * <p>Java class for DERGroupPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupPayloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.epri.com/2013/DERGroup#}DERGroups" minOccurs="0"/>
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
@XmlType(name = "DERGroupPayloadType", propOrder = {
    "derGroups",
    "operationSet",
    "compressed",
    "format"
})
public class DERGroupPayloadType {

    @XmlElement(name = "DERGroups", namespace = "http://www.epri.com/2013/DERGroup#")
    protected DERGroups derGroups;
    @XmlElement(name = "OperationSet")
    protected OperationSet operationSet;
    @XmlElement(name = "Compressed")
    protected String compressed;
    @XmlElement(name = "Format")
    protected String format;

    /**
     * Gets the value of the derGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroups }
     *     
     */
    public DERGroups getDERGroups() {
        return derGroups;
    }

    /**
     * Sets the value of the derGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroups }
     *     
     */
    public void setDERGroups(DERGroups value) {
        this.derGroups = value;
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
