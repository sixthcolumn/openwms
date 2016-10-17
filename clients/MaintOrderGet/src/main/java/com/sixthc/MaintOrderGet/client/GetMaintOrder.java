package com.sixthc.MaintOrderGet.client;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;

import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2015.getmaintenanceorders.GetMaintenanceOrders;
import ch.iec.tc57._2015.getmaintenanceorders.MaintenanceOrder;
import ch.iec.tc57._2015.getmaintenanceordersmessage.GetMaintenanceOrdersRequestMessageType;
import ch.iec.tc57._2015.getmaintenanceordersmessage.GetMaintenanceOrdersRequestType;
import ch.iec.tc57._2015.getmaintenanceordersmessage.GetMaintenanceOrdersResponseMessageType;
import ch.iec.tc57._2015.getmaintenanceordersmessage.MaintenanceOrdersPayloadType;

import com.sixthc.server.ws.GetMaintOrdersService;
import com.sixthc.server.ws.GetMaintenanceOrdersPort;

public class GetMaintOrder {

	public static void main(String[] args) {
		GetMaintOrder order = new GetMaintOrder();
		order.get(args[0], args[1]);
	}
	
	public void get(String url, String orderNumber) {
		URL wsdlLocation;
		try {
			wsdlLocation = new URL(url + "?wsdl");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		
		GetMaintOrdersService client = null;
		try {
		client = new GetMaintOrdersService(wsdlLocation);
		} catch (Exception ce) {
			System.out.println("Operation failed : " + ce.getMessage());
			System.exit(1);
		}
		GetMaintenanceOrdersPort port = client.getGetMaintOrdersPort();
		
		// change url if asked to
		if (url != null) {
			BindingProvider provider = (BindingProvider) port;
			provider.getRequestContext().put(
					BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		}
		
		GetMaintenanceOrdersRequestMessageType msg = new GetMaintenanceOrdersRequestMessageType();
		msg.setHeader(new HeaderType());
		msg.getHeader().setVerb("get");
		msg.getHeader().setNoun("noun");
		
		GetMaintenanceOrdersRequestType r = new GetMaintenanceOrdersRequestType();
		GetMaintenanceOrders mos = new GetMaintenanceOrders();	
		MaintenanceOrder mo = new MaintenanceOrder();
		mo.setMRID(orderNumber);
		mos.getMaintenanceOrder().add(mo);
		r.setGetMaintenanceOrders(mos);
		
		r.setGetMaintenanceOrders(mos);
		msg.setRequest(r);
		
		
		try {
			// get from remote
			GetMaintenanceOrdersResponseMessageType reply = port.getMaintenanceOrders(msg);
			reply.getReply().getResult();
			MaintenanceOrdersPayloadType payload = reply.getPayload();

			
			// for now we just print out the xml
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(MaintenanceOrdersPayloadType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(payload, writer);
			System.out.println(writer.toString());
			
		} catch (Exception e) {
			System.out.println("Operation failed : " + e.getMessage());
		}
	}

}
