-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: manoj_db
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `productName` varchar(50) DEFAULT NULL,
  `quantity` varchar(50) DEFAULT NULL,
  `productPrice` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES ('watch','2','40$',NULL),('','','',NULL),('','','',NULL),('','','',NULL),('Rolex Watch','2','40',NULL),('nike shoes','3','90',NULL),('nike shoes','2','60','manoj'),('Rolex Watch','3','60','manoj'),('nike shoes','3','90','manoj'),('nike shoes','3','90','manoj'),('nike shoes','3','90','manoj'),('Rolex Watch','3','60','manoj'),('nike shoes','3','90','manoj'),('nike shoes','3','90','manoj'),('nike shoes','1','30','srikanth'),('nike shoes','1','30','manoj'),('dell laptop','2','80','manoj'),('Rolex Watch','2','40','manoj'),('nike shoes','3','90','manoj'),('nike shoes','2','60','manoj'),('nike shoes','3','90','manoj'),('nike shoes','1','30','manoj'),('nike shoes','1','30','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','40','manoj'),('dell laptop','2','80','manoj'),('dell laptop','1','40','manoj'),('dell laptop','3','120','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','40','manoj'),('nike shoes','3','90','manoj'),('nike shoes','3','90','manoj'),('Rolex Watch','3','60','manoj'),('nike shoes','1','30','manoj'),('nike shoes','3','90','manoj'),('dell laptop','3','120','manoj'),('nike shoes','3','90','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','100','manoj'),('music album','2','100','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','40','manoj'),('nike shoes','1','30','manoj'),('dell laptop','1','40','manoj'),('dell laptop','1','40','manoj'),('nike shoes','1','100','kiran'),('nike shoes','1','30','kiran');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-10 16:12:52
