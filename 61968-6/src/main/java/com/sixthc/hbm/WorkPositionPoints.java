package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

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
 * WorkPositionPoints generated by hbm2java
 */
@Entity
@Table(name = "work_position_points")
public class WorkPositionPoints implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkPositionPoints.class);

	private Integer id;
	private WorkOrder workOrder;
	private Integer sequenceNum;
	private Integer xposition;
	private Integer yposition;
	private Integer zposition;

	public WorkPositionPoints() {
	}

	public WorkPositionPoints(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	public WorkPositionPoints(WorkOrder workOrder, Integer sequenceNum,
			Integer xposition, Integer yposition, Integer zposition) {
		this.workOrder = workOrder;
		this.sequenceNum = sequenceNum;
		this.xposition = xposition;
		this.yposition = yposition;
		this.zposition = zposition;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "work_order_id", nullable = false)
	public WorkOrder getWorkOrder() {
		return this.workOrder;
	}

	public void setWorkOrder(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	@Column(name = "sequence_num")
	public Integer getSequenceNum() {
		return this.sequenceNum;
	}

	public void setSequenceNum(Integer sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	@Column(name = "xposition")
	public Integer getXposition() {
		return this.xposition;
	}

	public void setXposition(Integer xposition) {
		log.debug("setXposition : " + xposition);
		this.xposition = xposition;
	}

	@Column(name = "yposition")
	public Integer getYposition() {
		return this.yposition;
	}

	public void setYposition(Integer yposition) {
		log.debug("setYposition : " + yposition);
		this.yposition = yposition;
	}

	@Column(name = "zposition")
	public Integer getZposition() {
		return this.zposition;
	}

	public void setZposition(Integer zposition) {
		log.debug("setZposition : " + zposition);
		this.zposition = zposition;
	}
}
