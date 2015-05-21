package com.sixthc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "workorder")
public class WorkOrder {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String data;
	private String message;
	@Column(name = "create_date")
	private java.sql.Timestamp createDate;
    @OneToMany(fetch=FetchType.EAGER,cascade = {CascadeType.ALL})
    @JoinColumn(name="WORKORDER_ID", nullable=false)
	private List<WorkOrderImage> workOrderImages;



	public List<WorkOrderImage> getWorkOrderImages() {
		return workOrderImages;
	}

	public void setWorkOrderImages(List<WorkOrderImage> workOrderImages) {
		this.workOrderImages = workOrderImages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public java.sql.Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.sql.Timestamp createDate) {
		this.createDate = createDate;
	}

	public String toString() {
		return "Id = " + id + ", Message = " + message + ", Timestamp = "
				+ createDate + ", data = " + data;
	}
}
