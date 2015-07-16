package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import com.sixthc.cim.delete.cxf.FaultMessage;
import com.sixthc.cim.delete.cxf.HeaderType;
import com.sixthc.cim.delete.cxf.MaintenanceOrdersPayloadType;
import com.sixthc.cim.delete.cxf.MaintenanceOrdersPort;
import com.sixthc.cim.delete.cxf.ReplyType;
import com.sixthc.cim.delete.cxf.RequestType;
import com.sixthc.client.ExecuteMaintOrderChangeDeleteClient;

public class RequestExecuteMaintOrderChangeDeleteImpl implements MaintenanceOrdersPort{
	private static org.apache.log4j.Logger log = Logger
	.getLogger(RequestExecuteMaintOrderChangeDeleteImpl.class);
	
	private ExecuteMaintOrderChangeDeleteClient client;
	
	public ExecuteMaintOrderChangeDeleteClient getClient() {
		return client;
	}
	
	public void setClient(ExecuteMaintOrderChangeDeleteClient client) {
		this.client = client;
	}

	@Override
	public void changeMaintenanceOrders(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrdersPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		log.debug("changeMaintenanceOrders called");
		
		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.setRequest(request);
		client.change();
		
		payload.value = client.getPayload();
		
		reply.value = new ReplyType();
		reply.value.setResult("OK");
	}

	@Override
	public void deleteMaintenanceOrders(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrdersPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		log.debug("deleteMaintenanceOrders called");
		
		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.setRequest(request);
		client.delete();
		
		payload.value = client.getPayload();
		
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		
	}

}
