
package ch.iec.tc57._2011.meterreadings;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2014-11-06T16:00:44.422-05:00
 * Generated source version: 2.4.1
 * 
 */
public final class ReplyMeterReadingsPort_ReplyMeterReadingsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadings", "ReplyMeterReadings");

    private ReplyMeterReadingsPort_ReplyMeterReadingsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ReplyMeterReadings.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ReplyMeterReadings ss = new ReplyMeterReadings(wsdlURL, SERVICE_NAME);
        ReplyMeterReadingsPort port = ss.getReplyMeterReadingsPort();  
        
        {
        System.out.println("Invoking changedMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _changedMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changedMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changedMeterReadings_headerVal);
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _changedMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _changedMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_changedMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changedMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changedMeterReadings(_changedMeterReadings_header, _changedMeterReadings_payload, _changedMeterReadings_reply);

            System.out.println("changedMeterReadings._changedMeterReadings_header=" + _changedMeterReadings_header.value);
            System.out.println("changedMeterReadings._changedMeterReadings_payload=" + _changedMeterReadings_payload.value);
            System.out.println("changedMeterReadings._changedMeterReadings_reply=" + _changedMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking closedMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _closedMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closedMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closedMeterReadings_headerVal);
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _closedMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _closedMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_closedMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closedMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closedMeterReadings(_closedMeterReadings_header, _closedMeterReadings_payload, _closedMeterReadings_reply);

            System.out.println("closedMeterReadings._closedMeterReadings_header=" + _closedMeterReadings_header.value);
            System.out.println("closedMeterReadings._closedMeterReadings_payload=" + _closedMeterReadings_payload.value);
            System.out.println("closedMeterReadings._closedMeterReadings_reply=" + _closedMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deletedMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _deletedMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deletedMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deletedMeterReadings_headerVal);
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _deletedMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _deletedMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_deletedMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deletedMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deletedMeterReadings(_deletedMeterReadings_header, _deletedMeterReadings_payload, _deletedMeterReadings_reply);

            System.out.println("deletedMeterReadings._deletedMeterReadings_header=" + _deletedMeterReadings_header.value);
            System.out.println("deletedMeterReadings._deletedMeterReadings_payload=" + _deletedMeterReadings_payload.value);
            System.out.println("deletedMeterReadings._deletedMeterReadings_reply=" + _deletedMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking canceledMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _canceledMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _canceledMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_canceledMeterReadings_headerVal);
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _canceledMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _canceledMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_canceledMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _canceledMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.canceledMeterReadings(_canceledMeterReadings_header, _canceledMeterReadings_payload, _canceledMeterReadings_reply);

            System.out.println("canceledMeterReadings._canceledMeterReadings_header=" + _canceledMeterReadings_header.value);
            System.out.println("canceledMeterReadings._canceledMeterReadings_payload=" + _canceledMeterReadings_payload.value);
            System.out.println("canceledMeterReadings._canceledMeterReadings_reply=" + _canceledMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createdMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _createdMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createdMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createdMeterReadings_headerVal);
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _createdMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _createdMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_createdMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createdMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createdMeterReadings(_createdMeterReadings_header, _createdMeterReadings_payload, _createdMeterReadings_reply);

            System.out.println("createdMeterReadings._createdMeterReadings_header=" + _createdMeterReadings_header.value);
            System.out.println("createdMeterReadings._createdMeterReadings_payload=" + _createdMeterReadings_payload.value);
            System.out.println("createdMeterReadings._createdMeterReadings_reply=" + _createdMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
