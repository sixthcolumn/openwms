-- MySQL dump 10.13  Distrib 5.5.13, for Linux (i686)
--
-- Host: localhost    Database: epri
-- ------------------------------------------------------
-- Server version	5.5.13

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
-- Table structure for table `EpriLog`
--

DROP TABLE IF EXISTS `EpriLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EpriLog` (
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
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EpriLog`
--

LOCK TABLES `EpriLog` WRITE;
/*!40000 ALTER TABLE `EpriLog` DISABLE KEYS */;
INSERT INTO `EpriLog` VALUES (72,'http://ec2-107-20-45-188.compute-1.amazonaws.com:8080/epriConnect/mdms/cis/send','text/xml;charset=UTF-8','2011-08-01 23:59:40',NULL,'UTF-8',NULL,'{accept-encoding=[gzip,deflate], Content-Length=[5389], content-type=[text/xml;charset=UTF-8], host=[ec2-107-20-45-188.compute-1.amazonaws.com:8080], SOAPAction=[\"http://iec.ch/TC57/2011/MeterServiceRequests/CreatedMeterServiceRequests\"], user-agent=[Jakarta Commons-HttpClient/3.1]}','POST',NULL,'26','http://iec.ch/TC57/2011/MeterServiceRequests/CreatedMeterServiceRequests','<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:met=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:mes=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:met1=\"http://iec.ch/TC57/2011/MeterServiceRequests#\">\n   <soapenv:Header/>\n   <soapenv:Body>\n      <met:CreatedMeterServiceRequests>\n         <met:Header>\n            <mes:Verb>create</mes:Verb>\n            <mes:Noun>MeterServiceRequests</mes:Noun>\n            <mes:Context>TESTING</mes:Context>\n            <mes:Timestamp>?</mes:Timestamp>\n            <mes:Source>CIS-001</mes:Source>\n            <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n            <mes:ReplyAddress>NONE</mes:ReplyAddress>\n            <mes:AckRequired>true</mes:AckRequired>\n            <mes:MessageID>CIS-12345</mes:MessageID>\n            <mes:CorrelationID>String</mes:CorrelationID>\n            <mes:Comment>Remote Disconnect Request</mes:Comment>\n            <!--Zero or more repetitions:-->            \n         </met:Header>\n         <!--Optional:-->\n         <met:Payload>\n            <met1:MeterServiceRequests>\n               <met1:Header>\n                  <mes:Verb>create</mes:Verb>\n                  <mes:Noun>MeterServiceRequest</mes:Noun>\n                  <!--Optional:-->\n                  <mes:Revision>?</mes:Revision>\n                  <!--Optional:-->\n                  <mes:Context>TESTING</mes:Context>\n                  <!--Optional:-->\n                  <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n                  <!--Optional:-->\n                  <mes:Source>?</mes:Source>\n                  <!--Optional:-->\n                  <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n                  <!--Optional:-->\n                  <mes:ReplyAddress>hello</mes:ReplyAddress>\n                  <!--Optional:-->\n                  <mes:AckRequired>true</mes:AckRequired>\n                  <!--Optional:-->\n                  <mes:User>\n                     <mes:UserID>?</mes:UserID>\n                     <mes:Organization>?</mes:Organization>\n                  </mes:User>\n                  <!--Optional:-->\n                  <mes:MessageID>?</mes:MessageID>\n                  <!--Optional:-->\n                  <mes:CorrelationID>?</mes:CorrelationID>\n                  <!--Optional:-->\n                  <mes:Comment>?</mes:Comment>\n                  <!--Zero or more repetitions:-->\n                  <mes:Property>\n                     <mes:Name>?</mes:Name>\n                     <!--Optional:-->\n                     <mes:Value>?</mes:Value>\n                  </mes:Property>\n                  <!--You may enter ANY elements at this point-->\n               </met1:Header>\n               <!--Zero or more repetitions:-->\n               <met1:MeterServiceWork>\n                  <!--Optional:-->\n                  <met1:kind>disconnect</met1:kind>\n                  <!--Optional:-->\n                  <met1:lastModifiedDateTime>2011-06-17T09:30:47.0Z</met1:lastModifiedDateTime>\n                  <!--Optional:-->\n                  <met1:priority>?</met1:priority>\n                  <!--Optional:-->\n                  <met1:requestDateTime>2011-06-17T09:30:47.0Z</met1:requestDateTime>\n                  <!--Optional:-->\n                  <met1:type>?</met1:type>\n                  <!--Zero or more repetitions:-->\n                  <met1:ActivityRecords>\n                     <met1:createdDateTime>2011-06-17T09:30:47.0Z</met1:createdDateTime>\n                     <!--Optional:-->\n                     <met1:reason>?</met1:reason>\n                     <!--Optional:-->\n                     <met1:severity>?</met1:severity>\n                     <met1:type>?</met1:type>\n                  </met1:ActivityRecords>\n                  <!--Zero or more repetitions:-->\n                  <met1:Meter>\n                     <!--Optional:-->\n                     <met1:mRID>?</met1:mRID>\n                     <!--Optional:-->\n                     <met1:amrSystem>?</met1:amrSystem>\n                     <!--Optional:-->\n                     <met1:formNumber>?</met1:formNumber>\n                     <!--Optional:-->\n                     <met1:serialNumber>?</met1:serialNumber>\n                     <!--Zero or more repetitions:--> \n                  </met1:Meter>\n               </met1:MeterServiceWork>\n               <!--Zero or more repetitions:-->\n               <met1:ReadingQualityType>\n                  <!--Optional:-->\n                  <met1:mRID>?</met1:mRID>\n                  <!--Optional:-->\n                  <met1:category>?</met1:category>\n                  <!--Optional:-->\n                  <met1:subCategory>?</met1:subCategory>\n                  <!--Optional:-->\n                  <met1:systemId>?</met1:systemId>\n                  <!--1 or more repetitions:-->\n                  <met1:Names>\n                     <met1:name>?</met1:name>\n                     <!--Optional:-->\n                     <met1:NameType>\n                        <met1:name>?</met1:name>\n                     </met1:NameType>\n                  </met1:Names>\n               </met1:ReadingQualityType>\n            </met1:MeterServiceRequests>\n            <!--Optional:-->\n            <met:Compressed>?</met:Compressed>\n            <!--Optional:-->\n            <met:Format>?</met:Format>\n         </met:Payload>\n      </met:CreatedMeterServiceRequests>\n   </soapenv:Body>\n</soapenv:Envelope>',NULL,'fail',1,'serviceIn'),(73,NULL,'text/xml','2011-08-01 23:59:40',NULL,'UTF-8',NULL,'{}',NULL,NULL,'26',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><soap:Fault><faultcode>soap:Client</faultcode><faultstring>Unmarshalling Error: ? [line:9] [line:9] </faultstring></soap:Fault></soap:Body></soap:Envelope>','500','fail',1,'serviceOutFault'),(74,'http://ec2-107-20-45-188.compute-1.amazonaws.com:8080/epriConnect/mdms/cis/send','text/xml;charset=UTF-8','2011-08-02 00:14:58',NULL,'UTF-8',NULL,'{accept-encoding=[gzip,deflate], Content-Length=[5410], content-type=[text/xml;charset=UTF-8], host=[ec2-107-20-45-188.compute-1.amazonaws.com:8080], SOAPAction=[\"http://iec.ch/TC57/2011/MeterServiceRequests/CreatedMeterServiceRequests\"], user-agent=[Jakarta Commons-HttpClient/3.1]}','POST',NULL,'27','http://iec.ch/TC57/2011/MeterServiceRequests/CreatedMeterServiceRequests','<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:met=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:mes=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:met1=\"http://iec.ch/TC57/2011/MeterServiceRequests#\">\n   <soapenv:Header/>\n   <soapenv:Body>\n      <met:CreatedMeterServiceRequests>\n         <met:Header>\n            <mes:Verb>create</mes:Verb>\n            <mes:Noun>MeterServiceRequests</mes:Noun>\n            <mes:Context>TESTING</mes:Context>\n            <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n            <mes:Source>CIS-001</mes:Source>\n            <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n            <mes:ReplyAddress>NONE</mes:ReplyAddress>\n            <mes:AckRequired>true</mes:AckRequired>\n            <mes:MessageID>CIS-12345</mes:MessageID>\n            <mes:CorrelationID>String</mes:CorrelationID>\n            <mes:Comment>Remote Disconnect Request</mes:Comment>\n            <!--Zero or more repetitions:-->            \n         </met:Header>\n         <!--Optional:-->\n         <met:Payload>\n            <met1:MeterServiceRequests>\n               <met1:Header>\n                  <mes:Verb>create</mes:Verb>\n                  <mes:Noun>MeterServiceRequest</mes:Noun>\n                  <!--Optional:-->\n                  <mes:Revision>?</mes:Revision>\n                  <!--Optional:-->\n                  <mes:Context>TESTING</mes:Context>\n                  <!--Optional:-->\n                  <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n                  <!--Optional:-->\n                  <mes:Source>?</mes:Source>\n                  <!--Optional:-->\n                  <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n                  <!--Optional:-->\n                  <mes:ReplyAddress>hello</mes:ReplyAddress>\n                  <!--Optional:-->\n                  <mes:AckRequired>true</mes:AckRequired>\n                  <!--Optional:-->\n                  <mes:User>\n                     <mes:UserID>?</mes:UserID>\n                     <mes:Organization>?</mes:Organization>\n                  </mes:User>\n                  <!--Optional:-->\n                  <mes:MessageID>?</mes:MessageID>\n                  <!--Optional:-->\n                  <mes:CorrelationID>?</mes:CorrelationID>\n                  <!--Optional:-->\n                  <mes:Comment>?</mes:Comment>\n                  <!--Zero or more repetitions:-->\n                  <mes:Property>\n                     <mes:Name>?</mes:Name>\n                     <!--Optional:-->\n                     <mes:Value>?</mes:Value>\n                  </mes:Property>\n                  <!--You may enter ANY elements at this point-->\n               </met1:Header>\n               <!--Zero or more repetitions:-->\n               <met1:MeterServiceWork>\n                  <!--Optional:-->\n                  <met1:kind>disconnect</met1:kind>\n                  <!--Optional:-->\n                  <met1:lastModifiedDateTime>2011-06-17T09:30:47.0Z</met1:lastModifiedDateTime>\n                  <!--Optional:-->\n                  <met1:priority>?</met1:priority>\n                  <!--Optional:-->\n                  <met1:requestDateTime>2011-06-17T09:30:47.0Z</met1:requestDateTime>\n                  <!--Optional:-->\n                  <met1:type>?</met1:type>\n                  <!--Zero or more repetitions:-->\n                  <met1:ActivityRecords>\n                     <met1:createdDateTime>2011-06-17T09:30:47.0Z</met1:createdDateTime>\n                     <!--Optional:-->\n                     <met1:reason>?</met1:reason>\n                     <!--Optional:-->\n                     <met1:severity>?</met1:severity>\n                     <met1:type>?</met1:type>\n                  </met1:ActivityRecords>\n                  <!--Zero or more repetitions:-->\n                  <met1:Meter>\n                     <!--Optional:-->\n                     <met1:mRID>?</met1:mRID>\n                     <!--Optional:-->\n                     <met1:amrSystem>?</met1:amrSystem>\n                     <!--Optional:-->\n                     <met1:formNumber>?</met1:formNumber>\n                     <!--Optional:-->\n                     <met1:serialNumber>?</met1:serialNumber>\n                     <!--Zero or more repetitions:--> \n                  </met1:Meter>\n               </met1:MeterServiceWork>\n               <!--Zero or more repetitions:-->\n               <met1:ReadingQualityType>\n                  <!--Optional:-->\n                  <met1:mRID>?</met1:mRID>\n                  <!--Optional:-->\n                  <met1:category>?</met1:category>\n                  <!--Optional:-->\n                  <met1:subCategory>?</met1:subCategory>\n                  <!--Optional:-->\n                  <met1:systemId>?</met1:systemId>\n                  <!--1 or more repetitions:-->\n                  <met1:Names>\n                     <met1:name>?</met1:name>\n                     <!--Optional:-->\n                     <met1:NameType>\n                        <met1:name>?</met1:name>\n                     </met1:NameType>\n                  </met1:Names>\n               </met1:ReadingQualityType>\n            </met1:MeterServiceRequests>\n            <!--Optional:-->\n            <met:Compressed>?</met:Compressed>\n            <!--Optional:-->\n            <met:Format>?</met:Format>\n         </met:Payload>\n      </met:CreatedMeterServiceRequests>\n   </soapenv:Body>\n</soapenv:Envelope>',NULL,'success',1,'serviceIn'),(75,NULL,'text/xml','2011-08-02 00:14:58',NULL,'UTF-8',NULL,'{}',NULL,NULL,'27',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:MeterServiceRequestsResponseMessage xmlns:ns3=\"http://iec.ch/TC57/2011/MeterServiceRequests#\" xmlns:ns2=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns=\"http://www.iec.ch/TC57/2011/schema/message\"><ns2:Header><Verb>create</Verb><Noun>MeterServiceRequests</Noun><Context>TESTING</Context><Timestamp>2011-06-17T09:30:47.0Z</Timestamp><Source>CIS-001</Source><AsyncReplyFlag>true</AsyncReplyFlag><ReplyAddress>NONE</ReplyAddress><AckRequired>true</AckRequired><MessageID>CIS-12345</MessageID><CorrelationID>String</CorrelationID><Comment>Remote Disconnect Request</Comment></ns2:Header><ns2:Reply><Result>OK</Result></ns2:Reply></ns2:MeterServiceRequestsResponseMessage></soap:Body></soap:Envelope>',NULL,'success',1,'serviceOut'),(76,'http://ec2-107-20-45-188.compute-1.amazonaws.com:8080/epriConnect/mdms/cis/request','text/xml;charset=UTF-8','2011-08-02 00:27:54',NULL,'UTF-8',NULL,'{accept-encoding=[gzip,deflate], Content-Length=[3293], content-type=[text/xml;charset=UTF-8], host=[ec2-107-20-45-188.compute-1.amazonaws.com:8080], SOAPAction=[\"http://iec.ch/TC57/2011/MeterServiceRequests/CreateMeterServiceRequests\"], user-agent=[Jakarta Commons-HttpClient/3.1]}','POST',NULL,'28','http://iec.ch/TC57/2011/MeterServiceRequests/CreateMeterServiceRequests','<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:met=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:mes=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:met1=\"http://iec.ch/TC57/2011/MeterServiceRequests#\">\n<soapenv:Header/>\n   <soapenv:Body>\n      <met:CreatedMeterServiceRequests>\n         <met:Header>\n            <mes:Verb>create</mes:Verb>\n            <mes:Noun>MeterServiceRequests</mes:Noun>\n            <mes:Context>TESTING</mes:Context>\n            <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n            <mes:Source>CIS-001</mes:Source>\n            <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n            <mes:ReplyAddress>http://mypublichostname:8088/replyMeterServiceRequests</mes:ReplyAddress>\n            <mes:AckRequired>true</mes:AckRequired>\n            <mes:MessageID>CIS-12345</mes:MessageID>\n            <mes:CorrelationID>String</mes:CorrelationID>\n            <mes:Comment>Remote Disconnect Request</mes:Comment>\n            <!--Zero or more repetitions:-->\n         </met:Header>\n         <!--Optional:-->\n         <met:Payload>\n            <met1:MeterServiceRequests>\n               <met1:Header>\n                  <mes:Verb>create</mes:Verb>\n                  <mes:Noun>MeterServiceRequest</mes:Noun>\n                  <mes:Revision>?</mes:Revision>\n                  <mes:Context>TESTING</mes:Context>\n                  <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n                  <mes:Source>?</mes:Source>\n                  <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n                  <mes:ReplyAddress>hello</mes:ReplyAddress>\n                  <mes:AckRequired>true</mes:AckRequired>\n                  <mes:User>\n                     <mes:UserID>?</mes:UserID>\n                     <mes:Organization>?</mes:Organization>\n                  </mes:User>\n                  <mes:MessageID>?</mes:MessageID>\n                  <mes:CorrelationID>?</mes:CorrelationID>\n                  <mes:Comment>?</mes:Comment>\n               </met1:Header>\n               <met1:MeterServiceWork>\n                  <met1:kind>disconnect</met1:kind>\n                  <met1:lastModifiedDateTime>2011-06-17T09:30:47.0Z</met1:lastModifiedDateTime>\n                  <met1:priority>?</met1:priority>\n                  <met1:requestDateTime>2011-06-17T09:30:47.0Z</met1:requestDateTime>\n                  <met1:type>?</met1:type>\n                  <met1:ActivityRecords>\n                     <met1:createdDateTime>2011-06-17T09:30:47.0Z</met1:createdDateTime>\n                     <met1:reason>?</met1:reason>\n                     <met1:severity>?</met1:severity>\n                     <met1:type>?</met1:type>\n                  </met1:ActivityRecords>\n                  <met1:Meter>\n                     <met1:mRID>1234</met1:mRID>\n                     <met1:amrSystem>?</met1:amrSystem>\n                     <met1:formNumber>?</met1:formNumber>\n                     <met1:serialNumber>?</met1:serialNumber>\n                  </met1:Meter>\n               </met1:MeterServiceWork>\n            </met1:MeterServiceRequests>\n            <met:Compressed>?</met:Compressed>\n           <met:Format>?</met:Format>\n         </met:Payload>\n      </met:CreatedMeterServiceRequests>\n   </soapenv:Body>\n</soapenv:Envelope>\n',NULL,'fail',2,'serviceIn'),(77,NULL,'text/xml','2011-08-02 00:27:55',NULL,'UTF-8',NULL,'{Accept=[*/*], SOAPAction=[\"http://iec.ch/TC57/2011/MeterServiceRequests/CreatedMeterServiceRequests\"]}',NULL,NULL,'1',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:CreatedMeterServiceRequests xmlns=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:ns2=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:ns3=\"http://iec.ch/TC57/2011/MeterServiceRequests#\"><ns2:Header><Verb>create</Verb><Noun>MeterServiceRequests</Noun><Context>TESTING</Context><Timestamp>2011-06-17T09:30:47.0Z</Timestamp><Source>CIS-001</Source><AsyncReplyFlag>true</AsyncReplyFlag><ReplyAddress>http://mypublichostname:8088/replyMeterServiceRequests</ReplyAddress><AckRequired>true</AckRequired><MessageID>CIS-12345</MessageID><CorrelationID>String</CorrelationID><Comment>Remote Disconnect Request</Comment></ns2:Header><ns2:Payload><ns3:MeterServiceRequests><ns3:Header><Verb>create</Verb><Noun>MeterServiceRequest</Noun><Revision>?</Revision><Context>TESTING</Context><Timestamp>2011-06-17T09:30:47.0Z</Timestamp><Source>?</Source><AsyncReplyFlag>true</AsyncReplyFlag><ReplyAddress>hello</ReplyAddress><AckRequired>true</AckRequired><User><UserID>?</UserID><Organization>?</Organization></User><MessageID>?</MessageID><CorrelationID>?</CorrelationID><Comment>?</Comment></ns3:Header><ns3:MeterServiceWork><ns3:kind>disconnect</ns3:kind><ns3:lastModifiedDateTime>2011-06-17T09:30:47.0Z</ns3:lastModifiedDateTime><ns3:priority>?</ns3:priority><ns3:requestDateTime>2011-06-17T09:30:47.0Z</ns3:requestDateTime><ns3:type>?</ns3:type><ns3:ActivityRecords><ns3:createdDateTime>2011-06-17T09:30:47.0Z</ns3:createdDateTime><ns3:reason>?</ns3:reason><ns3:severity>?</ns3:severity><ns3:type>?</ns3:type></ns3:ActivityRecords><ns3:Meter><ns3:mRID>1234</ns3:mRID><ns3:amrSystem>?</ns3:amrSystem><ns3:formNumber>?</ns3:formNumber><ns3:serialNumber>?</ns3:serialNumber></ns3:Meter></ns3:MeterServiceWork></ns3:MeterServiceRequests><ns2:Compressed>?</ns2:Compressed><ns2:Format>?</ns2:Format></ns2:Payload></ns2:CreatedMeterServiceRequests></soap:Body></soap:Envelope>',NULL,'success',2,'clientOut'),(78,NULL,'text/xml','2011-08-02 00:27:55',NULL,'UTF-8',NULL,'{}',NULL,NULL,'28',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><soap:Fault><faultcode>soap:Server</faultcode><faultstring>Could not send Message.</faultstring></soap:Fault></soap:Body></soap:Envelope>','500','fail',2,'serviceOutFault'),(79,'http://ec2-107-20-45-188.compute-1.amazonaws.com:8080/epriConnect/mdms/cis/request','text/xml;charset=UTF-8','2011-08-02 00:29:05',NULL,'UTF-8',NULL,'{accept-encoding=[gzip,deflate], Content-Length=[3293], content-type=[text/xml;charset=UTF-8], host=[ec2-107-20-45-188.compute-1.amazonaws.com:8080], SOAPAction=[\"http://iec.ch/TC57/2011/MeterServiceRequests/CreateMeterServiceRequests\"], user-agent=[Jakarta Commons-HttpClient/3.1]}','POST',NULL,'29','http://iec.ch/TC57/2011/MeterServiceRequests/CreateMeterServiceRequests','<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:met=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:mes=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:met1=\"http://iec.ch/TC57/2011/MeterServiceRequests#\">\n<soapenv:Header/>\n   <soapenv:Body>\n      <met:CreatedMeterServiceRequests>\n         <met:Header>\n            <mes:Verb>create</mes:Verb>\n            <mes:Noun>MeterServiceRequests</mes:Noun>\n            <mes:Context>TESTING</mes:Context>\n            <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n            <mes:Source>CIS-001</mes:Source>\n            <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n            <mes:ReplyAddress>http://dfmaus.dyndns.ws:8088/replyMeterServiceRequests</mes:ReplyAddress>\n            <mes:AckRequired>true</mes:AckRequired>\n            <mes:MessageID>CIS-12345</mes:MessageID>\n            <mes:CorrelationID>String</mes:CorrelationID>\n            <mes:Comment>Remote Disconnect Request</mes:Comment>\n            <!--Zero or more repetitions:-->\n         </met:Header>\n         <!--Optional:-->\n         <met:Payload>\n            <met1:MeterServiceRequests>\n               <met1:Header>\n                  <mes:Verb>create</mes:Verb>\n                  <mes:Noun>MeterServiceRequest</mes:Noun>\n                  <mes:Revision>?</mes:Revision>\n                  <mes:Context>TESTING</mes:Context>\n                  <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n                  <mes:Source>?</mes:Source>\n                  <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n                  <mes:ReplyAddress>hello</mes:ReplyAddress>\n                  <mes:AckRequired>true</mes:AckRequired>\n                  <mes:User>\n                     <mes:UserID>?</mes:UserID>\n                     <mes:Organization>?</mes:Organization>\n                  </mes:User>\n                  <mes:MessageID>?</mes:MessageID>\n                  <mes:CorrelationID>?</mes:CorrelationID>\n                  <mes:Comment>?</mes:Comment>\n               </met1:Header>\n               <met1:MeterServiceWork>\n                  <met1:kind>disconnect</met1:kind>\n                  <met1:lastModifiedDateTime>2011-06-17T09:30:47.0Z</met1:lastModifiedDateTime>\n                  <met1:priority>?</met1:priority>\n                  <met1:requestDateTime>2011-06-17T09:30:47.0Z</met1:requestDateTime>\n                  <met1:type>?</met1:type>\n                  <met1:ActivityRecords>\n                     <met1:createdDateTime>2011-06-17T09:30:47.0Z</met1:createdDateTime>\n                     <met1:reason>?</met1:reason>\n                     <met1:severity>?</met1:severity>\n                     <met1:type>?</met1:type>\n                  </met1:ActivityRecords>\n                  <met1:Meter>\n                     <met1:mRID>1234</met1:mRID>\n                     <met1:amrSystem>?</met1:amrSystem>\n                     <met1:formNumber>?</met1:formNumber>\n                     <met1:serialNumber>?</met1:serialNumber>\n                  </met1:Meter>\n               </met1:MeterServiceWork>\n            </met1:MeterServiceRequests>\n            <met:Compressed>?</met:Compressed>\n           <met:Format>?</met:Format>\n         </met:Payload>\n      </met:CreatedMeterServiceRequests>\n   </soapenv:Body>\n</soapenv:Envelope>\n',NULL,'success',2,'serviceIn'),(80,NULL,'text/xml','2011-08-02 00:29:05',NULL,'UTF-8',NULL,'{Accept=[*/*], SOAPAction=[\"http://iec.ch/TC57/2011/MeterServiceRequests/CreatedMeterServiceRequests\"]}',NULL,NULL,'2',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:CreatedMeterServiceRequests xmlns=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:ns2=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:ns3=\"http://iec.ch/TC57/2011/MeterServiceRequests#\"><ns2:Header><Verb>create</Verb><Noun>MeterServiceRequests</Noun><Context>TESTING</Context><Timestamp>2011-06-17T09:30:47.0Z</Timestamp><Source>CIS-001</Source><AsyncReplyFlag>true</AsyncReplyFlag><ReplyAddress>http://dfmaus.dyndns.ws:8088/replyMeterServiceRequests</ReplyAddress><AckRequired>true</AckRequired><MessageID>CIS-12345</MessageID><CorrelationID>String</CorrelationID><Comment>Remote Disconnect Request</Comment></ns2:Header><ns2:Payload><ns3:MeterServiceRequests><ns3:Header><Verb>create</Verb><Noun>MeterServiceRequest</Noun><Revision>?</Revision><Context>TESTING</Context><Timestamp>2011-06-17T09:30:47.0Z</Timestamp><Source>?</Source><AsyncReplyFlag>true</AsyncReplyFlag><ReplyAddress>hello</ReplyAddress><AckRequired>true</AckRequired><User><UserID>?</UserID><Organization>?</Organization></User><MessageID>?</MessageID><CorrelationID>?</CorrelationID><Comment>?</Comment></ns3:Header><ns3:MeterServiceWork><ns3:kind>disconnect</ns3:kind><ns3:lastModifiedDateTime>2011-06-17T09:30:47.0Z</ns3:lastModifiedDateTime><ns3:priority>?</ns3:priority><ns3:requestDateTime>2011-06-17T09:30:47.0Z</ns3:requestDateTime><ns3:type>?</ns3:type><ns3:ActivityRecords><ns3:createdDateTime>2011-06-17T09:30:47.0Z</ns3:createdDateTime><ns3:reason>?</ns3:reason><ns3:severity>?</ns3:severity><ns3:type>?</ns3:type></ns3:ActivityRecords><ns3:Meter><ns3:mRID>1234</ns3:mRID><ns3:amrSystem>?</ns3:amrSystem><ns3:formNumber>?</ns3:formNumber><ns3:serialNumber>?</ns3:serialNumber></ns3:Meter></ns3:MeterServiceWork></ns3:MeterServiceRequests><ns2:Compressed>?</ns2:Compressed><ns2:Format>?</ns2:Format></ns2:Payload></ns2:CreatedMeterServiceRequests></soap:Body></soap:Envelope>',NULL,'success',2,'clientOut'),(81,NULL,'text/xml; charset=utf-8','2011-08-02 00:29:06',NULL,'UTF-8',NULL,'{content-type=[text/xml; charset=utf-8], Server=[Jetty(6.1.x)], transfer-encoding=[chunked]}',NULL,NULL,'2',NULL,'<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:met=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns:mes=\"http://www.iec.ch/TC57/2011/schema/message\" xmlns:met1=\"http://iec.ch/TC57/2011/MeterServiceRequests#\">\n   <soapenv:Header/>\n   <soapenv:Body>\n      <met:MeterServiceRequestsResponseMessage>\n        <met:Header>\n            <mes:Verb>create</mes:Verb>\n            <mes:Noun>MeterServiceRequest</mes:Noun>\n            <mes:Context>TESTING</mes:Context>\n            <mes:Timestamp>2011-06-17T09:30:47.0Z</mes:Timestamp>\n            <mes:Source>CIS-001</mes:Source>\n            <mes:AsyncReplyFlag>true</mes:AsyncReplyFlag>\n            <mes:ReplyAddress>http://localhost:8088/mockReplyMeterServiceRequests_Binding</mes:ReplyAddress>\n            <mes:AckRequired>true</mes:AckRequired>\n            <mes:MessageID>CIS-12345</mes:MessageID>\n            <mes:CorrelationID>String</mes:CorrelationID>\n            <mes:Comment>Remote Disconnect Reply</mes:Comment>\n           </met:Header>\n         <met:Reply>\n            <mes:Result>OK</mes:Result>\n         </met:Reply>\n      </met:MeterServiceRequestsResponseMessage>\n   </soapenv:Body>\n</soapenv:Envelope>','200','success',2,'clientIn'),(82,NULL,'text/xml','2011-08-02 00:29:06',NULL,'UTF-8',NULL,'{}',NULL,NULL,'29',NULL,'<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:MeterServiceRequestsResponseMessage xmlns:ns3=\"http://iec.ch/TC57/2011/MeterServiceRequests#\" xmlns:ns2=\"http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage\" xmlns=\"http://www.iec.ch/TC57/2011/schema/message\"><ns2:Header><Verb>create</Verb><Noun>MeterServiceRequests</Noun><Context>TESTING</Context><Timestamp>2011-06-17T09:30:47.0Z</Timestamp><Source>CIS-001</Source><AsyncReplyFlag>true</AsyncReplyFlag><ReplyAddress>http://dfmaus.dyndns.ws:8088/replyMeterServiceRequests</ReplyAddress><AckRequired>true</AckRequired><MessageID>CIS-12345</MessageID><CorrelationID>String</CorrelationID><Comment>Remote Disconnect Request</Comment></ns2:Header><ns2:Reply><Result>OK</Result></ns2:Reply></ns2:MeterServiceRequestsResponseMessage></soap:Body></soap:Envelope>',NULL,'success',2,'serviceOut');
/*!40000 ALTER TABLE `EpriLog` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`epri`@`localhost`*/ /*!50003 trigger bir_eprilog before insert on EpriLog
for each row
begin
set new.create_date = now();
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `Request`
--

DROP TABLE IF EXISTS `Request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Request` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `request` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Request`
--

LOCK TABLES `Request` WRITE;
/*!40000 ALTER TABLE `Request` DISABLE KEYS */;
INSERT INTO `Request` VALUES (1,'Meter to disconnect : 1234','2011-06-22 20:48:25','disconnect','result'),(2,'Meter to disconnect : 5678','2011-06-22 20:48:25','disconnect','result'),(3,'Sending tamper for meter 1234',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(4,'Sending tamper for meter 1234',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(5,'Sending tamper for meter 5678',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(6,'Meter to disconnect : 1234','2011-06-22 21:12:11','disconnect','result'),(7,'Meter to disconnect : 5678','2011-06-22 21:12:11','disconnect','result'),(8,'Sending tamper for meter 1234',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK'),(9,'Sending tamper for meter 5678',NULL,'Send tamper to http://dfmaus.dyndns.ws:8090/epriConnect/endDeviceEventsService','OK');
/*!40000 ALTER TABLE `Request` ENABLE KEYS */;
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
INSERT INTO `interface` VALUES (1,'MD_CIS-MDM_Create(MeterServiceRequest)',1,1,1,1),(2,'MD_CIS-MDM_Request_Reply(MeterServiceRequest)',1,0,0,1),(3,'MD_CIS-MDM_Request_Updated(MeterServiceRequest)',1,0,0,1),(4,'MD_MDM-CIS_Request_Create(MeterServiceRequest)',1,0,0,2),(5,'MD-MDM-CIS_Reply(MeterServiceRequest)',1,1,1,2),(6,'MD_MDM-AMI_Create(EndDeviceControls)',1,1,1,2),(7,'MD_MDM-AMI_Request_Reply(EndDeviceControls)',1,0,0,2),(8,'MD_MDM-AMI_Create(MeterReadings)',1,1,1,2),(9,'MD_MDM-AMI_Request_Reply(MeterReadings)',1,0,0,2),(10,'MD_MDM-AMI_Request_Created(MeterReadings)',1,0,0,2),(11,'MD_MDM-AMI_Updated(MeterServiceRequest)',1,1,1,2),(12,'MD_AMI-MDM_Request_Create(EndDeviceControls)',1,0,0,3),(13,'MD_AMI-MDM_Reply(EndDeviceControls)',1,1,1,3),(14,'MD_AMI-MDM_Request_Create(EndDeviceControls)',1,0,0,3),(15,'MD_AMI-MDM_Reply(MeterReadings)',1,1,1,3),(16,'MD_AMI-MDM_Created(MeterReadings)',1,1,1,3),(17,'OD_CIS-MDM_Get(MeterReading)',2,1,1,1),(18,'OD_CIS-MDM_Reply(MeterReading)',2,0,0,1),(19,'OD_CIS-AMI_Get(MeterReading)',2,1,1,1),(20,'OD_CIS-AMI_Reply(MeterReading)',2,0,0,1),(21,'OD_CIS-MDM_Get(7MeterReading)',2,1,1,1),(22,'OD_CIS-MDM_Reply(8MeterReading)',2,0,0,1),(23,'OD_MDM-CIS_Get(MeterReading)',2,0,0,2),(24,'OD_MDM-CIS_Reply(MeterReading)',2,1,1,2),(25,'OD_MDM-AMI_Get(MeterReading)',2,1,1,2),(26,'OD_MDM-AMI_Reply(MeterReading)',2,0,0,2),(27,'OD_MDM-CIS_Get(7MeterReading)',2,0,0,2),(28,'OD_MDM-CIS_Reply(8MeterReading)',2,1,1,2),(29,'OD_AMI-MDM_Get(MeterReading)',2,0,0,3),(30,'OD_AMI-MDM_Reply(MeterReading)',2,1,1,3),(31,'OD_AMI-CIS_Get(MeterReading)',2,0,0,3),(32,'OD_AMI-CIS_Reply(MeterReading)',2,1,1,3);
/*!40000 ALTER TABLE `interface` ENABLE KEYS */;
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
INSERT INTO `package` VALUES (1,'Meter Connect'),(4,'Meter Tamper'),(2,'OnDemand Read'),(5,'Outage Management'),(3,'Scheduled Read');
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
INSERT INTO `packages_vendor_role_types` VALUES (1,1),(1,2),(1,3),(2,1),(2,2),(3,2),(4,2),(4,1),(4,3),(2,3),(3,3),(5,2),(5,4);
/*!40000 ALTER TABLE `packages_vendor_role_types` ENABLE KEYS */;
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
-- Table structure for table `resultCode`
--

DROP TABLE IF EXISTS `resultCode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resultCode` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultCode`
--

LOCK TABLES `resultCode` WRITE;
/*!40000 ALTER TABLE `resultCode` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultCode` ENABLE KEYS */;
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
INSERT INTO `seqs` VALUES ('message_id',1,1,29,'A');
/*!40000 ALTER TABLE `seqs` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor_role`
--

LOCK TABLES `vendor_role` WRITE;
/*!40000 ALTER TABLE `vendor_role` DISABLE KEYS */;
INSERT INTO `vendor_role` VALUES (2,'CIS',1),(3,'MDM',2),(4,'AMI',3);
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
INSERT INTO `vendor_role_type` VALUES (1,'CIS',1),(2,'MDMS',1),(3,'AMI',1),(4,'OMS',1);
/*!40000 ALTER TABLE `vendor_role_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-08-08 13:27:54
