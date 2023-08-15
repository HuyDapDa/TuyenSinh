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
  `typeOfTraning` varchar(45) NOT NULL,
  PRIMARY KEY (`idAdmission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admission`
--

LOCK TABLES `admission` WRITE;
/*!40000 ALTER TABLE `admission` DISABLE KEYS */;
INSERT INTO `admission` VALUES (1,'CLC'),(2,'Dai Tra'),(3,'Dao Tao Tu Xa');
/*!40000 ALTER TABLE `admission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `benmarks`
--

DROP TABLE IF EXISTS `benmarks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `benmarks` (
  `idBenmarks` int NOT NULL,
  `year` varchar(50) DEFAULT NULL,
  `diemHocBa` double DEFAULT NULL,
  `diemTHPT` double DEFAULT NULL,
  `diemDGNL` double DEFAULT NULL,
  `faculty_idFaculty` int NOT NULL,
  PRIMARY KEY (`idBenmarks`,`faculty_idFaculty`),
  KEY `fk_benmarks_faculty1_idx` (`faculty_idFaculty`),
  CONSTRAINT `fk_benmarks_faculty1` FOREIGN KEY (`faculty_idFaculty`) REFERENCES `faculty` (`idFaculty`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benmarks`
--

LOCK TABLES `benmarks` WRITE;
/*!40000 ALTER TABLE `benmarks` DISABLE KEYS */;
INSERT INTO `benmarks` VALUES (1,'2020',28,26,600,1);
/*!40000 ALTER TABLE `benmarks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `idComment` int NOT NULL,
  `commentInfomation` longtext,
  PRIMARY KEY (`idComment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,'ádasaaasdsas');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `faculty` (
  `idFaculty` int NOT NULL,
  `falcutyName` varchar(45) NOT NULL,
  `website` varchar(45) NOT NULL,
  `introVideo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idFaculty`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (1,'CNTT','it.ou.edu.vn',NULL);
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
  `PermissionName` varchar(45) NOT NULL,
  PRIMARY KEY (`idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` VALUES (1,'Admin'),(2,'User');
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post` (
  `idPost` int NOT NULL,
  `postInfomation` longtext NOT NULL,
  `postType` longtext,
  `users_idUsers` int NOT NULL,
  `users_permission_idPermission` int NOT NULL,
  `faculty_idFaculty` int NOT NULL,
  `admission_idAdmission` int NOT NULL,
  PRIMARY KEY (`idPost`,`users_idUsers`,`users_permission_idPermission`,`faculty_idFaculty`,`admission_idAdmission`),
  KEY `fk_post_users1_idx` (`users_idUsers`,`users_permission_idPermission`),
  KEY `fk_post_faculty1_idx` (`faculty_idFaculty`),
  KEY `fk_post_admission1_idx` (`admission_idAdmission`),
  CONSTRAINT `fk_post_admission1` FOREIGN KEY (`admission_idAdmission`) REFERENCES `admission` (`idAdmission`),
  CONSTRAINT `fk_post_faculty1` FOREIGN KEY (`faculty_idFaculty`) REFERENCES `faculty` (`idFaculty`),
  CONSTRAINT `fk_post_users1` FOREIGN KEY (`users_idUsers`, `users_permission_idPermission`) REFERENCES `users` (`idUsers`, `permission_idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,'','Bài báo',1,1,1,1);
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_has_comment`
--

DROP TABLE IF EXISTS `post_has_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post_has_comment` (
  `post_idPost` int NOT NULL,
  `post_users_idUsers` int NOT NULL,
  `post_users_permission_idPermission` int NOT NULL,
  `comment_idComment` int NOT NULL,
  PRIMARY KEY (`post_idPost`,`post_users_idUsers`,`post_users_permission_idPermission`,`comment_idComment`),
  KEY `fk_post_has_comment_comment1_idx` (`comment_idComment`),
  KEY `fk_post_has_comment_post1_idx` (`post_idPost`,`post_users_idUsers`,`post_users_permission_idPermission`),
  CONSTRAINT `fk_post_has_comment_comment1` FOREIGN KEY (`comment_idComment`) REFERENCES `comment` (`idComment`),
  CONSTRAINT `fk_post_has_comment_post1` FOREIGN KEY (`post_idPost`, `post_users_idUsers`, `post_users_permission_idPermission`) REFERENCES `post` (`idPost`, `users_idUsers`, `users_permission_idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_has_comment`
--

LOCK TABLES `post_has_comment` WRITE;
/*!40000 ALTER TABLE `post_has_comment` DISABLE KEYS */;
INSERT INTO `post_has_comment` VALUES (1,1,1,1);
/*!40000 ALTER TABLE `post_has_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `idUsers` int NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Avata` varchar(50) DEFAULT NULL,
  `LoginName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `loaiUser` varchar(45) NOT NULL,
  `permission_idPermission` int NOT NULL,
  PRIMARY KEY (`idUsers`,`permission_idPermission`),
  KEY `fk_users_permission_idx` (`permission_idPermission`),
  CONSTRAINT `fk_users_permission` FOREIGN KEY (`permission_idPermission`) REFERENCES `permission` (`idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Nguyen Cao Danh',NULL,'DanhCao198','123456','danhcao.ng@gmail.com','1',1),(2,'Tran Quang Huy',NULL,'HuyTran123','123456','huytran@gmail.com','2',2);
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

-- Dump completed on 2023-08-06 11:31:16
