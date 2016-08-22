package ch.iec.tc57._2011.getdergroupstatus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-12-09T08:35:01.515-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatus", name = "GetDERGroupStatus_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.getdergroupstatusmessage.ObjectFactory.class, com.epri._2013.derstatus.ObjectFactory.class})
public interface GetDERGroupStatusPort {

    @RequestWrapper(localName = "GetDERGroupStatus", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage", className = "ch.iec.tc57._2011.getdergroupstatusmessage.GetDERGroupStatusRequestMessageType")
    @WebMethod(operationName = "GetDERGroupStatus", action = "http://iec.ch/TC57/2011/GetDERGroupStatus/GetDERGroupStatus")
    @ResponseWrapper(localName = "DERGroupStatusResponseMessage", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage", className = "ch.iec.tc57._2011.getdergroupstatusmessage.DERGroupStatusResponseMessageType")
    public void getDERGroupStatus(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage")
        ch.iec.tc57._2011.getdergroupstatusmessage.GetDERGroupStatusRequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.getdergroupstatusmessage.DERGroupStatusPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}