package com.sixthc.server.client;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBException;

import com.sixthc.server.client.OrderData.Address;
import com.sixthc.server.client.OrderData.Header;
import com.sixthc.server.client.OrderData.Iloc;

public class TestOrderData {

	public static void main(String[] args) {
		OrderData od = new OrderData();
		Address a = new Address();
		Header h = new Header();
		Iloc i = new Iloc();
		od.setAddress(a);
		od.setHeader(h);
		od.setIloc(i);;
		
		a.setBuildingName("building1");
		a.setCode("cd");
		a.setGeneral("111 north street hanover mass");
		a.setName("Eagle's next");
		a.setNumber("123");
		a.setPrefix("East");
		a.setSuffix("North");
		a.setSuite("101");
		a.setType("Residential");
		a.setState("North Carolina");
		a.setCity("Cary");
		
		i.setBuildingName("building name");
		i.setBuildingName("120");
		i.setFloor("1st");
		i.setRoomNumber("101");
		
		h.setComment("Epri Testing App");
		h.setContext("ctx1");
		h.setCorrelationID("1234");
		h.setMessageId("1234-2222");
		h.setNoun("Maintenance Order");
		h.setOrganization("Epri");
		h.setPropertyName("p1");
		h.setPropertyValue("p1a");
		h.setRevision("0.1");
		h.setSource("epri test");
		h.setTimestamp(new Date(System.currentTimeMillis()));
		h.setUserid("epri1");
		h.setVerb("create");
		
		File f = new File("tempfile.xml");
		try {
			od.writeToFile(f);
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
