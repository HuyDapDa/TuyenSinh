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
  `idadmission` int NOT NULL,
  `typeoftraining` varchar(45) NOT NULL,
  PRIMARY KEY (`idadmission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admission`
--

LOCK TABLES `admission` WRITE;
/*!40000 ALTER TABLE `admission` DISABLE KEYS */;
INSERT INTO `admission` VALUES (1,'Chính quy'),(2,'Liên thông'),(3,'Cao học'),(4,'Thạc sĩ'),(5,'Đào tạo từ xa');
/*!40000 ALTER TABLE `admission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `benmarks`
--

DROP TABLE IF EXISTS `benmarks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `benmarks` (
  `idbenmarks` int NOT NULL AUTO_INCREMENT,
  `year` varchar(45) DEFAULT NULL,
  `diemhocba` double DEFAULT NULL,
  `diemthpt` double DEFAULT NULL,
  `diemdgnl` double DEFAULT NULL,
  `faculty_idFaculty` int NOT NULL,
  PRIMARY KEY (`idbenmarks`),
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
  `idcomment` int NOT NULL AUTO_INCREMENT,
  `commentinformation` varchar(45) DEFAULT NULL,
  `post_idpost` int NOT NULL,
  `post_users_idusers` int NOT NULL,
  `post_users_permission_idpermission` int NOT NULL,
  `post_faculty_idfaculty` int NOT NULL,
  `post_admission_idadmission` int NOT NULL,
  PRIMARY KEY (`idcomment`),
  KEY `post_idPost_idx` (`post_idpost`),
  KEY `post_users_idUsers_idx` (`post_users_idusers`),
  KEY `post_users_permission_idPermission_idx` (`post_users_permission_idpermission`),
  KEY `post_faculty_idFaculty_idx` (`post_faculty_idfaculty`),
  KEY `post_admission_idAdmission_idx` (`post_admission_idadmission`),
  CONSTRAINT `post_admission_idAdmission` FOREIGN KEY (`post_admission_idadmission`) REFERENCES `post` (`admission_idadmission`),
  CONSTRAINT `post_faculty_idFaculty` FOREIGN KEY (`post_faculty_idfaculty`) REFERENCES `post` (`faculty_idfaculty`),
  CONSTRAINT `post_idPost` FOREIGN KEY (`post_idpost`) REFERENCES `post` (`idpost`),
  CONSTRAINT `post_users_idUsers` FOREIGN KEY (`post_users_idusers`) REFERENCES `post` (`users_idusers`),
  CONSTRAINT `post_users_permission_idPermission` FOREIGN KEY (`post_users_permission_idpermission`) REFERENCES `post` (`users_permission_idpermission`)
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
  `idfaculty` int NOT NULL AUTO_INCREMENT,
  `facultyname` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `introvideo` varchar(45) DEFAULT NULL,
  `benmarks_idbenmarks` int NOT NULL,
  PRIMARY KEY (`idfaculty`),
  KEY `benmarks_idBenmarks_idx` (`benmarks_idbenmarks`),
  CONSTRAINT `benmarks_idBenmarks` FOREIGN KEY (`benmarks_idbenmarks`) REFERENCES `benmarks` (`idbenmarks`)
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
  `idpermission` int NOT NULL,
  `permissionname` varchar(45) NOT NULL,
  PRIMARY KEY (`idpermission`)
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
  `idpost` int NOT NULL AUTO_INCREMENT,
  `postinformation` longtext NOT NULL,
  `posttype` longtext,
  `users_idusers` int NOT NULL,
  `users_permission_idpermission` int NOT NULL,
  `faculty_idfaculty` int NOT NULL,
  `admission_idadmission` int NOT NULL,
  PRIMARY KEY (`idpost`),
  KEY `users_idUsers_idx` (`users_idusers`),
  KEY `users_permission_idPermission_idx` (`users_permission_idpermission`),
  KEY `faculty_idFaculty_idx` (`faculty_idfaculty`),
  KEY `admission_idAdmission_idx` (`admission_idadmission`),
  CONSTRAINT `admission_idAdmission` FOREIGN KEY (`admission_idadmission`) REFERENCES `admission` (`idadmission`),
  CONSTRAINT `faculty_idFaculty` FOREIGN KEY (`faculty_idfaculty`) REFERENCES `faculty` (`idfaculty`),
  CONSTRAINT `users_permission_idPermission` FOREIGN KEY (`users_permission_idpermission`) REFERENCES `users` (`permission_idpermission`),
  CONSTRAINT `usesr_idUsers` FOREIGN KEY (`users_idusers`) REFERENCES `users` (`idusers`)
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
  `idusers` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `avatar` varchar(100) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `user_role` varchar(45) NOT NULL,
  `permission_idpermission` int DEFAULT NULL,
  PRIMARY KEY (`idusers`),
  KEY `permission_idPermission_idx` (`permission_idpermission`),
  CONSTRAINT `permission_idPermission` FOREIGN KEY (`permission_idpermission`) REFERENCES `permission` (`idpermission`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Huy','Tran',NULL,'huy0204','huy123',NULL,'USER_ADMIN',NULL);
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

-- Dump completed on 2023-08-30 14:58:58
