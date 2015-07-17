
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for station complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="station">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMultiGeometryObject">
 *       &lt;sequence>
 *         &lt;element name="graphicSymbol" type="{http://www.multispeak.org/Version_4.1_Release}graphicSymbol" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGenericAnnotationFeature" minOccurs="0"/>
 *         &lt;element name="substationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="poleUse" type="{http://www.multispeak.org/Version_4.1_Release}poleUse" minOccurs="0"/>
 *         &lt;element name="backSpanList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfBackSpan" minOccurs="0"/>
 *         &lt;element name="constTyp" type="{http://www.multispeak.org/Version_4.1_Release}constTypeCode" minOccurs="0"/>
 *         &lt;element name="staStatus" type="{http://www.multispeak.org/Version_4.1_Release}staStatus" minOccurs="0"/>
 *         &lt;element name="constGrade" type="{http://www.multispeak.org/Version_4.1_Release}constGrade" minOccurs="0"/>
 *         &lt;element name="angle" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="isTap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="terrain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/Version_4.1_Release}GPSLocation" minOccurs="0"/>
 *         &lt;element name="assemblyList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAssembly" minOccurs="0"/>
 *         &lt;element name="CPRList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCPR" minOccurs="0"/>
 *         &lt;element name="objectList" type="{http://www.multispeak.org/Version_4.1_Release}physicalObjectList" minOccurs="0"/>
 *         &lt;element name="pickList" type="{http://www.multispeak.org/Version_4.1_Release}pickList" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAttachment" minOccurs="0"/>
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
@XmlType(name = "station", propOrder = {
    "graphicSymbol",
    "annotationList",
    "substationCode",
    "feeder",
    "phaseCode",
    "poleUse",
    "backSpanList",
    "constTyp",
    "staStatus",
    "constGrade",
    "angle",
    "isTap",
    "terrain",
    "gpsLocation",
    "assemblyList",
    "cprList",
    "objectList",
    "pickList",
    "attachments"
})
public class Station
    extends MspMultiGeometryObject
{

    protected GraphicSymbol graphicSymbol;
    protected ArrayOfGenericAnnotationFeature annotationList;
    protected String substationCode;
    protected String feeder;
    protected PhaseCode phaseCode;
    protected PoleUse poleUse;
    protected ArrayOfBackSpan backSpanList;
    protected ConstTypeCode constTyp;
    protected StaStatus staStatus;
    protected ConstGrade constGrade;
    protected Float angle;
    protected Boolean isTap;
    protected String terrain;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected ArrayOfAssembly assemblyList;
    @XmlElement(name = "CPRList")
    protected ArrayOfCPR cprList;
    protected PhysicalObjectList objectList;
    protected PickList pickList;
    protected ArrayOfAttachment attachments;

    /**
     * Gets the value of the graphicSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicSymbol }
     *     
     */
    public GraphicSymbol getGraphicSymbol() {
        return graphicSymbol;
    }

    /**
     * Sets the value of the graphicSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicSymbol }
     *     
     */
    public void setGraphicSymbol(GraphicSymbol value) {
        this.graphicSymbol = value;
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
     * Gets the value of the substationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationCode() {
        return substationCode;
    }

    /**
     * Sets the value of the substationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationCode(String value) {
        this.substationCode = value;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the poleUse property.
     * 
     * @return
     *     possible object is
     *     {@link PoleUse }
     *     
     */
    public PoleUse getPoleUse() {
        return poleUse;
    }

    /**
     * Sets the value of the poleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleUse }
     *     
     */
    public void setPoleUse(PoleUse value) {
        this.poleUse = value;
    }

    /**
     * Gets the value of the backSpanList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBackSpan }
     *     
     */
    public ArrayOfBackSpan getBackSpanList() {
        return backSpanList;
    }

    /**
     * Sets the value of the backSpanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBackSpan }
     *     
     */
    public void setBackSpanList(ArrayOfBackSpan value) {
        this.backSpanList = value;
    }

    /**
     * Gets the value of the constTyp property.
     * 
     * @return
     *     possible object is
     *     {@link ConstTypeCode }
     *     
     */
    public ConstTypeCode getConstTyp() {
        return constTyp;
    }

    /**
     * Sets the value of the constTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstTypeCode }
     *     
     */
    public void setConstTyp(ConstTypeCode value) {
        this.constTyp = value;
    }

    /**
     * Gets the value of the staStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StaStatus }
     *     
     */
    public StaStatus getStaStatus() {
        return staStatus;
    }

    /**
     * Sets the value of the staStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaStatus }
     *     
     */
    public void setStaStatus(StaStatus value) {
        this.staStatus = value;
    }

    /**
     * Gets the value of the constGrade property.
     * 
     * @return
     *     possible object is
     *     {@link ConstGrade }
     *     
     */
    public ConstGrade getConstGrade() {
        return constGrade;
    }

    /**
     * Sets the value of the constGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstGrade }
     *     
     */
    public void setConstGrade(ConstGrade value) {
        this.constGrade = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAngle(Float value) {
        this.angle = value;
    }

    /**
     * Gets the value of the isTap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTap() {
        return isTap;
    }

    /**
     * Sets the value of the isTap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTap(Boolean value) {
        this.isTap = value;
    }

    /**
     * Gets the value of the terrain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * Sets the value of the terrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerrain(String value) {
        this.terrain = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GPSLocation }
     *     
     */
    public GPSLocation getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSLocation }
     *     
     */
    public void setGPSLocation(GPSLocation value) {
        this.gpsLocation = value;
    }

    /**
     * Gets the value of the assemblyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssembly }
     *     
     */
    public ArrayOfAssembly getAssemblyList() {
        return assemblyList;
    }

    /**
     * Sets the value of the assemblyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssembly }
     *     
     */
    public void setAssemblyList(ArrayOfAssembly value) {
        this.assemblyList = value;
    }

    /**
     * Gets the value of the cprList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCPR }
     *     
     */
    public ArrayOfCPR getCPRList() {
        return cprList;
    }

    /**
     * Sets the value of the cprList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCPR }
     *     
     */
    public void setCPRList(ArrayOfCPR value) {
        this.cprList = value;
    }

    /**
     * Gets the value of the objectList property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalObjectList }
     *     
     */
    public PhysicalObjectList getObjectList() {
        return objectList;
    }

    /**
     * Sets the value of the objectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalObjectList }
     *     
     */
    public void setObjectList(PhysicalObjectList value) {
        this.objectList = value;
    }

    /**
     * Gets the value of the pickList property.
     * 
     * @return
     *     possible object is
     *     {@link PickList }
     *     
     */
    public PickList getPickList() {
        return pickList;
    }

    /**
     * Sets the value of the pickList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickList }
     *     
     */
    public void setPickList(PickList value) {
        this.pickList = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

}
