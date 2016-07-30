
package org.multispeak.v5_0.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The Box structure defines an extent using a pair of coordinate tuples.
 *       
 * 
 * <p>Java class for BoxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/gml}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.multispeak.org/V5.0/gml}coord" maxOccurs="2" minOccurs="2"/>
 *           &lt;element ref="{http://www.multispeak.org/V5.0/gml}coordinates"/>
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
@XmlType(name = "BoxType", propOrder = {
    "coord",
    "coordinates"
})
public class BoxType
    extends AbstractGeometryType
{

    protected List<CoordType> coord;
    protected CoordinatesType coordinates;

    /**
     * Gets the value of the coord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordType }
     * 
     * 
     */
    public List<CoordType> getCoord() {
        if (coord == null) {
            coord = new ArrayList<CoordType>();
        }
        return this.coord;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

}
