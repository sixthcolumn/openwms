/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.6.21-log : Database - wms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`wms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `wms`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sd_address_1` varchar(20) DEFAULT NULL COMMENT 'msp.address.address_1, cim.work_location.streetaddress.address_general',
  `sd_address_2` varchar(20) DEFAULT NULL COMMENT 'msp.address.address_2, cim.worklocation.streetdetail.name',
  `sd_building_name` varchar(20) DEFAULT NULL COMMENT 'msp.address..building_number, cim.work_location.streetdetail.building_name',
  `sd_code` varchar(20) DEFAULT NULL COMMENT 'cim.worklocation.streetdetail.code',
  `sd_number` varchar(8) DEFAULT NULL COMMENT 'msp.address..streetnumber, cim.worklocation.streetdetail.number',
  `sd_prefix` varchar(10) DEFAULT NULL COMMENT 'msp.address..streetprefix, cim.worklocation.streetdetail.prefix',
  `sd_suffix` varchar(10) DEFAULT NULL COMMENT 'msp.address..streetsuffix, cim.worklocation.streetdetail.suffix',
  `sd_suite_number` varchar(10) DEFAULT NULL COMMENT 'msp.address..suiteNumber, cim.worklocation.streetdetail.suitenumber',
  `sd_type` varchar(10) DEFAULT NULL COMMENT 'msp.address..streettype, cim.worklocation.streetdetail.type',
  `sd_within_town_limits_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'cim.worklocation.streetdetail.withintownlimits',
  `td_code` varchar(20) DEFAULT NULL COMMENT 'msp.address.townCode, cim.worklocation.towndetail.code',
  `td_country` varchar(20) DEFAULT NULL COMMENT 'cim.worklocation.towndetail.country, msp.address..country',
  `td_name` varchar(20) DEFAULT NULL COMMENT 'msp.address.city,cim.worklocation.towndetail.name',
  `td_section` varchar(3) DEFAULT NULL COMMENT 'cim.worklocation.towndetail.section,msp.',
  `td_state_province` varchar(20) DEFAULT NULL COMMENT 'cim.worklocation.towndetail.state,msp.address.state',
  `directions` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationComment,cim.worklocation.direction',
  `td_pobox` varchar(10) DEFAULT NULL COMMENT 'msp.worklocation.address.pobox',
  `td_postal_code` varchar(10) DEFAULT NULL COMMENT 'msp.worklocation.postalcode',
  `td_region` varchar(12) DEFAULT NULL COMMENT 'msp.worklocation.address.region',
  `county` varchar(20) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.county',
  `township_name` varchar(30) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.townshipname',
  `subdivision` varchar(20) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.subdivision',
  `block` varchar(6) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.block',
  `lot` varchar(6) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.lot',
  `time_zone` varchar(15) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.time_zone',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

/*Table structure for table `address_districts` */

DROP TABLE IF EXISTS `address_districts`;

CREATE TABLE `address_districts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `district_id` int(11) NOT NULL COMMENT 'foreign to district',
  PRIMARY KEY (`id`),
  KEY `fk_address_districts_address_id` (`address_id`),
  KEY `fk_address_districts_district_id` (`district_id`),
  CONSTRAINT `fk_address_districts_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_address_districts_district_id` FOREIGN KEY (`district_id`) REFERENCES `district` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address_districts` */

/*Table structure for table `attachment` */

DROP TABLE IF EXISTS `attachment`;

CREATE TABLE `attachment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) NOT NULL COMMENT 'picture/video',
  `filename` varchar(256) NOT NULL COMMENT 'path to file on server',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `attachment` */

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(512) NOT NULL COMMENT 'msp.supplementalnote.notevalue',
  `comment_type` varchar(12) DEFAULT NULL COMMENT 'msp.supplementalnote.notetype',
  `comment_subtype` varchar(12) DEFAULT NULL COMMENT 'msp.supplementalnote.notesubtype',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `contactperson` */

