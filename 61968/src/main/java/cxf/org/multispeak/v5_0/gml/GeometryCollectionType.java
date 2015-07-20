
package org.multispeak.v5_0.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A geometry collection must include one or more geometries, referenced 
 *         through geometryMember elements. User-defined geometry collections 
 *         that accept GML geometry classes as members must instantiate--or 
 *         derive from--this type.
 *       
 * 
 * <p>Java class for GeometryCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometryCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/gml}AbstractGeometryCollectionBaseType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://www.multispeak.org/V5.0/gml}geometryMember"/>
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
    "geometryMember"
})
@XmlSeeAlso({
    MultiPolygonType.class,
    MultiLineStringType.class,
    MultiPointType.class
})
public class GeometryCollectionType
    extends AbstractGeometryCollectionBaseType
{

    @XmlElementRef(name = "geometryMember", namespace = "http://www.multispeak.org/V5.0/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends GeometryAssociationType>> geometryMember;

    /**
     * Gets the value of the geometryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GeometryAssociationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointMemberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringMemberType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonMemberType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GeometryAssociationType>> getGeometryMember() {
        if (geometryMember == null) {
            geometryMember = new ArrayList<JAXBElement<? extends GeometryAssociationType>>();
        }
        return this.geometryMember;
    }

}
