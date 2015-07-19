package com.sixthc.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import com.sixthc.dao.WorkOrderDao;
import com.sixthc.hbm.Contactperson;
import com.sixthc.hbm.ContactpersonAddresses;
import com.sixthc.hbm.ContactpersonEmails;
import com.sixthc.hbm.ContactpersonOtherContactinfos;
import com.sixthc.hbm.ContactpersonPhones;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.model.EpriLog;
//import com.sixthc.model.WorkOrder;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("workOrderDao")
public class WorkOrderDaoImpl extends CustomHibernateDaoSupport implements
		WorkOrderDao {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkOrderDaoImpl.class);

	@Override
	public void save(WorkOrder workOrder) {
		if (workOrder.getCreatedAt() == null)
			workOrder.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		
		/*
		 * Please note : for the contactperson subs (phone, addr, email, other),
		 * if you don't set twice ie : 
		 * 		phones.setPhone(p);
		 *		phones.setContactperson(cp);
		 *
		 * you will get null transient errors. This is because for these four items,
		 * (for example) phone and contactPerson are the parents of contactperson_phone
		 */

		getHibernateTemplate().save(workOrder);

	}

	@Override
	public void update(WorkOrder log) {
		getHibernateTemplate().update(log);
	}

	@Override
	public void delete(WorkOrder log) {
		getHibernateTemplate().delete(log);
	}

	public void saveOrUpdate(WorkOrder log) {
		getHibernateTemplate().saveOrUpdate(log);
	}
	
	public WorkOrder find(String mrid) {
		@SuppressWarnings("unchecked")
		List<WorkOrder> list = getHibernateTemplate().find(
				"from WorkOrder where mrid=?", mrid);
		if (list.size() > 0)
			return (WorkOrder) list.get(0);
		return null;
	}
}
