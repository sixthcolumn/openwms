package com.sixthc.server.client;

import java.io.StringWriter;
import java.math.BigInteger;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;
import ch.iec.tc57._2011.schema.message.UserType;
import ch.iec.tc57._2015.maintenanceorders.ActivityRecord;
import ch.iec.tc57._2015.maintenanceorders.Attachment;
import ch.iec.tc57._2015.maintenanceorders.InternalLocation;
import ch.iec.tc57._2015.maintenanceorders.MaintenanceOrder;
import ch.iec.tc57._2015.maintenanceorders.MaintenanceOrders;
import ch.iec.tc57._2015.maintenanceorders.Organisation;
import ch.iec.tc57._2015.maintenanceorders.Work;
import ch.iec.tc57._2015.maintenanceorders.Work.Attachments;
import ch.iec.tc57._2015.maintenanceorders.Work.Priority;
import ch.iec.tc57._2015.maintenanceorders.WorkKind;
import ch.iec.tc57._2015.maintenanceorders.WorkLocation;
import ch.iec.tc57._2015.maintenanceorders.WorkLocation.MainAddress;
import ch.iec.tc57._2015.maintenanceorders.WorkStatusKind;
import ch.iec.tc57._2015.maintenanceordersmessage.MaintenanceOrdersPayloadType;

import com.sixthc.server.ws.ExecuteMaintOrderCreateService;
import com.sixthc.server.ws.FaultMessage;
import com.sixthc.server.ws.MaintenanceOrdersPort;

public class CreateMaintOrder {

	public static void main(String[] args) throws JAXBException {
		CreateMaintOrder cmo = new CreateMaintOrder();

		// arg 0 : soap server, arg 1 : xml of data to be sent
		if (args.length < 2)
			cmo.send(null, null);
		else
			cmo.send(args[0], args[1]);
	}

