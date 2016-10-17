
package ch.iec.tc57._2015.maintenanceorders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Names" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Name" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="phone1" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="localNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="streetAddress" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="streetDetail" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="addressGeneral" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                             &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="suiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="withinTownLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="townDetail" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                             &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", propOrder = {
    "mrid",
    "names",
    "phone1",
    "streetAddress"
})
public class Organisation {

    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlElement(name = "Names")
    protected List<Name> names;
    protected Organisation.Phone1 phone1;
    protected Organisation.StreetAddress streetAddress;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation.Phone1 }
     *     
     */
    public Organisation.Phone1 getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation.Phone1 }
     *     
     */
    public void setPhone1(Organisation.Phone1 value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation.StreetAddress }
     *     
     */
    public Organisation.StreetAddress getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation.StreetAddress }
     *     
     */
    public void setStreetAddress(Organisation.StreetAddress value) {
        this.streetAddress = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="localNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "areaCode",
        "cityCode",
        "countryCode",
        "extension",
        "localNumber"
    })
    public static class Phone1 {

        protected String areaCode;
        protected String cityCode;
        protected String countryCode;
        protected String extension;
        @XmlElement(required = true)
        protected String localNumber;

        /**
         * Gets the value of the areaCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCode() {
            return areaCode;
        }

        /**
         * Sets the value of the areaCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCode(String value) {
            this.areaCode = value;
        }

        /**
         * Gets the value of the cityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityCode() {
            return cityCode;
        }

        /**
         * Sets the value of the cityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityCode(String value) {
            this.cityCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the localNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalNumber() {
            return localNumber;
        }

        /**
         * Sets the value of the localNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalNumber(String value) {
            this.localNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="streetDetail" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="addressGeneral" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *                   &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="suiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="withinTownLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="townDetail" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *                   &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "streetDetail",
        "townDetail"
    })
    public static class StreetAddress {

        @XmlElement(required = true)
        protected Organisation.StreetAddress.StreetDetail streetDetail;
        @XmlElement(required = true)
        protected Organisation.StreetAddress.TownDetail townDetail;

        /**
         * Gets the value of the streetDetail property.
         * 
         * @return
         *     possible object is
         *     {@link Organisation.StreetAddress.StreetDetail }
         *     
         */
        public Organisation.StreetAddress.StreetDetail getStreetDetail() {
            return streetDetail;
        }

        /**
         * Sets the value of the streetDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link Organisation.StreetAddress.StreetDetail }
         *     
         */
        public void setStreetDetail(Organisation.StreetAddress.StreetDetail value) {
            this.streetDetail = value;
        }

        /**
         * Gets the value of the townDetail property.
         * 
         * @return
         *     possible object is
         *     {@link Organisation.StreetAddress.TownDetail }
         *     
         */
        public Organisation.StreetAddress.TownDetail getTownDetail() {
            return townDetail;
        }

        /**
         * Sets the value of the townDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link Organisation.StreetAddress.TownDetail }
         *     
         */
        public void setTownDetail(Organisation.StreetAddress.TownDetail value) {
            this.townDetail = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="addressGeneral" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
         *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="suiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="withinTownLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addressGeneral",
            "buildingName",
            "code",
            "name",
            "number",
            "prefix",
            "suffix",
            "suiteNumber",
            "type",
            "withinTownLimits"
        })
        public static class StreetDetail {

            @XmlElement(required = true)
            protected String addressGeneral;
            protected String buildingName;
            protected String code;
            protected String name;
            protected String number;
            protected String prefix;
            protected String suffix;
            protected String suiteNumber;
            protected String type;
            protected Boolean withinTownLimits;

            /**
             * Gets the value of the addressGeneral property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressGeneral() {
                return addressGeneral;
            }

            /**
             * Sets the value of the addressGeneral property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressGeneral(String value) {
                this.addressGeneral = value;
            }

            /**
             * Gets the value of the buildingName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildingName() {
                return buildingName;
            }

            /**
             * Sets the value of the buildingName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildingName(String value) {
                this.buildingName = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the prefix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrefix() {
                return prefix;
            }

            /**
             * Sets the value of the prefix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrefix(String value) {
                this.prefix = value;
            }

            /**
             * Gets the value of the suffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuffix() {
                return suffix;
            }

            /**
             * Sets the value of the suffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuffix(String value) {
                this.suffix = value;
            }

            /**
             * Gets the value of the suiteNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuiteNumber() {
                return suiteNumber;
            }

            /**
             * Sets the value of the suiteNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuiteNumber(String value) {
                this.suiteNumber = value;
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
             * Gets the value of the withinTownLimits property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isWithinTownLimits() {
                return withinTownLimits;
            }

            /**
             * Sets the value of the withinTownLimits property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setWithinTownLimits(Boolean value) {
                this.withinTownLimits = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
         *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "country",
            "name",
            "section",
            "stateOrProvince"
        })
        public static class TownDetail {

            protected String code;
            protected String country;
            @XmlElement(required = true)
            protected String name;
            protected String section;
            protected String stateOrProvince;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the section property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSection() {
                return section;
            }

            /**
             * Sets the value of the section property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSection(String value) {
                this.section = value;
            }

            /**
             * Gets the value of the stateOrProvince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateOrProvince() {
                return stateOrProvince;
            }

            /**
             * Sets the value of the stateOrProvince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateOrProvince(String value) {
                this.stateOrProvince = value;
            }

        }

    }

}
