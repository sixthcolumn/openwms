package ch.iec.tc57._2011.enddeviceevents;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-05-14T11:18:32.658-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/EndDeviceEvents", name = "RequestEndDeviceEvents_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ObjectFactory.class, ch.iec.tc57._2011.enddeviceeventsmessage.ObjectFactory.class})
public interface RequestEndDeviceEventsPort {

    @RequestWrapper(localName = "CancelEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsRequestMessageType")
    @WebMethod(operationName = "CancelEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/CancelEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void cancelEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CreateEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsRequestMessageType")
    @WebMethod(operationName = "CreateEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/CreateEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void createEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CloseEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsRequestMessageType")
    @WebMethod(operationName = "CloseEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/CloseEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void closeEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ChangeEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsRequestMessageType")
    @WebMethod(operationName = "ChangeEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/ChangeEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void changeEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeleteEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsRequestMessageType")
    @WebMethod(operationName = "DeleteEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/DeleteEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void deleteEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        ch.iec.tc57._2011.schema.message.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
