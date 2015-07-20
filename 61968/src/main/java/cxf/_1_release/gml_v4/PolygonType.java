
package _1_release.gml_v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.version_4.GMLPolygon;


/**
 * <p>Java class for PolygonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolygonType">
 *   &lt;complexContent>
 *     &lt;extension base="{gml_V4.1_Release}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element name="outerBoundaryIs" type="{gml_V4.1_Release}LinearRingType" minOccurs="0"/>
 *         &lt;element name="innerBoundaryIs" type="{gml_V4.1_Release}LinearRingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonType", propOrder = {
    "outerBoundaryIs",
    "innerBoundaryIs"
})
@XmlSeeAlso({
    GMLPolygon.class
})
public class PolygonType
    extends AbstractGeometryType
{

    protected LinearRingType outerBoundaryIs;
    protected List<LinearRingType> innerBoundaryIs;

    /**
     * Gets the value of the outerBoundaryIs property.
     * 
     * @return
     *     possible object is
     *     {@link LinearRingType }
     *     
     */
    public LinearRingType getOuterBoundaryIs() {
        return outerBoundaryIs;
    }

    /**
     * Sets the value of the outerBoundaryIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearRingType }
     *     
     */
    public void setOuterBoundaryIs(LinearRingType value) {
        this.outerBoundaryIs = value;
    }

    /**
     * Gets the value of the innerBoundaryIs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerBoundaryIs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerBoundaryIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearRingType }
     * 
     * 
     */
    public List<LinearRingType> getInnerBoundaryIs() {
        if (innerBoundaryIs == null) {
            innerBoundaryIs = new ArrayList<LinearRingType>();
        }
        return this.innerBoundaryIs;
    }

}
