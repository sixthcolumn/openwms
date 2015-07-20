
package ch.iec.tc57._2011.meterreadschedule;

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
 * 2015-07-20T09:15:19.163-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class SendMeterReadSchedulePort_SendMeterReadSchedulePort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadSchedule", "SendMeterReadSchedule");

    private SendMeterReadSchedulePort_SendMeterReadSchedulePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SendMeterReadSchedule.WSDL_LOCATION;
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
      
        SendMeterReadSchedule ss = new SendMeterReadSchedule(wsdlURL, SERVICE_NAME);
        SendMeterReadSchedulePort port = ss.getSendMeterReadSchedulePort();  
        
        {
        System.out.println("Invoking closedMeterReadSchedule...");
        ch.iec.tc57._2011.schema.message.HeaderType _closedMeterReadSchedule_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closedMeterReadSchedule_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closedMeterReadSchedule_headerVal);
        ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType _closedMeterReadSchedule_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> _closedMeterReadSchedule_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType>(_closedMeterReadSchedule_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closedMeterReadSchedule_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closedMeterReadSchedule(_closedMeterReadSchedule_header, _closedMeterReadSchedule_payload, _closedMeterReadSchedule_reply);

            System.out.println("closedMeterReadSchedule._closedMeterReadSchedule_header=" + _closedMeterReadSchedule_header.value);
            System.out.println("closedMeterReadSchedule._closedMeterReadSchedule_payload=" + _closedMeterReadSchedule_payload.value);
            System.out.println("closedMeterReadSchedule._closedMeterReadSchedule_reply=" + _closedMeterReadSchedule_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changedMeterReadSchedule...");
        ch.iec.tc57._2011.schema.message.HeaderType _changedMeterReadSchedule_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changedMeterReadSchedule_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changedMeterReadSchedule_headerVal);
        ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType _changedMeterReadSchedule_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> _changedMeterReadSchedule_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType>(_changedMeterReadSchedule_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changedMeterReadSchedule_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changedMeterReadSchedule(_changedMeterReadSchedule_header, _changedMeterReadSchedule_payload, _changedMeterReadSchedule_reply);

            System.out.println("changedMeterReadSchedule._changedMeterReadSchedule_header=" + _changedMeterReadSchedule_header.value);
            System.out.println("changedMeterReadSchedule._changedMeterReadSchedule_payload=" + _changedMeterReadSchedule_payload.value);
            System.out.println("changedMeterReadSchedule._changedMeterReadSchedule_reply=" + _changedMeterReadSchedule_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createdMeterReadSchedule...");
        ch.iec.tc57._2011.schema.message.HeaderType _createdMeterReadSchedule_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createdMeterReadSchedule_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createdMeterReadSchedule_headerVal);
        ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType _createdMeterReadSchedule_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> _createdMeterReadSchedule_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType>(_createdMeterReadSchedule_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createdMeterReadSchedule_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createdMeterReadSchedule(_createdMeterReadSchedule_header, _createdMeterReadSchedule_payload, _createdMeterReadSchedule_reply);

            System.out.println("createdMeterReadSchedule._createdMeterReadSchedule_header=" + _createdMeterReadSchedule_header.value);
            System.out.println("createdMeterReadSchedule._createdMeterReadSchedule_payload=" + _createdMeterReadSchedule_payload.value);
            System.out.println("createdMeterReadSchedule._createdMeterReadSchedule_reply=" + _createdMeterReadSchedule_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking canceledMeterReadSchedule...");
        ch.iec.tc57._2011.schema.message.HeaderType _canceledMeterReadSchedule_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _canceledMeterReadSchedule_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_canceledMeterReadSchedule_headerVal);
        ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType _canceledMeterReadSchedule_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> _canceledMeterReadSchedule_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType>(_canceledMeterReadSchedule_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _canceledMeterReadSchedule_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.canceledMeterReadSchedule(_canceledMeterReadSchedule_header, _canceledMeterReadSchedule_payload, _canceledMeterReadSchedule_reply);

            System.out.println("canceledMeterReadSchedule._canceledMeterReadSchedule_header=" + _canceledMeterReadSchedule_header.value);
            System.out.println("canceledMeterReadSchedule._canceledMeterReadSchedule_payload=" + _canceledMeterReadSchedule_payload.value);
            System.out.println("canceledMeterReadSchedule._canceledMeterReadSchedule_reply=" + _canceledMeterReadSchedule_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deletedMeterReadSchedule...");
        ch.iec.tc57._2011.schema.message.HeaderType _deletedMeterReadSchedule_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deletedMeterReadSchedule_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deletedMeterReadSchedule_headerVal);
        ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType _deletedMeterReadSchedule_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> _deletedMeterReadSchedule_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType>(_deletedMeterReadSchedule_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deletedMeterReadSchedule_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deletedMeterReadSchedule(_deletedMeterReadSchedule_header, _deletedMeterReadSchedule_payload, _deletedMeterReadSchedule_reply);

            System.out.println("deletedMeterReadSchedule._deletedMeterReadSchedule_header=" + _deletedMeterReadSchedule_header.value);
            System.out.println("deletedMeterReadSchedule._deletedMeterReadSchedule_payload=" + _deletedMeterReadSchedule_payload.value);
            System.out.println("deletedMeterReadSchedule._deletedMeterReadSchedule_reply=" + _deletedMeterReadSchedule_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
