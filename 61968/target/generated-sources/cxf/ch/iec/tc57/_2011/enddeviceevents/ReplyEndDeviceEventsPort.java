package ch.iec.tc57._2011.enddeviceevents;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-05-09T09:21:14.036-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/EndDeviceEvents", name = "ReplyEndDeviceEvents_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ObjectFactory.class, ch.iec.tc57._2011.enddeviceeventsmessage.ObjectFactory.class})
public interface ReplyEndDeviceEventsPort {

    @RequestWrapper(localName = "CanceledEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType")
    @WebMethod(operationName = "CanceledEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/CanceledEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void canceledEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeletedEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType")
    @WebMethod(operationName = "DeletedEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/DeletedEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void deletedEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ChangedEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType")
    @WebMethod(operationName = "ChangedEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/ChangedEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void changedEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "CreatedEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType")
    @WebMethod(operationName = "CreatedEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/CreatedEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void createdEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "ClosedEndDeviceEvents", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType")
    @WebMethod(operationName = "ClosedEndDeviceEvents", action = "http://iec.ch/TC57/2011/EndDeviceEvents/ClosedEndDeviceEvents")
    @ResponseWrapper(localName = "EndDeviceEventsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage", className = "ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType")
    public void closedEndDeviceEvents(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
