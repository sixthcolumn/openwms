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
 * NameTypeAuthority generated by hbm2java
 */
@Entity
@Table(name = "name_type_authority")
public class NameTypeAuthority implements java.io.Serializable {
	private static Constraint con = new Constraint(NameTypeAuthority.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(NameTypeAuthority.class);

	private Integer id;
	private String name;
	private String description;

	public NameTypeAuthority() {
	}

	public NameTypeAuthority(String name) {
		this.name = name;
	}

	public NameTypeAuthority(String name, String description
	// ,Set<Nametype> nametypes
	) {
		this.name = name;
		this.description = description;
		// this.nametypes = nametypes;
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

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		con.check("setName", name, false, 20);
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		con.check("setDescription", description, true, 255);
		this.description = description;
	}

}
