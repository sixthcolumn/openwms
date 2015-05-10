
package _1_release.gml_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.GeometryAssociationTypeActuate;
import org.w3._1999.xlink.GeometryAssociationTypeShow;


/**
 * <p>Java class for GeometryAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometryAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Point" type="{gml_V4.1_Release}PointType" minOccurs="0"/>
 *           &lt;element name="MultiLineString" type="{gml_V4.1_Release}MultiLineStringType" minOccurs="0"/>
 *           &lt;element name="MultiPoint" type="{gml_V4.1_Release}MultiPointType" minOccurs="0"/>
 *           &lt;element name="MultiPolygon" type="{gml_V4.1_Release}MultiPolygonType" minOccurs="0"/>
 *           &lt;element name="LineString" type="{gml_V4.1_Release}LineStringType" minOccurs="0"/>
 *           &lt;element name="Polygon" type="{gml_V4.1_Release}PolygonType" minOccurs="0"/>
 *           &lt;element name="LinearRing" type="{gml_V4.1_Release}LinearRingType" minOccurs="0"/>
 *           &lt;element name="MultiGeometry" type="{gml_V4.1_Release}GeometryCollectionType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}role"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}arcrole"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
 *       &lt;attribute name="remoteSchema" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryAssociationType", propOrder = {
    "point",
    "multiLineString",
    "multiPoint",
    "multiPolygon",
    "lineString",
    "polygon",
    "linearRing",
    "multiGeometry"
})
@XmlSeeAlso({
    PointMemberType.class,
    LinearRingMemberType.class,
    LineStringMemberType.class,
    PolygonMemberType.class
})
public class GeometryAssociationType {

    @XmlElement(name = "Point")
    protected PointType point;
    @XmlElement(name = "MultiLineString")
    protected MultiLineStringType multiLineString;
    @XmlElement(name = "MultiPoint")
    protected MultiPointType multiPoint;
    @XmlElement(name = "MultiPolygon")
    protected MultiPolygonType multiPolygon;
    @XmlElement(name = "LineString")
    protected LineStringType lineString;
    @XmlElement(name = "Polygon")
    protected PolygonType polygon;
    @XmlElement(name = "LinearRing")
    protected LinearRingType linearRing;
    @XmlElement(name = "MultiGeometry")
    protected GeometryCollectionType multiGeometry;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected GeometryAssociationTypeShow show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected GeometryAssociationTypeActuate actuate;
    @XmlAttribute(name = "remoteSchema", namespace = "gml_V4.1_Release")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
    }

    /**
     * Gets the value of the multiLineString property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLineStringType }
     *     
     */
    public MultiLineStringType getMultiLineString() {
        return multiLineString;
    }

    /**
     * Sets the value of the multiLineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLineStringType }
     *     
     */
    public void setMultiLineString(MultiLineStringType value) {
        this.multiLineString = value;
    }

    /**
     * Gets the value of the multiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointType }
     *     
     */
    public MultiPointType getMultiPoint() {
        return multiPoint;
    }

    /**
     * Sets the value of the multiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointType }
     *     
     */
    public void setMultiPoint(MultiPointType value) {
        this.multiPoint = value;
    }

    /**
     * Gets the value of the multiPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPolygonType }
     *     
     */
    public MultiPolygonType getMultiPolygon() {
        return multiPolygon;
    }

    /**
     * Sets the value of the multiPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPolygonType }
     *     
     */
    public void setMultiPolygon(MultiPolygonType value) {
        this.multiPolygon = value;
    }

    /**
     * Gets the value of the lineString property.
     * 
     * @return
     *     possible object is
     *     {@link LineStringType }
     *     
     */
    public LineStringType getLineString() {
        return lineString;
    }

    /**
     * Sets the value of the lineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringType }
     *     
     */
    public void setLineString(LineStringType value) {
        this.lineString = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link PolygonType }
     *     
     */
    public PolygonType getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonType }
     *     
     */
    public void setPolygon(PolygonType value) {
        this.polygon = value;
    }

    /**
     * Gets the value of the linearRing property.
     * 
     * @return
     *     possible object is
     *     {@link LinearRingType }
     *     
     */
    public LinearRingType getLinearRing() {
        return linearRing;
    }

    /**
     * Sets the value of the linearRing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearRingType }
     *     
     */
    public void setLinearRing(LinearRingType value) {
        this.linearRing = value;
    }

    /**
     * Gets the value of the multiGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryCollectionType }
     *     
     */
    public GeometryCollectionType getMultiGeometry() {
        return multiGeometry;
    }

    /**
     * Sets the value of the multiGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryCollectionType }
     *     
     */
    public void setMultiGeometry(GeometryCollectionType value) {
        this.multiGeometry = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryAssociationTypeShow }
     *     
     */
    public GeometryAssociationTypeShow getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryAssociationTypeShow }
     *     
     */
    public void setShow(GeometryAssociationTypeShow value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryAssociationTypeActuate }
     *     
     */
    public GeometryAssociationTypeActuate getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryAssociationTypeActuate }
     *     
     */
    public void setActuate(GeometryAssociationTypeActuate value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

}
