
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobWorked complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobWorked">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobWorked", propOrder = {
    "woNumber",
    "jobNumber",
    "jobDescr",
    "jobHours"
})
public class JobWorked {

    protected String woNumber;
    protected String jobNumber;
    protected String jobDescr;
    protected Float jobHours;

    /**
     * Gets the value of the woNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoNumber() {
        return woNumber;
    }

    /**
     * Sets the value of the woNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoNumber(String value) {
        this.woNumber = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the jobDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescr() {
        return jobDescr;
    }

    /**
     * Sets the value of the jobDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescr(String value) {
        this.jobDescr = value;
    }

    /**
     * Gets the value of the jobHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getJobHours() {
        return jobHours;
    }

    /**
     * Sets the value of the jobHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setJobHours(Float value) {
        this.jobHours = value;
    }

}
