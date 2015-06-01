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
  `coord_system` varchar(12) DEFAULT NULL COMMENT 'cim.work.worklocation.coordinatesystem',
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

/*Table structure for table `address_hazards` */

DROP TABLE IF EXISTS `address_hazards`;

CREATE TABLE `address_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `hazard_id` int(11) NOT NULL COMMENT 'foreign to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_address_hazards_address_id` (`address_id`),
  KEY `fk_address_hazards_hazard_id` (`hazard_id`),
  CONSTRAINT `fk_address_hazards_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_address_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset.hazards';

/*Data for the table `address_hazards` */

/*Table structure for table `address_position_points` */

DROP TABLE IF EXISTS `address_position_points`;

CREATE TABLE `address_position_points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `sequence` int(5) DEFAULT NULL COMMENT 'cim.asset.location',
  `xposition` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  `yposition` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  `zposition` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  PRIMARY KEY (`id`),
  KEY `fk_address_position_points_address_id` (`address_id`),
  CONSTRAINT `fk_address_position_points_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset  position points';

/*Data for the table `address_position_points` */

/*Table structure for table `asset` */

DROP TABLE IF EXISTS `asset`;

CREATE TABLE `asset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(40) NOT NULL COMMENT 'cim.asset.mRID',
  `critical_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'cim.asset',
  `utc_number` varchar(40) DEFAULT NULL COMMENT 'cim.asset',
  `address_id` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset';

/*Data for the table `asset` */

/*Table structure for table `asset_names` */

DROP TABLE IF EXISTS `asset_names`;

CREATE TABLE `asset_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `name` varchar(40) NOT NULL COMMENT 'cim.name',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to nametype',
  PRIMARY KEY (`id`),
  KEY `fk_asset_names_nametype_id` (`name_type_id`),
  KEY `fk_asset_names_objectid` (`asset_id`),
  CONSTRAINT `fk_asset_names_nametype_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_asset_names_objectid` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_names` */

/*Table structure for table `asset_procedures` */

DROP TABLE IF EXISTS `asset_procedures`;

CREATE TABLE `asset_procedures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `procedure_id` int(11) NOT NULL COMMENT 'foreign to procedure',
  PRIMARY KEY (`id`),
  KEY `fk_asset_procedures_asset_id` (`asset_id`),
  KEY `fk_asset_procedures_procedure_id` (`procedure_id`),
  CONSTRAINT `fk_asset_procedures_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_asset_procedures_procedure_id` FOREIGN KEY (`procedure_id`) REFERENCES `procedure` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_procedures` */

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
  `objectid` varchar(40) DEFAULT NULL COMMENT 'msp identified_object',
  PRIMARY KEY (`id`)
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

/*Table structure for table `eprilog` */

DROP TABLE IF EXISTS `eprilog`;

CREATE TABLE `eprilog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` longtext,
  `contentType` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `encoding` varchar(255) DEFAULT NULL,
  `faultCode` longtext,
  `header` longtext,
  `httpMethod` longtext,
  `message` varchar(255) DEFAULT NULL,
  `messageId` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  `payload` longtext,
  `responseCode` longtext,
  `resultCode` varchar(255) DEFAULT NULL,
  `INTERFACE_ID` int(11) DEFAULT NULL,
  `stage` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `INTERFACE_ID` (`INTERFACE_ID`),
  CONSTRAINT `EpriLog_ibfk_1` FOREIGN KEY (`INTERFACE_ID`) REFERENCES `interface` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=728 DEFAULT CHARSET=latin1;

/*Data for the table `eprilog` */

/*Table structure for table `hazards` */

DROP TABLE IF EXISTS `hazards`;

CREATE TABLE `hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hazard_name` varchar(12) NOT NULL COMMENT 'cim.asset.location.hazards',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hazards` */

/*Table structure for table `interface` */

DROP TABLE IF EXISTS `interface`;

