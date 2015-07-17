
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formattedBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formattedBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentNounType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSyntax" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSyntaxItem" minOccurs="0"/>
 *         &lt;element name="valueList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString16" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formattedBlock", propOrder = {
    "separator",
    "contentNounType",
    "contentID",
    "comment",
    "valSyntax",
    "valueList"
})
public class FormattedBlock {

    protected String separator;
    protected String contentNounType;
    protected String contentID;
    protected String comment;
    protected ArrayOfSyntaxItem valSyntax;
    protected ArrayOfString16 valueList;

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the contentNounType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentNounType() {
        return contentNounType;
    }

    /**
     * Sets the value of the contentNounType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentNounType(String value) {
        this.contentNounType = value;
    }

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the valSyntax property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSyntaxItem }
     *     
     */
    public ArrayOfSyntaxItem getValSyntax() {
        return valSyntax;
    }

    /**
     * Sets the value of the valSyntax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSyntaxItem }
     *     
     */
    public void setValSyntax(ArrayOfSyntaxItem value) {
        this.valSyntax = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString16 }
     *     
     */
    public ArrayOfString16 getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString16 }
     *     
     */
    public void setValueList(ArrayOfString16 value) {
        this.valueList = value;
    }

}
