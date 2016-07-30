package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import com.sixthc.cim.createServiceOrders.HeaderType;
import com.sixthc.cim.createServiceOrders.ReplyType;
import com.sixthc.cim.createServiceOrders.RequestType;
import com.sixthc.cim.createServiceOrders.cxf.FaultMessage;
import com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersPayloadType;
import com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersPort;

public class ExecuteServiceOrderCreate implements ServiceOrdersPort{

	@Override
	public void createServiceOrders(Holder<HeaderType> header,
			RequestType request, Holder<ServiceOrdersPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

}