CREATE TABLE `interface` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `package_id` int(11) NOT NULL,
  `proxy_flag` int(1) DEFAULT '0',
  `required_flag` int(1) DEFAULT '1',
  `vendor_role_type_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `i_interface_name` (`name`),
  KEY `package_id` (`package_id`),
  KEY `vendor_role_type_id` (`vendor_role_type_id`),
  CONSTRAINT `interface_ibfk_1` FOREIGN KEY (`package_id`) REFERENCES `package` (`id`),
  CONSTRAINT `interface_ibfk_2` FOREIGN KEY (`vendor_role_type_id`) REFERENCES `vendor_role_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `interface` */

insert  into `interface`(`id`,`name`,`package_id`,`proxy_flag`,`required_flag`,`vendor_role_type_id`) values (1,'MD_CIS-MDM_Create(MeterServiceRequest)',1,1,1,1),(2,'MD_CIS-MDM_Request_Reply(MeterServiceRequest)',1,0,0,1),(3,'MD_CIS-MDM_Request_Updated(MeterServiceRequest)',1,0,0,1),(4,'MD_MDM-CIS_Request_Create(MeterServiceRequest)',1,0,0,2),(5,'MD-MDM-CIS_Reply(MeterServiceRequest)',1,1,1,2),(6,'MD_MDM-AMI_Create(EndDeviceControls)',1,1,1,2),(7,'MD_MDM-AMI_Request_Reply(EndDeviceControls)',1,0,0,2),(8,'MD_MDM-AMI_Create(MeterReadings)',1,1,1,2),(9,'MD_MDM-AMI_Request_Reply(MeterReadings)',1,0,0,2),(10,'MD_MDM-AMI_Request_Created(MeterReadings)',1,0,0,2),(11,'MD_MDM-AMI_Updated(MeterServiceRequest)',1,1,1,2),(12,'MD_AMI-MDM_Request_Create(EndDeviceControls)',1,0,0,3),(13,'MD_AMI-MDM_Reply(EndDeviceControls)',1,1,1,3),(14,'MD_AMI-MDM_Request_Create(EndDeviceControls)',1,0,0,3),(15,'MD_AMI-MDM_Reply(MeterReadings)',1,1,1,3),(16,'MD_AMI-MDM_Created(MeterReadings)',1,1,1,3),(17,'OD_CIS-MDM_Get(MeterReading)',2,1,1,1),(18,'OD_CIS-MDM_Reply(MeterReading)',2,0,0,1),(19,'OD_CIS-AMI_Get(MeterReading)',2,1,1,1),(20,'OD_CIS-AMI_Reply(MeterReading)',2,0,0,1),(21,'OD_CIS-MDM_Get(7MeterReading)',2,1,1,1),(22,'OD_CIS-MDM_Reply(8MeterReading)',2,0,0,1),(23,'OD_MDM-CIS_Get(MeterReading)',2,0,0,2),(24,'OD_MDM-CIS_Reply(MeterReading)',2,1,1,2),(25,'OD_MDM-AMI_Get(MeterReading)',2,1,1,2),(26,'OD_MDM-AMI_Reply(MeterReading)',2,0,0,2),(27,'OD_MDM-CIS_Get(7MeterReading)',2,0,0,2),(28,'OD_MDM-CIS_Reply(8MeterReading)',2,1,1,2),(29,'OD_AMI-MDM_Get(MeterReading)',2,0,0,3),(30,'OD_AMI-MDM_Reply(MeterReading)',2,1,1,3),(31,'OD_AMI-CIS_Get(MeterReading)',2,0,0,3),(32,'OD_AMI-CIS_Reply(MeterReading)',2,1,1,3),(80,'GetDomainMembers',9,0,1,8),(81,'GetDomainNames',9,0,1,8),(82,'CreateDERGroups',9,0,1,8),(83,'DeleteDERGroups',9,0,1,8),(84,'GetAllDERs',9,0,1,8),(85,'GetAttachmentsByObjectRefs',9,0,1,8),(86,'GetDERGroupForecasts',9,0,1,8),(87,'GetDERGroupStatusesByDERGroupIDs',9,0,1,8),(88,'GetDERGroupStatusesByDERGroupIDs',9,0,1,8),(90,'GetMethods',9,0,1,8),(91,'InitiateDERGroupDispatchRequests',9,0,1,8),(92,'InsertDERsInDERGroup',9,0,1,8),(93,'LinkAttachmentsToObjects',9,0,1,8),(94,'PingURL',9,0,1,8),(95,'RemoveDERsFromDERGroup',9,0,1,8),(96,'UnlinkAttachmentsFromObjects',9,0,1,8),(100,'GetDomainMembers',10,0,1,8),(101,'GetDomainNames',10,0,1,8),(102,'CreateDERGroups',10,0,1,8),(103,'DeleteDERGroups',10,0,1,8),(104,'GetAllDERs',10,0,1,8),(105,'GetAttachmentsByObjectRefs',10,0,1,8),(106,'GetDERGroupForecasts',10,0,1,8),(107,'GetDERGroupStatusesByDERGroupIDs',10,0,1,8),(109,'GetDERsByDERID',10,0,1,8),(110,'GetMethods',10,0,1,8),(111,'InitiateDERGroupDispatchRequests',10,0,1,8),(112,'InsertDERsInDERGroup',10,0,1,8),(113,'LinkAttachmentsToObjects',10,0,1,8),(114,'PingURL',10,0,1,8),(115,'RemoveDERsFromDERGroup',10,0,1,8),(116,'UnlinkAttachmentsFromObjects',10,0,1,8),(120,'CIM_DER(getDERGroupStatus)',11,0,1,9),(121,'CIM_DER(getDERGroupCapabilities)',11,0,1,9),(122,'CIM_DER(getDERGroup)',11,0,1,9),(123,'CIM_DER(deleteDERGroup)',11,0,1,9),(124,'CIM_DER(createDERGroupForecast)',11,0,1,9),(125,'CIM_DER(changedDERGroupStatus)',11,0,1,9),(126,'CIM_DER(createDERGroupCapabilities)',11,0,1,9),(127,'CIM_DER(changedDERGroup)',11,0,1,9),(128,'CIM_DER(createDERGroupDispatch)',11,0,1,9),(129,'CIM_DER(createDERGroup)',11,0,1,9),(130,'CIM_DER(requestChangedDERGroups)',12,0,1,9),(131,'CIM_DER(changedDERGroupStatus)',12,0,1,9),(132,'CIM_DER(requestCreateDERGroup)',12,0,1,9),(133,'CIM_DER(requestCreateDERGroupCapabilities)',12,0,1,9),(134,'CIM_DER(requestCreateDERGroupForecast)',12,0,1,9),(135,'CIM_DER(requestDeleteDERGroup)',12,0,1,9),(136,'CIM_DER(requestGetDERGroup)',12,0,1,9),(137,'CIM_DER(requestGetDERGroupCapabilities)',12,0,1,9),(138,'CIM_DER(requestGetDERGroupStatus)',12,0,1,9),(139,'CIM_DER(requestCreateDERGroupDispatch)',12,0,1,9);

