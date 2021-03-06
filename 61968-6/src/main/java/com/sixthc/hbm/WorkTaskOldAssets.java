package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;

/**
 * WorkTaskAssets generated by hbm2java
 */
@Entity
@Table(name = "work_task_old_assets")
public class WorkTaskOldAssets implements java.io.Serializable {
	private static Constraint con = new Constraint(WorkTaskOldAssets.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkTaskOldAssets.class);

	private Integer id;
	private WorkTask workTask;
	private Asset asset;
	private Date createdAt;
	private String createdBy;

	public WorkTaskOldAssets() {
	}

	public WorkTaskOldAssets(WorkTask workTask, Asset asset, Date createdAt) {
		this.workTask = workTask;
		this.asset = asset;
		this.createdAt = createdAt;
	}

	public WorkTaskOldAssets(WorkTask workTask, Asset asset, Date createdAt,
			String createdBy) {
		this.workTask = workTask;
		this.asset = asset;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
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
	@JoinColumn(name = "work_task_id", nullable = false)
	public WorkTask getWorkTask() {
		return this.workTask;
	}

	public void setWorkTask(WorkTask workTask) {
		this.workTask = workTask;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "asset_id", nullable = false)
	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		log.debug("setCreatedAt : " + createdAt);
		this.createdAt = createdAt;
	}

	@Column(name = "created_by", length = 20)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		con.check("setCreatedBy", createdBy, true, 20);
		this.createdBy = createdBy;
	}

}
