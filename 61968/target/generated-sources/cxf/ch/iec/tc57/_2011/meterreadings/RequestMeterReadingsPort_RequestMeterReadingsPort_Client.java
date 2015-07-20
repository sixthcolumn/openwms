
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
 * 2015-07-20T09:15:17.276-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class RequestMeterReadingsPort_RequestMeterReadingsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadings", "RequestMeterReadings");

    private RequestMeterReadingsPort_RequestMeterReadingsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RequestMeterReadings.WSDL_LOCATION;
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
      
        RequestMeterReadings ss = new RequestMeterReadings(wsdlURL, SERVICE_NAME);
        RequestMeterReadingsPort port = ss.getRequestMeterReadingsPort();  
        
        {
        System.out.println("Invoking closeMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _closeMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closeMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closeMeterReadings_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _closeMeterReadings_request = null;
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _closeMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _closeMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_closeMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closeMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closeMeterReadings(_closeMeterReadings_header, _closeMeterReadings_request, _closeMeterReadings_payload, _closeMeterReadings_reply);

            System.out.println("closeMeterReadings._closeMeterReadings_header=" + _closeMeterReadings_header.value);
            System.out.println("closeMeterReadings._closeMeterReadings_payload=" + _closeMeterReadings_payload.value);
            System.out.println("closeMeterReadings._closeMeterReadings_reply=" + _closeMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _createMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createMeterReadings_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _createMeterReadings_request = null;
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _createMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _createMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_createMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createMeterReadings(_createMeterReadings_header, _createMeterReadings_request, _createMeterReadings_payload, _createMeterReadings_reply);

            System.out.println("createMeterReadings._createMeterReadings_header=" + _createMeterReadings_header.value);
            System.out.println("createMeterReadings._createMeterReadings_payload=" + _createMeterReadings_payload.value);
            System.out.println("createMeterReadings._createMeterReadings_reply=" + _createMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changeMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _changeMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changeMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changeMeterReadings_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _changeMeterReadings_request = null;
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _changeMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _changeMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_changeMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changeMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changeMeterReadings(_changeMeterReadings_header, _changeMeterReadings_request, _changeMeterReadings_payload, _changeMeterReadings_reply);

            System.out.println("changeMeterReadings._changeMeterReadings_header=" + _changeMeterReadings_header.value);
            System.out.println("changeMeterReadings._changeMeterReadings_payload=" + _changeMeterReadings_payload.value);
            System.out.println("changeMeterReadings._changeMeterReadings_reply=" + _changeMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _cancelMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _cancelMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_cancelMeterReadings_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _cancelMeterReadings_request = null;
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _cancelMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _cancelMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_cancelMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _cancelMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.cancelMeterReadings(_cancelMeterReadings_header, _cancelMeterReadings_request, _cancelMeterReadings_payload, _cancelMeterReadings_reply);

            System.out.println("cancelMeterReadings._cancelMeterReadings_header=" + _cancelMeterReadings_header.value);
            System.out.println("cancelMeterReadings._cancelMeterReadings_payload=" + _cancelMeterReadings_payload.value);
            System.out.println("cancelMeterReadings._cancelMeterReadings_reply=" + _cancelMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteMeterReadings...");
        ch.iec.tc57._2011.schema.message.HeaderType _deleteMeterReadings_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deleteMeterReadings_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deleteMeterReadings_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _deleteMeterReadings_request = null;
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType _deleteMeterReadings_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> _deleteMeterReadings_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType>(_deleteMeterReadings_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deleteMeterReadings_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deleteMeterReadings(_deleteMeterReadings_header, _deleteMeterReadings_request, _deleteMeterReadings_payload, _deleteMeterReadings_reply);

            System.out.println("deleteMeterReadings._deleteMeterReadings_header=" + _deleteMeterReadings_header.value);
            System.out.println("deleteMeterReadings._deleteMeterReadings_payload=" + _deleteMeterReadings_payload.value);
            System.out.println("deleteMeterReadings._deleteMeterReadings_reply=" + _deleteMeterReadings_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