/*Table structure for table `material_item` */

DROP TABLE IF EXISTS `material_item`;

CREATE TABLE `material_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `multiplier` float DEFAULT NULL,
  `unit` varchar(12) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.materialitem';

/*Data for the table `material_item` */

/*Table structure for table `material_item_names` */

DROP TABLE IF EXISTS `material_item_names`;

CREATE TABLE `material_item_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_item_id` int(11) NOT NULL COMMENT 'foreign to material_item',
  `name` varchar(40) NOT NULL,
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to nametype',
  PRIMARY KEY (`id`),
  KEY `fk_material_item_material_id` (`material_item_id`),
  KEY `fk_material_item_names_nametype_id` (`name_type_id`),
  CONSTRAINT `fk_material_item_material_id` FOREIGN KEY (`material_item_id`) REFERENCES `material_item` (`id`),
  CONSTRAINT `fk_material_item_names_nametype_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `material_item_names` */

/*Table structure for table `measurement` */

DROP TABLE IF EXISTS `measurement`;

CREATE TABLE `measurement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) DEFAULT NULL,
  `phases` varchar(4) DEFAULT NULL,
  `unit_multiplier` float DEFAULT NULL,
  `unit_symbol` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `measurement` */

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

/*Table structure for table `package` */

DROP TABLE IF EXISTS `package`;

CREATE TABLE `package` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `i_package_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `package` */