	public void send(String url, String dataXmlString) throws JAXBException {
		Holder<HeaderType> header = new Holder<HeaderType>();
		Holder<MaintenanceOrdersPayloadType> payload = new Holder<MaintenanceOrdersPayloadType>();
		Holder<ReplyType> reply = new Holder<ReplyType>();
		RequestType request = new RequestType();
		URL wsdlLocation;
		try {
			wsdlLocation = new URL(url + "?wsdl");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}

		ExecuteMaintOrderCreateService client = null;

		try {
		client = new ExecuteMaintOrderCreateService(wsdlLocation);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			orders o = new orders("Error", e.getMessage());
			System.out.println(o.toXml());
			System.exit(1);
		}
		MaintenanceOrdersPort port = client.getExecuteMaintOrderCreatePort();

		// change url if asked to
		if (url != null) {
			BindingProvider provider = (BindingProvider) port;
			provider.getRequestContext().put(
					BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		}

		OrderData od = OrderData.fromString(dataXmlString);

		header.value = new HeaderType();
		header.value.setVerb(od.getHeader().getVerb());
		header.value.setNoun(od.getHeader().getNoun());
		header.value.setComment(od.getHeader().getComment());
		header.value.setContext(od.getHeader().getContext());
		header.value.setCorrelationID(od.getHeader().getCorrelationID());
		header.value.setMessageID(od.getHeader().getMessageId());
		header.value.setRevision(od.getHeader().getRevision());
		header.value.setSource(od.getHeader().getSource());
		header.value.setTimestamp(getXMLDate(new java.util.Date(System
				.currentTimeMillis())));
		header.value.setUser(new UserType());
		header.value.getUser()
				.setOrganization(od.getHeader().getOrganization());
		header.value.getUser().setUserID(od.getHeader().getUserid());

		request.setEndTime(getXMLDate(new java.util.Date(System
				.currentTimeMillis())));
		request.setStartTime(getXMLDate(new java.util.Date(System
				.currentTimeMillis())));

		MaintenanceOrders mos = new MaintenanceOrders();
		MaintenanceOrder mo = new MaintenanceOrder();
		//mo.setMRID("1234");
		mo.setOrganisation(new Organisation());
		mo.getOrganisation().setMRID("1234");

		mos.getMaintenanceOrder().add(mo);
		payload.value = new MaintenanceOrdersPayloadType();
		payload.value.setMaintenanceOrders(mos);
		Work work = new Work();

		Attachments ats = new Attachments();
		Attachment at = new Attachment();
		at.setComment("testing pi");
		at.setDescription("pi test");
		at.setUrl(od.getImageFile());
		ats.getAttachment().add(at);
		work.setAttachments(ats);
		work.setKind(WorkKind.MAINTENANCE);
		work.setLastModifiedDateTime(getXMLDate(new java.util.Date(System
				.currentTimeMillis())));
		work.setRequestDateTime(getXMLDate(new java.util.Date(System
				.currentTimeMillis())));
		work.setStatusKind(WorkStatusKind.APPROVED);
		work.setPriority(new Priority());
		work.getPriority().setType(od.getType());
		work.getPriority().setRank(BigInteger.valueOf(1));
		mo.getWork().add(work);

		if (od.isAddressvalid() == true || od.isIlocValid()) {
			WorkLocation loc = new WorkLocation();
			
			// address
			if (od.getAddress() != null && od.getAddress().isAddressValid()) {
				MainAddress addr = od.getAddress().setAddress();
				loc.setMainAddress(addr);
			}
			
			// internal loc
			if (od.getIloc() != null && od.getIloc().isInternalLocValid()) {
				InternalLocation iloc = od.getIloc().setInternalLoc();
				loc.setInternalLocation(iloc);
			}
			
			work.setWorkLocation(loc);
		}

		// activity record
		ActivityRecord ar = new ActivityRecord();
		ar.setCreatedDateTime(getXMLDate(new java.util.Date(System
				.currentTimeMillis())));
		ar.setReason(od.getReason());
		ar.setSeverity(od.getSeverity());
		ar.setType(od.getType());
		work.getActivityRecords().add(ar);

		try {
			port.createMaintenanceOrders(header, request, payload, reply);		
			orders o = new orders(reply.value.getResult(), payload.value);
			System.out.println(o.toXml());
		} catch (FaultMessage e) {
			orders o = new orders("Error");
			System.out.println(o.toXml());
		}

	}

	public boolean isSet(String v) {
		return (v != null && v.length() > 0);
	}

	public static Timestamp parseDate(XMLGregorianCalendar from) {
		if (from != null) {
			Timestamp timestamp = new Timestamp(from.toGregorianCalendar()
					.getTimeInMillis());
			return timestamp;
		}
		return null;
	}

	public static XMLGregorianCalendar getXMLDate(java.util.Date dt) {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(dt);
		XMLGregorianCalendar d2;
		try {
			d2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return d2;
		} catch (DatatypeConfigurationException e) {
			return null;
		}

	}

	@XmlRootElement(name = "orders")
	static class orders {
		String result;
		String reason;
		List<String> ids = new Vector<String>();

		public orders(String result) {
			this.result = result;
		}
		
		public orders(String result, String reason) {
			this.result = result;
			this.reason = reason;
		}
		
		public orders() { }

		public orders(String result, MaintenanceOrdersPayloadType payload) {
			if (payload != null && payload.getMaintenanceOrders() != null) {
				List<MaintenanceOrder> orders = payload.getMaintenanceOrders()
						.getMaintenanceOrder();
				this.result = result;
				for (MaintenanceOrder mo2 : orders) {
					ids.add(mo2.getMRID());
				}
			}
		}

		public String toXml() {
			StringWriter writer = new StringWriter();
			JAXBContext context;
			try {
				context = JAXBContext.newInstance(this.getClass());
				Marshaller m = context.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				m.marshal(this, writer);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return writer.toString();
		}
		
		public String getResult() {
			return result;
		}		
		
		
		@XmlElement(name = "Result")
		public void setResult(String result) {
			this.result = result;
		}
		
		public String getReason() {
			return reason;
		}

		@XmlElement(name = "Reason")
		public void setReason(String reason) {
			this.reason = reason;
		}


		@XmlElement(name = "ID")
		public void setIDs(String[] ids) {
			for (String i : ids) {
				this.ids.add(i);
			}
		}

		public String[] getIDs() {
			String rlist[] = new String[ids.size()];
			return ids.toArray(rlist);
		}


	}
}