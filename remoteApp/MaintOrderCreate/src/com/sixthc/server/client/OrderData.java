package com.sixthc.server.client;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

import ch.iec.tc57._2015.maintenanceorders.InternalLocation;
import ch.iec.tc57._2015.maintenanceorders.WorkLocation.MainAddress;
import ch.iec.tc57._2015.maintenanceorders.WorkLocation.MainAddress.StreetDetail;
import ch.iec.tc57._2015.maintenanceorders.WorkLocation.MainAddress.TownDetail;

@XmlRootElement(name = "orderData")
public class OrderData {
	private Header header;
	private Address address;
	private Iloc iloc;
	private String reason;
	private String severity;
	private String type;
	private String imageFile;
	private String taskKind;
	private String taskStatus;
	private String taskSubject;
	private String assetID;
	private String assetUTC;

	public static boolean isSet(String v) {
		return (v != null && v.length() > 0);
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

	public static OrderData fromString(String xmlString) throws JAXBException {
		JAXBContext context;
		context = JAXBContext.newInstance(OrderData.class);
		Unmarshaller um = context.createUnmarshaller();
		InputStream stream = new ByteArrayInputStream(
				xmlString.getBytes(StandardCharsets.UTF_8));

		OrderData od = (OrderData) um.unmarshal(stream);
		return od;
	}

	public void writeToFile(File file) throws JAXBException, IOException {
		JAXBContext context;
		context = JAXBContext.newInstance(this.getClass());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(this, file);
	}

	public static OrderData readFromFile(File file) throws JAXBException,
			IOException {
		JAXBContext context;
		context = JAXBContext.newInstance(OrderData.class);
		Unmarshaller um = context.createUnmarshaller();
		OrderData od = (OrderData) um.unmarshal(file);
		return od;
	}

	public Iloc getIloc() {
		return iloc;
	}

	public void setIloc(Iloc iloc) {
		this.iloc = iloc;
	}
	
	public boolean isIlocValid() {
		return (iloc != null && iloc.isInternalLocValid());
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}
	
	public boolean isAddressvalid() {
		return (address != null && address.isAddressValid());
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	

	public String getTaskKind() {
		return taskKind;
	}

	public void setTaskKind(String task) {
		this.taskKind = task;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskSubject() {
		return taskSubject;
	}

	public void setTaskSubject(String taskSubject) {
		this.taskSubject = taskSubject;
	}

	public String getAssetID() {
		return assetID;
	}

	public void setAssetID(String assetID) {
		this.assetID = assetID;
	}

	public String getAssetUTC() {
		return assetUTC;
	}

	public void setAssetUTC(String assetUTC) {
		this.assetUTC = assetUTC;
	}



	public static class Header {
		private String verb;
		private String noun;
		private String revision;
		private String Context;
		private Date Timestamp;
		private String source;
		private String userid;
		private String organization;
		private String messageId;
		private String correlationID;
		private String comment;
		private String propertyName;
		private String propertyValue;

		public String getVerb() {
			return verb;
		}

		public void setVerb(String verb) {
			this.verb = verb;
		}

		public String getNoun() {
			return noun;
		}

		public void setNoun(String noun) {
			this.noun = noun;
		}

		public String getRevision() {
			return revision;
		}

		public void setRevision(String revision) {
			this.revision = revision;
		}

		public String getContext() {
			return Context;
		}

		public void setContext(String context) {
			Context = context;
		}

		public Date getTimestamp() {
			return Timestamp;
		}

		public void setTimestamp(Date timestamp) {
			Timestamp = timestamp;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getOrganization() {
			return organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getMessageId() {
			return messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getCorrelationID() {
			return correlationID;
		}

		public void setCorrelationID(String correlationID) {
			this.correlationID = correlationID;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getPropertyName() {
			return propertyName;
		}

		public void setPropertyName(String propertyName) {
			this.propertyName = propertyName;
		}

		public String getPropertyValue() {
			return propertyValue;
		}

		public void setPropertyValue(String propertyValue) {
			this.propertyValue = propertyValue;
		}
	}

	public static class Address {
		String general;
		String buildingName;
		String code;
		String name;
		String number;
		String prefix;
		String suffix;
		String suite;
		String type;
		String addr1;
		String city;
		String state;
		
		public boolean isAddressValid() {
			return ( OrderData.isSet(general) );
		}

		public MainAddress setAddress() {
			if (isAddressValid()) {
				MainAddress addr = new MainAddress();
				StreetDetail sd = new StreetDetail();
				TownDetail td = new TownDetail();
				addr.setStreetDetail(sd);
				addr.setTownDetail(td);
				if (OrderData.isSet(general))
					sd.setAddressGeneral(general);
				if (OrderData.isSet(buildingName))
					sd.setBuildingName(buildingName);
				if (OrderData.isSet(code))
					sd.setCode(code);
				if (OrderData.isSet(name))
					sd.setName(name);
				if (OrderData.isSet(number))
					sd.setNumber(number);
				if (OrderData.isSet(prefix))
					sd.setPrefix(prefix);
				if (OrderData.isSet(suffix))
					sd.setSuffix(suffix);
				if (OrderData.isSet(suite))
					sd.setSuiteNumber(suite);
				if (OrderData.isSet(type))
					sd.setType(type);
				if(OrderData.isSet(state))
					td.setStateOrProvince(state);
				if(OrderData.isSet(city))
					td.setName(city);
					
				return addr;
			}
			return null;
		}

		public String getGeneral() {
			return general;
		}

		public void setGeneral(String general) {
			this.general = general;
		}

		public String getBuildingName() {
			return buildingName;
		}

		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getPrefix() {
			return prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getSuffix() {
			return suffix;
		}

		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}

		public String getSuite() {
			return suite;
		}

		public void setSuite(String suite) {
			this.suite = suite;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAddr1() {
			return addr1;
		}

		public void setAddr1(String addr1) {
			this.addr1 = addr1;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	public static class Iloc {
		String buildingName;
		String buildingNumber;
		String floor;
		String roomNumber;

		public InternalLocation setInternalLoc() {
			InternalLocation iloc = new InternalLocation();
			if (isInternalLocValid()) {
				iloc.setBuildingNumber(buildingNumber);
				iloc.setFloor(floor);
				iloc.setRoomNumber(roomNumber);
				if (isSet(buildingName))
					iloc.setBuildingName(buildingName);
				return iloc;
			}
			return null;
		}

		public boolean isInternalLocValid() {
			return (OrderData.isSet(buildingNumber) && OrderData.isSet(floor) && OrderData
					.isSet(roomNumber));
		}

		public String getBuildingName() {
			return buildingName;
		}

		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}

		public String getBuildingNumber() {
			return buildingNumber;
		}

		public void setBuildingNumber(String buildingNumber) {
			this.buildingNumber = buildingNumber;
		}

		public String getFloor() {
			return floor;
		}

		public void setFloor(String floor) {
			this.floor = floor;
		}

		public String getRoomNumber() {
			return roomNumber;
		}

		public void setRoomNumber(String roomNumber) {
			this.roomNumber = roomNumber;
		}
	}
}
