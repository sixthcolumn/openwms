package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import ch.iec.tc57._2011.getdergroup.FaultMessage;
import ch.iec.tc57._2011.getdergroup.GetDERGroupPort;
import ch.iec.tc57._2011.getdergroupmessage.DERGroupPayloadType;
import ch.iec.tc57._2011.getdergroupmessage.GetDERGroupRequestType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.epri._2013.dergroup.DERGroups.DERGroup;


public class GetDERGroupImpl implements GetDERGroupPort, ApplicationContextAware{
	private static org.apache.log4j.Logger log = Logger
			.getLogger(GetDERGroupImpl.class);
	ApplicationContext appContext;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		appContext = arg0;
		
	}

	@Override
	public void getDERGroup(Holder<HeaderType> header,
			GetDERGroupRequestType request,
			Holder<DERGroupPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("***** OPERATION : getDERGroup");
		
		DERGroup dg = new DERGroup();
		dg.setComment("epri test");
		dg.setName("d1");
		
		payload.value.getDERGroups().getDERGroup().clear();
		payload.value.getDERGroups().getDERGroup().add(dg);
		
		ReplyType r = appContext.getBean(("ReplyTypeBean"), ReplyType.class);
		reply.value = r;

	}
}
