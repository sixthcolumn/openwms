package com.sixthc.ServiceOrderGet.client;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;

import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2015.getserviceorders.GetServiceOrders;
import ch.iec.tc57._2015.getserviceorders.ServiceOrder;
import ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersRequestMessageType;
import ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersRequestType;
import ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersResponseMessageType;
import ch.iec.tc57._2015.getserviceordersmessage.ServiceOrdersPayloadType;

import com.sixthc.server.ws.GetServiceOrdersPort;
import com.sixthc.server.ws.GetServiceOrdersService;

public class GetServiceOrder {

	public static void main(String[] args) {
		GetServiceOrder order = new GetServiceOrder();
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
		
		GetServiceOrdersService client = null;
		try {
		client = new GetServiceOrdersService(wsdlLocation);
		} catch (Exception ce) {
			System.out.println("Operation failed : " + ce.getMessage());
			System.exit(1);
		}
		GetServiceOrdersPort port = client.getGetServiceOrdersPort();
		
		// change url if asked to
		if (url != null) {
			BindingProvider provider = (BindingProvider) port;
			provider.getRequestContext().put(
					BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		}
		
		GetServiceOrdersRequestMessageType msg = new GetServiceOrdersRequestMessageType();
		msg.setHeader(new HeaderType());
		msg.getHeader().setVerb("get");
		msg.getHeader().setNoun("noun");
		
		GetServiceOrdersRequestType r = new GetServiceOrdersRequestType();
		GetServiceOrders mos = new GetServiceOrders();	
		ServiceOrder mo = new ServiceOrder();
		mo.setMRID(orderNumber);
		mos.getServiceOrder().add(mo);
		r.setGetServiceOrders(mos);
		
		r.setGetServiceOrders(mos);
		msg.setRequest(r);
		
		
		try {
			// get from remote
			GetServiceOrdersResponseMessageType reply = port.getServiceOrders(msg);
			reply.getReply().getResult();
			ServiceOrdersPayloadType payload = reply.getPayload();

			
			// for now we just print out the xml
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(ServiceOrdersPayloadType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(payload, writer);
			System.out.println(writer.toString());
			
		} catch (Exception e) {
			System.out.println("Operation failed : " + e.getMessage());
		}
	}

}
