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
 * WorkTaskMaterialItems generated by hbm2java
 */
@Entity
@Table(name = "work_task_material_items")
public class WorkTaskMaterialItems implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkTaskMaterialItems.class);

	private Integer id;
	private MaterialItem materialItem;
	private WorkTask workTask;

	public WorkTaskMaterialItems() {
	}

	public WorkTaskMaterialItems(MaterialItem materialItem, WorkTask workTask) {
		this.materialItem = materialItem;
		this.workTask = workTask;
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
	@JoinColumn(name = "material_item_id", nullable = false)
	public MaterialItem getMaterialItem() {
		return this.materialItem;
	}

	public void setMaterialItem(MaterialItem materialItem) {
		this.materialItem = materialItem;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "work_task_id", nullable = false)
	public WorkTask getWorkTask() {
		return this.workTask;
	}

	public void setWorkTask(WorkTask workTask) {
		this.workTask = workTask;
	}

}
