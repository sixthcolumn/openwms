
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout package. 
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

    private final static QName _DREventOptOut_QNAME = new QName("http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut", "DREventOptOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbsoluteDate }
     * 
     */
    public AbsoluteDate createAbsoluteDate() {
        return new AbsoluteDate();
    }

    /**
     * Create an instance of {@link Constraint }
     * 
     */
    public Constraint createConstraint() {
        return new Constraint();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link DREventOptOut }
     * 
     */
    public DREventOptOut createDREventOptOut() {
        return new DREventOptOut();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link DemandResponseEvent }
     * 
     */
    public DemandResponseEvent createDemandResponseEvent() {
        return new DemandResponseEvent();
    }

    /**
     * Create an instance of {@link OfferParameters }
     * 
     */
    public OfferParameters createOfferParameters() {
        return new OfferParameters();
    }

    /**
     * Create an instance of {@link EndDeviceAsset }
     * 
     */
    public EndDeviceAsset createEndDeviceAsset() {
        return new EndDeviceAsset();
    }

    /**
     * Create an instance of {@link AbsoluteDateTime }
     * 
     */
    public AbsoluteDateTime createAbsoluteDateTime() {
        return new AbsoluteDateTime();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DREventOptOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut", name = "DREventOptOut")
    public JAXBElement<DREventOptOut> createDREventOptOut(DREventOptOut value) {
        return new JAXBElement<DREventOptOut>(_DREventOptOut_QNAME, DREventOptOut.class, null, value);
    }

}
