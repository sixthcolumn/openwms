
package org.ucaiug.osgug._2010._06.schema.header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ucaiug.osgug._2010._06.schema.header package. 
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

    private final static QName _MessageHeader_QNAME = new QName("http://osgug.ucaiug.org/2010/06/schema/header", "MessageHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ucaiug.osgug._2010._06.schema.header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osgug.ucaiug.org/2010/06/schema/header", name = "MessageHeader")
    public JAXBElement<MessageHeaderType> createMessageHeader(MessageHeaderType value) {
        return new JAXBElement<MessageHeaderType>(_MessageHeader_QNAME, MessageHeaderType.class, null, value);
    }

}
