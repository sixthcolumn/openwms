package ch.iec.tc57._2011.meterreadings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T11:33:52.100-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2011/MeterReadings", name = "GetMeterReadings_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ch.iec.tc57._2011.meterreadingsmessage.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetMeterReadingsPort {

    @WebResult(name = "MeterReadingsResponseMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", partName = "ResponseMessage")
    @WebMethod(operationName = "GetMeterReadings", action = "http://iec.ch/TC57/2011/GetMeterReadings/GetMeterReadings")
    public ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType getMeterReadings(
        @WebParam(partName = "GetMeterReadingsRequestMessage", name = "MeterReadingsRequestMessage", targetNamespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage")
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType getMeterReadingsRequestMessage
    ) throws FaultMessage;
}
