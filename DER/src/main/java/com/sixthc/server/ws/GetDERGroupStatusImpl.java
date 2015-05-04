package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import ch.iec.tc57._2011.getdergroupstatus.FaultMessage;
import ch.iec.tc57._2011.getdergroupstatus.GetDERGroupStatusPort;
import ch.iec.tc57._2011.getdergroupstatusmessage.DERGroupStatusPayloadType;
import ch.iec.tc57._2011.getdergroupstatusmessage.GetDERGroupStatusRequestType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.epri._2013.derstatus.DERGroupStatus;
import com.epri._2013.derstatus.DERGroupStatuses;


public class GetDERGroupStatusImpl implements GetDERGroupStatusPort, ApplicationContextAware{
	private static org.apache.log4j.Logger log = Logger
			.getLogger(GetDERGroupStatusImpl.class);
	ApplicationContext appContext;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		appContext = arg0;
		
	}

	@Override
	public void getDERGroupStatus(Holder<HeaderType> header,
			GetDERGroupStatusRequestType request,
			Holder<DERGroupStatusPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("***** OPERATION : getDERGroupStatus");
		
		DERGroupStatus e =  appContext.getBean(
				"CIMDERGroupStatus",
				DERGroupStatus.class);
		
		payload.value.getDERGroupStatuses().getDERGroupStatuses().clear();
		payload.value.getDERGroupStatuses().getDERGroupStatuses().add(e);
		
		ReplyType r = appContext.getBean(("ReplyTypeBean"), ReplyType.class);
		reply.value = r;
		
	}
}