DROP TABLE IF EXISTS `contactperson`;

CREATE TABLE `contactperson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastname` varchar(20) NOT NULL COMMENT 'msp.workrequest.requestingperson',
  `firstname` varchar(20) NOT NULL COMMENT 'msp.workrequest.requestingperson',
  `middle` varchar(20) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `prefix` varchar(5) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `suffix` varchar(5) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `governmentid` varchar(20) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `affiliation` varchar(20) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `primary_id` varchar(20) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `secondary_id` varchar(20) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `identified_object_id` int(11) DEFAULT NULL COMMENT 'foreign to identified_object',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_identified_object` (`identified_object_id`),
  CONSTRAINT `fk_contactperson_identified_object` FOREIGN KEY (`identified_object_id`) REFERENCES `identified_object` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contactperson` */

/*Table structure for table `contactperson_addresses` */

DROP TABLE IF EXISTS `contactperson_addresses`;

CREATE TABLE `contactperson_addresses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contact_person',
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `address_type` varchar(12) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.addressitems.addressitem',
  `priority_order` int(3) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.addressitems.addressitem',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_addresses_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_addresses_address_id` (`address_id`),
  CONSTRAINT `fk_contactperson_addresses_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_contactperson_addresses_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contactperson_addresses` */

/*Table structure for table `contactperson_emails` */

DROP TABLE IF EXISTS `contactperson_emails`;

CREATE TABLE `contactperson_emails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contactperson',
  `email_id` int(11) NOT NULL COMMENT 'foreign to email',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_emails_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_emails_email_id` (`email_id`),
  CONSTRAINT `fk_contactperson_emails_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_contactperson_emails_email_id` FOREIGN KEY (`email_id`) REFERENCES `email` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contactperson_emails` */

/*Table structure for table `contactperson_other_contactinfos` */

DROP TABLE IF EXISTS `contactperson_other_contactinfos`;

CREATE TABLE `contactperson_other_contactinfos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contactperson',
  `other_contactinfo_id` int(11) NOT NULL COMMENT 'foreign to other_contactinfo',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_other_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_other_other_contactinfo_id` (`other_contactinfo_id`),
  CONSTRAINT `fk_contactperson_other_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_contactperson_other_other_contactinfo_id` FOREIGN KEY (`other_contactinfo_id`) REFERENCES `other_contactinfo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contactperson_other_contactinfos` */

/*Table structure for table `contactperson_phones` */

DROP TABLE IF EXISTS `contactperson_phones`;

CREATE TABLE `contactperson_phones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contactperson',
  `phone_id` int(11) NOT NULL COMMENT 'foreign to phone',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_phones_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_phones_phone+id` (`phone_id`),
  CONSTRAINT `fk_contactperson_phones_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_contactperson_phones_phone+id` FOREIGN KEY (`phone_id`) REFERENCES `phone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contactperson_phones` */

/*Table structure for table `crew` */

DROP TABLE IF EXISTS `crew`;

CREATE TABLE `crew` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(20) NOT NULL COMMENT 'cim.crew',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `crew` */

/*Table structure for table `crew_names` */

DROP TABLE IF EXISTS `crew_names`;

CREATE TABLE `crew_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_id` int(11) NOT NULL COMMENT 'foreign key to crew',
  `name` varchar(20) NOT NULL COMMENT 'cim.crew',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign key to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_crew_names_crew_id` (`crew_id`),
  KEY `fk_crew_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_crew_names_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_crew_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `crew_names` */

/*Table structure for table `district` */

DROP TABLE IF EXISTS `district`;

CREATE TABLE `district` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `name` varchar(20) NOT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `code` varchar(12) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `description` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `district` */

/*Table structure for table `email` */

DROP TABLE IF EXISTS `email`;

CREATE TABLE `email` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  `email_type` varchar(10) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  `priority_order` int(3) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `email` */

/*Table structure for table `hazards` */

DROP TABLE IF EXISTS `hazards`;

CREATE TABLE `hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hazard_name` varchar(12) NOT NULL COMMENT 'cim.asset.location.hazards',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hazards` */

