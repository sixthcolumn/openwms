package com.sixthc.server.client;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.sixthc.server.client.OrderData.Address;
import com.sixthc.server.client.OrderData.Header;
import com.sixthc.server.client.OrderData.Iloc;

public class TestUnit {

	@Test
	public void test() {
		OrderData od = new OrderData();
		Address a = new Address();
		Header h = new Header();
		Iloc i = new Iloc();
		od.setAddress(a);
		od.setHeader(h);
		od.setIloc(i);
		
		i.setBuildingName("eagle next");
		i.setBuildingNumber("102");
		i.setFloor("23");
		i.setRoomNumber("204a");
		
		od.setReason("outage");
		od.setSeverity("critical");
		od.setType("outage");
		od.setImageFile("1234-5678.jpg");

		a.setBuildingName("building1");
		a.setCode("cd");
		a.setGeneral("111 north street hanover mass");
		a.setName("Eagle's next");
		a.setNumber("123");
		a.setPrefix("East");
		a.setSuffix("North");
		a.setSuite("101");
		a.setType("Residential");

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
	
	@Test
	public void test2() {
		File f = new File("tempfile.xml");
		try {
			OrderData od = OrderData.readFromFile(f);
			System.out.println("foo");
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
