
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
 * 2015-07-17T12:13:37.427-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class SendEndDeviceControlsPort_SendEndDeviceControlsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "SendEndDeviceControls");

    private SendEndDeviceControlsPort_SendEndDeviceControlsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SendEndDeviceControls.WSDL_LOCATION;
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
      
        SendEndDeviceControls ss = new SendEndDeviceControls(wsdlURL, SERVICE_NAME);
        SendEndDeviceControlsPort port = ss.getSendEndDeviceControlsPort();  
        
        {
        System.out.println("Invoking closedEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _closedEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closedEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closedEndDeviceControls_headerVal);
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _closedEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _closedEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_closedEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closedEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closedEndDeviceControls(_closedEndDeviceControls_header, _closedEndDeviceControls_payload, _closedEndDeviceControls_reply);

            System.out.println("closedEndDeviceControls._closedEndDeviceControls_header=" + _closedEndDeviceControls_header.value);
            System.out.println("closedEndDeviceControls._closedEndDeviceControls_payload=" + _closedEndDeviceControls_payload.value);
            System.out.println("closedEndDeviceControls._closedEndDeviceControls_reply=" + _closedEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking canceledEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _canceledEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _canceledEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_canceledEndDeviceControls_headerVal);
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _canceledEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _canceledEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_canceledEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _canceledEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.canceledEndDeviceControls(_canceledEndDeviceControls_header, _canceledEndDeviceControls_payload, _canceledEndDeviceControls_reply);

            System.out.println("canceledEndDeviceControls._canceledEndDeviceControls_header=" + _canceledEndDeviceControls_header.value);
            System.out.println("canceledEndDeviceControls._canceledEndDeviceControls_payload=" + _canceledEndDeviceControls_payload.value);
            System.out.println("canceledEndDeviceControls._canceledEndDeviceControls_reply=" + _canceledEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createdEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _createdEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createdEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createdEndDeviceControls_headerVal);
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _createdEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _createdEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_createdEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createdEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createdEndDeviceControls(_createdEndDeviceControls_header, _createdEndDeviceControls_payload, _createdEndDeviceControls_reply);

            System.out.println("createdEndDeviceControls._createdEndDeviceControls_header=" + _createdEndDeviceControls_header.value);
            System.out.println("createdEndDeviceControls._createdEndDeviceControls_payload=" + _createdEndDeviceControls_payload.value);
            System.out.println("createdEndDeviceControls._createdEndDeviceControls_reply=" + _createdEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deletedEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _deletedEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deletedEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deletedEndDeviceControls_headerVal);
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _deletedEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _deletedEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_deletedEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deletedEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deletedEndDeviceControls(_deletedEndDeviceControls_header, _deletedEndDeviceControls_payload, _deletedEndDeviceControls_reply);

            System.out.println("deletedEndDeviceControls._deletedEndDeviceControls_header=" + _deletedEndDeviceControls_header.value);
            System.out.println("deletedEndDeviceControls._deletedEndDeviceControls_payload=" + _deletedEndDeviceControls_payload.value);
            System.out.println("deletedEndDeviceControls._deletedEndDeviceControls_reply=" + _deletedEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changedEndDeviceControls...");
        ch.iec.tc57._2011.schema.message.HeaderType _changedEndDeviceControls_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changedEndDeviceControls_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changedEndDeviceControls_headerVal);
        ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType _changedEndDeviceControls_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType> _changedEndDeviceControls_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType>(_changedEndDeviceControls_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changedEndDeviceControls_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changedEndDeviceControls(_changedEndDeviceControls_header, _changedEndDeviceControls_payload, _changedEndDeviceControls_reply);

            System.out.println("changedEndDeviceControls._changedEndDeviceControls_header=" + _changedEndDeviceControls_header.value);
            System.out.println("changedEndDeviceControls._changedEndDeviceControls_payload=" + _changedEndDeviceControls_payload.value);
            System.out.println("changedEndDeviceControls._changedEndDeviceControls_reply=" + _changedEndDeviceControls_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
