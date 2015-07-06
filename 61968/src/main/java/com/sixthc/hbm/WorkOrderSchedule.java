package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * WorkOrderSchedule generated by hbm2java
 */
@Entity
@Table(name = "work_order_schedules", catalog = "wms")
public class WorkOrderSchedule implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkOrderSchedule.class);

	private Integer id;
	private WorkOrder workOrder;
	private TimeSchedule timeSchedule;

	public WorkOrderSchedule() {
	}

	public WorkOrderSchedule(WorkOrder workOrder, TimeSchedule timeSchedule) {
		this.workOrder = workOrder;
		this.timeSchedule = timeSchedule;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		log.debug("setId : " + id);
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "work_order_id", nullable = false)
	public WorkOrder getWorkOrder() {
		return this.workOrder;
	}

	public void setWorkOrder(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "time_schedule_id", nullable = false)
	public TimeSchedule getTimeSchedule() {
		return this.timeSchedule;
	}

	public void setTimeSchedule(TimeSchedule timeSchedule) {
		this.timeSchedule = timeSchedule;
	}

}
