-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: newlibrary
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `authors` (
  `id` int NOT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `expertise` varchar(100) DEFAULT NULL,
  `about` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors`
--

LOCK TABLES `authors` WRITE;
/*!40000 ALTER TABLE `authors` DISABLE KEYS */;
INSERT INTO `authors` VALUES (2,'Vũ','Hữu Tiệp','Ngôn ngữ','Là một người giàu ngôn ngữ '),(3,'Martin ',' Lindstrom','Maketting',''),(4,'Trần ','Bích Hà','Y học','là một nhà y học tài ba'),(5,'BOBBY ','BONES','Kĩ năng sống','Ông có rất nhiều câu nói hay về kĩ năng sống'),(6,'Ngô','Thành Nam','AI','Hơn 10 năm trước - những lập trình viên Việt Nam - tìm mọi cách thuyết phục hãng Boeing để tham gia vào dự án Digital Aviation của họ. Một dự án đầy thách thức.'),(7,'Houbing ','Song','Công nghệ','Là một người giàu kinh nghiệm trong lĩnh vực công nghệ'),(12,'Kevin','Mitnick','Công nghệ','Hồ Anh Thái có lẽ là một trong những tác giả có sức viết dồi dào nhất nền văn học đương đại Việt Nam với tổng cộng 33 cuốn sách. “Hiện tượng văn chương của thế hệ văn nhân thời hậu chiến sau 1975” Hồ Anh Thái bắt đầu sự nghiệp viết lách từ năm 1985, bên cạnh một sự nghiệp khác là nhà ngoại giao và giáo sư văn hóa.'),(984,'Hồ','Hồng Thái','Văn học','Hồ Anh Thái có lẽ là một trong những tác giả có sức viết dồi dào nhất nền văn học đương đại Việt Nam với tổng cộng 33 cuốn sách. “Hiện tượng văn chương của thế hệ văn nhân thời hậu chiến sau 1975” Hồ Anh Thái bắt đầu sự nghiệp viết lách từ năm 1985, bên cạnh một sự nghiệp khác là nhà ngoại giao và giáo sư văn hóa.');
/*!40000 ALTER TABLE `authors` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-25  0:19:33
