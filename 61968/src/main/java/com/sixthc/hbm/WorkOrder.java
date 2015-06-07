package com.sixthc.hbm;

// Generated May 31, 2015 2:36:12 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;

/**
 * WorkOrder generated by hbm2java
 */
@Entity
@Table(name = "work_order", catalog = "wms")
public class WorkOrder implements java.io.Serializable {
	private static Constraint con = new Constraint(WorkOrder.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkOrder.class);
	
	private Integer id;
	private Objectref objectref;
	private Contactperson contactpersonByLocationContactId;
	private Contactperson contactpersonByRequestContactId;
	private String workOrderName;
	private Date createdAt;
	private String createdBy;
	private String mrid;
	private String kind;
	private Date updatedAt;
	private java.sql.Timestamp requestDatetime;
	private String updatedBy;
	private String status;
	private String statusKind;
	private String priorityJustification;
	private Integer priorityRank;
	private String priorityType;
	private String comments;
	private String description;
	private String title;
	private Integer addressId;
	private String gridLocation;
	private String locationComment;
	private Float gpsLatitude;
	private Float gpsLongitude;
	private Float gpsAltitude;
	private String internalBuildingName;
	private String internalBuildingNum;
	private String internalFloor;
	private String internalRoomNum;
	private Set<WorkOrderWorkTasks> workOrderWorkTaskses = new HashSet<WorkOrderWorkTasks>(
			0);
	private Set<WorkOrderNames> workOrderNameses = new HashSet<WorkOrderNames>(
			0);
	private Set<WorkOrderLocationObjectRefs> workOrderLocationObjectRefses = new HashSet<WorkOrderLocationObjectRefs>(
			0);
	private Set<WorkOrderAttachments> workOrderAttachmentses = new HashSet<WorkOrderAttachments>(
			0);
	private Set<WorkOrderSchedule> workOrderSchedules = new HashSet<WorkOrderSchedule>(
			0);
	private Set<WorkOrderComments> workOrderCommentses = new HashSet<WorkOrderComments>(
			0);
	private Set<WorkPositionPoints> workPositionPointses = new HashSet<WorkPositionPoints>(
			0);
	private Set<WorkOrderHazards> workOrderHazardses = new HashSet<WorkOrderHazards>(
			0);

	public WorkOrder() {
	}

	public WorkOrder(String workOrderName, Date createdAt, String createdBy,
			String mrid, String kind, String status) {
		this.workOrderName = workOrderName;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.mrid = mrid;
		this.kind = kind;
		this.status = status;
	}

	public WorkOrder(Objectref objectref,
			Contactperson contactpersonByLocationContactId,
			Contactperson contactpersonByRequestContactId,
			String workOrderName, Date createdAt, String createdBy,
			String mrid, String kind, Date updatedAt, java.sql.Timestamp requestDatetime,
			String updatedBy, String status, String statusKind,
			String priorityJustification, Integer priorityRank,
			String priorityType, String comments, String description,
			String title, Integer addressId, String gridLocation,
			String locationComment, Float gpsLatitude, Float gpsLongitude,
			Float gpsAltitude, String internalBuildingName,
			String internalBuildingNum, String internalFloor,
			String internalRoomNum,
			Set<WorkOrderWorkTasks> workOrderWorkTaskses,
			Set<WorkOrderNames> workOrderNameses,
			Set<WorkOrderLocationObjectRefs> workOrderLocationObjectRefses,
			Set<WorkOrderAttachments> workOrderAttachmentses,
			Set<WorkOrderSchedule> workOrderSchedules,
			Set<WorkOrderComments> workOrderCommentses,
			Set<WorkPositionPoints> workPositionPointses,
			Set<WorkOrderHazards> workOrderHazardses) {
		this.objectref = objectref;
		this.contactpersonByLocationContactId = contactpersonByLocationContactId;
		this.contactpersonByRequestContactId = contactpersonByRequestContactId;
		this.workOrderName = workOrderName;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.mrid = mrid;
		this.kind = kind;
		this.updatedAt = updatedAt;
		this.requestDatetime = requestDatetime;
		this.updatedBy = updatedBy;
		this.status = status;
		this.statusKind = statusKind;
		this.priorityJustification = priorityJustification;
		this.priorityRank = priorityRank;
		this.priorityType = priorityType;
		this.comments = comments;
		this.description = description;
		this.title = title;
		this.addressId = addressId;
		this.gridLocation = gridLocation;
		this.locationComment = locationComment;
		this.gpsLatitude = gpsLatitude;
		this.gpsLongitude = gpsLongitude;
		this.gpsAltitude = gpsAltitude;
		this.internalBuildingName = internalBuildingName;
		this.internalBuildingNum = internalBuildingNum;
		this.internalFloor = internalFloor;
		this.internalRoomNum = internalRoomNum;
		this.workOrderWorkTaskses = workOrderWorkTaskses;
		this.workOrderNameses = workOrderNameses;
		this.workOrderLocationObjectRefses = workOrderLocationObjectRefses;
		this.workOrderAttachmentses = workOrderAttachmentses;
		this.workOrderSchedules = workOrderSchedules;
		this.workOrderCommentses = workOrderCommentses;
		this.workPositionPointses = workPositionPointses;
		this.workOrderHazardses = workOrderHazardses;
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

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "primary_object_ref_id")
	public Objectref getObjectref() {
		return this.objectref;
	}

