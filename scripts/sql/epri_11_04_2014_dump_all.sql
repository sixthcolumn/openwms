/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.6.21-log : Database - epri
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`epri` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `epri`;

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

insert  into `eprilog`(`id`,`address`,`contentType`,`create_date`,`data`,`encoding`,`faultCode`,`header`,`httpMethod`,`message`,`messageId`,`operation`,`payload`,`responseCode`,`resultCode`,`INTERFACE_ID`,`stage`) values (722,'http://localhost:8080/DERConnect/cim/request','text/xml;charset=UTF-8','2014-10-30 06:57:45',NULL,'UTF-8',NULL,'{accept-encoding=[gzip,deflate], connection=[Keep-Alive], Content-Length=[1892], content-type=[text/xml;charset=UTF-8], host=[localhost:8080], SOAPAction=[\"http://iec.ch/61968/getDERGroupCapabilities\"], user-agent=[Apache-HttpClient/4.1.1 (java 1.5)]}','POST',NULL,'0','http://iec.ch/61968/getDERGroupCapabilities','<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:req=\"http://sixthc.com/CIM/Request\" xmlns:get=\"http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage\" xmlns:mes=\"http://iec.ch/TC57/2011/schema/message\" xmlns:der=\"http://www.epri.com/2013/DERStatus#\">\n   <soapenv:Header/>\n   <soapenv:Body>\n      <req:GetDERGroupCapabilityPayload>\n         <requestURL>http://localhost:8080/DERConnect/cim/getDERGroupCapabilities</requestURL>\n         <payload>\n            <get:Header>\n               <mes:Verb>get</mes:Verb>\n              <mes:Noun>DER</mes:Noun>\n              <mes:Timestamp>2002-05-30T09:00:00</mes:Timestamp>\n              <mes:Comment>epri testing</mes:Comment> \n            </get:Header>\n            <get:Request>\n            <!--Optional:-->\n            <get:StartTime>2002-05-30T09:00:00</get:StartTime>\n            <!--Optional:-->\n            <get:EndTime>2002-05-30T09:00:00</get:EndTime>\n         </get:Request>\n            <!--Optional:-->\n            <get:Payload>\n              <der:DERGroupCapabilities>\n               <!--1 or more repetitions:-->\n               <der:DERGroupStatuses>\n                  <!--Optional:-->\n                  <der:mRID>1234</der:mRID>\n                  <!--Optional:-->\n                  <der:name>d1</der:name>\n                 \n                  <der:RequestedCapability>Watts</der:RequestedCapability>\n                  <!--Optional:-->\n                 \n               \n                  <der:DERGroup>\n                     <der:name>d1</der:name>\n                     <!--Optional:-->\n                     <der:mRID>102</der:mRID>\n                    \n                  </der:DERGroup>\n               </der:DERGroupStatuses>\n            </der:DERGroupCapabilities>\n              \n            </get:Payload>\n         </payload>\n      </req:GetDERGroupCapabilityPayload>\n   </soapenv:Body>\n</soapenv:Envelope>',NULL,'success',137,'serviceIn'),(723,NULL,'text/xml','2014-10-30 06:57:45',NULL,'UTF-8',NULL,'{Accept=[*/*], SOAPAction=[\"http://iec.ch/TC57/2011/GetDERGroupCapability/GetDERGroupCapability\"]}',NULL,NULL,'1','\"http://iec.ch/TC57/2011/GetDERGroupCapability/GetDERGroupCapability\"','<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:GetDERGroupCapability xmlns=\"http://iec.ch/TC57/2011/schema/message\" xmlns:ns2=\"http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage\" xmlns:ns3=\"http://www.epri.com/2013/DERStatus#\"><ns2:Header><Verb>get</Verb><Noun>DER</Noun><Timestamp>2002-05-30T09:00:00</Timestamp><Comment>epri testing</Comment></ns2:Header><ns2:Request><ns2:StartTime>2002-05-30T09:00:00</ns2:StartTime><ns2:EndTime>2002-05-30T09:00:00</ns2:EndTime></ns2:Request><ns2:Payload><ns3:DERGroupCapabilities><ns3:DERGroupStatuses><ns3:mRID>1234</ns3:mRID><ns3:name>d1</ns3:name><ns3:RequestedCapability>Watts</ns3:RequestedCapability><ns3:DERGroup><ns3:name>d1</ns3:name><ns3:mRID>102</ns3:mRID></ns3:DERGroup></ns3:DERGroupStatuses></ns3:DERGroupCapabilities></ns2:Payload></ns2:GetDERGroupCapability></soap:Body></soap:Envelope>',NULL,'success',137,'clientOut'),(724,'http://localhost:8080/DERConnect/cim/getDERGroupCapabilities','text/xml; charset=UTF-8','2014-10-30 06:57:45',NULL,'UTF-8',NULL,'{Accept=[*/*], cache-control=[no-cache], connection=[keep-alive], Content-Length=[882], content-type=[text/xml; charset=UTF-8], host=[localhost:8080], pragma=[no-cache], SOAPAction=[\"http://iec.ch/TC57/2011/GetDERGroupCapability/GetDERGroupCapability\"], user-agent=[Apache CXF 2.4.1]}','POST',NULL,'0','http://iec.ch/TC57/2011/GetDERGroupCapability/GetDERGroupCapability','<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:GetDERGroupCapability xmlns=\"http://iec.ch/TC57/2011/schema/message\" xmlns:ns2=\"http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage\" xmlns:ns3=\"http://www.epri.com/2013/DERStatus#\"><ns2:Header><Verb>get</Verb><Noun>DER</Noun><Timestamp>2002-05-30T09:00:00</Timestamp><Comment>epri testing</Comment></ns2:Header><ns2:Request><ns2:StartTime>2002-05-30T09:00:00</ns2:StartTime><ns2:EndTime>2002-05-30T09:00:00</ns2:EndTime></ns2:Request><ns2:Payload><ns3:DERGroupCapabilities><ns3:DERGroupStatuses><ns3:mRID>1234</ns3:mRID><ns3:name>d1</ns3:name><ns3:RequestedCapability>Watts</ns3:RequestedCapability><ns3:DERGroup><ns3:name>d1</ns3:name><ns3:mRID>102</ns3:mRID></ns3:DERGroup></ns3:DERGroupStatuses></ns3:DERGroupCapabilities></ns2:Payload></ns2:GetDERGroupCapability></soap:Body></soap:Envelope>',NULL,'success',121,'serviceIn'),(725,NULL,'text/xml','2014-10-30 06:57:45',NULL,'UTF-8',NULL,'{}',NULL,NULL,'0','GetDERGroupCapability','<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:GetDERGroupCapabilityResponseMessage xmlns:ns3=\"http://www.epri.com/2013/DERStatus#\" xmlns:ns2=\"http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage\" xmlns=\"http://iec.ch/TC57/2011/schema/message\"><ns2:Header><Verb>get</Verb><Noun>DER</Noun><Timestamp>2002-05-30T09:00:00</Timestamp><Comment>epri testing</Comment></ns2:Header><ns2:Reply><Result>OK</Result><operationId>102799</operationId></ns2:Reply><ns2:Payload><ns3:DERGroupCapabilities><ns3:DERGroupStatuses><ns3:name>testing123</ns3:name><ns3:RequestedCapability>Watts</ns3:RequestedCapability><ns3:DERGroup><ns3:name>dg2</ns3:name><ns3:mRID>099</ns3:mRID></ns3:DERGroup></ns3:DERGroupStatuses></ns3:DERGroupCapabilities></ns2:Payload></ns2:GetDERGroupCapabilityResponseMessage></soap:Body></soap:Envelope>',NULL,'success',121,'serviceOut'),(726,NULL,'text/xml;charset=UTF-8','2014-10-30 06:57:45',NULL,'UTF-8',NULL,'{Content-Length=[848], content-type=[text/xml;charset=UTF-8], Date=[Thu, 30 Oct 2014 10:57:45 GMT], Server=[Apache-Coyote/1.1]}',NULL,NULL,'1',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:GetDERGroupCapabilityResponseMessage xmlns:ns3=\"http://www.epri.com/2013/DERStatus#\" xmlns:ns2=\"http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage\" xmlns=\"http://iec.ch/TC57/2011/schema/message\"><ns2:Header><Verb>get</Verb><Noun>DER</Noun><Timestamp>2002-05-30T09:00:00</Timestamp><Comment>epri testing</Comment></ns2:Header><ns2:Reply><Result>OK</Result><operationId>102799</operationId></ns2:Reply><ns2:Payload><ns3:DERGroupCapabilities><ns3:DERGroupStatuses><ns3:name>testing123</ns3:name><ns3:RequestedCapability>Watts</ns3:RequestedCapability><ns3:DERGroup><ns3:name>dg2</ns3:name><ns3:mRID>099</ns3:mRID></ns3:DERGroup></ns3:DERGroupStatuses></ns3:DERGroupCapabilities></ns2:Payload></ns2:GetDERGroupCapabilityResponseMessage></soap:Body></soap:Envelope>','200','success',NULL,'clientIn'),(727,NULL,'text/xml','2014-10-30 06:57:46',NULL,'UTF-8',NULL,'{}',NULL,NULL,'0','getDERGroupCapabilities','<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns14:GetDERGroupCapabilityResponse xmlns:ns14=\"http://sixthc.com/CIM/Request\" xmlns:ns13=\"http://www.epri.com/2013/DERGroupDispatch#\" xmlns:ns12=\"http://iec.ch/TC57/2011/DERGroupDispatchMessage\" xmlns:ns11=\"http://iec.ch/TC57/2011/GetDERGroupMessage\" xmlns:ns10=\"http://iec.ch/TC57/2011/GetDERGroupForecastMessage\" xmlns:ns9=\"http://iec.ch/TC57/2011/GetDERGroupStatusMessage\" xmlns:ns8=\"http://www.epri.com/2013/DERStatus#\" xmlns:ns7=\"http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage\" xmlns:ns6=\"http://www.epri.com/2013/DERGroupForecast#\" xmlns:ns5=\"http://iec.ch/TC57/2011/DERGroupForecastMessage\" xmlns:ns4=\"http://www.epri.com/2013/DERGroup#\" xmlns:ns3=\"http://iec.ch/TC57/2011/DERGroupMessage\" xmlns:ns2=\"http://iec.ch/TC57/2011/schema/message\"><ns7:Header><ns2:Verb>get</ns2:Verb><ns2:Noun>DER</ns2:Noun><ns2:Timestamp>2002-05-30T09:00:00</ns2:Timestamp><ns2:Comment>epri testing</ns2:Comment></ns7:Header><ns7:Reply><ns2:Result>OK</ns2:Result><ns2:operationId>102799</ns2:operationId></ns7:Reply><ns7:Payload><ns8:DERGroupCapabilities><ns8:DERGroupStatuses><ns8:name>testing123</ns8:name><ns8:RequestedCapability>Watts</ns8:RequestedCapability><ns8:DERGroup><ns8:name>dg2</ns8:name><ns8:mRID>099</ns8:mRID></ns8:DERGroup></ns8:DERGroupStatuses></ns8:DERGroupCapabilities></ns7:Payload></ns14:GetDERGroupCapabilityResponse></soap:Body></soap:Envelope>',NULL,'success',137,'serviceOut');

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

insert  into `request`(`id`,`data`,`create_date`,`request`,`result`) values (1,'Meter to disconnect : 1234','2011-06-22 20:48:25','disconnect','result'),(2,'Meter to disconnect : 5678','2011-06-22 20:48:25','disconnect','result'),(3,'Sending tamper for meter 1234',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(4,'Sending tamper for meter 1234',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(5,'Sending tamper for meter 5678',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(6,'Meter to disconnect : 1234','2011-06-22 21:12:11','disconnect','result'),(7,'Meter to disconnect : 5678','2011-06-22 21:12:11','disconnect','result'),(8,'Sending tamper for meter 1234',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(9,'Sending tamper for meter 5678',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK');

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

insert  into `vendor_role`(`id`,`name`,`vendor_role_type_id`) values (2,'CIS',1),(3,'MDM',2),(4,'AMI',3),(5,'MSP DER',8),(6,'CIM DER',9);

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

/* Trigger structure for table `eprilog` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `bir_eprilog` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'epri'@'localhost' */ /*!50003 TRIGGER `bir_eprilog` BEFORE INSERT ON `eprilog` FOR EACH ROW begin
set new.create_date = now();
end */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