/*Table structure for table `identified_object` */

DROP TABLE IF EXISTS `identified_object`;

CREATE TABLE `identified_object` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(40) NOT NULL COMMENT 'cim.asset.mRID, msp.identifiedobject.mRID',
  `description` varchar(512) DEFAULT NULL COMMENT 'map.identifiedobject',
  `critical_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'cim.asset',
  `utc_number` varchar(40) DEFAULT NULL COMMENT 'cim.asset',
  `coord_system` varchar(12) DEFAULT NULL COMMENT 'cim.asset',
  `address_id` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='this is a combination of cim.asset and msp.identified_object';

/*Data for the table `identified_object` */

/*Table structure for table `identified_object_hazards` */

DROP TABLE IF EXISTS `identified_object_hazards`;

CREATE TABLE `identified_object_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identified_object_id` int(11) NOT NULL COMMENT 'foreign to identified_object',
  `hazard_id` int(11) NOT NULL COMMENT 'foreign to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_identified_object_hazards_hazard_id` (`hazard_id`),
  KEY `fk_identified_object_hazards_identified_object_id` (`identified_object_id`),
  CONSTRAINT `fk_identified_object_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`),
  CONSTRAINT `fk_identified_object_hazards_identified_object_id` FOREIGN KEY (`identified_object_id`) REFERENCES `identified_object` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset.hazards';

/*Data for the table `identified_object_hazards` */

/*Table structure for table `identified_object_names` */

DROP TABLE IF EXISTS `identified_object_names`;

CREATE TABLE `identified_object_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identified_object_id` int(11) NOT NULL COMMENT 'foreign to identified_object',
  `name` varchar(40) NOT NULL COMMENT 'msp.name,cim.name',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to nametype',
  PRIMARY KEY (`id`),
  KEY `fk_identified_object_names_objectid` (`identified_object_id`),
  KEY `fk_identified_object_names_nametype_id` (`name_type_id`),
  CONSTRAINT `fk_identified_object_names_nametype_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_identified_object_names_objectid` FOREIGN KEY (`identified_object_id`) REFERENCES `identified_object` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `identified_object_names` */

/*Table structure for table `identified_object_position_points` */

DROP TABLE IF EXISTS `identified_object_position_points`;

CREATE TABLE `identified_object_position_points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identified_object_id` int(11) NOT NULL COMMENT 'foreign to identified_object',
  `sequence` int(5) DEFAULT NULL COMMENT 'cim.asset',
  `xposition` int(11) DEFAULT NULL COMMENT 'cim.asset',
  `yposition` int(11) DEFAULT NULL COMMENT 'cim.asset',
  `zposition` int(11) DEFAULT NULL COMMENT 'cim.asset',
  PRIMARY KEY (`id`),
  KEY `fk_identified_object_position_id` (`identified_object_id`),
  CONSTRAINT `fk_identified_object_position_id` FOREIGN KEY (`identified_object_id`) REFERENCES `identified_object` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset  position points';

/*Data for the table `identified_object_position_points` */

/*Table structure for table `name_type_authority` */

DROP TABLE IF EXISTS `name_type_authority`;

