CREATE DATABASE  IF NOT EXISTS `quanlybanhang` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quanlybanhang`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlybanhang
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `chucvu`
--

DROP TABLE IF EXISTS `chucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chucvu` (
  `idchucvu` int NOT NULL,
  `tenChucVu` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idchucvu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
INSERT INTO `chucvu` VALUES (1,'quanly'),(2,'nhanvienkho'),(3,'nhanvienbanhang');
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangnhap`
--

DROP TABLE IF EXISTS `dangnhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dangnhap` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `idchucvu` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_chucvu3` (`idchucvu`),
  CONSTRAINT `fk_chucvu3` FOREIGN KEY (`idchucvu`) REFERENCES `chucvu` (`idchucvu`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangnhap`
--

LOCK TABLES `dangnhap` WRITE;
/*!40000 ALTER TABLE `dangnhap` DISABLE KEYS */;
INSERT INTO `dangnhap` VALUES (11,'1','$2a$08$HPFcBBKPVvzYm7rqM8gcRuIApCV72KpFfETBD2.VO/RTSVC5ILFMe',1),(12,'2','$2a$08$yOxqwzV9cb9En833OA3kruXhzewHzZBFJcVOdtjzAoFxvDqOBj5Li',2),(13,'3','$2a$08$nmMKOqaS5zyUmc0H5LWlkOfKkNv9hyksUHGYc4ThgxUZ5ym7g3SRy',3),(14,'phi','$2a$08$ayhjMm9vPFnCE.ubNr6c3uJMwqbqoxzhTUP.gjvi1A8j5OouADmbe',3);
/*!40000 ALTER TABLE `dangnhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danhmucsanpham`
--

DROP TABLE IF EXISTS `danhmucsanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhmucsanpham` (
  `maDanhMuc` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tenDanhMuc` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhmucsanpham`
--

LOCK TABLES `danhmucsanpham` WRITE;
/*!40000 ALTER TABLE `danhmucsanpham` DISABLE KEYS */;
INSERT INTO `danhmucsanpham` VALUES ('dm1','gia dụng'),('dm10','Hóa phẩm'),('dm2','điện tử'),('dm3','Đồ uống'),('dm4','Thức ăn nhanh'),('dm5','Bánh kẹo'),('dm6','Thuốc lá'),('dm7','Đồ chơi'),('dm8','Quần áo'),('dm9','Mỹ phẩm');
/*!40000 ALTER TABLE `danhmucsanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gia`
--

DROP TABLE IF EXISTS `gia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gia` (
  `idGia` int NOT NULL AUTO_INCREMENT,
  `giaNhap` double DEFAULT NULL,
  `giaBan` double DEFAULT NULL,
  `MasanPham` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idGia`),
  KEY `FK_giasp` (`MasanPham`),
  CONSTRAINT `FK_giasp` FOREIGN KEY (`MasanPham`) REFERENCES `sanpham` (`MasanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gia`
--

LOCK TABLES `gia` WRITE;
/*!40000 ALTER TABLE `gia` DISABLE KEYS */;
INSERT INTO `gia` VALUES (3,100000,100000,'sp01'),(4,1010202,10202,'sp02'),(5,20000,1000,'sp03');
/*!40000 ALTER TABLE `gia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvienbanhang`
--

DROP TABLE IF EXISTS `nhanvienbanhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvienbanhang` (
  `idnhanvienbanhang` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fullname` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gioiTinh` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthDay` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Address` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idchucVu` int DEFAULT NULL,
  PRIMARY KEY (`idnhanvienbanhang`),
  KEY `fk_chucvu2` (`idchucVu`),
  CONSTRAINT `fk_chucvu2` FOREIGN KEY (`idchucVu`) REFERENCES `chucvu` (`idchucvu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvienbanhang`
--

LOCK TABLES `nhanvienbanhang` WRITE;
/*!40000 ALTER TABLE `nhanvienbanhang` DISABLE KEYS */;
INSERT INTO `nhanvienbanhang` VALUES (1,'p1','phi','Nam','29/04/2021','uuuuu',NULL),(2,'3','3','Nam','03/04/2021','1',NULL),(3,'phi','3','Nam','16/04/2021','m',NULL);
/*!40000 ALTER TABLE `nhanvienbanhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvienkho`
--

DROP TABLE IF EXISTS `nhanvienkho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvienkho` (
  `idNhanvienKho` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fullname` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gioiTinh` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthDay` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Address` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idchucVu` int DEFAULT NULL,
  PRIMARY KEY (`idNhanvienKho`),
  KEY `fk_chucvu_idx` (`idchucVu`),
  KEY `fk_chucvu_idx1` (`idchucVu`),
  KEY `fk_chucvu_idx2` (`idchucVu`),
  CONSTRAINT `fk_chucvu1` FOREIGN KEY (`idchucVu`) REFERENCES `chucvu` (`idchucvu`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvienkho`
--

LOCK TABLES `nhanvienkho` WRITE;
/*!40000 ALTER TABLE `nhanvienkho` DISABLE KEYS */;
INSERT INTO `nhanvienkho` VALUES (1,'phi','chinh','Nam','13/04/2021','êwuewu',2),(2,'2','phi','Nam','17/04/1998','1	',NULL);
/*!40000 ALTER TABLE `nhanvienkho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quanly`
--

DROP TABLE IF EXISTS `quanly`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quanly` (
  `idquanly` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fullname` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gioiTinh` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthDay` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Address` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idchucVu` int DEFAULT NULL,
  PRIMARY KEY (`idquanly`),
  KEY `fk_chucvu_idx` (`idchucVu`),
  CONSTRAINT `fk_chucvu` FOREIGN KEY (`idchucVu`) REFERENCES `chucvu` (`idchucvu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quanly`
--

LOCK TABLES `quanly` WRITE;
/*!40000 ALTER TABLE `quanly` DISABLE KEYS */;
INSERT INTO `quanly` VALUES (1,'phit1','phi xuân','Nam','02/04/2021','12345 nam định',NULL),(2,'lâm','lâm','Nam','04/04/2021','hùng ca',NULL),(3,'1','phi','Nam','17/04/2021','phi	',NULL);
/*!40000 ALTER TABLE `quanly` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `MasanPham` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tenSanPham` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayXS` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `HanSD` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soLuong` int DEFAULT NULL,
  `maDanhMuc` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MasanPham`),
  KEY `maDanhMuc` (`maDanhMuc`),
  CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`maDanhMuc`) REFERENCES `danhmucsanpham` (`maDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES ('sp01','coca','08/04/2021','08/04/2021',94,'dm5'),('sp02','bia','19/04/2021','30/04/2021',109,'dm6'),('sp03','pepsi','09/04/1999','24/04/2021',986,'dm7');
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'quanlybanhang'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-30 23:21:30
