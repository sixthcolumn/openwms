
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultCurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DefaultCurrencyCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AFN"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AOA"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BOV"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CDF"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CHW"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHS"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MGA"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MXV"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="SRD"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TMM"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="USN"/>
 *     &lt;enumeration value="USS"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="XAG"/>
 *     &lt;enumeration value="XAU"/>
 *     &lt;enumeration value="XBA"/>
 *     &lt;enumeration value="XBB"/>
 *     &lt;enumeration value="XBC"/>
 *     &lt;enumeration value="XBD"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="XFU"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XPD"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="XPT"/>
 *     &lt;enumeration value="XTS"/>
 *     &lt;enumeration value="XXX"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWD"/>
 *     &lt;enumeration value="ADF"/>
 *     &lt;enumeration value="ADP"/>
 *     &lt;enumeration value="ATS"/>
 *     &lt;enumeration value="BEF"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="DEM"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="FIM"/>
 *     &lt;enumeration value="FRF"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="IEP"/>
 *     &lt;enumeration value="ITL"/>
 *     &lt;enumeration value="LUF"/>
 *     &lt;enumeration value="MCF"/>
 *     &lt;enumeration value="MTL"/>
 *     &lt;enumeration value="NLG"/>
 *     &lt;enumeration value="PTE"/>
 *     &lt;enumeration value="SIT"/>
 *     &lt;enumeration value="SML"/>
 *     &lt;enumeration value="VAL"/>
 *     &lt;enumeration value="XEU"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DefaultCurrencyCode")
@XmlEnum
public enum DefaultCurrencyCode {

    USD("USD"),
    EUR("EUR"),
    AED("AED"),
    AFN("AFN"),
    ALL("ALL"),
    AMD("AMD"),
    ANG("ANG"),
    AOA("AOA"),
    ARS("ARS"),
    AUD("AUD"),
    AWG("AWG"),
    AZN("AZN"),
    BAM("BAM"),
    BBD("BBD"),
    BDT("BDT"),
    BGN("BGN"),
    BHD("BHD"),
    BIF("BIF"),
    BMD("BMD"),
    BND("BND"),
    BOB("BOB"),
    BOV("BOV"),
    BRL("BRL"),
    BSD("BSD"),
    BTN("BTN"),
    BWP("BWP"),
    BYR("BYR"),
    BZD("BZD"),
    CAD("CAD"),
    CDF("CDF"),
    CHE("CHE"),
    CHF("CHF"),
    CHW("CHW"),
    CLF("CLF"),
    CLP("CLP"),
    CNY("CNY"),
    COP("COP"),
    COU("COU"),
    CRC("CRC"),
    CUP("CUP"),
    CVE("CVE"),
    CZK("CZK"),
    DJF("DJF"),
    DKK("DKK"),
    DOP("DOP"),
    DZD("DZD"),
    EEK("EEK"),
    EGP("EGP"),
    ERN("ERN"),
    ETB("ETB"),
    FJD("FJD"),
    FKP("FKP"),
    GBP("GBP"),
    GEL("GEL"),
    GHS("GHS"),
    GIP("GIP"),
    GMD("GMD"),
    GNF("GNF"),
    GTQ("GTQ"),
    GYD("GYD"),
    HKD("HKD"),
    HNL("HNL"),
    HRK("HRK"),
    HTG("HTG"),
    HUF("HUF"),
    IDR("IDR"),
    ILS("ILS"),
    INR("INR"),
    IQD("IQD"),
    IRR("IRR"),
    ISK("ISK"),
    JMD("JMD"),
    JOD("JOD"),
    JPY("JPY"),
    KES("KES"),
    KGS("KGS"),
    KHR("KHR"),
    KMF("KMF"),
    KPW("KPW"),
    KRW("KRW"),
    KWD("KWD"),
    KYD("KYD"),
    KZT("KZT"),
    LAK("LAK"),
    LBP("LBP"),
    LKR("LKR"),
    LRD("LRD"),
    LSL("LSL"),
    LTL("LTL"),
    LVL("LVL"),
    LYD("LYD"),
    MAD("MAD"),
    MDL("MDL"),
    MGA("MGA"),
    MKD("MKD"),
    MMK("MMK"),
    MNT("MNT"),
    MOP("MOP"),
    MRO("MRO"),
    MUR("MUR"),
    MVR("MVR"),
    MWK("MWK"),
    MXN("MXN"),
    MXV("MXV"),
    MYR("MYR"),
    MZN("MZN"),
    NAD("NAD"),
    NGN("NGN"),
    NIO("NIO"),
    NOK("NOK"),
    NPR("NPR"),
    NZD("NZD"),
    OMR("OMR"),
    PAB("PAB"),
    PEN("PEN"),
    PGK("PGK"),
    PHP("PHP"),
    PKR("PKR"),
    PLN("PLN"),
    PYG("PYG"),
    QAR("QAR"),
    RON("RON"),
    RSD("RSD"),
    RUB("RUB"),
    RWF("RWF"),
    SAR("SAR"),
    SBD("SBD"),
    SCR("SCR"),
    SDG("SDG"),
    SEK("SEK"),
    SGD("SGD"),
    SHP("SHP"),
    SKK("SKK"),
    SLL("SLL"),
    SOS("SOS"),
    SRD("SRD"),
    STD("STD"),
    SYP("SYP"),
    SZL("SZL"),
    THB("THB"),
    TJS("TJS"),
    TMM("TMM"),
    TND("TND"),
    TOP("TOP"),
    TRY("TRY"),
    TTD("TTD"),
    TWD("TWD"),
    TZS("TZS"),
    UAH("UAH"),
    UGX("UGX"),
    USN("USN"),
    USS("USS"),
    UYU("UYU"),
    UZS("UZS"),
    VEF("VEF"),
    VND("VND"),
    VUV("VUV"),
    WST("WST"),
    XAF("XAF"),
    XAG("XAG"),
    XAU("XAU"),
    XBA("XBA"),
    XBB("XBB"),
    XBC("XBC"),
    XBD("XBD"),
    XCD("XCD"),
    XDR("XDR"),
    XFU("XFU"),
    XOF("XOF"),
    XPD("XPD"),
    XPF("XPF"),
    XPT("XPT"),
    XTS("XTS"),
    XXX("XXX"),
    YER("YER"),
    ZAR("ZAR"),
    ZMK("ZMK"),
    ZWD("ZWD"),
    ADF("ADF"),
    ADP("ADP"),
    ATS("ATS"),
    BEF("BEF"),
    CYP("CYP"),
    DEM("DEM"),
    ESP("ESP"),
    FIM("FIM"),
    FRF("FRF"),
    GRD("GRD"),
    IEP("IEP"),
    ITL("ITL"),
    LUF("LUF"),
    MCF("MCF"),
    MTL("MTL"),
    NLG("NLG"),
    PTE("PTE"),
    SIT("SIT"),
    SML("SML"),
    VAL("VAL"),
    XEU("XEU"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DefaultCurrencyCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefaultCurrencyCode fromValue(String v) {
        for (DefaultCurrencyCode c: DefaultCurrencyCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
