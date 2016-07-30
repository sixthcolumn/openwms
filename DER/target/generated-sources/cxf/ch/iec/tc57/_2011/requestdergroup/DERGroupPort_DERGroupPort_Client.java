
package ch.iec.tc57._2011.requestdergroup;

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
 * 2015-12-09T08:35:01.293-05:00
 * Generated source version: 2.4.1
 * 
 */
public final class DERGroupPort_DERGroupPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/RequestDERGroup", "RequestDERGroup");

    private DERGroupPort_DERGroupPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RequestDERGroup.WSDL_LOCATION;
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
      
        RequestDERGroup ss = new RequestDERGroup(wsdlURL, SERVICE_NAME);
        DERGroupPort port = ss.getDERGroupPort();  
        
        {
        System.out.println("Invoking deleteDERGroup...");
        ch.iec.tc57._2011.schema.message.HeaderType _deleteDERGroup_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deleteDERGroup_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deleteDERGroup_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _deleteDERGroup_request = null;
        ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType _deleteDERGroup_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType> _deleteDERGroup_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType>(_deleteDERGroup_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deleteDERGroup_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deleteDERGroup(_deleteDERGroup_header, _deleteDERGroup_request, _deleteDERGroup_payload, _deleteDERGroup_reply);

            System.out.println("deleteDERGroup._deleteDERGroup_header=" + _deleteDERGroup_header.value);
            System.out.println("deleteDERGroup._deleteDERGroup_payload=" + _deleteDERGroup_payload.value);
            System.out.println("deleteDERGroup._deleteDERGroup_reply=" + _deleteDERGroup_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelDERGroup...");
        ch.iec.tc57._2011.schema.message.HeaderType _cancelDERGroup_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _cancelDERGroup_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_cancelDERGroup_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _cancelDERGroup_request = null;
        ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType _cancelDERGroup_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType> _cancelDERGroup_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType>(_cancelDERGroup_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _cancelDERGroup_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.cancelDERGroup(_cancelDERGroup_header, _cancelDERGroup_request, _cancelDERGroup_payload, _cancelDERGroup_reply);

            System.out.println("cancelDERGroup._cancelDERGroup_header=" + _cancelDERGroup_header.value);
            System.out.println("cancelDERGroup._cancelDERGroup_payload=" + _cancelDERGroup_payload.value);
            System.out.println("cancelDERGroup._cancelDERGroup_reply=" + _cancelDERGroup_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changeDERGroup...");
        ch.iec.tc57._2011.schema.message.HeaderType _changeDERGroup_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changeDERGroup_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changeDERGroup_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _changeDERGroup_request = null;
        ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType _changeDERGroup_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType> _changeDERGroup_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType>(_changeDERGroup_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changeDERGroup_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changeDERGroup(_changeDERGroup_header, _changeDERGroup_request, _changeDERGroup_payload, _changeDERGroup_reply);

            System.out.println("changeDERGroup._changeDERGroup_header=" + _changeDERGroup_header.value);
            System.out.println("changeDERGroup._changeDERGroup_payload=" + _changeDERGroup_payload.value);
            System.out.println("changeDERGroup._changeDERGroup_reply=" + _changeDERGroup_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createDERGroup...");
        ch.iec.tc57._2011.schema.message.HeaderType _createDERGroup_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createDERGroup_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createDERGroup_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _createDERGroup_request = null;
        ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType _createDERGroup_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType> _createDERGroup_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType>(_createDERGroup_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createDERGroup_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createDERGroup(_createDERGroup_header, _createDERGroup_request, _createDERGroup_payload, _createDERGroup_reply);

            System.out.println("createDERGroup._createDERGroup_header=" + _createDERGroup_header.value);
            System.out.println("createDERGroup._createDERGroup_payload=" + _createDERGroup_payload.value);
            System.out.println("createDERGroup._createDERGroup_reply=" + _createDERGroup_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking closeDERGroup...");
        ch.iec.tc57._2011.schema.message.HeaderType _closeDERGroup_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closeDERGroup_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closeDERGroup_headerVal);
        ch.iec.tc57._2011.schema.message.RequestType _closeDERGroup_request = null;
        ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType _closeDERGroup_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType> _closeDERGroup_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.dergroupmessage.DERGroupPayloadType>(_closeDERGroup_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closeDERGroup_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closeDERGroup(_closeDERGroup_header, _closeDERGroup_request, _closeDERGroup_payload, _closeDERGroup_reply);

            System.out.println("closeDERGroup._closeDERGroup_header=" + _closeDERGroup_header.value);
            System.out.println("closeDERGroup._closeDERGroup_payload=" + _closeDERGroup_payload.value);
            System.out.println("closeDERGroup._closeDERGroup_reply=" + _closeDERGroup_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
