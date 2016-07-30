
package com.epri._2013.derstatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2013.derstatus package. 
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

    private final static QName _OtherCapability_QNAME = new QName("http://www.epri.com/2013/DERStatus#", "otherCapability");
    private final static QName _DERGroupCapabilities_QNAME = new QName("http://www.epri.com/2013/DERStatus#", "DERGroupCapabilities");
    private final static QName _DERGroupStatuses_QNAME = new QName("http://www.epri.com/2013/DERStatus#", "DERGroupStatuses");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2013.derstatus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtensionsList }
     * 
     */
    public ExtensionsList createExtensionsList() {
        return new ExtensionsList();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link DERGroupStatuses }
     * 
     */
    public DERGroupStatuses createDERGroupStatuses() {
        return new DERGroupStatuses();
    }

    /**
     * Create an instance of {@link DERGroupStatus }
     * 
     */
    public DERGroupStatus createDERGroupStatus() {
        return new DERGroupStatus();
    }

    /**
     * Create an instance of {@link DERGroup }
     * 
     */
    public DERGroup createDERGroup() {
        return new DERGroup();
    }

    /**
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link OtherCapability }
     * 
     */
    public OtherCapability createOtherCapability() {
        return new OtherCapability();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ExtValue }
     * 
     */
    public ExtValue createExtValue() {
        return new ExtValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCapability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERStatus#", name = "otherCapability")
    public JAXBElement<OtherCapability> createOtherCapability(OtherCapability value) {
        return new JAXBElement<OtherCapability>(_OtherCapability_QNAME, OtherCapability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupStatuses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERStatus#", name = "DERGroupCapabilities")
    public JAXBElement<DERGroupStatuses> createDERGroupCapabilities(DERGroupStatuses value) {
        return new JAXBElement<DERGroupStatuses>(_DERGroupCapabilities_QNAME, DERGroupStatuses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupStatuses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERStatus#", name = "DERGroupStatuses")
    public JAXBElement<DERGroupStatuses> createDERGroupStatuses(DERGroupStatuses value) {
        return new JAXBElement<DERGroupStatuses>(_DERGroupStatuses_QNAME, DERGroupStatuses.class, null, value);
    }

}
