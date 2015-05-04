package ch.iec.tc57._2011.meterreadschedule;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2014-11-06T16:00:47.758-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/MeterReadSchedule", name = "ReplyMeterReadSchedule_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.meterreadschedulemessage.ObjectFactory.class, ObjectFactory.class})
public interface ReplyMeterReadSchedulePort {

    @RequestWrapper(localName = "ClosedMeterReadSchedule", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType")
    @WebMethod(operationName = "ClosedMeterReadSchedule", action = "http://iec.ch/TC57/2011/MeterReadSchedule/ClosedMeterReadSchedule")
    @ResponseWrapper(localName = "MeterReadScheduleResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleResponseMessageType")
    public void closedMeterReadSchedule(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ChangedMeterReadSchedule", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType")
    @WebMethod(operationName = "ChangedMeterReadSchedule", action = "http://iec.ch/TC57/2011/MeterReadSchedule/ChangedMeterReadSchedule")
    @ResponseWrapper(localName = "MeterReadScheduleResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleResponseMessageType")
    public void changedMeterReadSchedule(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CreatedMeterReadSchedule", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType")
    @WebMethod(operationName = "CreatedMeterReadSchedule", action = "http://iec.ch/TC57/2011/MeterReadSchedule/CreatedMeterReadSchedule")
    @ResponseWrapper(localName = "MeterReadScheduleResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleResponseMessageType")
    public void createdMeterReadSchedule(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CanceledMeterReadSchedule", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType")
    @WebMethod(operationName = "CanceledMeterReadSchedule", action = "http://iec.ch/TC57/2011/MeterReadSchedule/CanceledMeterReadSchedule")
    @ResponseWrapper(localName = "MeterReadScheduleResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleResponseMessageType")
    public void canceledMeterReadSchedule(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeletedMeterReadSchedule", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType")
    @WebMethod(operationName = "DeletedMeterReadSchedule", action = "http://iec.ch/TC57/2011/MeterReadSchedule/DeletedMeterReadSchedule")
    @ResponseWrapper(localName = "MeterReadScheduleResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", className = "ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleResponseMessageType")
    public void deletedMeterReadSchedule(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
