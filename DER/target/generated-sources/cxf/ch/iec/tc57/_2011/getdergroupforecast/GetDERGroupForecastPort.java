package ch.iec.tc57._2011.getdergroupforecast;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-12-09T08:35:02.380-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecast", name = "GetDERGroupForecast_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.getdergroupforecastmessage.ObjectFactory.class, com.epri._2013.dergroupforecast.ObjectFactory.class})
public interface GetDERGroupForecastPort {

    @RequestWrapper(localName = "GetDERGroupForecast", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage", className = "ch.iec.tc57._2011.getdergroupforecastmessage.GetDERGroupForecastRequestMessageType")
    @WebMethod(operationName = "GetDERGroupForecast", action = "http://iec.ch/TC57/2011/GetDERGroupForecast/GetDERGroupForecast")
    @ResponseWrapper(localName = "DERGroupForecastResponseMessage", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage", className = "ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastResponseMessageType")
    public void getDERGroupForecast(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage")
        ch.iec.tc57._2011.getdergroupforecastmessage.GetDERGroupForecastRequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage")
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> reply
    ) throws FaultMessage;
}