insert  into `package`(`id`,`name`) values (11,'CIM DER Control'),(12,'CIM DER Request'),(1,'Meter Connect'),(4,'Meter Tamper'),(9,'MSP DER Control'),(10,'MSP DER Request'),(2,'OnDemand Read'),(5,'Outage Management'),(3,'Scheduled Read');

/*Table structure for table `packages_vendor_role_types` */

DROP TABLE IF EXISTS `packages_vendor_role_types`;

CREATE TABLE `packages_vendor_role_types` (
  `package_id` int(11) DEFAULT NULL,
  `vendor_role_type_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `packages_vendor_role_types` */

insert  into `packages_vendor_role_types`(`package_id`,`vendor_role_type_id`) values (1,1),(1,2),(1,3),(2,1),(2,2),(3,2),(4,2),(4,1),(4,3),(2,3),(3,3),(5,2),(5,4),(10,8),(11,9),(12,9),(9,8);

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

/*Table structure for table `procedure` */

DROP TABLE IF EXISTS `procedure`;

CREATE TABLE `procedure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instruction` varchar(512) NOT NULL,
  `kind` varchar(20) DEFAULT NULL,
  `sequence` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset';

/*Data for the table `procedure` */

/*Table structure for table `procedure_measurements` */

DROP TABLE IF EXISTS `procedure_measurements`;

CREATE TABLE `procedure_measurements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `procedure_id` int(11) NOT NULL COMMENT 'foreign to procedure',
  `measurement_id` int(11) NOT NULL COMMENT 'foreign to measurement',
  PRIMARY KEY (`id`),
  KEY `fk_procedure_measurements_procedure_id` (`procedure_id`),
  KEY `fk_procedure_measurements_measurement_id` (`measurement_id`),
  CONSTRAINT `fk_procedure_measurements_measurement_id` FOREIGN KEY (`measurement_id`) REFERENCES `measurement` (`id`),
  CONSTRAINT `fk_procedure_measurements_procedure_id` FOREIGN KEY (`procedure_id`) REFERENCES `procedure` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `procedure_measurements` */

/*Table structure for table `proxy_interface` */

DROP TABLE IF EXISTS `proxy_interface`;

CREATE TABLE `proxy_interface` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interface_id` int(11) DEFAULT NULL,
  `proxy_url` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_id` (`interface_id`),
  CONSTRAINT `proxy_interface_ibfk_1` FOREIGN KEY (`interface_id`) REFERENCES `interface` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `proxy_interface` */

/*Table structure for table `request` */

DROP TABLE IF EXISTS `request`;

CREATE TABLE `request` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `request` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `request` */

/*Table structure for table `resultcode` */

DROP TABLE IF EXISTS `resultcode`;

CREATE TABLE `resultcode` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `resultcode` */

/*Table structure for table `seqs` */

DROP TABLE IF EXISTS `seqs`;

CREATE TABLE `seqs` (
  `seq_name` varchar(30) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `increment` int(11) DEFAULT NULL,
  `curval` int(11) DEFAULT NULL,
  `flag` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `seqs` */

insert  into `seqs`(`seq_name`,`start`,`increment`,`curval`,`flag`) values ('message_id',1,1,29,'A');

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

/*Table structure for table `vendor_role` */

DROP TABLE IF EXISTS `vendor_role`;

CREATE TABLE `vendor_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `vendor_role_type_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vendor_role_type_id` (`vendor_role_type_id`),
  CONSTRAINT `vendor_role_ibfk_1` FOREIGN KEY (`vendor_role_type_id`) REFERENCES `vendor_role_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `vendor_role` */

/*Table structure for table `vendor_role_type` */

DROP TABLE IF EXISTS `vendor_role_type`;

CREATE TABLE `vendor_role_type` (
  `id` int(11) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  `active_flag` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vendor_role_type` */

insert  into `vendor_role_type`(`id`,`name`,`active_flag`) values (1,'CIS',1),(2,'MDMS',1),(3,'AMI',1),(4,'OMS',1),(8,'MSP DER',1),(9,'CIM DER',1);

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
  `internal_building_name` varchar(20) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `internal_building_num` varchar(8) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `internal_floor` varchar(3) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `internal_room_num` varchar(5) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
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

/*Table structure for table `work_order_work_tasks` */

DROP TABLE IF EXISTS `work_order_work_tasks`;

CREATE TABLE `work_order_work_tasks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_work_tasks_order_id` (`work_order_id`),
  KEY `fk_work_order_work_tasks_task_id` (`work_task_id`),
  CONSTRAINT `fk_work_order_work_tasks_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`),
  CONSTRAINT `fk_work_order_work_tasks_task_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_order_work_tasks` */

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
  `crew_eta` timestamp NULL DEFAULT NULL COMMENT 'cim work.worktask.creweta',
  `task_type` varchar(12) DEFAULT NULL COMMENT 'cim.work.worktask.taskKind',
  `old_asset_id` int(11) DEFAULT NULL COMMENT 'cim.work.worktask.oldAsset',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_old_asset_id` (`old_asset_id`),
  CONSTRAINT `fk_work_task_old_asset_id` FOREIGN KEY (`old_asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks';

/*Data for the table `work_task` */

/*Table structure for table `work_task_assets` */

DROP TABLE IF EXISTS `work_task_assets`;

CREATE TABLE `work_task_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'created timestamp',
  `created_by` varchar(20) DEFAULT NULL COMMENT 'created by',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_asset_id` (`asset_id`),
  KEY `fk_work_task_assets_work_id` (`work_task_id`),
  CONSTRAINT `fk_work_task_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_work_task_assets_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.assets';

/*Data for the table `work_task_assets` */

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

/*Table structure for table `work_task_material_items` */

DROP TABLE IF EXISTS `work_task_material_items`;

CREATE TABLE `work_task_material_items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `material_item_id` int(11) NOT NULL COMMENT 'foreign to material_item',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_material_items_mat_id` (`material_item_id`),
  KEY `fk_work_task_material_items_work_id` (`work_task_id`),
  CONSTRAINT `fk_work_task_material_items_mat_id` FOREIGN KEY (`material_item_id`) REFERENCES `material_item` (`id`),
  CONSTRAINT `fk_work_task_material_items_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_task_material_items` */

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

/*Table structure for table `work_task_time_schedules` */

DROP TABLE IF EXISTS `work_task_time_schedules`;

CREATE TABLE `work_task_time_schedules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `time_schedule_id` int(11) NOT NULL COMMENT 'foreign to time_schedule',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_time_schedule_work_id` (`work_task_id`),
  KEY `fk_work_task_time_schedules_time_id` (`time_schedule_id`),
  CONSTRAINT `fk_work_task_time_schedule_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`),
  CONSTRAINT `fk_work_task_time_schedules_time_id` FOREIGN KEY (`time_schedule_id`) REFERENCES `time_schedule` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_task_time_schedules` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
