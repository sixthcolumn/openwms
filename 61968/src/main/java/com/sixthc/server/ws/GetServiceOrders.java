package com.sixthc.server.ws;

import com.sixthc.cim.getServiceOrders.cxf.GetServiceOrdersFaultMessage;
import com.sixthc.cim.getServiceOrders.cxf.GetServiceOrdersPort;
import com.sixthc.cim.getServiceOrders.cxf.GetServiceOrdersRequestMessageType;
import com.sixthc.cim.getServiceOrders.cxf.GetServiceOrdersResponseMessageType;

public class GetServiceOrders implements GetServiceOrdersPort{

	@Override
	public GetServiceOrdersResponseMessageType getServiceOrders(
			GetServiceOrdersRequestMessageType getServiceOrdersRequestMessage)
			throws GetServiceOrdersFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

}
