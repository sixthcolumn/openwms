
package org.ucaiug.osgug.ns._2010._06.wsoadr.schema.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ucaiug.osgug.ns._2010._06.wsoadr.schema.message package. 
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

    private final static QName _CreatedDREventOptOut_QNAME = new QName("http://osgug.ucaiug.org/ns/2010/06/wsoadr/schema/message", "CreatedDREventOptOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ucaiug.osgug.ns._2010._06.wsoadr.schema.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osgug.ucaiug.org/ns/2010/06/wsoadr/schema/message", name = "CreatedDREventOptOut")
    public JAXBElement<MessageType> createCreatedDREventOptOut(MessageType value) {
        return new JAXBElement<MessageType>(_CreatedDREventOptOut_QNAME, MessageType.class, null, value);
    }

}
