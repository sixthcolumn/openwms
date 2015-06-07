package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

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
 * AssetNames generated by hbm2java
 */
@Entity
@Table(name = "asset_names", catalog = "wms")
public class AssetNames implements java.io.Serializable {
	private static Constraint con = new Constraint(AssetNames.class);
	private static org.apache.log4j.Logger log = Logger
			.getLogger(AssetNames.class);

	private Integer id;
	private Nametype nametype;
	private Asset asset;
	private String name;

	public AssetNames() {
	}

	public AssetNames(Asset asset, String name) {
		this.asset = asset;
		this.name = name;
	}

	public AssetNames(Nametype nametype, Asset asset, String name) {
		this.nametype = nametype;
		this.asset = asset;
		this.name = name;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "name_type_id")
	public Nametype getNametype() {
		return this.nametype;
	}

	public void setNametype(Nametype nametype) {
		this.nametype = nametype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_id", nullable = false)
	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	@Column(name = "name", nullable = false, length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		con.check("setName", name, true, 40);
		this.name = name;
	}
}