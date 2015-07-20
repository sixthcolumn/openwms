
package org.multispeak.v5_0.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This abstract base type for geometry collections just makes the 
 *         srsName attribute mandatory.
 *       
 * 
 * <p>Java class for AbstractGeometryCollectionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeometryCollectionBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.multispeak.org/V5.0/gml}AbstractGeometryType">
 *       &lt;attribute name="gid" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="srsName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometryCollectionBaseType")
@XmlSeeAlso({
    GeometryCollectionType.class
})
public abstract class AbstractGeometryCollectionBaseType
    extends AbstractGeometryType
{


}
