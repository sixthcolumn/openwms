package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

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

import org.apache.log4j.Logger;

/**
 * Measurement generated by hbm2java
 */
@Entity
@Table(name = "measurement", catalog = "wms")
public class Measurement implements java.io.Serializable {
	private static Constraint con = new Constraint(Measurement.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(Measurement.class);

	private Integer id;
	private String type;
	private String phases;
	private Float unitMultiplier;
	private String unitSymbol;
	private Set<ProcedureMeasurements> procedureMeasurementses = new HashSet<ProcedureMeasurements>(
			0);

	public Measurement() {
	}

	public Measurement(String type, String phases, Float unitMultiplier,
			String unitSymbol,
			Set<ProcedureMeasurements> procedureMeasurementses) {
		this.type = type;
		this.phases = phases;
		this.unitMultiplier = unitMultiplier;
		this.unitSymbol = unitSymbol;
		this.procedureMeasurementses = procedureMeasurementses;
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

	@Column(name = "type", length = 12)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		con.check( "setType", type, true, 12);
		this.type = type;
	}

	@Column(name = "phases", length = 4)
	public String getPhases() {
		return this.phases;
	}

	public void setPhases(String phases) {
		con.check( "setPhases", phases, true, 4);
		this.phases = phases;
	}

	@Column(name = "unit_multiplier", precision = 12, scale = 0)
	public Float getUnitMultiplier() {
		return this.unitMultiplier;
	}

	public void setUnitMultiplier(Float unitMultiplier) {
		log.debug("setUnitMultiplier : " + unitMultiplier);
		this.unitMultiplier = unitMultiplier;
	}

	@Column(name = "unit_symbol", length = 12)
	public String getUnitSymbol() {
		return this.unitSymbol;
	}

	public void setUnitSymbol(String unitSymbol) {
		con.check( "setUnitSymbol", unitSymbol, true, 12);
		this.unitSymbol = unitSymbol;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "measurement")
	public Set<ProcedureMeasurements> getProcedureMeasurementses() {
		return this.procedureMeasurementses;
	}

	public void setProcedureMeasurementses(
			Set<ProcedureMeasurements> procedureMeasurementses) {
		this.procedureMeasurementses = procedureMeasurementses;
	}

}
