CREATE DATABASE  IF NOT EXISTS `renhe` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `renhe`;
-- MySQL dump 10.13  Distrib 5.6.18, for Win32 (x86)
--
-- Host: localhost    Database: renhe
-- ------------------------------------------------------
-- Server version	5.6.19-enterprise-commercial-advanced

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
-- Table structure for table `muser`
--

DROP TABLE IF EXISTS `muser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `muser` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(45) DEFAULT NULL,
  `mpassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muser`
--

LOCK TABLES `muser` WRITE;
/*!40000 ALTER TABLE `muser` DISABLE KEYS */;
INSERT INTO `muser` VALUES (1,'谢飞','123456'),(2,'12','c20ad4d76fe97759aa27a0c99bff6710'),(3,'1','c4ca4238a0b923820dcc509a6f75849b'),(4,'123','202cb962ac59075b964b07152d234b70'),(5,'12312','c20ad4d76fe97759aa27a0c99bff6710'),(6,'123','123'),(7,'12343','c8ffe9a587b126f152ed3d89a146b445'),(8,'12','12'),(9,'123','123'),(10,'12345','12345');
/*!40000 ALTER TABLE `muser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setpeople`
--

DROP TABLE IF EXISTS `setpeople`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `setpeople` (
  `spid` int(11) NOT NULL,
  `spname` varchar(45) DEFAULT NULL,
  `spuname` varchar(45) DEFAULT NULL,
  `sppw` varchar(45) DEFAULT NULL,
  `sppwd` varchar(45) DEFAULT NULL,
  `spdp` varchar(45) DEFAULT NULL,
  `spclass` varchar(45) DEFAULT NULL,
  `splevel` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`spid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setpeople`
--

LOCK TABLES `setpeople` WRITE;
/*!40000 ALTER TABLE `setpeople` DISABLE KEYS */;
INSERT INTO `setpeople` VALUES (151601,'冯静','me','123456','123456','计算机科学与技术学院','计算机科学与技术调研室','领导'),(151602,'高巍','haha','123456','123456','计算机科学与技术学院','网络工程调研室','领导'),(151603,'赵林','zhaolin','123456','123456','计算机科学与技术学院','网络工程调研室','审核人员'),(151604,'王亚娜','wang','1232456','123456','经济与管理学院','网络工程调研室','审核人员'),(151605,'李艳荣','lilili','123456','123456','计算机科学与技术学院','信息与计算科学调研室','普通教师'),(151606,'张立秋','123ww','123456','123456','计算机科学与技术学院','信息与计算科学调研室','审核人员'),(151607,'张立忠','123sss','123456','123456','计算机科学与技术学院','计算机科学与技术调研室','领导'),(151608,'张克非','zkf','123456','123456','计算机科学与技术学院','信息与计算科学调研室','审核人员'),(151609,'王怀忠','whssdfefr','123456','123456','计算机科学与技术学院','计算机科学与技术调研室','普通教师'),(151610,'谢飞','rh123','123456','123456','计算机科学与技术学院','软件工程调研室','审核人员');
/*!40000 ALTER TABLE `setpeople` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-16 18:30:25
