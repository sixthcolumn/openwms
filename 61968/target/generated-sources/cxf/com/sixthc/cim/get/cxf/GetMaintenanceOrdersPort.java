package com.sixthc.cim.get.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-20T09:15:16.342-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrders", name = "GetMaintenanceOrders_Port")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetMaintenanceOrdersPort {

    @WebResult(name = "GetMaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", partName = "GetMaintenanceOrdersResponseMessage")
    @WebMethod(operationName = "GetMaintenanceOrders", action = "http://iec.ch/TC57/2015/GetMaintenanceOrders/GetMaintenanceOrders")
    public GetMaintenanceOrdersResponseMessageType getMaintenanceOrders(
        @WebParam(partName = "GetMaintenanceOrdersRequestMessage", name = "GetMaintenanceOrdersRequestMessage", targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage")
        GetMaintenanceOrdersRequestMessageType getMaintenanceOrdersRequestMessage
    ) throws GetMaintenanceOrdersFaultMessage;
}
