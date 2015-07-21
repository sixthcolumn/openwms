package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import com.sixthc.cim.create.cxf.FaultMessage;
import com.sixthc.cim.create.cxf.MaintenanceOrdersPayloadType;
import com.sixthc.cim.create.cxf.MaintenanceOrdersPort;
import com.sixthc.cim.create2.HeaderType;
import com.sixthc.cim.create2.ReplyType;
import com.sixthc.cim.create2.RequestType;
import com.sixthc.client.ExecuteMaintOrderCreateClient;

public class RequestExecuteMaintOrderCreateImpl implements MaintenanceOrdersPort{
	private static org.apache.log4j.Logger log = Logger
	.getLogger(RequestExecuteMaintOrderCreateImpl.class);
	
	private ExecuteMaintOrderCreateClient client;
	
	public ExecuteMaintOrderCreateClient getClient() {
		return client;
	}
	
	public void setClient(ExecuteMaintOrderCreateClient client) {
		this.client = client;
	}
	
	@Override
	public void createMaintenanceOrders(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrdersPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		log.debug("createMaintenanceOrders called");
		
		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.setRequest(request);
		client.create();
		
		payload.value = client.getPayload();
		
		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}

}
