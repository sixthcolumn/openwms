
package ch.iec.tc57._2011.getdergroup;

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
 * 2015-12-09T08:35:01.058-05:00
 * Generated source version: 2.4.1
 * 
 */
public final class GetDERGroupPort_GetDERGroupPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/GetDERGroup", "GetDERGroup");

    private GetDERGroupPort_GetDERGroupPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GetDERGroup.WSDL_LOCATION;
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
      
        GetDERGroup ss = new GetDERGroup(wsdlURL, SERVICE_NAME);
        GetDERGroupPort port = ss.getGetDERGroupPort();  
        
        {
        System.out.println("Invoking getDERGroup...");
        ch.iec.tc57._2011.schema.message.HeaderType _getDERGroup_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _getDERGroup_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_getDERGroup_headerVal);
        ch.iec.tc57._2011.getdergroupmessage.GetDERGroupRequestType _getDERGroup_request = null;
        ch.iec.tc57._2011.getdergroupmessage.DERGroupPayloadType _getDERGroup_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.getdergroupmessage.DERGroupPayloadType> _getDERGroup_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.getdergroupmessage.DERGroupPayloadType>(_getDERGroup_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _getDERGroup_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.getDERGroup(_getDERGroup_header, _getDERGroup_request, _getDERGroup_payload, _getDERGroup_reply);

            System.out.println("getDERGroup._getDERGroup_header=" + _getDERGroup_header.value);
            System.out.println("getDERGroup._getDERGroup_payload=" + _getDERGroup_payload.value);
            System.out.println("getDERGroup._getDERGroup_reply=" + _getDERGroup_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
