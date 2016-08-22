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
 * Hazards generated by hbm2java
 */
@Entity
@Table(name = "hazards")
public class Hazards implements java.io.Serializable {
	private static Constraint con = new Constraint(Hazards.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(Hazards.class);

	private Integer id;
	private String hazardName;
	private Set<AddressHazards> addressHazardses = new HashSet<AddressHazards>(
			0);
	private Set<WorkOrderHazards> workOrderHazardses = new HashSet<WorkOrderHazards>(
			0);
	private Set<IdentifiedObjectHazards> identifiedObjectHazardses = new HashSet<IdentifiedObjectHazards>(
			0);

	public Hazards() {
	}

	public Hazards(String hazardName) {
		this.hazardName = hazardName;
	}

	public Hazards(String hazardName, Set<AddressHazards> addressHazardses,
			Set<WorkOrderHazards> workOrderHazardses,
			Set<IdentifiedObjectHazards> identifiedObjectHazardses) {
		this.hazardName = hazardName;
		this.addressHazardses = addressHazardses;
		this.workOrderHazardses = workOrderHazardses;
		this.identifiedObjectHazardses = identifiedObjectHazardses;
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

	@Column(name = "hazard_name", nullable = false, length = 12)
	public String getHazardName() {
		return this.hazardName;
	}

	public void setHazardName(String hazardName) {
		con.check("setHazardName", hazardName, false, 12);
		this.hazardName = hazardName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hazards")
	public Set<AddressHazards> getAddressHazardses() {
		return this.addressHazardses;
	}

	public void setAddressHazardses(Set<AddressHazards> addressHazardses) {
		this.addressHazardses = addressHazardses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hazards")
	public Set<WorkOrderHazards> getWorkOrderHazardses() {
		return this.workOrderHazardses;
	}

	public void setWorkOrderHazardses(Set<WorkOrderHazards> workOrderHazardses) {
		this.workOrderHazardses = workOrderHazardses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hazards")
	public Set<IdentifiedObjectHazards> getIdentifiedObjectHazardses() {
		return this.identifiedObjectHazardses;
	}

	public void setIdentifiedObjectHazardses(
			Set<IdentifiedObjectHazards> identifiedObjectHazardses) {
		this.identifiedObjectHazardses = identifiedObjectHazardses;
	}

}