-- MySQL dump 10.13  Distrib 5.6.20, for osx10.8 (x86_64)
--
-- Host: localhost    Database: wms
-- ------------------------------------------------------
-- Server version	5.6.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=134 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address_districts`
--

DROP TABLE IF EXISTS `address_districts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address_districts`
--

LOCK TABLES `address_districts` WRITE;
/*!40000 ALTER TABLE `address_districts` DISABLE KEYS */;
/*!40000 ALTER TABLE `address_districts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address_hazards`
--

DROP TABLE IF EXISTS `address_hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address_hazards`
--

LOCK TABLES `address_hazards` WRITE;
/*!40000 ALTER TABLE `address_hazards` DISABLE KEYS */;
/*!40000 ALTER TABLE `address_hazards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address_position_points`
--

DROP TABLE IF EXISTS `address_position_points`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address_position_points`
--

LOCK TABLES `address_position_points` WRITE;
/*!40000 ALTER TABLE `address_position_points` DISABLE KEYS */;
/*!40000 ALTER TABLE `address_position_points` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asset`
--

DROP TABLE IF EXISTS `asset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(40) NOT NULL COMMENT 'cim.asset.mRID',
  `critical_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'cim.asset',
  `utc_number` varchar(40) DEFAULT NULL COMMENT 'cim.asset',
  `address_id` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  PRIMARY KEY (`id`),
  KEY `address_id` (`address_id`),
  CONSTRAINT `asset_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='cim.asset';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asset`
--

LOCK TABLES `asset` WRITE;
/*!40000 ALTER TABLE `asset` DISABLE KEYS */;
/*!40000 ALTER TABLE `asset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asset_names`
--

DROP TABLE IF EXISTS `asset_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asset_names`
--

LOCK TABLES `asset_names` WRITE;
/*!40000 ALTER TABLE `asset_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `asset_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asset_procedures`
--

DROP TABLE IF EXISTS `asset_procedures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asset_procedures`
--

LOCK TABLES `asset_procedures` WRITE;
/*!40000 ALTER TABLE `asset_procedures` DISABLE KEYS */;
/*!40000 ALTER TABLE `asset_procedures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attachment`
--

DROP TABLE IF EXISTS `attachment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attachment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) NOT NULL COMMENT 'picture/video',
  `filename` varchar(256) NOT NULL COMMENT 'path to file on server',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attachment`
--

LOCK TABLES `attachment` WRITE;
/*!40000 ALTER TABLE `attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `attachment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(512) NOT NULL COMMENT 'msp.supplementalnote.notevalue',
  `comment_type` varchar(12) DEFAULT NULL COMMENT 'msp.supplementalnote.notetype',
  `comment_subtype` varchar(12) DEFAULT NULL COMMENT 'msp.supplementalnote.notesubtype',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactperson`
--

DROP TABLE IF EXISTS `contactperson`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactperson`
--

LOCK TABLES `contactperson` WRITE;
/*!40000 ALTER TABLE `contactperson` DISABLE KEYS */;
/*!40000 ALTER TABLE `contactperson` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactperson_addresses`
--

DROP TABLE IF EXISTS `contactperson_addresses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactperson_addresses`
--

LOCK TABLES `contactperson_addresses` WRITE;
/*!40000 ALTER TABLE `contactperson_addresses` DISABLE KEYS */;
/*!40000 ALTER TABLE `contactperson_addresses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactperson_emails`
--

DROP TABLE IF EXISTS `contactperson_emails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactperson_emails`
--

LOCK TABLES `contactperson_emails` WRITE;
/*!40000 ALTER TABLE `contactperson_emails` DISABLE KEYS */;
/*!40000 ALTER TABLE `contactperson_emails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactperson_other_contactinfos`
--

DROP TABLE IF EXISTS `contactperson_other_contactinfos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactperson_other_contactinfos`
--

LOCK TABLES `contactperson_other_contactinfos` WRITE;
/*!40000 ALTER TABLE `contactperson_other_contactinfos` DISABLE KEYS */;
/*!40000 ALTER TABLE `contactperson_other_contactinfos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactperson_phones`
--

DROP TABLE IF EXISTS `contactperson_phones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactperson_phones`
--

LOCK TABLES `contactperson_phones` WRITE;
/*!40000 ALTER TABLE `contactperson_phones` DISABLE KEYS */;
/*!40000 ALTER TABLE `contactperson_phones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crew`
--

DROP TABLE IF EXISTS `crew`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(20) NOT NULL COMMENT 'cim.crew',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crew`
--

LOCK TABLES `crew` WRITE;
/*!40000 ALTER TABLE `crew` DISABLE KEYS */;
/*!40000 ALTER TABLE `crew` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crew_names`
--

DROP TABLE IF EXISTS `crew_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crew_names`
--

LOCK TABLES `crew_names` WRITE;
/*!40000 ALTER TABLE `crew_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `crew_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `district` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `name` varchar(20) NOT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `code` varchar(12) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `description` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  `email_type` varchar(10) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  `priority_order` int(3) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email`
--

LOCK TABLES `email` WRITE;
/*!40000 ALTER TABLE `email` DISABLE KEYS */;
/*!40000 ALTER TABLE `email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eprilog`
--

DROP TABLE IF EXISTS `eprilog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=1051 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eprilog`
--

LOCK TABLES `eprilog` WRITE;
/*!40000 ALTER TABLE `eprilog` DISABLE KEYS */;
/*!40000 ALTER TABLE `eprilog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hazards`
--

DROP TABLE IF EXISTS `hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hazard_name` varchar(12) NOT NULL COMMENT 'cim.asset.location.hazards',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hazards`
--

LOCK TABLES `hazards` WRITE;
/*!40000 ALTER TABLE `hazards` DISABLE KEYS */;
/*!40000 ALTER TABLE `hazards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identified_object`
--

DROP TABLE IF EXISTS `identified_object`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identified_object`
--

LOCK TABLES `identified_object` WRITE;
/*!40000 ALTER TABLE `identified_object` DISABLE KEYS */;
/*!40000 ALTER TABLE `identified_object` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identified_object_hazards`
--

DROP TABLE IF EXISTS `identified_object_hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identified_object_hazards`
--

LOCK TABLES `identified_object_hazards` WRITE;
/*!40000 ALTER TABLE `identified_object_hazards` DISABLE KEYS */;
/*!40000 ALTER TABLE `identified_object_hazards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identified_object_names`
--

DROP TABLE IF EXISTS `identified_object_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identified_object_names`
--

LOCK TABLES `identified_object_names` WRITE;
/*!40000 ALTER TABLE `identified_object_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `identified_object_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identified_object_position_points`
--

DROP TABLE IF EXISTS `identified_object_position_points`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identified_object_position_points`
--

LOCK TABLES `identified_object_position_points` WRITE;
/*!40000 ALTER TABLE `identified_object_position_points` DISABLE KEYS */;
/*!40000 ALTER TABLE `identified_object_position_points` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identified_object_procedures`
--

DROP TABLE IF EXISTS `identified_object_procedures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identified_object_procedures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identified_object_id` int(11) NOT NULL COMMENT 'foreign to identified_object',
  `procedure_id` int(11) NOT NULL COMMENT 'foreign to procedure',
  PRIMARY KEY (`id`),
  KEY `fk_identified_object_object_id` (`identified_object_id`),
  KEY `fk_identified_object_procedure_id` (`procedure_id`),
  CONSTRAINT `fk_identified_object_object_id` FOREIGN KEY (`identified_object_id`) REFERENCES `identified_object` (`id`),
  CONSTRAINT `fk_identified_object_procedure_id` FOREIGN KEY (`procedure_id`) REFERENCES `procedure` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identified_object_procedures`
--

LOCK TABLES `identified_object_procedures` WRITE;
/*!40000 ALTER TABLE `identified_object_procedures` DISABLE KEYS */;
/*!40000 ALTER TABLE `identified_object_procedures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interface`
--

DROP TABLE IF EXISTS `interface`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interface`
--

LOCK TABLES `interface` WRITE;
/*!40000 ALTER TABLE `interface` DISABLE KEYS */;
INSERT INTO `interface` VALUES (1,'MD_CIS-MDM_Create(MeterServiceRequest)',1,1,1,1),(2,'MD_CIS-MDM_Request_Reply(MeterServiceRequest)',1,0,0,1),(3,'MD_CIS-MDM_Request_Updated(MeterServiceRequest)',1,0,0,1),(4,'MD_MDM-CIS_Request_Create(MeterServiceRequest)',1,0,0,2),(5,'MD-MDM-CIS_Reply(MeterServiceRequest)',1,1,1,2),(6,'MD_MDM-AMI_Create(EndDeviceControls)',1,1,1,2),(7,'MD_MDM-AMI_Request_Reply(EndDeviceControls)',1,0,0,2),(8,'MD_MDM-AMI_Create(MeterReadings)',1,1,1,2),(9,'MD_MDM-AMI_Request_Reply(MeterReadings)',1,0,0,2),(10,'MD_MDM-AMI_Request_Created(MeterReadings)',1,0,0,2),(11,'MD_MDM-AMI_Updated(MeterServiceRequest)',1,1,1,2),(12,'MD_AMI-MDM_Request_Create(EndDeviceControls)',1,0,0,3),(13,'MD_AMI-MDM_Reply(EndDeviceControls)',1,1,1,3),(14,'MD_AMI-MDM_Request_Create(EndDeviceControls)',1,0,0,3),(15,'MD_AMI-MDM_Reply(MeterReadings)',1,1,1,3),(16,'MD_AMI-MDM_Created(MeterReadings)',1,1,1,3),(17,'OD_CIS-MDM_Get(MeterReading)',2,1,1,1),(18,'OD_CIS-MDM_Reply(MeterReading)',2,0,0,1),(19,'OD_CIS-AMI_Get(MeterReading)',2,1,1,1),(20,'OD_CIS-AMI_Reply(MeterReading)',2,0,0,1),(21,'OD_CIS-MDM_Get(7MeterReading)',2,1,1,1),(22,'OD_CIS-MDM_Reply(8MeterReading)',2,0,0,1),(23,'OD_MDM-CIS_Get(MeterReading)',2,0,0,2),(24,'OD_MDM-CIS_Reply(MeterReading)',2,1,1,2),(25,'OD_MDM-AMI_Get(MeterReading)',2,1,1,2),(26,'OD_MDM-AMI_Reply(MeterReading)',2,0,0,2),(27,'OD_MDM-CIS_Get(7MeterReading)',2,0,0,2),(28,'OD_MDM-CIS_Reply(8MeterReading)',2,1,1,2),(29,'OD_AMI-MDM_Get(MeterReading)',2,0,0,3),(30,'OD_AMI-MDM_Reply(MeterReading)',2,1,1,3),(31,'OD_AMI-CIS_Get(MeterReading)',2,0,0,3),(32,'OD_AMI-CIS_Reply(MeterReading)',2,1,1,3),(80,'GetDomainMembers',9,0,1,8),(81,'GetDomainNames',9,0,1,8),(82,'CreateDERGroups',9,0,1,8),(83,'DeleteDERGroups',9,0,1,8),(84,'GetAllDERs',9,0,1,8),(85,'GetAttachmentsByObjectRefs',9,0,1,8),(86,'GetDERGroupForecasts',9,0,1,8),(87,'GetDERGroupStatusesByDERGroupIDs',9,0,1,8),(88,'GetDERGroupStatusesByDERGroupIDs',9,0,1,8),(90,'GetMethods',9,0,1,8),(91,'InitiateDERGroupDispatchRequests',9,0,1,8),(92,'InsertDERsInDERGroup',9,0,1,8),(93,'LinkAttachmentsToObjects',9,0,1,8),(94,'PingURL',9,0,1,8),(95,'RemoveDERsFromDERGroup',9,0,1,8),(96,'UnlinkAttachmentsFromObjects',9,0,1,8),(100,'GetDomainMembers',10,0,1,8),(101,'GetDomainNames',10,0,1,8),(102,'CreateDERGroups',10,0,1,8),(103,'DeleteDERGroups',10,0,1,8),(104,'GetAllDERs',10,0,1,8),(105,'GetAttachmentsByObjectRefs',10,0,1,8),(106,'GetDERGroupForecasts',10,0,1,8),(107,'GetDERGroupStatusesByDERGroupIDs',10,0,1,8),(109,'GetDERsByDERID',10,0,1,8),(110,'GetMethods',10,0,1,8),(111,'InitiateDERGroupDispatchRequests',10,0,1,8),(112,'InsertDERsInDERGroup',10,0,1,8),(113,'LinkAttachmentsToObjects',10,0,1,8),(114,'PingURL',10,0,1,8),(115,'RemoveDERsFromDERGroup',10,0,1,8),(116,'UnlinkAttachmentsFromObjects',10,0,1,8),(120,'CIM_DER(getDERGroupStatus)',11,0,1,9),(121,'CIM_DER(getDERGroupCapabilities)',11,0,1,9),(122,'CIM_DER(getDERGroup)',11,0,1,9),(123,'CIM_DER(deleteDERGroup)',11,0,1,9),(124,'CIM_DER(createDERGroupForecast)',11,0,1,9),(125,'CIM_DER(changedDERGroupStatus)',11,0,1,9),(126,'CIM_DER(createDERGroupCapabilities)',11,0,1,9),(127,'CIM_DER(changedDERGroup)',11,0,1,9),(128,'CIM_DER(createDERGroupDispatch)',11,0,1,9),(129,'CIM_DER(createDERGroup)',11,0,1,9),(130,'CIM_DER(requestChangedDERGroups)',12,0,1,9),(131,'CIM_DER(changedDERGroupStatus)',12,0,1,9),(132,'CIM_DER(requestCreateDERGroup)',12,0,1,9),(133,'CIM_DER(requestCreateDERGroupCapabilities)',12,0,1,9),(134,'CIM_DER(requestCreateDERGroupForecast)',12,0,1,9),(135,'CIM_DER(requestDeleteDERGroup)',12,0,1,9),(136,'CIM_DER(requestGetDERGroup)',12,0,1,9),(137,'CIM_DER(requestGetDERGroupCapabilities)',12,0,1,9),(138,'CIM_DER(requestGetDERGroupStatus)',12,0,1,9),(139,'CIM_DER(requestCreateDERGroupDispatch)',12,0,1,9);
/*!40000 ALTER TABLE `interface` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material_item`
--

DROP TABLE IF EXISTS `material_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `multiplier` float DEFAULT NULL,
  `unit` varchar(12) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.materialitem';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material_item`
--

LOCK TABLES `material_item` WRITE;
/*!40000 ALTER TABLE `material_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `material_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material_item_names`
--

DROP TABLE IF EXISTS `material_item_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material_item_names`
--

LOCK TABLES `material_item_names` WRITE;
/*!40000 ALTER TABLE `material_item_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `material_item_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measurement`
--

DROP TABLE IF EXISTS `measurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measurement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) DEFAULT NULL,
  `phases` varchar(4) DEFAULT NULL,
  `unit_multiplier` float DEFAULT NULL,
  `unit_symbol` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurement`
--

LOCK TABLES `measurement` WRITE;
/*!40000 ALTER TABLE `measurement` DISABLE KEYS */;
/*!40000 ALTER TABLE `measurement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `name_type_authority`
--

DROP TABLE IF EXISTS `name_type_authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `name_type_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL COMMENT 'cim.nametypeauthority, msp.nametypeauthority',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=199 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `name_type_authority`
--

LOCK TABLES `name_type_authority` WRITE;
/*!40000 ALTER TABLE `name_type_authority` DISABLE KEYS */;
/*!40000 ALTER TABLE `name_type_authority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nametype`
--

DROP TABLE IF EXISTS `nametype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nametype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `name_type_authority_id` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_name_type_authority_id` (`name_type_authority_id`),
  CONSTRAINT `fk_name_type_authority_id` FOREIGN KEY (`name_type_authority_id`) REFERENCES `name_type_authority` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=213 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nametype`
--

LOCK TABLES `nametype` WRITE;
/*!40000 ALTER TABLE `nametype` DISABLE KEYS */;
/*!40000 ALTER TABLE `nametype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `objectref`
--

DROP TABLE IF EXISTS `objectref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `objectref`
--

LOCK TABLES `objectref` WRITE;
/*!40000 ALTER TABLE `objectref` DISABLE KEYS */;
/*!40000 ALTER TABLE `objectref` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization`
--

DROP TABLE IF EXISTS `organization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=198 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization`
--

LOCK TABLES `organization` WRITE;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization_names`
--

DROP TABLE IF EXISTS `organization_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `organization_id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `name_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_organization_names_organization_id` (`organization_id`),
  KEY `fk_organization_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_organization_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_organization_names_organization_id` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization_names`
--

LOCK TABLES `organization_names` WRITE;
/*!40000 ALTER TABLE `organization_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `other_contactinfo`
--

DROP TABLE IF EXISTS `other_contactinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `other_contactinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `details` varchar(30) NOT NULL COMMENT 'msp.other_contactinfo',
  `info_type` varchar(10) DEFAULT NULL COMMENT 'msp.other_contactinfo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `other_contactinfo`
--

LOCK TABLES `other_contactinfo` WRITE;
/*!40000 ALTER TABLE `other_contactinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `other_contactinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `package`
--

DROP TABLE IF EXISTS `package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `package` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `i_package_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `package`
--

LOCK TABLES `package` WRITE;
/*!40000 ALTER TABLE `package` DISABLE KEYS */;
INSERT INTO `package` VALUES (11,'CIM DER Control'),(12,'CIM DER Request'),(1,'Meter Connect'),(4,'Meter Tamper'),(9,'MSP DER Control'),(10,'MSP DER Request'),(2,'OnDemand Read'),(5,'Outage Management'),(3,'Scheduled Read');
/*!40000 ALTER TABLE `package` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packages_vendor_role_types`
--

DROP TABLE IF EXISTS `packages_vendor_role_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packages_vendor_role_types` (
  `package_id` int(11) DEFAULT NULL,
  `vendor_role_type_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packages_vendor_role_types`
--

LOCK TABLES `packages_vendor_role_types` WRITE;
/*!40000 ALTER TABLE `packages_vendor_role_types` DISABLE KEYS */;
INSERT INTO `packages_vendor_role_types` VALUES (1,1),(1,2),(1,3),(2,1),(2,2),(3,2),(4,2),(4,1),(4,3),(2,3),(3,3),(5,2),(5,4),(10,8),(11,9),(12,9),(9,8);
/*!40000 ALTER TABLE `packages_vendor_role_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phone`
--

DROP TABLE IF EXISTS `phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `areacode` varchar(5) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `citycode` varchar(5) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `countrycode` varchar(3) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `localnumber` varchar(10) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `extension` varchar(10) DEFAULT NULL,
  `phonetype` varchar(10) DEFAULT NULL COMMENT 'msp.phone',
  `priorityorder` int(3) DEFAULT NULL COMMENT 'msp.phone',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phone`
--

LOCK TABLES `phone` WRITE;
/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
/*!40000 ALTER TABLE `phone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `procedure`
--

DROP TABLE IF EXISTS `procedure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `procedure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instruction` varchar(512) NOT NULL,
  `kind` varchar(20) DEFAULT NULL,
  `sequence` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='cim.asset';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `procedure`
--

LOCK TABLES `procedure` WRITE;
/*!40000 ALTER TABLE `procedure` DISABLE KEYS */;
/*!40000 ALTER TABLE `procedure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `procedure_measurements`
--

DROP TABLE IF EXISTS `procedure_measurements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `procedure_measurements`
--

LOCK TABLES `procedure_measurements` WRITE;
/*!40000 ALTER TABLE `procedure_measurements` DISABLE KEYS */;
/*!40000 ALTER TABLE `procedure_measurements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proxy_interface`
--

DROP TABLE IF EXISTS `proxy_interface`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proxy_interface` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interface_id` int(11) DEFAULT NULL,
  `proxy_url` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_id` (`interface_id`),
  CONSTRAINT `proxy_interface_ibfk_1` FOREIGN KEY (`interface_id`) REFERENCES `interface` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proxy_interface`
--

LOCK TABLES `proxy_interface` WRITE;
/*!40000 ALTER TABLE `proxy_interface` DISABLE KEYS */;
/*!40000 ALTER TABLE `proxy_interface` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `request` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `request` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request`
--

LOCK TABLES `request` WRITE;
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
/*!40000 ALTER TABLE `request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultcode`
--

DROP TABLE IF EXISTS `resultcode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resultcode` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultcode`
--

LOCK TABLES `resultcode` WRITE;
/*!40000 ALTER TABLE `resultcode` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultcode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seqs`
--

DROP TABLE IF EXISTS `seqs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seqs` (
  `seq_name` varchar(30) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `increment` int(11) DEFAULT NULL,
  `curval` int(11) DEFAULT NULL,
  `flag` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seqs`
--

LOCK TABLES `seqs` WRITE;
/*!40000 ALTER TABLE `seqs` DISABLE KEYS */;
/*!40000 ALTER TABLE `seqs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `time_schedule`
--

DROP TABLE IF EXISTS `time_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `time_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(12) NOT NULL COMMENT 'cim.timeschedule',
  `start_tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'cim.timeschedule',
  `end_tstamp` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT 'cim.timeschedule',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time_schedule`
--

LOCK TABLES `time_schedule` WRITE;
/*!40000 ALTER TABLE `time_schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `time_schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor_role`
--

DROP TABLE IF EXISTS `vendor_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `vendor_role_type_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vendor_role_type_id` (`vendor_role_type_id`),
  CONSTRAINT `vendor_role_ibfk_1` FOREIGN KEY (`vendor_role_type_id`) REFERENCES `vendor_role_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor_role`
--

LOCK TABLES `vendor_role` WRITE;
/*!40000 ALTER TABLE `vendor_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor_role_type`
--

DROP TABLE IF EXISTS `vendor_role_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor_role_type` (
  `id` int(11) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  `active_flag` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor_role_type`
--

LOCK TABLES `vendor_role_type` WRITE;
/*!40000 ALTER TABLE `vendor_role_type` DISABLE KEYS */;
INSERT INTO `vendor_role_type` VALUES (1,'CIS',1),(2,'MDMS',1),(3,'AMI',1),(4,'OMS',1),(8,'MSP DER',1),(9,'CIM DER',1);
/*!40000 ALTER TABLE `vendor_role_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order`
--

DROP TABLE IF EXISTS `work_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 COMMENT='msp, cim  \r\nworkrequest';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order`
--

LOCK TABLES `work_order` WRITE;
/*!40000 ALTER TABLE `work_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_attachments`
--

DROP TABLE IF EXISTS `work_order_attachments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_attachments`
--

LOCK TABLES `work_order_attachments` WRITE;
/*!40000 ALTER TABLE `work_order_attachments` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_attachments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_comments`
--

DROP TABLE IF EXISTS `work_order_comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_comments`
--

LOCK TABLES `work_order_comments` WRITE;
/*!40000 ALTER TABLE `work_order_comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_hazards`
--

DROP TABLE IF EXISTS `work_order_hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `hazard_id` int(11) NOT NULL COMMENT 'foreigh to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_hazards_work_id` (`work_order_id`),
  KEY `fk_work_order_hazards_hazard_id` (`hazard_id`),
  CONSTRAINT `fk_work_order_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`),
  CONSTRAINT `fk_work_order_hazards_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8 COMMENT='cim.worklocation.hazards';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_hazards`
--

LOCK TABLES `work_order_hazards` WRITE;
/*!40000 ALTER TABLE `work_order_hazards` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_hazards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_location_object_refs`
--

DROP TABLE IF EXISTS `work_order_location_object_refs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_location_object_refs`
--

LOCK TABLES `work_order_location_object_refs` WRITE;
/*!40000 ALTER TABLE `work_order_location_object_refs` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_location_object_refs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_names`
--

DROP TABLE IF EXISTS `work_order_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to name_type',
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_names_work_order_id` (`work_order_id`),
  KEY `fk_work_order_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_work_order_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_work_order_names_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8 COMMENT='cim.workrequest.names';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_names`
--

LOCK TABLES `work_order_names` WRITE;
/*!40000 ALTER TABLE `work_order_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_organizations`
--

DROP TABLE IF EXISTS `work_order_organizations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_organizations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `organization_id` int(11) NOT NULL COMMENT 'foreign to organization',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_organizations_organization_id` (`organization_id`),
  KEY `fk_work_order_organizations_work_order_id` (`work_order_id`),
  CONSTRAINT `fk_work_order_organizations_organization_id` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`),
  CONSTRAINT `fk_work_order_organizations_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_organizations`
--

LOCK TABLES `work_order_organizations` WRITE;
/*!40000 ALTER TABLE `work_order_organizations` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_organizations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_schedule`
--

DROP TABLE IF EXISTS `work_order_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign key to work_order',
  `time_schedule_id` int(11) NOT NULL COMMENT 'foreign key to time_schedule',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_schedule_work_order_id` (`work_order_id`),
  KEY `fk_work_order_schedule_time_schedule_id` (`time_schedule_id`),
  CONSTRAINT `fk_work_order_schedule_time_schedule_id` FOREIGN KEY (`time_schedule_id`) REFERENCES `time_schedule` (`id`),
  CONSTRAINT `fk_work_order_schedule_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='cim.work.timeschedules\r\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_schedule`
--

LOCK TABLES `work_order_schedule` WRITE;
/*!40000 ALTER TABLE `work_order_schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_order_work_tasks`
--

DROP TABLE IF EXISTS `work_order_work_tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_work_tasks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_work_tasks_order_id` (`work_order_id`),
  KEY `fk_work_order_work_tasks_task_id` (`work_task_id`),
  CONSTRAINT `fk_work_order_work_tasks_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`),
  CONSTRAINT `fk_work_order_work_tasks_task_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_order_work_tasks`
--

LOCK TABLES `work_order_work_tasks` WRITE;
/*!40000 ALTER TABLE `work_order_work_tasks` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_order_work_tasks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_position_points`
--

DROP TABLE IF EXISTS `work_position_points`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COMMENT='cim.work.worklocation.pospoints\r\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_position_points`
--

LOCK TABLES `work_position_points` WRITE;
/*!40000 ALTER TABLE `work_position_points` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_position_points` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task`
--

DROP TABLE IF EXISTS `work_task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task`
--

LOCK TABLES `work_task` WRITE;
/*!40000 ALTER TABLE `work_task` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task_assets`
--

DROP TABLE IF EXISTS `work_task_assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.assets';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task_assets`
--

LOCK TABLES `work_task_assets` WRITE;
/*!40000 ALTER TABLE `work_task_assets` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task_assets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task_crews`
--

DROP TABLE IF EXISTS `work_task_crews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_crews` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `crew_id` int(11) NOT NULL COMMENT 'foreign to crew',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_crews_work_id` (`work_task_id`),
  KEY `fk_work_task_crews_crew_id` (`crew_id`),
  CONSTRAINT `fk_work_task_crews_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_work_task_crews_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks.crews';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task_crews`
--

LOCK TABLES `work_task_crews` WRITE;
/*!40000 ALTER TABLE `work_task_crews` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task_crews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task_identified_objects`
--

DROP TABLE IF EXISTS `work_task_identified_objects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task_identified_objects`
--

LOCK TABLES `work_task_identified_objects` WRITE;
/*!40000 ALTER TABLE `work_task_identified_objects` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task_identified_objects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task_material_items`
--

DROP TABLE IF EXISTS `work_task_material_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task_material_items`
--

LOCK TABLES `work_task_material_items` WRITE;
/*!40000 ALTER TABLE `work_task_material_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task_material_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task_names`
--

DROP TABLE IF EXISTS `work_task_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task_names`
--

LOCK TABLES `work_task_names` WRITE;
/*!40000 ALTER TABLE `work_task_names` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task_names` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_task_time_schedules`
--

DROP TABLE IF EXISTS `work_task_time_schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_time_schedules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `time_schedule_id` int(11) NOT NULL COMMENT 'foreign to time_schedule',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_time_schedule_work_id` (`work_task_id`),
  KEY `fk_work_task_time_schedules_time_id` (`time_schedule_id`),
  CONSTRAINT `fk_work_task_time_schedule_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`),
  CONSTRAINT `fk_work_task_time_schedules_time_id` FOREIGN KEY (`time_schedule_id`) REFERENCES `time_schedule` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_task_time_schedules`
--

LOCK TABLES `work_task_time_schedules` WRITE;
/*!40000 ALTER TABLE `work_task_time_schedules` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_task_time_schedules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workorderimage`
--

DROP TABLE IF EXISTS `workorderimage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workorderimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `workorder_id` int(11) DEFAULT NULL,
  `url` varchar(800) DEFAULT NULL,
  `error` varchar(256) DEFAULT NULL,
  `filename` varchar(1025) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workorderimage`
--

LOCK TABLES `workorderimage` WRITE;
/*!40000 ALTER TABLE `workorderimage` DISABLE KEYS */;
/*!40000 ALTER TABLE `workorderimage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-13 16:29:10
