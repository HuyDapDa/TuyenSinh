-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: tuyensinhdb
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admission`
--

DROP TABLE IF EXISTS `admission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admission` (
  `idAdmission` int NOT NULL,
  `typeOfTraining` varchar(45) NOT NULL,
  PRIMARY KEY (`idAdmission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admission`
--

LOCK TABLES `admission` WRITE;
/*!40000 ALTER TABLE `admission` DISABLE KEYS */;
/*!40000 ALTER TABLE `admission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `benmarks`
--

DROP TABLE IF EXISTS `benmarks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `benmarks` (
  `idBenmarks` int NOT NULL AUTO_INCREMENT,
  `year` varchar(45) DEFAULT NULL,
  `diemHocBa` double DEFAULT NULL,
  `diemTHPT` double DEFAULT NULL,
  `diemDGNL` double DEFAULT NULL,
  `benmarkscol` varchar(45) DEFAULT NULL,
  `faculty_idFaculty` int NOT NULL,
  PRIMARY KEY (`idBenmarks`),
  KEY `faculty_idFaculty_idx` (`faculty_idFaculty`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benmarks`
--

LOCK TABLES `benmarks` WRITE;
/*!40000 ALTER TABLE `benmarks` DISABLE KEYS */;
/*!40000 ALTER TABLE `benmarks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `idComment` int NOT NULL AUTO_INCREMENT,
  `commentInformation` varchar(45) DEFAULT NULL,
  `post_idPost` int NOT NULL,
  `post_users_idUsers` int NOT NULL,
  `post_users_permission_idPermission` int NOT NULL,
  `post_faculty_idFaculty` int NOT NULL,
  `post_admission_idAdmission` int NOT NULL,
  PRIMARY KEY (`idComment`),
  KEY `post_idPost_idx` (`post_idPost`),
  KEY `post_users_idUsers_idx` (`post_users_idUsers`),
  KEY `post_users_permission_idPermission_idx` (`post_users_permission_idPermission`),
  KEY `post_faculty_idFaculty_idx` (`post_faculty_idFaculty`),
  KEY `post_admission_idAdmission_idx` (`post_admission_idAdmission`),
  CONSTRAINT `post_admission_idAdmission` FOREIGN KEY (`post_admission_idAdmission`) REFERENCES `post` (`admission_idAdmission`),
  CONSTRAINT `post_faculty_idFaculty` FOREIGN KEY (`post_faculty_idFaculty`) REFERENCES `post` (`faculty_idFaculty`),
  CONSTRAINT `post_idPost` FOREIGN KEY (`post_idPost`) REFERENCES `post` (`idPost`),
  CONSTRAINT `post_users_idUsers` FOREIGN KEY (`post_users_idUsers`) REFERENCES `post` (`users_idUsers`),
  CONSTRAINT `post_users_permission_idPermission` FOREIGN KEY (`post_users_permission_idPermission`) REFERENCES `post` (`users_permission_idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `faculty` (
  `idFaculty` int NOT NULL AUTO_INCREMENT,
  `facultyName` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `introVideo` varchar(45) DEFAULT NULL,
  `benmarks_idBenmarks` int NOT NULL,
  PRIMARY KEY (`idFaculty`),
  KEY `benmarks_idBenmarks_idx` (`benmarks_idBenmarks`),
  CONSTRAINT `benmarks_idBenmarks` FOREIGN KEY (`benmarks_idBenmarks`) REFERENCES `benmarks` (`idBenmarks`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permission` (
  `idPermission` int NOT NULL,
  `permissionName` varchar(45) NOT NULL,
  PRIMARY KEY (`idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post` (
  `idPost` int NOT NULL AUTO_INCREMENT,
  `postInformation` longtext NOT NULL,
  `postType` longtext,
  `users_idUsers` int NOT NULL,
  `users_permission_idPermission` int NOT NULL,
  `faculty_idFaculty` int NOT NULL,
  `admission_idAdmission` int NOT NULL,
  PRIMARY KEY (`idPost`),
  KEY `users_idUsers_idx` (`users_idUsers`),
  KEY `users_permission_idPermission_idx` (`users_permission_idPermission`),
  KEY `faculty_idFaculty_idx` (`faculty_idFaculty`),
  KEY `admission_idAdmission_idx` (`admission_idAdmission`),
  CONSTRAINT `admission_idAdmission` FOREIGN KEY (`admission_idAdmission`) REFERENCES `admission` (`idAdmission`),
  CONSTRAINT `faculty_idFaculty` FOREIGN KEY (`faculty_idFaculty`) REFERENCES `faculty` (`idFaculty`),
  CONSTRAINT `users_permission_idPermission` FOREIGN KEY (`users_permission_idPermission`) REFERENCES `users` (`permission_idPermission`),
  CONSTRAINT `usesr_idUsers` FOREIGN KEY (`users_idUsers`) REFERENCES `users` (`idUsers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `idUsers` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Avatar` varchar(45) DEFAULT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `User_Role` varchar(45) NOT NULL,
  `permission_idPermission` int NOT NULL,
  PRIMARY KEY (`idUsers`),
  KEY `permission_idPermission_idx` (`permission_idPermission`),
  CONSTRAINT `permission_idPermission` FOREIGN KEY (`permission_idPermission`) REFERENCES `permission` (`idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-28 12:09:46
