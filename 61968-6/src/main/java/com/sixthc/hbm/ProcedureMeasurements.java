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
 * ProcedureMeasurements generated by hbm2java
 */
@Entity
@Table(name = "proced_measurements")
public class ProcedureMeasurements implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(ProcedureMeasurements.class);

	private Integer id;
	private Measurement measurement;
	private Procedure procedure;

	public ProcedureMeasurements() {
	}

	public ProcedureMeasurements(Measurement measurement, Procedure procedure) {
		this.measurement = measurement;
		this.procedure = procedure;
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
	@JoinColumn(name = "measurement_id", nullable = false)
	public Measurement getMeasurement() {
		return this.measurement;
	}

	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "proced_id", nullable = false)
	public Procedure getProcedure() {
		return this.procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

}