CREATE TABLE `name_type_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT 'cim.nametypeauthority, msp.nametypeauthority',
  `description` varchar(255) DEFAULT NULL COMMENT 'cim.nametypeauthority, msp.nametypeauthority',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `name_type_authority` */

/*Table structure for table `nametype` */

DROP TABLE IF EXISTS `nametype`;

CREATE TABLE `nametype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT 'cim.nametype,msp.nametype',
  `name_type_authority_id` int(11) NOT NULL COMMENT 'foreign to name_type_autohtiry',
  PRIMARY KEY (`id`),
  KEY `fk_name_type_authority_id` (`name_type_authority_id`),
  CONSTRAINT `fk_name_type_authority_id` FOREIGN KEY (`name_type_authority_id`) REFERENCES `name_type_authority` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nametype` */

/*Table structure for table `objectref` */

DROP TABLE IF EXISTS `objectref`;

CREATE TABLE `objectref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `primary_name` varchar(40) NOT NULL COMMENT 'msp.objectref',
  `secondary_name` varchar(40) DEFAULT NULL COMMENT 'msp.objectref',
  `noun` varchar(12) DEFAULT NULL COMMENT 'msp.objectref',
  `object_guid` varchar(40) DEFAULT NULL COMMENT 'msp.objectref',
  `utility` varchar(12) DEFAULT NULL COMMENT 'msp.objectref',
  `registered_name` varchar(40) DEFAULT NULL COMMENT 'msp.objectref',
  `system_name` varchar(40) DEFAULT NULL COMMENT 'msp.objectref',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `objectref` */

/*Table structure for table `organization` */

DROP TABLE IF EXISTS `organization`;

CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(40) NOT NULL COMMENT 'cim.organization',
  `address_id` int(11) DEFAULT NULL COMMENT 'foreign to address',
  `phone_id` int(11) DEFAULT NULL COMMENT 'foreign to phone',
  PRIMARY KEY (`id`),
  KEY `fk_organization_phone_id` (`phone_id`),
  KEY `fk_organization_address_id` (`address_id`),
  CONSTRAINT `fk_organization_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_organization_phone_id` FOREIGN KEY (`phone_id`) REFERENCES `phone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `organization` */

/*Table structure for table `organization_names` */

DROP TABLE IF EXISTS `organization_names`;

CREATE TABLE `organization_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `organization_id` int(11) NOT NULL COMMENT 'foreign to organization',
  `name` varchar(20) NOT NULL COMMENT 'cim.organization.names',
  `name_type_id` int(11) NOT NULL COMMENT 'foreign key to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_organization_names_organization_id` (`organization_id`),
  KEY `fk_organization_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_organization_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_organization_names_organization_id` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `organization_names` */

/*Table structure for table `other_contactinfo` */

DROP TABLE IF EXISTS `other_contactinfo`;

CREATE TABLE `other_contactinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `details` varchar(30) NOT NULL COMMENT 'msp.other_contactinfo',
  `info_type` varchar(10) DEFAULT NULL COMMENT 'msp.other_contactinfo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `other_contactinfo` */

/*Table structure for table `phone` */

DROP TABLE IF EXISTS `phone`;

CREATE TABLE `phone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `areacode` varchar(5) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `citycode` varchar(5) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `countrycode` varchar(3) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `localnumber` varchar(10) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `extension` int(5) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `phonetype` varchar(10) DEFAULT NULL COMMENT 'msp.phone',
  `priorityorder` int(3) DEFAULT NULL COMMENT 'msp.phone',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `phone` */

/*Table structure for table `time_schedule` */

DROP TABLE IF EXISTS `time_schedule`;

CREATE TABLE `time_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) NOT NULL COMMENT 'cim.timeschedule',
  `start_tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'cim.timeschedule',
  `end_tstamp` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT 'cim.timeschedule',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `time_schedule` */

/*Table structure for table `work_order` */

DROP TABLE IF EXISTS `work_order`;

