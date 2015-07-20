
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for inHomeDisplayBillingMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inHomeDisplayBillingMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="inHomeDisplayID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentBalance" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="currentRate" type="{http://www.multispeak.org/Version_4.1_Release}rate" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="priorityOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="averageDailyUsage" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="usedYesterday" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="usedThisMonth" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="usedLastMonth" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="usedFourWeeksAgo" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="usedThisMonthLastYear" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="usageOtherPeriodList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfUsageOtherPeriod" minOccurs="0"/>
 *         &lt;element name="daysRemaining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "inHomeDisplayBillingMessage", propOrder = {
    "inHomeDisplayID",
    "currentBalance",
    "currentRate",
    "dateTime",
    "priorityOrder",
    "averageDailyUsage",
    "usedYesterday",
    "usedThisMonth",
    "usedLastMonth",
    "usedFourWeeksAgo",
    "usedThisMonthLastYear",
    "usageOtherPeriodList",
    "daysRemaining"
})
public class InHomeDisplayBillingMessage
    extends MspObject
{

    protected String inHomeDisplayID;
    protected Money currentBalance;
    protected Rate currentRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected BigInteger priorityOrder;
    protected Money averageDailyUsage;
    protected Money usedYesterday;
    protected Money usedThisMonth;
    protected Money usedLastMonth;
    protected Money usedFourWeeksAgo;
    protected Money usedThisMonthLastYear;
    protected ArrayOfUsageOtherPeriod usageOtherPeriodList;
    protected BigInteger daysRemaining;

    /**
     * Gets the value of the inHomeDisplayID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHomeDisplayID() {
        return inHomeDisplayID;
    }

    /**
     * Sets the value of the inHomeDisplayID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHomeDisplayID(String value) {
        this.inHomeDisplayID = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCurrentBalance(Money value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the currentRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getCurrentRate() {
        return currentRate;
    }

    /**
     * Sets the value of the currentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setCurrentRate(Rate value) {
        this.currentRate = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the priorityOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityOrder() {
        return priorityOrder;
    }

    /**
     * Sets the value of the priorityOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityOrder(BigInteger value) {
        this.priorityOrder = value;
    }

    /**
     * Gets the value of the averageDailyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageDailyUsage() {
        return averageDailyUsage;
    }

    /**
     * Sets the value of the averageDailyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageDailyUsage(Money value) {
        this.averageDailyUsage = value;
    }

    /**
     * Gets the value of the usedYesterday property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUsedYesterday() {
        return usedYesterday;
    }

    /**
     * Sets the value of the usedYesterday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUsedYesterday(Money value) {
        this.usedYesterday = value;
    }

    /**
     * Gets the value of the usedThisMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUsedThisMonth() {
        return usedThisMonth;
    }

    /**
     * Sets the value of the usedThisMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUsedThisMonth(Money value) {
        this.usedThisMonth = value;
    }

    /**
     * Gets the value of the usedLastMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUsedLastMonth() {
        return usedLastMonth;
    }

    /**
     * Sets the value of the usedLastMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUsedLastMonth(Money value) {
        this.usedLastMonth = value;
    }

    /**
     * Gets the value of the usedFourWeeksAgo property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUsedFourWeeksAgo() {
        return usedFourWeeksAgo;
    }

    /**
     * Sets the value of the usedFourWeeksAgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUsedFourWeeksAgo(Money value) {
        this.usedFourWeeksAgo = value;
    }

    /**
     * Gets the value of the usedThisMonthLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUsedThisMonthLastYear() {
        return usedThisMonthLastYear;
    }

    /**
     * Sets the value of the usedThisMonthLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUsedThisMonthLastYear(Money value) {
        this.usedThisMonthLastYear = value;
    }

    /**
     * Gets the value of the usageOtherPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUsageOtherPeriod }
     *     
     */
    public ArrayOfUsageOtherPeriod getUsageOtherPeriodList() {
        return usageOtherPeriodList;
    }

    /**
     * Sets the value of the usageOtherPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUsageOtherPeriod }
     *     
     */
    public void setUsageOtherPeriodList(ArrayOfUsageOtherPeriod value) {
        this.usageOtherPeriodList = value;
    }

    /**
     * Gets the value of the daysRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysRemaining() {
        return daysRemaining;
    }

    /**
     * Sets the value of the daysRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysRemaining(BigInteger value) {
        this.daysRemaining = value;
    }

}
