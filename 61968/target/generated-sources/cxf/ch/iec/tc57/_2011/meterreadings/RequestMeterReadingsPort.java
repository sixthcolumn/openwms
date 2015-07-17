package ch.iec.tc57._2011.meterreadings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T11:33:52.790-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/MeterReadings", name = "RequestMeterReadings_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.meterreadingsmessage.ObjectFactory.class, ObjectFactory.class})
public interface RequestMeterReadingsPort {

    @RequestWrapper(localName = "CloseMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType")
    @WebMethod(operationName = "CloseMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/CloseMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void closeMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CreateMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType")
    @WebMethod(operationName = "CreateMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/CreateMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void createMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ChangeMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType")
    @WebMethod(operationName = "ChangeMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/ChangeMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void changeMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CancelMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType")
    @WebMethod(operationName = "CancelMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/CancelMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void cancelMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeleteMeterReadings", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType")
    @WebMethod(operationName = "DeleteMeterReadings", action = "http://iec.ch/TC57/2011/MeterReadings/DeleteMeterReadings")
    @ResponseWrapper(localName = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", className = "ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType")
    public void deleteMeterReadings(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
