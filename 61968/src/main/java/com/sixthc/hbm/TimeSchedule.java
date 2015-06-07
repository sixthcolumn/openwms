package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;

/**
 * TimeSchedule generated by hbm2java
 */
@Entity
@Table(name = "time_schedule", catalog = "wms")
public class TimeSchedule implements java.io.Serializable {
	private static Constraint con = new Constraint(TimeSchedule.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(TimeSchedule.class);

	private Integer id;
	private String type;
	private Date startTstamp;
	private Date endTstamp;
	private Set<WorkTaskTimeSchedules> workTaskTimeScheduleses = new HashSet<WorkTaskTimeSchedules>(
			0);
	private Set<WorkOrderSchedule> workOrderSchedules = new HashSet<WorkOrderSchedule>(
			0);

	public TimeSchedule() {
	}

	public TimeSchedule(String type, Date startTstamp, Date endTstamp) {
		this.type = type;
		this.startTstamp = startTstamp;
		this.endTstamp = endTstamp;
	}

	public TimeSchedule(String type, Date startTstamp, Date endTstamp,
			Set<WorkTaskTimeSchedules> workTaskTimeScheduleses,
			Set<WorkOrderSchedule> workOrderSchedules) {
		this.type = type;
		this.startTstamp = startTstamp;
		this.endTstamp = endTstamp;
		this.workTaskTimeScheduleses = workTaskTimeScheduleses;
		this.workOrderSchedules = workOrderSchedules;
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

	@Column(name = "type", nullable = false, length = 12)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		con.check( "setType", type, false, 12);
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_tstamp", nullable = false, length = 19)
	public Date getStartTstamp() {
		return this.startTstamp;
	}

	public void setStartTstamp(Date startTstamp) {
		log.debug("setStartTstamp : " + startTstamp);
		this.startTstamp = startTstamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_tstamp", nullable = false, length = 19)
	public Date getEndTstamp() {
		return this.endTstamp;
	}

	public void setEndTstamp(Date endTstamp) {
		log.debug("setEndTstamp : " + endTstamp);
		this.endTstamp = endTstamp;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "timeSchedule")
	public Set<WorkTaskTimeSchedules> getWorkTaskTimeScheduleses() {
		return this.workTaskTimeScheduleses;
	}

	public void setWorkTaskTimeScheduleses(
			Set<WorkTaskTimeSchedules> workTaskTimeScheduleses) {
		this.workTaskTimeScheduleses = workTaskTimeScheduleses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "timeSchedule")
	public Set<WorkOrderSchedule> getWorkOrderSchedules() {
		return this.workOrderSchedules;
	}

	public void setWorkOrderSchedules(Set<WorkOrderSchedule> workOrderSchedules) {
		this.workOrderSchedules = workOrderSchedules;
	}

}