CREATE TABLE `work_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_name` varchar(40) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` varchar(20) NOT NULL,
  `mRid` varchar(40) NOT NULL COMMENT 'master resource id',
  `kind` varchar(12) NOT NULL COMMENT 'type of work',
  `updated_at` timestamp NULL DEFAULT NULL,
  `request_datetime` timestamp NULL DEFAULT NULL COMMENT 'date and time work was requested',
  `updated_by` varchar(20) DEFAULT NULL,
  `status` varchar(10) NOT NULL COMMENT 'status of work order',
  `status_kind` varchar(10) DEFAULT NULL COMMENT 'kind of work status',
  `priority_justification` varchar(10) DEFAULT NULL COMMENT 'justification for rank',
  `priority_rank` int(5) DEFAULT NULL COMMENT 'lower number = higher priority',
  `priority_type` varchar(10) DEFAULT NULL COMMENT 'type of priority',
  `comments` varchar(1024) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `title` varchar(40) DEFAULT NULL,
  `request_contact_id` int(11) DEFAULT NULL COMMENT 'foreign to contact_person',
  `address_id` int(11) DEFAULT NULL COMMENT 'foreign to address',
  `primary_object_ref_id` int(11) DEFAULT NULL COMMENT 'foreign to objectref',
  `grid_location` varchar(40) DEFAULT NULL COMMENT 'grid location',
  `location_comment` varchar(512) DEFAULT NULL COMMENT 'comment about location',
  `location_contact_id` int(11) DEFAULT NULL COMMENT 'foreign to contactperson',
  `gps_latitude` float DEFAULT NULL COMMENT 'msp.workrequest.worklocation',
  `gps_longitude` float DEFAULT NULL COMMENT 'msp.workrequest.worklocation',
  `gps_altitude` float DEFAULT NULL COMMENT 'msp.workrequest.worklocation',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_request_contact_id` (`request_contact_id`),
  KEY `fk_work_order_primary_object_id` (`primary_object_ref_id`),
  KEY `fk_work_order_location_contact_id` (`location_contact_id`),
  CONSTRAINT `fk_work_order_location_contact_id` FOREIGN KEY (`location_contact_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_work_order_primary_object_id` FOREIGN KEY (`primary_object_ref_id`) REFERENCES `objectref` (`id`),
  CONSTRAINT `fk_work_order_request_contact_id` FOREIGN KEY (`request_contact_id`) REFERENCES `contactperson` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='msp, cim  \r\nworkrequest';

/*Data for the table `work_order` */

/*Table structure for table `work_order_attachments` */

DROP TABLE IF EXISTS `work_order_attachments`;

CREATE TABLE `work_order_attachments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `attachment_id` int(11) NOT NULL COMMENT 'foreign to attachment',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_attachments_attachment_id` (`attachment_id`),
  KEY `fk_work_order_attachments_work_order_id` (`work_order_id`),
  CONSTRAINT `fk_work_order_attachments_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`id`),
  CONSTRAINT `fk_work_order_attachments_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_order_attachments` */

/*Table structure for table `work_order_comments` */

DROP TABLE IF EXISTS `work_order_comments`;

CREATE TABLE `work_order_comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `comment_id` int(11) NOT NULL COMMENT 'foreign to comment',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_comments_work_order_id` (`work_order_id`),
  KEY `fk_work_order_comments_comment_id` (`comment_id`),
  CONSTRAINT `fk_work_order_comments_comment_id` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`),
  CONSTRAINT `fk_work_order_comments_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='msp.workrequest.supplementalnotes\r\n';

/*Data for the table `work_order_comments` */

/*Table structure for table `work_order_hazards` */

DROP TABLE IF EXISTS `work_order_hazards`;

CREATE TABLE `work_order_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `hazard_id` int(11) NOT NULL COMMENT 'foreigh to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_hazards_work_id` (`work_order_id`),
  KEY `fk_work_order_hazards_hazard_id` (`hazard_id`),
  CONSTRAINT `fk_work_order_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`),
  CONSTRAINT `fk_work_order_hazards_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.worklocation.hazards';

/*Data for the table `work_order_hazards` */

/*Table structure for table `work_order_location_object_refs` */

DROP TABLE IF EXISTS `work_order_location_object_refs`;

CREATE TABLE `work_order_location_object_refs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `loc_ref_object_id` int(11) NOT NULL COMMENT 'foreign to objectref',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_location_object_refs_work_id` (`work_order_id`),
  KEY `fk_work_order_location_object_refs_locref_objid` (`loc_ref_object_id`),
  CONSTRAINT `fk_work_order_location_object_refs_locref_objid` FOREIGN KEY (`loc_ref_object_id`) REFERENCES `objectref` (`id`),
  CONSTRAINT `fk_work_order_location_object_refs_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='msp.workrequest.locationreferences.objectrefs';

