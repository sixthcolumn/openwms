package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;

/**
 * Request generated by hbm2java
 */
@Entity
@Table(name = "request", catalog = "wms")
public class Request implements java.io.Serializable {
	private static Constraint con = new Constraint(Request.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(Request.class);

	private Integer id;
	private String data;
	private Date createDate;
	private String request;
	private String result;

	public Request() {
	}

	public Request(String data, Date createDate, String request, String result) {
		this.data = data;
		this.createDate = createDate;
		this.request = request;
		this.result = result;
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

	@Column(name = "data")
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		con.check( "setData", data, true, 255);
		this.data = data;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "request")
	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		con.check( "setRequest", request, true, 255);
		this.request = request;
	}

	@Column(name = "result")
	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		con.check( "setResult", result, true, 255);
		this.result = result;
	}

}