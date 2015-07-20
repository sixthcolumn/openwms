package com.sixthc.request;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-20T09:15:25.200-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://sixthc.com/Request", name = "Request_Port")
@XmlSeeAlso({ch.iec.tc57._2011.schema.message.ObjectFactory.class, ObjectFactory.class, ch.iec.tc57._2011.enddevicecontrolsmessage.ObjectFactory.class, ch.iec.tc57._2011.enddevicecontrols.ObjectFactory.class, ch.iec.tc57._2011.enddeviceevents.ObjectFactory.class, ch.iec.tc57._2011.meterreadingsmessage.ObjectFactory.class, ch.iec.tc57._2011.meterservicerequestsmessage.ObjectFactory.class, ch.iec.tc57._2011.enddeviceeventsmessage.ObjectFactory.class, ch.iec.tc57._2011.meterreadschedulemessage.ObjectFactory.class, ch.iec.tc57._2011.meterreadschedule.ObjectFactory.class, ch.iec.tc57._2011.meterreadings.ObjectFactory.class, ch.iec.tc57._2011.meterservicerequests.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RequestPort {

    @WebResult(name = "ResponseMessage", targetNamespace = "http://sixthc.com/Request", partName = "ResponseMessage")
    @WebMethod(operationName = "RequestEndDeviceEvents", action = "http://com.sixthc/Request/RequestEndDeviceEvents")
    public ch.iec.tc57._2011.schema.message.ReplyType requestEndDeviceEvents(
        @WebParam(partName = "EndDeviceEventsPayload", name = "EndDeviceEventsPayloadMessage", targetNamespace = "http://sixthc.com/Request")
        EndDeviceEventsPayload endDeviceEventsPayload
    ) throws FaultMessage;

    @WebResult(name = "ResponseMessage", targetNamespace = "http://sixthc.com/Request", partName = "ResponseMessage")
    @WebMethod(operationName = "RequestMeterServiceRequests", action = "http://com.sixthc/Request/RequestMeterServiceRequests")
    public ch.iec.tc57._2011.schema.message.ReplyType requestMeterServiceRequests(
        @WebParam(partName = "MeterServiceRequestsPayload", name = "MeterServiceRequestsPayloadMessage", targetNamespace = "http://sixthc.com/Request")
        MeterServiceRequestsPayload meterServiceRequestsPayload
    ) throws FaultMessage;

    @WebResult(name = "ResponseMessage", targetNamespace = "http://sixthc.com/Request", partName = "ResponseMessage")
    @WebMethod(operationName = "RequestEndDeviceControls", action = "http://com.sixthc/Request/RequestEndDeviceControls")
    public ch.iec.tc57._2011.schema.message.ReplyType requestEndDeviceControls(
        @WebParam(partName = "EndDevicePayload", name = "EndDeviceControlsPayloadMessage", targetNamespace = "http://sixthc.com/Request")
        EndDeviceControlsPayload endDevicePayload
    ) throws FaultMessage;

    @WebResult(name = "ResponseMessage", targetNamespace = "http://sixthc.com/Request", partName = "ResponseMessage")
    @WebMethod(operationName = "RequestMeterReadings", action = "http://com.sixthc/Request/RequestMeterReadings")
    public ch.iec.tc57._2011.schema.message.ReplyType requestMeterReadings(
        @WebParam(partName = "MeterReadingsPayload", name = "MeterReadingsPayloadMessage", targetNamespace = "http://sixthc.com/Request")
        MeterReadingsPayload meterReadingsPayload
    ) throws FaultMessage;

    @WebResult(name = "ResponseMessage", targetNamespace = "http://sixthc.com/Request", partName = "ResponseMessage")
    @WebMethod(operationName = "RequestMeterReadSchedule", action = "http://com.sixthc/Request/RequestMeterReadSchedule")
    public ch.iec.tc57._2011.schema.message.ReplyType requestMeterReadSchedule(
        @WebParam(partName = "MeterReadSchedulePayload", name = "MeterReadSchedulePayloadMessage", targetNamespace = "http://sixthc.com/Request")
        MeterReadSchedulePayload meterReadSchedulePayload
    ) throws FaultMessage;
}
