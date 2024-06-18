-- MySQL dump 10.13  Distrib 8.4.0, for Win64 (x86_64)
--
-- Host: localhost    Database: student_portal
-- ------------------------------------------------------
-- Server version	8.4.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ROLL_NUMBER` int DEFAULT NULL,
  `USER_NAME` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  `security_qtn1` varchar(40) DEFAULT NULL,
  `security_qtn1_ans` varchar(40) DEFAULT NULL,
  `security_qtn2` varchar(40) DEFAULT NULL,
  `security_qtn2_ans` varchar(40) DEFAULT NULL,
  `CREATED_BY` varchar(20) DEFAULT NULL,
  `CREATED_AT` date DEFAULT NULL,
  `UPDATED_AT` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ROLL_NUMBER` (`ROLL_NUMBER`),
  CONSTRAINT `accounts_ibfk_1` FOREIGN KEY (`ROLL_NUMBER`) REFERENCES `student` (`ROLL_NUMBER`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,100101,'raju','Raju@123','Your birth place','tirupati','Your best friend name','seetha','raju','2024-06-01','2024-06-01'),(3,100102,'tony123','Tony@123','Your favorite pet','tommy','Your favorite color','black','tony123','2024-06-11','2024-06-11');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaves`
--

DROP TABLE IF EXISTS `leaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leaves` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ROLL_NUMBER` int DEFAULT NULL,
  `leave_type` varchar(50) DEFAULT NULL,
  `REASON` varchar(30) DEFAULT NULL,
  `FROM_DATE` date DEFAULT NULL,
  `TO_DATE` date DEFAULT NULL,
  `NUMBER_OF_DAYS` int DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL,
  `COMMENTS` varchar(30) DEFAULT NULL,
  `CREATED_AT` date DEFAULT NULL,
  `UPDATED_AT` date DEFAULT NULL,
  `CREATED_BY` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaves`
--

LOCK TABLES `leaves` WRITE;
/*!40000 ALTER TABLE `leaves` DISABLE KEYS */;
INSERT INTO `leaves` VALUES (1,100102,'Sick Leave','Health illness','0018-12-15','0018-12-15',1,'new','','2024-06-12','2024-06-12','admin'),(2,100102,'Casual Leave','Need to go out','0018-12-15','0019-12-15',2,'new','','2024-06-12','2024-06-12','tony123'),(3,100101,'Sick Leave','Health illness','0018-12-15','0018-12-15',1,'new','','2024-06-12','2024-06-12','raju'),(4,100101,'Sick Leave','Sick leave','0018-12-15','0018-12-15',1,'new','','2024-06-12','2024-06-12','raju');
/*!40000 ALTER TABLE `leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `ROLL_NUMBER` int NOT NULL,
  `STUDENT_NAME` varchar(40) DEFAULT NULL,
  `GENDER` varchar(10) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `COURSE_NAME` varchar(15) DEFAULT NULL,
  `ADDRESS` varchar(70) DEFAULT NULL,
  `MOBILE_NUMBER` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL,
  `CREATED_BY` varchar(20) DEFAULT NULL,
  `CREATED_AT` date DEFAULT NULL,
  `UPDATED_AT` date DEFAULT NULL,
  PRIMARY KEY (`ROLL_NUMBER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (100101,'Raju','male','2020-01-01','cse','Tirupati','9988776655','raju@gmail.com','admin','2024-06-01','2024-06-01'),(100102,'Tony Stark','male','2020-01-02','cse','Hyderabad','9988776644','tony@gmail.com','admin','2024-06-11','2024-06-11');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-18 21:22:55
