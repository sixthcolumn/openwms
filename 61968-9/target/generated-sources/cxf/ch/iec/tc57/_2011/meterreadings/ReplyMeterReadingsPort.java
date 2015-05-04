package ch.iec.tc57._2011.meterreadings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2014-11-06T16:00:44.444-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/MeterReadings", name = "ReplyMeterReadings_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.meterreadingsmessage.ObjectFactory.class, ObjectFactory.class})
public interface ReplyMeterReadingsPort {

    @RequestWrapper(localName = "ChangedMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType")
    @WebMethod(operationName = "ChangedMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/ChangedMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void changedMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ClosedMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType")
    @WebMethod(operationName = "ClosedMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/ClosedMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void closedMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeletedMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType")
    @WebMethod(operationName = "DeletedMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/DeletedMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void deletedMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CanceledMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType")
    @WebMethod(operationName = "CanceledMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/CanceledMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void canceledMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CreatedMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType")
    @WebMethod(operationName = "CreatedMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/CreatedMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void createdMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
