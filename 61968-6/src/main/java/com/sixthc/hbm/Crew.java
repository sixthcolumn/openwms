package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * Crew generated by hbm2java
 */
@Entity
@Table(name = "crew")
public class Crew implements java.io.Serializable {
	private static Constraint con = new Constraint(Crew.class);
	private static org.apache.log4j.Logger log = Logger.getLogger(Crew.class);

	private Integer id;
	private String mrid;
	private Set<WorkTaskCrews> workTaskCrewses = new HashSet<WorkTaskCrews>(0);
	private Set<CrewAssets> crewAssets = new HashSet<CrewAssets>(0);
	private Set<CrewNames> crewNameses = new HashSet<CrewNames>(0);
	private Set<CrewContactpersons> contactPersons = new HashSet<CrewContactpersons>(0);

	public Crew() {
	}

	public Crew(String mrid) {
		this.mrid = mrid;
	}

	public Crew(String mrid, Set<WorkTaskCrews> workTaskCrewses,
			Set<CrewNames> crewNameses) {
		this.mrid = mrid;
		this.workTaskCrewses = workTaskCrewses;
		this.crewNameses = crewNameses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		log.debug("setId : " + id);
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "mRid", nullable = false, length = 20)
	public String getMrid() {
		return this.mrid;
	}

	public void setMrid(String mrid) {
		con.check("setMrid", mrid, true, 20);
		this.mrid = mrid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "crew")
	public Set<WorkTaskCrews> getWorkTaskCrewses() {
		return this.workTaskCrewses;
	}

	public void setWorkTaskCrewses(Set<WorkTaskCrews> workTaskCrewses) {
		this.workTaskCrewses = workTaskCrewses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "crew")
	public Set<CrewNames> getCrewNameses() {
		return this.crewNameses;
	}

	public void setCrewNameses(Set<CrewNames> crewNameses) {
		this.crewNameses = crewNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "crew")
	public Set<CrewAssets> getCrewAssets() {
		return crewAssets;
	}

	public void setCrewAssets(Set<CrewAssets> crewAssets) {
		this.crewAssets = crewAssets;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "crew")
	public Set<CrewContactpersons> getContactPersons() {
		return contactPersons;
	}

	public void setContactPersons(Set<CrewContactpersons> contactPersons) {
		this.contactPersons = contactPersons;
	}
	
	

}
