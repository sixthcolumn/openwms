
package com.epri._2013.dergroupforecast;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2013.dergroupforecast package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DERGroupForecasts_QNAME = new QName("http://www.epri.com/2013/DERGroupForecast#", "DERGroupForecasts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2013.dergroupforecast
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtValue }
     * 
     */
    public ExtValue createExtValue() {
        return new ExtValue();
    }

    /**
     * Create an instance of {@link OtherCapability }
     * 
     */
    public OtherCapability createOtherCapability() {
        return new OtherCapability();
    }

    /**
     * Create an instance of {@link ExtensionsList }
     * 
     */
    public ExtensionsList createExtensionsList() {
        return new ExtensionsList();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link DERGroupForecast }
     * 
     */
    public DERGroupForecast createDERGroupForecast() {
        return new DERGroupForecast();
    }

    /**
     * Create an instance of {@link DERGroup }
     * 
     */
    public DERGroup createDERGroup() {
        return new DERGroup();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link DERMember }
     * 
     */
    public DERMember createDERMember() {
        return new DERMember();
    }

    /**
     * Create an instance of {@link TimeInterval }
     * 
     */
    public TimeInterval createTimeInterval() {
        return new TimeInterval();
    }

    /**
     * Create an instance of {@link DERGroupForecasts }
     * 
     */
    public DERGroupForecasts createDERGroupForecasts() {
        return new DERGroupForecasts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecasts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERGroupForecast#", name = "DERGroupForecasts")
    public JAXBElement<DERGroupForecasts> createDERGroupForecasts(DERGroupForecasts value) {
        return new JAXBElement<DERGroupForecasts>(_DERGroupForecasts_QNAME, DERGroupForecasts.class, null, value);
    }

}
