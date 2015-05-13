package com.sixthc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workorderimage")
public class WorkOrderImage {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "create_date")
	private java.sql.Timestamp createDate;
	private String url;
	
	public WorkOrderImage(String url) {
		this.url = url;
	}
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public java.sql.Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.sql.Timestamp createDate) {
		this.createDate = createDate;
	}

	public String toString() {
		return "Id = " + id + ", URL = " + url + ", Timestamp = "
				+ createDate;
	}

}
