package com.sixthc.hbm;

// Generated May 31, 2015 2:36:12 PM by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

import com.sixthc.dao.impl.WorkOrderDaoImpl;

/**
 * Contactperson generated by hbm2java
 */
@Entity
@Table(name = "contactperson", catalog = "wms")
public class Contactperson implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6824857311490089166L;
	private static Constraint con = new Constraint(Contactperson.class);
	private static org.apache.log4j.Logger log = Logger
			.getLogger(Contactperson.class);

	private Integer id;
	private String lastname;
	private String firstname;
	private String middle;
	private String prefix;
	private String suffix;
	private String governmentid;
	private String affiliation;
	private String primaryId;
	private String secondaryId;
	private Set<WorkOrder> workOrdersForLocationContactId = new HashSet<WorkOrder>(
			0);
	private Set<ContactpersonPhones> contactpersonPhoneses = new HashSet<ContactpersonPhones>(
			0);
	private Set<ContactpersonOtherContactinfos> contactpersonOtherContactinfoses = new HashSet<ContactpersonOtherContactinfos>(
			0);
	private Set<ContactpersonAddresses> contactpersonAddresseses = new HashSet<ContactpersonAddresses>(
			0);
	private Set<ContactpersonEmails> contactpersonEmailses = new HashSet<ContactpersonEmails>(
			0);
	private Set<WorkOrder> workOrdersForRequestContactId = new HashSet<WorkOrder>(
			0);

	public Contactperson() {
	}

	public Contactperson(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}

	public Contactperson(
			String lastname,
			String firstname,
			String middle,
			String prefix,
			String suffix,
			String governmentid,
			String affiliation,
			String primaryId,
			String secondaryId,
			Set<WorkOrder> workOrdersForLocationContactId,
			Set<ContactpersonPhones> contactpersonPhoneses,
			Set<ContactpersonOtherContactinfos> contactpersonOtherContactinfoses,
			Set<ContactpersonAddresses> contactpersonAddresseses,
			Set<ContactpersonEmails> contactpersonEmailses,
			Set<WorkOrder> workOrdersForRequestContactId) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.middle = middle;
		this.prefix = prefix;
		this.suffix = suffix;
		this.governmentid = governmentid;
		this.affiliation = affiliation;
		this.primaryId = primaryId;
		this.secondaryId = secondaryId;
		this.workOrdersForLocationContactId = workOrdersForLocationContactId;
		this.contactpersonPhoneses = contactpersonPhoneses;
		this.contactpersonOtherContactinfoses = contactpersonOtherContactinfoses;
		this.contactpersonAddresseses = contactpersonAddresseses;
		this.contactpersonEmailses = contactpersonEmailses;
		this.workOrdersForRequestContactId = workOrdersForRequestContactId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "lastname", nullable = false, length = 20)
	public String getLastname() {
		con.check( "setLastname", lastname, false, 20);
		return this.lastname;
	}

	public void setLastname(String lastname) {
		con.check( "setLastname", lastname, false, 20);
		con.check( "setLastname", lastname, false, 20);
		this.lastname = lastname;
	}

	@Column(name = "firstname", nullable = false, length = 20)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		con.check( "setFirstname", firstname, false, 20);
		this.firstname = firstname;
	}

	@Column(name = "middle", length = 20)
	public String getMiddle() {
		return this.middle;
	}

	public void setMiddle(String middle) {
		con.check( "setMiddle", middle, true, 20);
		this.middle = middle;
	}

	@Column(name = "prefix", length = 5)
	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		con.check( "setPrefix", prefix, true, 5);
		this.prefix = prefix;
	}

	@Column(name = "suffix", length = 5)
	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		con.check( "setSuffix", suffix, true, 5);
		this.suffix = suffix;
	}

	@Column(name = "governmentid", length = 20)
	public String getGovernmentid() {
		return this.governmentid;
	}

	public void setGovernmentid(String governmentid) {
		con.check( "setGovernmentid", governmentid, true, 20);
		this.governmentid = governmentid;
	}

	@Column(name = "affiliation", length = 20)
	public String getAffiliation() {
		con.check( "setAffiliation", affiliation, true, 20);
		return this.affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	@Column(name = "primary_id", length = 20)
	public String getPrimaryId() {
		return this.primaryId;
	}

	public void setPrimaryId(String primaryId) {
		con.check( "setPrimaryId", primaryId, true, 20);
		this.primaryId = primaryId;
	}

	@Column(name = "secondary_id", length = 20)
	public String getSecondaryId() {
		return this.secondaryId;
	}

	public void setSecondaryId(String secondaryId) {
		con.check( "secondaryId", secondaryId, true, 20);
		this.secondaryId = secondaryId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactpersonByLocationContactId")
	public Set<WorkOrder> getWorkOrdersForLocationContactId() {
		return this.workOrdersForLocationContactId;
	}

	public void setWorkOrdersForLocationContactId(
			Set<WorkOrder> workOrdersForLocationContactId) {
		this.workOrdersForLocationContactId = workOrdersForLocationContactId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactperson")
	public Set<ContactpersonPhones> getContactpersonPhoneses() {
		return this.contactpersonPhoneses;
	}

	public void setContactpersonPhoneses(
			Set<ContactpersonPhones> contactpersonPhoneses) {
		this.contactpersonPhoneses = contactpersonPhoneses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactperson")
	public Set<ContactpersonOtherContactinfos> getContactpersonOtherContactinfoses() {
		return this.contactpersonOtherContactinfoses;
	}

	public void setContactpersonOtherContactinfoses(
			Set<ContactpersonOtherContactinfos> contactpersonOtherContactinfoses) {
		this.contactpersonOtherContactinfoses = contactpersonOtherContactinfoses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactperson")
	public Set<ContactpersonAddresses> getContactpersonAddresseses() {
		return this.contactpersonAddresseses;
	}

	public void setContactpersonAddresseses(
			Set<ContactpersonAddresses> contactpersonAddresseses) {
		this.contactpersonAddresseses = contactpersonAddresseses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactperson")
	public Set<ContactpersonEmails> getContactpersonEmailses() {
		return this.contactpersonEmailses;
	}

	public void setContactpersonEmailses(
			Set<ContactpersonEmails> contactpersonEmailses) {
		this.contactpersonEmailses = contactpersonEmailses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactpersonByRequestContactId")
	public Set<WorkOrder> getWorkOrdersForRequestContactId() {
		return this.workOrdersForRequestContactId;
	}

	public void setWorkOrdersForRequestContactId(
			Set<WorkOrder> workOrdersForRequestContactId) {
		this.workOrdersForRequestContactId = workOrdersForRequestContactId;
	}

}
