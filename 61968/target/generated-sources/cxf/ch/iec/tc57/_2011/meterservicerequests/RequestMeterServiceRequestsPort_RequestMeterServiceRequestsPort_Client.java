
package ch.iec.tc57._2011.meterservicerequests;

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
 * 2015-07-17T12:13:37.270-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class RequestMeterServiceRequestsPort_RequestMeterServiceRequestsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterServiceRequests", "RequestMeterServiceRequests");

    private RequestMeterServiceRequestsPort_RequestMeterServiceRequestsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RequestMeterServiceRequests.WSDL_LOCATION;
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
      
        RequestMeterServiceRequests ss = new RequestMeterServiceRequests(wsdlURL, SERVICE_NAME);
        RequestMeterServiceRequestsPort port = ss.getRequestMeterServiceRequestsPort();  
        
        {
        System.out.println("Invoking createMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _createMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _createMeterServiceRequests_request = null;
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _createMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _createMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_createMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createMeterServiceRequests(_createMeterServiceRequests_header, _createMeterServiceRequests_request, _createMeterServiceRequests_payload, _createMeterServiceRequests_reply);

            System.out.println("createMeterServiceRequests._createMeterServiceRequests_header=" + _createMeterServiceRequests_header.value);
            System.out.println("createMeterServiceRequests._createMeterServiceRequests_payload=" + _createMeterServiceRequests_payload.value);
            System.out.println("createMeterServiceRequests._createMeterServiceRequests_reply=" + _createMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _deleteMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deleteMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deleteMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _deleteMeterServiceRequests_request = null;
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _deleteMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _deleteMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_deleteMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deleteMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deleteMeterServiceRequests(_deleteMeterServiceRequests_header, _deleteMeterServiceRequests_request, _deleteMeterServiceRequests_payload, _deleteMeterServiceRequests_reply);

            System.out.println("deleteMeterServiceRequests._deleteMeterServiceRequests_header=" + _deleteMeterServiceRequests_header.value);
            System.out.println("deleteMeterServiceRequests._deleteMeterServiceRequests_payload=" + _deleteMeterServiceRequests_payload.value);
            System.out.println("deleteMeterServiceRequests._deleteMeterServiceRequests_reply=" + _deleteMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changeMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _changeMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changeMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changeMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _changeMeterServiceRequests_request = null;
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _changeMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _changeMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_changeMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changeMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changeMeterServiceRequests(_changeMeterServiceRequests_header, _changeMeterServiceRequests_request, _changeMeterServiceRequests_payload, _changeMeterServiceRequests_reply);

            System.out.println("changeMeterServiceRequests._changeMeterServiceRequests_header=" + _changeMeterServiceRequests_header.value);
            System.out.println("changeMeterServiceRequests._changeMeterServiceRequests_payload=" + _changeMeterServiceRequests_payload.value);
            System.out.println("changeMeterServiceRequests._changeMeterServiceRequests_reply=" + _changeMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _cancelMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _cancelMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_cancelMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _cancelMeterServiceRequests_request = null;
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _cancelMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _cancelMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_cancelMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _cancelMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.cancelMeterServiceRequests(_cancelMeterServiceRequests_header, _cancelMeterServiceRequests_request, _cancelMeterServiceRequests_payload, _cancelMeterServiceRequests_reply);

            System.out.println("cancelMeterServiceRequests._cancelMeterServiceRequests_header=" + _cancelMeterServiceRequests_header.value);
            System.out.println("cancelMeterServiceRequests._cancelMeterServiceRequests_payload=" + _cancelMeterServiceRequests_payload.value);
            System.out.println("cancelMeterServiceRequests._cancelMeterServiceRequests_reply=" + _cancelMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking closeMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _closeMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closeMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closeMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _closeMeterServiceRequests_request = null;
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _closeMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _closeMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_closeMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closeMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closeMeterServiceRequests(_closeMeterServiceRequests_header, _closeMeterServiceRequests_request, _closeMeterServiceRequests_payload, _closeMeterServiceRequests_reply);

            System.out.println("closeMeterServiceRequests._closeMeterServiceRequests_header=" + _closeMeterServiceRequests_header.value);
            System.out.println("closeMeterServiceRequests._closeMeterServiceRequests_payload=" + _closeMeterServiceRequests_payload.value);
            System.out.println("closeMeterServiceRequests._closeMeterServiceRequests_reply=" + _closeMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
