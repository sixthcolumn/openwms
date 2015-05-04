
package org.ucaiug.osgug._2010._06.schema.reply;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ucaiug.osgug._2010._06.schema.reply package. 
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

    private final static QName _Error_QNAME = new QName("http://osgug.ucaiug.org/2010/06/schema/reply", "Error");
    private final static QName _Location_QNAME = new QName("http://osgug.ucaiug.org/2010/06/schema/reply", "Location");
    private final static QName _Reply_QNAME = new QName("http://osgug.ucaiug.org/2010/06/schema/reply", "Reply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ucaiug.osgug._2010._06.schema.reply
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link IdentifiedObject }
     * 
     */
    public IdentifiedObject createIdentifiedObject() {
        return new IdentifiedObject();
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
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ReplyType }
     * 
     */
    public ReplyType createReplyType() {
        return new ReplyType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osgug.ucaiug.org/2010/06/schema/reply", name = "Error")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osgug.ucaiug.org/2010/06/schema/reply", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osgug.ucaiug.org/2010/06/schema/reply", name = "Reply")
    public JAXBElement<ReplyType> createReply(ReplyType value) {
        return new JAXBElement<ReplyType>(_Reply_QNAME, ReplyType.class, null, value);
    }

}
