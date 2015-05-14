
package _1_release.gml_v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometryCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometryCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{gml_V4.1_Release}AbstractGeometryCollectionBaseType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="polygonMember" type="{gml_V4.1_Release}PolygonMemberType" minOccurs="0"/>
 *           &lt;element name="pointMember" type="{gml_V4.1_Release}PointMemberType" minOccurs="0"/>
 *           &lt;element name="geometryMember" type="{gml_V4.1_Release}GeometryAssociationType" minOccurs="0"/>
 *           &lt;element name="lineStringMember" type="{gml_V4.1_Release}LineStringMemberType" minOccurs="0"/>
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
@XmlType(name = "GeometryCollectionType", propOrder = {
    "polygonMemberOrPointMemberOrGeometryMember"
})
@XmlSeeAlso({
    MultiLineStringType.class,
    MultiPolygonType.class,
    MultiPointType.class
})
public class GeometryCollectionType
    extends AbstractGeometryCollectionBaseType
{

    @XmlElements({
        @XmlElement(name = "pointMember", type = PointMemberType.class),
        @XmlElement(name = "polygonMember", type = PolygonMemberType.class),
        @XmlElement(name = "lineStringMember", type = LineStringMemberType.class),
        @XmlElement(name = "geometryMember")
    })
    protected List<GeometryAssociationType> polygonMemberOrPointMemberOrGeometryMember;

    /**
     * Gets the value of the polygonMemberOrPointMemberOrGeometryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygonMemberOrPointMemberOrGeometryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonMemberOrPointMemberOrGeometryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointMemberType }
     * {@link PolygonMemberType }
     * {@link LineStringMemberType }
     * {@link GeometryAssociationType }
     * 
     * 
     */
    public List<GeometryAssociationType> getPolygonMemberOrPointMemberOrGeometryMember() {
        if (polygonMemberOrPointMemberOrGeometryMember == null) {
            polygonMemberOrPointMemberOrGeometryMember = new ArrayList<GeometryAssociationType>();
        }
        return this.polygonMemberOrPointMemberOrGeometryMember;
    }

}