/*Data for the table `work_order_location_object_refs` */

/*Table structure for table `work_order_names` */

DROP TABLE IF EXISTS `work_order_names`;

CREATE TABLE `work_order_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT 'work order name',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to name_type',
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_names_work_order_id` (`work_order_id`),
  KEY `fk_work_order_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_work_order_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_work_order_names_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.workrequest.names';

/*Data for the table `work_order_names` */

/*Table structure for table `work_order_schedule` */

DROP TABLE IF EXISTS `work_order_schedule`;

CREATE TABLE `work_order_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign key to work_order',
  `time_schedule_id` int(11) NOT NULL COMMENT 'foreign key to time_schedule',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_schedule_work_order_id` (`work_order_id`),
  KEY `fk_work_order_schedule_time_schedule_id` (`time_schedule_id`),
  CONSTRAINT `fk_work_order_schedule_time_schedule_id` FOREIGN KEY (`time_schedule_id`) REFERENCES `time_schedule` (`id`),
  CONSTRAINT `fk_work_order_schedule_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.timeschedules\r\n';

/*Data for the table `work_order_schedule` */

/*Table structure for table `work_position_points` */

DROP TABLE IF EXISTS `work_position_points`;

CREATE TABLE `work_position_points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `sequence_num` int(5) DEFAULT NULL,
  `xposition` int(11) DEFAULT NULL,
  `yposition` int(11) DEFAULT NULL,
  `zposition` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_work_position_points_work_id` (`work_order_id`),
  CONSTRAINT `fk_work_position_points_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worklocation.pospoints\r\n';

/*Data for the table `work_position_points` */

/*Table structure for table `work_task` */

DROP TABLE IF EXISTS `work_task`;

CREATE TABLE `work_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(20) NOT NULL COMMENT 'master resource id',
  `instructions` varchar(1024) DEFAULT NULL COMMENT 'instructions for performing this task',
  `subject` varchar(20) NOT NULL COMMENT 'document subject',
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_work_order_id` (`work_order_id`),
  CONSTRAINT `fk_work_task_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks';

/*Data for the table `work_task` */

/*Table structure for table `work_task_crews` */

DROP TABLE IF EXISTS `work_task_crews`;

CREATE TABLE `work_task_crews` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `crew_id` int(11) NOT NULL COMMENT 'foreign to crew',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_crews_work_id` (`work_task_id`),
  KEY `fk_work_task_crews_crew_id` (`crew_id`),
  CONSTRAINT `fk_work_task_crews_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_work_task_crews_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks.crews';

/*Data for the table `work_task_crews` */

/*Table structure for table `work_task_identified_objects` */

DROP TABLE IF EXISTS `work_task_identified_objects`;

CREATE TABLE `work_task_identified_objects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `identified_object_id` int(11) NOT NULL COMMENT 'foreign to identified_object',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'created timestamp',
  `created_by` varchar(20) DEFAULT NULL COMMENT 'created by',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_identified_objects_identified_object_id` (`identified_object_id`),
  KEY `fk_work_task_identified_object_work_id` (`work_task_id`),
  CONSTRAINT `fk_work_task_identified_object_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`),
  CONSTRAINT `fk_work_task_identified_objects_identified_object_id` FOREIGN KEY (`identified_object_id`) REFERENCES `identified_object` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.assets';

/*Data for the table `work_task_identified_objects` */

/*Table structure for table `work_task_names` */

DROP TABLE IF EXISTS `work_task_names`;

CREATE TABLE `work_task_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_names_work_id` (`work_task_id`),
  KEY `fk_work_task_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_work_task_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_work_task_names_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.names';

/*Data for the table `work_task_names` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
