package ch.iec.tc57._2011.meterservicerequests;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2014-11-06T16:00:45.431-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/MeterServiceRequests", name = "GetMeterServiceRequests_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.meterservicerequestsmessage.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetMeterServiceRequestsPort {

    @WebResult(name = "MeterServiceRequestsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", partName = "ResponseMessage")
    @WebMethod(operationName = "GetMeterServiceRequests", action = "http://iec.ch/TC57/2011/GetMeterServiceRequests/GetMeterServiceRequests")
    public ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType getMeterServiceRequests(
        @WebParam(partName = "GetMeterServiceRequestsRequestMessage", name = "MeterServiceRequestsRequestMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage")
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType getMeterServiceRequestsRequestMessage
    ) throws FaultMessage;
}
