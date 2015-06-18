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
 * CrewNames generated by hbm2java
 */
@Entity
@Table(name = "crew_names", catalog = "wms")
public class CrewNames implements java.io.Serializable {
	private static Constraint con = new Constraint(CrewNames.class);
	private static org.apache.log4j.Logger log = Logger
			.getLogger(CrewNames.class);

	private Integer id;
	private Crew crew;
	private Nametype nametype;
	private String name;

	public CrewNames() {
	}

	public CrewNames(Crew crew, String name) {
		this.crew = crew;
		this.name = name;
	}

	public CrewNames(Crew crew, Nametype nametype, String name) {
		this.crew = crew;
		this.nametype = nametype;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		log.debug("setID : " + id);
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "crew_id", nullable = false)
	public Crew getCrew() {
		return this.crew;
	}

	public void setCrew(Crew crew) {
		this.crew = crew;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "name_type_id")
	public Nametype getNametype() {
		return this.nametype;
	}

	public void setNametype(Nametype nametype) {
		this.nametype = nametype;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		con.check("setName", name, false, 20);
		this.name = name;
	}
}
