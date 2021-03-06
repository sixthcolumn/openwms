package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PackagesVendorRoleTypes generated by hbm2java
 */
@Entity
@Table(name = "packages_vendor_role_types")
public class PackagesVendorRoleTypes implements java.io.Serializable {

	private PackagesVendorRoleTypesId id;

	public PackagesVendorRoleTypes() {
	}

	public PackagesVendorRoleTypes(PackagesVendorRoleTypesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "packageId", column = @Column(name = "package_id")),
			@AttributeOverride(name = "vendorRoleTypeId", column = @Column(name = "vendor_role_type_id")) })
	public PackagesVendorRoleTypesId getId() {
		return this.id;
	}

	public void setId(PackagesVendorRoleTypesId id) {
		this.id = id;
	}

}
