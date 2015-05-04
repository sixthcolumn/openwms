
package _1_release.gml_v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearRingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearRingType">
 *   &lt;complexContent>
 *     &lt;extension base="{gml_V4.1_Release}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="coordinates" type="{gml_V4.1_Release}CoordinatesType" minOccurs="0"/>
 *           &lt;element name="coord" type="{gml_V4.1_Release}CoordType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearRingType", propOrder = {
    "coordinatesOrCoord"
})
public class LinearRingType
    extends AbstractGeometryType
{

    @XmlElements({
        @XmlElement(name = "coord", type = CoordType.class),
        @XmlElement(name = "coordinates", type = CoordinatesType.class)
    })
    protected List<Object> coordinatesOrCoord;

    /**
     * Gets the value of the coordinatesOrCoord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinatesOrCoord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinatesOrCoord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordType }
     * {@link CoordinatesType }
     * 
     * 
     */
    public List<Object> getCoordinatesOrCoord() {
        if (coordinatesOrCoord == null) {
            coordinatesOrCoord = new ArrayList<Object>();
        }
        return this.coordinatesOrCoord;
    }

}
