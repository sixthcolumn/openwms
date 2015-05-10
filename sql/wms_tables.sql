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

/*Table structure for table `asset` */

DROP TABLE IF EXISTS `asset`;

CREATE TABLE `asset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(20) NOT NULL COMMENT 'master resource id',
  `critical_flag` int(1) NOT NULL DEFAULT '0' COMMENT '1 if critical',
  `utc_number` varchar(40) NOT NULL COMMENT 'UTC number',
  `sd_address_general` varchar(20) DEFAULT NULL COMMENT 'additional address information, for example a mailstop',
  `sd_building_name` varchar(20) DEFAULT NULL COMMENT 'building name',
  `sd_code` varchar(20) DEFAULT NULL COMMENT 'external street code, if any',
  `sd_name` varchar(20) DEFAULT NULL COMMENT 'street name',
  `sd_number` varchar(8) DEFAULT NULL COMMENT 'street location designation',
  `sd_prefix` varchar(10) DEFAULT NULL COMMENT 'prefix to the street name',
  `sd_suffix` varchar(10) DEFAULT NULL COMMENT 'suffix to the street name',
  `sd_suite_number` varchar(10) DEFAULT NULL COMMENT 'number of the apartment or suite',
  `sd_type` varchar(10) DEFAULT NULL COMMENT 'type of street',
  `sd_within_town_limits_flag` int(1) NOT NULL DEFAULT '0' COMMENT '1 if street is within town limits',
  `td_code` varchar(20) DEFAULT NULL COMMENT 'town code',
  `td_country` varchar(20) DEFAULT NULL COMMENT 'name of the country',
  `td_name` varchar(20) DEFAULT NULL COMMENT 'town name',
  `td_section` varchar(3) DEFAULT NULL COMMENT 'town section',
  `td_state_province` varchar(20) DEFAULT NULL COMMENT 'state or province',
  `location_mRID` varchar(20) DEFAULT NULL COMMENT 'mRID of location',
  `directions` varchar(512) DEFAULT NULL COMMENT 'directions',
  `coord_system` varchar(12) DEFAULT NULL COMMENT 'coordinate system',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset` */

/*Table structure for table `asset_hazards` */

DROP TABLE IF EXISTS `asset_hazards`;

CREATE TABLE `asset_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `hazard_id` int(11) NOT NULL COMMENT 'foreign to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_asset_hazards_asset_id` (`asset_id`),
  KEY `fk_asset_hazards_hazard_id` (`hazard_id`),
  CONSTRAINT `fk_asset_hazards_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_asset_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_hazards` */

/*Table structure for table `asset_names` */

DROP TABLE IF EXISTS `asset_names`;

CREATE TABLE `asset_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign key to asset',
  `name` varchar(20) NOT NULL COMMENT 'name',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign key to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_asset_name_type_id` (`name_type_id`),
  KEY `fk_asset_names_asset_id` (`asset_id`),
  CONSTRAINT `fk_asset_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_asset_names_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_names` */

/*Table structure for table `asset_position_points` */

DROP TABLE IF EXISTS `asset_position_points`;

CREATE TABLE `asset_position_points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `sequence` int(5) DEFAULT NULL COMMENT 'sequence',
  `xposition` int(11) DEFAULT NULL,
  `yposition` int(11) DEFAULT NULL,
  `zposition` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_asset_position_id` (`asset_id`),
  CONSTRAINT `fk_asset_position_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_position_points` */

/*Table structure for table `crew` */

DROP TABLE IF EXISTS `crew`;

CREATE TABLE `crew` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(20) NOT NULL COMMENT 'unique resource is',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `crew` */

/*Table structure for table `crew_names` */

DROP TABLE IF EXISTS `crew_names`;

CREATE TABLE `crew_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_id` int(11) NOT NULL COMMENT 'foreign key to crew',
  `name` varchar(20) NOT NULL COMMENT 'crew name',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign key to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_crew_names_crew_id` (`crew_id`),
  KEY `fk_crew_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_crew_names_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_crew_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `crew_names` */

/*Table structure for table `hazards` */

DROP TABLE IF EXISTS `hazards`;

CREATE TABLE `hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hazard_name` varchar(12) NOT NULL COMMENT 'name of hazard',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hazards` */

/*Table structure for table `name_type_authority` */

DROP TABLE IF EXISTS `name_type_authority`;

CREATE TABLE `name_type_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT 'also unique',
  `description` varchar(255) DEFAULT NULL COMMENT 'description of this name authority',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `name_type_authority` */

/*Table structure for table `nametype` */

DROP TABLE IF EXISTS `nametype`;

CREATE TABLE `nametype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT 'also unique',
  `name_type_authority_id` int(11) NOT NULL COMMENT 'link to name_type_authority',
  PRIMARY KEY (`id`),
  KEY `fk_name_type_authority_id` (`name_type_authority_id`),
  CONSTRAINT `fk_name_type_authority_id` FOREIGN KEY (`name_type_authority_id`) REFERENCES `name_type_authority` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nametype` */

/*Table structure for table `organization` */

DROP TABLE IF EXISTS `organization`;

CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(40) NOT NULL COMMENT 'master resource id',
  `phone_area_code` varchar(10) DEFAULT NULL COMMENT 'area code of phone number',
  `phone_city_code` varchar(10) DEFAULT NULL COMMENT 'city code of phone number',
  `phone_country_code` varchar(3) DEFAULT NULL COMMENT 'country code of phone number',
  `phone_extension` varchar(10) DEFAULT NULL COMMENT 'extension of phone number',
  `phone_local_number` varchar(12) DEFAULT NULL COMMENT 'local number of phone number',
  `sd_address_general` varchar(20) DEFAULT NULL COMMENT 'additional address information, for example a mailstop',
  `sd_building_name` varchar(20) DEFAULT NULL COMMENT 'building name',
  `sd_code` varchar(20) DEFAULT NULL COMMENT 'external street code, if any',
  `sd_name` varchar(20) DEFAULT NULL COMMENT 'street name',
  `sd_number` varchar(8) DEFAULT NULL COMMENT 'street location designation',
  `sd_prefix` varchar(10) DEFAULT NULL COMMENT 'prefix to the street name',
  `sd_suffix` varchar(10) DEFAULT NULL COMMENT 'suffix to the street name',
  `sd_suite_number` varchar(10) DEFAULT NULL COMMENT 'number of the apartment or suite',
  `sd_type` varchar(10) DEFAULT NULL COMMENT 'type of street',
  `sd_within_town_limits_flag` int(1) NOT NULL DEFAULT '0' COMMENT '1 if street is within town limits',
  `td_code` varchar(20) DEFAULT NULL COMMENT 'town code',
  `td_country` varchar(20) DEFAULT NULL COMMENT 'name of the country',
  `td_name` varchar(20) DEFAULT NULL COMMENT 'town name',
  `td_section` varchar(3) DEFAULT NULL COMMENT 'town section',
  `td_state_province` varchar(20) DEFAULT NULL COMMENT 'state or province',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `organization` */

/*Table structure for table `organization_names` */

DROP TABLE IF EXISTS `organization_names`;

CREATE TABLE `organization_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `organization_id` int(11) NOT NULL COMMENT 'foreign to organization',
  `name` varchar(20) NOT NULL COMMENT 'name of this organization',
  `name_type_id` int(11) NOT NULL COMMENT 'foreign key to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_organization_names_organization_id` (`organization_id`),
  KEY `fk_organization_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_organization_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_organization_names_organization_id` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `organization_names` */

/*Table structure for table `time_schedule` */

DROP TABLE IF EXISTS `time_schedule`;

CREATE TABLE `time_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) NOT NULL COMMENT 'type of schedule',
  `start_tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'starting timestamp',
  `end_tstamp` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT 'ending timestamp',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `time_schedule` */

/*Table structure for table `work_location_names` */

DROP TABLE IF EXISTS `work_location_names`;

CREATE TABLE `work_location_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_location_mRid` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to name_type',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_location_names` */

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
  `workloc_mrid` varchar(20) NOT NULL COMMENT 'work location master resource identifier',
  `workloc_directions` varchar(512) DEFAULT NULL COMMENT 'work location directions',
  `workloc_coord_system` varchar(12) DEFAULT NULL COMMENT 'work location coordinate system',
  `workloc_address_status` varchar(10) DEFAULT NULL COMMENT 'work location status',
  `workloc_sd_address_general` varchar(20) DEFAULT NULL COMMENT 'additional address information, for example a mailstop',
  `workloc_sd_building_name` varchar(20) DEFAULT NULL COMMENT 'building name',
  `workloc_sd_code` varchar(20) DEFAULT NULL COMMENT 'external street code, if any',
  `workloc_sd_name` varchar(20) DEFAULT NULL COMMENT 'street name',
  `workloc_sd_number` varchar(8) DEFAULT NULL COMMENT 'street location designation',
  `workloc_sd_prefix` varchar(10) DEFAULT NULL COMMENT 'prefix to the street name',
  `workloc_sd_suffix` varchar(10) DEFAULT NULL COMMENT 'suffix to the street name',
  `workloc_sd_suite_number` varchar(10) DEFAULT NULL COMMENT 'number of the apartment or suite',
  `workloc_sd_type` varchar(10) DEFAULT NULL COMMENT 'type of street',
  `workloc_sd_within_town_limits_flag` int(1) NOT NULL DEFAULT '0' COMMENT '1 if street is within town limits',
  `workloc_td_code` varchar(20) DEFAULT NULL COMMENT 'town code',
  `workloc_td_country` varchar(20) DEFAULT NULL COMMENT 'name of the country',
  `workloc_td_name` varchar(20) DEFAULT NULL COMMENT 'town name',
  `workloc_td_section` varchar(3) DEFAULT NULL COMMENT 'town section',
  `workloc_td_state_province` varchar(20) DEFAULT NULL COMMENT 'state or province',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_order` */

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_order_hazards` */

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  KEY `fk_work_task_assets_work_id` (`work_task_id`),
  KEY `fk_work_task_assets_asset_id` (`asset_id`),
  CONSTRAINT `fk_work_task_assets_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_work_task_assets_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_task_crews` */

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work_task_names` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
