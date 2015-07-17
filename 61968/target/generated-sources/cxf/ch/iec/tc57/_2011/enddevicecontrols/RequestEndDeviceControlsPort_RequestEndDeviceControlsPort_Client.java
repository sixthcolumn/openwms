
package ch.iec.tc57._2011.enddevicecontrols;

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
 * 2015-07-17T11:33:54.121-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class RequestEndDeviceControlsPort_RequestEndDeviceControlsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "RequestEndDeviceControls");

    private RequestEndDeviceControlsPort_RequestEndDeviceControlsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RequestEndDeviceControls.WSDL_LOCATION;
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
      
        RequestEndDeviceControls ss = new RequestEndDeviceControls(wsdlURL, SERVICE_NAME);
        RequestEndDeviceControlsPort port = ss.getRequestEndDeviceControlsPort();  
        
        {
        System.out.println("Invoking closeEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _closeEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closeEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closeEndDeviceControls_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _closeEndDeviceControls_request = null;
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _closeEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _closeEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_closeEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closeEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closeEndDeviceControls(_closeEndDeviceControls_header, _closeEndDeviceControls_request, _closeEndDeviceControls_payload, _closeEndDeviceControls_reply);

            System.out.println("closeEndDeviceControls._closeEndDeviceControls_header=" + _closeEndDeviceControls_header.value);
            System.out.println("closeEndDeviceControls._closeEndDeviceControls_payload=" + _closeEndDeviceControls_payload.value);
            System.out.println("closeEndDeviceControls._closeEndDeviceControls_reply=" + _closeEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _cancelEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _cancelEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_cancelEndDeviceControls_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _cancelEndDeviceControls_request = null;
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _cancelEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _cancelEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_cancelEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _cancelEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.cancelEndDeviceControls(_cancelEndDeviceControls_header, _cancelEndDeviceControls_request, _cancelEndDeviceControls_payload, _cancelEndDeviceControls_reply);

            System.out.println("cancelEndDeviceControls._cancelEndDeviceControls_header=" + _cancelEndDeviceControls_header.value);
            System.out.println("cancelEndDeviceControls._cancelEndDeviceControls_payload=" + _cancelEndDeviceControls_payload.value);
            System.out.println("cancelEndDeviceControls._cancelEndDeviceControls_reply=" + _cancelEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _createEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createEndDeviceControls_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _createEndDeviceControls_request = null;
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _createEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _createEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_createEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createEndDeviceControls(_createEndDeviceControls_header, _createEndDeviceControls_request, _createEndDeviceControls_payload, _createEndDeviceControls_reply);

            System.out.println("createEndDeviceControls._createEndDeviceControls_header=" + _createEndDeviceControls_header.value);
            System.out.println("createEndDeviceControls._createEndDeviceControls_payload=" + _createEndDeviceControls_payload.value);
            System.out.println("createEndDeviceControls._createEndDeviceControls_reply=" + _createEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changeEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _changeEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changeEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changeEndDeviceControls_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _changeEndDeviceControls_request = null;
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _changeEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _changeEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_changeEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changeEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changeEndDeviceControls(_changeEndDeviceControls_header, _changeEndDeviceControls_request, _changeEndDeviceControls_payload, _changeEndDeviceControls_reply);

            System.out.println("changeEndDeviceControls._changeEndDeviceControls_header=" + _changeEndDeviceControls_header.value);
            System.out.println("changeEndDeviceControls._changeEndDeviceControls_payload=" + _changeEndDeviceControls_payload.value);
            System.out.println("changeEndDeviceControls._changeEndDeviceControls_reply=" + _changeEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _deleteEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deleteEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deleteEndDeviceControls_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _deleteEndDeviceControls_request = null;
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _deleteEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _deleteEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_deleteEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deleteEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deleteEndDeviceControls(_deleteEndDeviceControls_header, _deleteEndDeviceControls_request, _deleteEndDeviceControls_payload, _deleteEndDeviceControls_reply);

            System.out.println("deleteEndDeviceControls._deleteEndDeviceControls_header=" + _deleteEndDeviceControls_header.value);
            System.out.println("deleteEndDeviceControls._deleteEndDeviceControls_payload=" + _deleteEndDeviceControls_payload.value);
            System.out.println("deleteEndDeviceControls._deleteEndDeviceControls_reply=" + _deleteEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
