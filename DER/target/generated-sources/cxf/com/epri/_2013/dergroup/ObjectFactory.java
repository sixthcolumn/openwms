
package com.epri._2013.dergroup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2013.dergroup package. 
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

    private final static QName _DERGroups_QNAME = new QName("http://www.epri.com/2013/DERGroup#", "DERGroups");
    private final static QName _ChangedDERGroups_QNAME = new QName("http://www.epri.com/2013/DERGroup#", "ChangedDERGroups");
    private final static QName _DeleteDERGroups_QNAME = new QName("http://www.epri.com/2013/DERGroup#", "DeleteDERGroups");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2013.dergroup
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
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link DERGroups.DERGroup }
     * 
     */
    public DERGroups.DERGroup createDERGroupsDERGroup() {
        return new DERGroups.DERGroup();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
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
     * Create an instance of {@link DERMember }
     * 
     */
    public DERMember createDERMember() {
        return new DERMember();
    }

    /**
     * Create an instance of {@link com.epri._2013.dergroup.DERGroup }
     * 
     */
    public com.epri._2013.dergroup.DERGroup createDERGroup() {
        return new com.epri._2013.dergroup.DERGroup();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link DERGroups }
     * 
     */
    public DERGroups createDERGroups() {
        return new DERGroups();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERGroup#", name = "DERGroups")
    public JAXBElement<DERGroups> createDERGroups(DERGroups value) {
        return new JAXBElement<DERGroups>(_DERGroups_QNAME, DERGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERGroup#", name = "ChangedDERGroups")
    public JAXBElement<DERGroups> createChangedDERGroups(DERGroups value) {
        return new JAXBElement<DERGroups>(_ChangedDERGroups_QNAME, DERGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERGroup#", name = "DeleteDERGroups")
    public JAXBElement<DERGroups> createDeleteDERGroups(DERGroups value) {
        return new JAXBElement<DERGroups>(_DeleteDERGroups_QNAME, DERGroups.class, null, value);
    }

}
