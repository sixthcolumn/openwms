package ch.iec.tc57._2011.meterservicerequests;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2014-11-06T16:00:46.309-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/MeterServiceRequests", name = "RequestMeterServiceRequests_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.meterservicerequestsmessage.ObjectFactory.class, ObjectFactory.class})
public interface RequestMeterServiceRequestsPort {

    @RequestWrapper(localName = "CreateMeterServiceRequests", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType")
    @WebMethod(operationName = "CreateMeterServiceRequests", action = "http://iec.ch/TC57/2011/MeterServiceRequests/CreateMeterServiceRequests")
    @ResponseWrapper(localName = "MeterServiceRequestsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType")
    public void createMeterServiceRequests(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeleteMeterServiceRequests", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType")
    @WebMethod(operationName = "DeleteMeterServiceRequests", action = "http://iec.ch/TC57/2011/MeterServiceRequests/DeleteMeterServiceRequests")
    @ResponseWrapper(localName = "MeterServiceRequestsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType")
    public void deleteMeterServiceRequests(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ChangeMeterServiceRequests", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType")
    @WebMethod(operationName = "ChangeMeterServiceRequests", action = "http://iec.ch/TC57/2011/MeterServiceRequests/ChangeMeterServiceRequests")
    @ResponseWrapper(localName = "MeterServiceRequestsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType")
    public void changeMeterServiceRequests(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CancelMeterServiceRequests", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType")
    @WebMethod(operationName = "CancelMeterServiceRequests", action = "http://iec.ch/TC57/2011/MeterServiceRequests/CancelMeterServiceRequests")
    @ResponseWrapper(localName = "MeterServiceRequestsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType")
    public void cancelMeterServiceRequests(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CloseMeterServiceRequests", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType")
    @WebMethod(operationName = "CloseMeterServiceRequests", action = "http://iec.ch/TC57/2011/MeterServiceRequests/CloseMeterServiceRequests")
    @ResponseWrapper(localName = "MeterServiceRequestsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", className = "ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType")
    public void closeMeterServiceRequests(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
