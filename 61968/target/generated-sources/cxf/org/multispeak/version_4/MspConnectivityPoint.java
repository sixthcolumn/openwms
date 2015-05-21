
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspConnectivityPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspConnectivityPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="graphicSymbolList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGraphicSymbol" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGenericAnnotationFeature" minOccurs="0"/>
 *         &lt;element name="sectionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentSectionID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromNodeID" type="{http://www.multispeak.org/Version_4.1_Release}nodeIdentifier" minOccurs="0"/>
 *         &lt;element name="toNodeID" type="{http://www.multispeak.org/Version_4.1_Release}nodeIdentifier" minOccurs="0"/>
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
@XmlType(name = "mspConnectivityPoint", propOrder = {
    "graphicSymbolList",
    "annotationList",
    "sectionID",
    "parentSectionID",
    "fromNodeID",
    "toNodeID"
})
@XmlSeeAlso({
    MspElectricPoint.class
})
public abstract class MspConnectivityPoint
    extends MspPointObject
{

    protected ArrayOfGraphicSymbol graphicSymbolList;
    protected ArrayOfGenericAnnotationFeature annotationList;
    protected String sectionID;
    protected List<ObjectRef> parentSectionID;
    protected NodeIdentifier fromNodeID;
    protected NodeIdentifier toNodeID;

    /**
     * Gets the value of the graphicSymbolList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGraphicSymbol }
     *     
     */
    public ArrayOfGraphicSymbol getGraphicSymbolList() {
        return graphicSymbolList;
    }

    /**
     * Sets the value of the graphicSymbolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGraphicSymbol }
     *     
     */
    public void setGraphicSymbolList(ArrayOfGraphicSymbol value) {
        this.graphicSymbolList = value;
    }

    /**
     * Gets the value of the annotationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public ArrayOfGenericAnnotationFeature getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public void setAnnotationList(ArrayOfGenericAnnotationFeature value) {
        this.annotationList = value;
    }

    /**
     * Gets the value of the sectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionID() {
        return sectionID;
    }

    /**
     * Sets the value of the sectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionID(String value) {
        this.sectionID = value;
    }

    /**
     * Gets the value of the parentSectionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentSectionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentSectionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRef }
     * 
     * 
     */
    public List<ObjectRef> getParentSectionID() {
        if (parentSectionID == null) {
            parentSectionID = new ArrayList<ObjectRef>();
        }
        return this.parentSectionID;
    }

    /**
     * Gets the value of the fromNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getFromNodeID() {
        return fromNodeID;
    }

    /**
     * Sets the value of the fromNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setFromNodeID(NodeIdentifier value) {
        this.fromNodeID = value;
    }

    /**
     * Gets the value of the toNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getToNodeID() {
        return toNodeID;
    }

    /**
     * Sets the value of the toNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setToNodeID(NodeIdentifier value) {
        this.toNodeID = value;
    }

}
