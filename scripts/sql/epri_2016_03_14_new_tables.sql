/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.6.21-log : Database - epri2
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  `package_group_id` int(11) NOT NULL,
  `request_flag` tinyint(1) NOT NULL DEFAULT '0',
  `default_message_txt` longtext,
  PRIMARY KEY (`id`),
  UNIQUE KEY `message_name` (`name`),
  KEY `message_package_group_id` (`package_group_id`),
  CONSTRAINT `message_package_group_id` FOREIGN KEY (`package_group_id`) REFERENCES `package_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message` */

/*Table structure for table `message_log` */

DROP TABLE IF EXISTS `message_log`;

CREATE TABLE `message_log` (
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
  `message_id` int(11) DEFAULT NULL,
  `stage` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `INTERFACE_ID` (`message_id`),
  CONSTRAINT `message_log_message_id` FOREIGN KEY (`message_id`) REFERENCES `message` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=728 DEFAULT CHARSET=latin1;

/*Data for the table `message_log` */

/*Table structure for table `package` */

DROP TABLE IF EXISTS `package`;

CREATE TABLE `package` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `package` */

/*Table structure for table `package_group` */

DROP TABLE IF EXISTS `package_group`;

CREATE TABLE `package_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `package_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `package_group_package_id` (`package_id`),
  CONSTRAINT `package_group_package_id` FOREIGN KEY (`package_id`) REFERENCES `package` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `package_group` */

/*Table structure for table `test_seq_step` */

DROP TABLE IF EXISTS `test_seq_step`;

CREATE TABLE `test_seq_step` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `test_sequence_id` int(11) NOT NULL,
  `in_message_id` int(11) NOT NULL,
  `esb_url` varchar(512) DEFAULT NULL,
  `harness_url` varchar(512) DEFAULT NULL,
  `swap_corrid_flag` tinyint(1) NOT NULL DEFAULT '0',
  `next_step_id` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `test_steps_in_message_id` (`in_message_id`),
  KEY `test_steps_next_step_id` (`next_step_id`),
  KEY `test_seq_step_test_seq` (`test_sequence_id`),
  CONSTRAINT `test_seq_step_test_seq` FOREIGN KEY (`test_sequence_id`) REFERENCES `test_sequence` (`id`),
  CONSTRAINT `test_steps_in_message_id` FOREIGN KEY (`in_message_id`) REFERENCES `message` (`id`),
  CONSTRAINT `test_steps_next_step_id` FOREIGN KEY (`next_step_id`) REFERENCES `test_seq_step` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `test_seq_step` */

/*Table structure for table `test_sequence` */

DROP TABLE IF EXISTS `test_sequence`;

CREATE TABLE `test_sequence` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `type` enum('standalone','proxy','multimessage') NOT NULL DEFAULT 'standalone',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `test_sequence` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` varchar(40) NOT NULL,
  `vendor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_vendor_id` (`vendor_id`),
  CONSTRAINT `user_vendor_id` FOREIGN KEY (`vendor_id`) REFERENCES `vendor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `vendor` */

DROP TABLE IF EXISTS `vendor`;

CREATE TABLE `vendor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `vendor_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='One record for each vendor.  ';

/*Data for the table `vendor` */

/*Table structure for table `vendor_packages` */

DROP TABLE IF EXISTS `vendor_packages`;

CREATE TABLE `vendor_packages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_id` int(11) NOT NULL,
  `package_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vendor_package_package_id` (`package_id`),
  KEY `vendor_package_vendor_id` (`vendor_id`),
  CONSTRAINT `vendor_package_package_id` FOREIGN KEY (`package_id`) REFERENCES `package` (`id`),
  CONSTRAINT `vendor_package_vendor_id` FOREIGN KEY (`vendor_id`) REFERENCES `vendor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vendor_packages` */

/*Table structure for table `vendor_request_message` */

DROP TABLE IF EXISTS `vendor_request_message`;

CREATE TABLE `vendor_request_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_id` int(11) NOT NULL,
  `message_id` int(11) NOT NULL,
  `message_txt` longtext NOT NULL COMMENT 'overrides message..default_message_txt',
  PRIMARY KEY (`id`),
  KEY `vendor_request_message_vendor_id` (`vendor_id`),
  KEY `vendor_request_message_message_id` (`message_id`),
  CONSTRAINT `vendor_request_message_message_id` FOREIGN KEY (`message_id`) REFERENCES `message` (`id`),
  CONSTRAINT `vendor_request_message_vendor_id` FOREIGN KEY (`vendor_id`) REFERENCES `vendor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vendor_request_message` */

/*Table structure for table `vendor_seq_step_logging` */

DROP TABLE IF EXISTS `vendor_seq_step_logging`;

CREATE TABLE `vendor_seq_step_logging` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_id` int(11) NOT NULL COMMENT 'de-normalized for convenience',
  `vendor_test_seq_steps_id` int(11) NOT NULL,
  `in_mess_id` varchar(255) DEFAULT NULL,
  `out_mess_id` varchar(255) DEFAULT NULL,
  `in_reply_url` varchar(1024) DEFAULT NULL,
  `tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `vend_seq_logging_vendor_id` (`vendor_id`),
  KEY `vend_seq_logging_test_seq_step_id` (`vendor_test_seq_steps_id`),
  CONSTRAINT `vend_seq_logging_test_seq_step_id` FOREIGN KEY (`vendor_test_seq_steps_id`) REFERENCES `vendor_test_seq_steps` (`id`),
  CONSTRAINT `vend_seq_logging_vendor_id` FOREIGN KEY (`vendor_id`) REFERENCES `vendor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='T';

/*Data for the table `vendor_seq_step_logging` */

/*Table structure for table `vendor_test_seq_steps` */

DROP TABLE IF EXISTS `vendor_test_seq_steps`;

CREATE TABLE `vendor_test_seq_steps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_test_sequences_id` int(11) NOT NULL,
  `test_seq_step_id` int(11) NOT NULL,
  `out_url` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vendor_test_seq_steps_vendor_sequence_id` (`vendor_test_sequences_id`),
  KEY `vendor_test_seq_steps_test_seq_step_id` (`test_seq_step_id`),
  CONSTRAINT `vendor_test_seq_steps_test_seq_step_id` FOREIGN KEY (`test_seq_step_id`) REFERENCES `test_seq_step` (`id`),
  CONSTRAINT `vendor_test_seq_steps_vendor_sequence_id` FOREIGN KEY (`vendor_test_sequences_id`) REFERENCES `vendor_test_sequences` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vendor_test_seq_steps` */

/*Table structure for table `vendor_test_sequences` */

DROP TABLE IF EXISTS `vendor_test_sequences`;

CREATE TABLE `vendor_test_sequences` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_id` int(11) NOT NULL,
  `test_sequence_id` int(11) NOT NULL,
  `asynch_flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `vendor_test_seq_test_seq_id` (`test_sequence_id`),
  KEY `vendor_test_seq_vendor_id` (`vendor_id`),
  CONSTRAINT `vendor_test_seq_test_seq_id` FOREIGN KEY (`test_sequence_id`) REFERENCES `test_sequence` (`id`),
  CONSTRAINT `vendor_test_seq_vendor_id` FOREIGN KEY (`vendor_id`) REFERENCES `vendor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vendor_test_sequences` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

