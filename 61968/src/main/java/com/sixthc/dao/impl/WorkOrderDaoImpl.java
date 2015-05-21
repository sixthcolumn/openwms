package com.sixthc.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixthc.dao.IfaceDao;
import com.sixthc.dao.PkgDao;
import com.sixthc.dao.Sequence;
import com.sixthc.dao.VendorRoleTypeDao;
import com.sixthc.dao.WorkOrderDao;
import com.sixthc.model.WorkOrder;
import com.sixthc.model.Iface;
import com.sixthc.model.Pkg;
import com.sixthc.model.VendorRoleType;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("workOrderDao")
public class WorkOrderDaoImpl extends CustomHibernateDaoSupport implements
		WorkOrderDao {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkOrderDaoImpl.class);


	@Override
	public void save(WorkOrder log) {
		if (log.getCreateDate() == null)
			log.setCreateDate(new Timestamp(System.currentTimeMillis()));

		getHibernateTemplate().save(log);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
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
}