	public void setObjectref(Objectref objectref) {
		this.objectref = objectref;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "location_contact_id")
	public Contactperson getContactpersonByLocationContactId() {
		return this.contactpersonByLocationContactId;
	}

	public void setContactpersonByLocationContactId(
			Contactperson contactpersonByLocationContactId) {
		this.contactpersonByLocationContactId = contactpersonByLocationContactId;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "request_contact_id")
	public Contactperson getContactpersonByRequestContactId() {
		return this.contactpersonByRequestContactId;
	}

	public void setContactpersonByRequestContactId(
			Contactperson contactpersonByRequestContactId) {
		this.contactpersonByRequestContactId = contactpersonByRequestContactId;
	}

	@Column(name = "work_order_name", nullable = false, length = 40)
	public String getWorkOrderName() {
		return this.workOrderName;
	}

	public void setWorkOrderName(String workOrderName) {
		con.check( "setWorkOrderName", workOrderName, false, 40);
		this.workOrderName = workOrderName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "created_by", nullable = false, length = 20)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		con.check( "setCreatedBy", createdBy, false, 20);
		this.createdBy = createdBy;
	}

	@Column(name = "mRid", nullable = false, length = 40)
	public String getMrid() {
		return this.mrid;
	}

	public void setMrid(String mrid) {
		con.check( "setMrid", mrid, false, 40);
		this.mrid = mrid;
	}

	@Column(name = "kind", nullable = false, length = 12)
	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		con.check( "setKind", kind, false, 12);
		this.kind = kind;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		log.debug("setUpdatedAt : " + (updatedAt == null  ? "not set" : updatedAt.toString()));
		this.updatedAt = updatedAt;
	}


	@Column(name = "request_datetime", length = 19)
	public java.sql.Timestamp getRequestDatetime() {
		return this.requestDatetime;
	}

	public void setRequestDatetime(java.sql.Timestamp requestDatetime) {
		log.debug("setRequestDatetime : " + requestDatetime.toString());
		this.requestDatetime = requestDatetime;
	}

	@Column(name = "updated_by", length = 20)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		con.check( "setUpdatedBy", updatedBy, true, 20);
		this.updatedBy = updatedBy;
	}

	@Column(name = "status", nullable = false, length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		con.check( "setStatus", status, false, 10);
		this.status = status;
	}

	@Column(name = "status_kind", length = 10)
	public String getStatusKind() {
		return this.statusKind;
	}

	public void setStatusKind(String statusKind) {
		con.check( "setStatusKind", statusKind, true, 10);
		this.statusKind = statusKind;
	}

	@Column(name = "priority_justification", length = 10)
	public String getPriorityJustification() {
		return this.priorityJustification;
	}

	public void setPriorityJustification(String priorityJustification) {
		con.check( "setPriorityJustification", priorityJustification, true, 10);
		this.priorityJustification = priorityJustification;
	}

	@Column(name = "priority_rank")
	public Integer getPriorityRank() {
		return this.priorityRank;
	}

	public void setPriorityRank(Integer priorityRank) {
		log.debug("setPriorityRank : " + priorityRank);		
		this.priorityRank = priorityRank;
	}

	@Column(name = "priority_type", length = 10)
	public String getPriorityType() {
		return this.priorityType;
	}

	public void setPriorityType(String priorityType) {
		con.check( "setPriorityType", priorityType, true, 10);
		this.priorityType = priorityType;
	}

	@Column(name = "comments", length = 1024)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		con.check( "setComments", comments, true, 1024);
		this.comments = comments;
	}

	@Column(name = "description", length = 256)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		con.check( "setDescription", description, true, 256);
		this.description = description;
	}

	@Column(name = "title", length = 40)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		con.check( "setTitle", title, true, 40);
		this.title = title;
	}

	@Column(name = "address_id")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "grid_location", length = 40)
	public String getGridLocation() {
		return this.gridLocation;
	}

	public void setGridLocation(String gridLocation) {
		this.gridLocation = gridLocation;
	}

	@Column(name = "location_comment", length = 512)
	public String getLocationComment() {
		return this.locationComment;
	}

	public void setLocationComment(String locationComment) {
		con.check( "setLocationComment", locationComment, true, 512);
		this.locationComment = locationComment;
	}

	@Column(name = "gps_latitude", precision = 12, scale = 0)
	public Float getGpsLatitude() {
		return this.gpsLatitude;
	}

	public void setGpsLatitude(Float gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	@Column(name = "gps_longitude", precision = 12, scale = 0)
	public Float getGpsLongitude() {
		return this.gpsLongitude;
	}

	public void setGpsLongitude(Float gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	@Column(name = "gps_altitude", precision = 12, scale = 0)
	public Float getGpsAltitude() {
		return this.gpsAltitude;
	}

	public void setGpsAltitude(Float gpsAltitude) {
		this.gpsAltitude = gpsAltitude;
	}

	@Column(name = "internal_building_name", length = 20)
	public String getInternalBuildingName() {
		return this.internalBuildingName;
	}

	public void setInternalBuildingName(String internalBuildingName) {
		con.check( "setInternalBuildingName", internalBuildingName, true, 20);
		this.internalBuildingName = internalBuildingName;
	}

	@Column(name = "internal_building_num", length = 8)
	public String getInternalBuildingNum() {
		return this.internalBuildingNum;
	}

	public void setInternalBuildingNum(String internalBuildingNum) {
		con.check( "setInternalBuildingNum", internalBuildingNum, true, 8);
		this.internalBuildingNum = internalBuildingNum;
	}

	@Column(name = "internal_floor", length = 3)
	public String getInternalFloor() {
		return this.internalFloor;
	}

	public void setInternalFloor(String internalFloor) {
		con.check( "setInternalFloor", internalFloor, true, 3);
		this.internalFloor = internalFloor;
	}

	@Column(name = "internal_room_num", length = 5)
	public String getInternalRoomNum() {
		return this.internalRoomNum;
	}

	public void setInternalRoomNum(String internalRoomNum) {
		con.check( "setInternalRoomNum", internalRoomNum, true, 5);
		this.internalRoomNum = internalRoomNum;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderWorkTasks> getWorkOrderWorkTaskses() {
		return this.workOrderWorkTaskses;
	}

	public void setWorkOrderWorkTaskses(
			Set<WorkOrderWorkTasks> workOrderWorkTaskses) {
		this.workOrderWorkTaskses = workOrderWorkTaskses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderNames> getWorkOrderNameses() {
		return this.workOrderNameses;
	}

	public void setWorkOrderNameses(Set<WorkOrderNames> workOrderNameses) {
		this.workOrderNameses = workOrderNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderLocationObjectRefs> getWorkOrderLocationObjectRefses() {
		return this.workOrderLocationObjectRefses;
	}

	public void setWorkOrderLocationObjectRefses(
			Set<WorkOrderLocationObjectRefs> workOrderLocationObjectRefses) {
		this.workOrderLocationObjectRefses = workOrderLocationObjectRefses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderAttachments> getWorkOrderAttachmentses() {
		return this.workOrderAttachmentses;
	}

	public void setWorkOrderAttachmentses(
			Set<WorkOrderAttachments> workOrderAttachmentses) {
		this.workOrderAttachmentses = workOrderAttachmentses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderSchedule> getWorkOrderSchedules() {
		return this.workOrderSchedules;
	}

	public void setWorkOrderSchedules(Set<WorkOrderSchedule> workOrderSchedules) {
		this.workOrderSchedules = workOrderSchedules;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderComments> getWorkOrderCommentses() {
		return this.workOrderCommentses;
	}

	public void setWorkOrderCommentses(
			Set<WorkOrderComments> workOrderCommentses) {
		this.workOrderCommentses = workOrderCommentses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkPositionPoints> getWorkPositionPointses() {
		return this.workPositionPointses;
	}

	public void setWorkPositionPointses(
			Set<WorkPositionPoints> workPositionPointses) {
		this.workPositionPointses = workPositionPointses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workOrder")
	public Set<WorkOrderHazards> getWorkOrderHazardses() {
		return this.workOrderHazardses;
	}

	public void setWorkOrderHazardses(Set<WorkOrderHazards> workOrderHazardses) {
		this.workOrderHazardses = workOrderHazardses;
	}

}
