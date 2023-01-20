-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: wypozyczalnia3_1
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `archiwum`
--

DROP TABLE IF EXISTS `archiwum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `archiwum` (
  `ID_wypozyczenia` int NOT NULL,
  `ID_auta` int NOT NULL,
  `ID_klienta` int DEFAULT NULL,
  `Data_godzina_wypozyczenia` datetime NOT NULL,
  `Termin_zwrotu` datetime NOT NULL,
  `Data_zwrotu` datetime NOT NULL,
  `Kaucja` int NOT NULL,
  `Czy_w_terminie` tinyint NOT NULL,
  `Kara` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archiwum`
--

LOCK TABLES `archiwum` WRITE;
/*!40000 ALTER TABLE `archiwum` DISABLE KEYS */;
INSERT INTO `archiwum` VALUES (101,7,1,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',117,1,0),(102,21,2,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',103,1,0),(103,33,3,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',161,1,0),(104,29,4,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',122,1,0),(105,34,5,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',153,1,0),(106,10,6,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',162,1,0),(107,24,7,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',202,1,0),(108,2,8,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',138,1,0),(109,6,10,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',192,1,0),(110,19,9,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',180,1,0),(111,26,11,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',203,1,0),(112,22,12,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',129,1,0),(113,36,13,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',111,1,0),(114,25,14,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',110,1,0),(115,20,16,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',120,1,0),(116,17,17,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',193,1,0),(117,16,19,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',167,1,0),(118,14,20,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',165,1,0),(119,23,21,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',181,1,0),(120,15,22,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',122,1,0),(121,1,23,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',207,1,0),(122,3,24,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',123,1,0),(123,13,25,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',188,1,0),(124,30,26,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',181,1,0),(125,5,27,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',194,1,0),(126,40,28,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',127,1,0),(127,4,29,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',192,1,0),(128,9,30,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',195,1,0),(129,32,31,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',167,1,0),(130,35,32,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',205,1,0),(131,38,33,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',216,1,0),(132,12,34,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',126,1,0),(133,28,35,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',204,1,0),(134,39,36,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',208,1,0),(135,31,37,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',181,1,0),(136,37,38,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',145,1,0),(137,18,39,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',191,1,0),(138,27,40,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',127,1,0),(139,11,41,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',174,1,0),(140,8,42,'2022-03-14 07:07:39','2022-03-18 13:07:39','2022-03-18 07:07:39',111,1,0);
/*!40000 ALTER TABLE `archiwum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auto_wyposazenie`
--

DROP TABLE IF EXISTS `auto_wyposazenie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auto_wyposazenie` (
  `ID_auta` int NOT NULL,
  `ID_wyposazenia` int NOT NULL,
  PRIMARY KEY (`ID_wyposazenia`),
  UNIQUE KEY `ID_auta` (`ID_auta`),
  CONSTRAINT `auto_wyposazenie_ibfk_1` FOREIGN KEY (`ID_auta`) REFERENCES `samochody` (`ID_auta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auto_wyposazenie`
--

LOCK TABLES `auto_wyposazenie` WRITE;
/*!40000 ALTER TABLE `auto_wyposazenie` DISABLE KEYS */;
/*!40000 ALTER TABLE `auto_wyposazenie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `galeria`
--

DROP TABLE IF EXISTS `galeria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `galeria` (
  `ID_auta` int NOT NULL,
  `ID_zdjecia` int NOT NULL,
  `zdj` text NOT NULL,
  `Tekst_Alt` varchar(33) NOT NULL,
  KEY `ID_auta` (`ID_auta`),
  CONSTRAINT `galeria_ibfk_1` FOREIGN KEY (`ID_auta`) REFERENCES `samochody` (`ID_auta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `galeria`
--

LOCK TABLES `galeria` WRITE;
/*!40000 ALTER TABLE `galeria` DISABLE KEYS */;
INSERT INTO `galeria` VALUES (1,1,'https://images92.fotosik.pl/590/1b830a065833a6cdmed.png','przod1'),(1,2,'https://images91.fotosik.pl/588/78a3af2a5371296emed.png','przod2'),(2,1,'https://images91.fotosik.pl/588/f43e2d26b0266222med.png','przod1');
/*!40000 ALTER TABLE `galeria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pracownik_wypo`
--

DROP TABLE IF EXISTS `pracownik_wypo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pracownik_wypo` (
  `ID_wypozyczenia` int NOT NULL,
  `ID_pracownika` int NOT NULL,
  `ID_klienta` int NOT NULL,
  KEY `ID_pracownika` (`ID_pracownika`),
  KEY `ID_klienta` (`ID_klienta`),
  CONSTRAINT `pracownik_wypo_ibfk_2` FOREIGN KEY (`ID_pracownika`) REFERENCES `wypozyczenia_pracownik` (`ID_pracownika`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pracownik_wypo`
--

LOCK TABLES `pracownik_wypo` WRITE;
/*!40000 ALTER TABLE `pracownik_wypo` DISABLE KEYS */;
INSERT INTO `pracownik_wypo` VALUES (102,1,0),(101,1,0),(103,2,0),(104,3,0),(105,3,0),(106,1,0),(107,2,0),(108,3,0),(109,1,0),(110,2,0),(111,3,0),(112,1,0),(113,2,0),(114,3,0),(115,1,0),(116,2,0),(117,3,0),(118,1,0),(119,2,0),(120,3,0),(121,1,0),(122,2,0),(123,3,0),(124,1,0),(125,2,0),(126,3,0),(127,1,0),(128,2,0),(129,3,0),(130,1,0),(131,2,0),(132,3,0),(133,1,0),(134,2,0),(135,3,0),(136,1,0),(137,2,0),(138,3,0),(139,1,0),(140,1,0);
/*!40000 ALTER TABLE `pracownik_wypo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `samochody`
--

DROP TABLE IF EXISTS `samochody`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `samochody` (
  `ID_auta` int NOT NULL AUTO_INCREMENT,
  `Nr_rejestracyjny` varchar(45) NOT NULL,
  `Marka` varchar(30) NOT NULL,
  `Model` varchar(45) NOT NULL,
  `Przebieg` int NOT NULL,
  `Ilosc_miejsc` int NOT NULL,
  `Kolor` varchar(20) NOT NULL,
  `Skrzynia_biegow` varchar(20) NOT NULL,
  `Rodzaj_paliwa` varchar(20) NOT NULL,
  `Kategoria_samochodu` text NOT NULL,
  `cena_za_h` int NOT NULL,
  `Data_waznosci_przegladu` date NOT NULL,
  `Data_konca_ubezpieczenia` date NOT NULL,
  `Koszt_ubezpieczenia` int NOT NULL,
  `Czy_dostepne` int DEFAULT NULL,
  PRIMARY KEY (`ID_auta`)
) ENGINE=InnoDB AUTO_INCREMENT=341 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `samochody`
--

LOCK TABLES `samochody` WRITE;
/*!40000 ALTER TABLE `samochody` DISABLE KEYS */;
INSERT INTO `samochody` VALUES (1,'RZ-D0CJ5','Volkswagen','New Beetle',167794,4,'czarny','manualna','olej napedowy','duzy',49,'2022-05-28','2022-05-28',1738,1),(2,'RZ-NCEVX','Volkswagen','Jetta',198369,2,'bialy','manualna','LPG','sredni',17,'2022-05-18','2022-05-18',1606,1),(3,'RZ-OYSQN','Mercedes-Benz','SL-Class',170749,2,'szary','manualna','LPG','sredni',15,'2022-05-13','2022-05-13',1114,1),(4,'RZ-RJSJ6','Audi','riolet',197630,2,'bialy','manualna','LPG','minivan',39,'2022-05-30','2022-05-30',1552,1),(5,'RZ-4OEU2','Aston Martin','Vantage',110552,2,'szary','manualna','olej napedowy','maly',16,'2022-07-29','2022-07-29',1728,1),(6,'RZ-3U0HK','BMW','X5 M',98734,2,'srebny','automatyczna','olej napedowy','duzy',17,'2022-07-17','2022-07-17',861,1),(7,'RZ-JD6M9','Mercedes-Benz','500SEL',25308,4,'bialy','automatyczna','LPG','sredni',47,'2022-06-09','2022-06-09',1565,1),(8,'RZ-0DA28','Audi','S8',183914,2,'czerwony','automatyczna','LPG','kombi',23,'2022-06-05','2022-06-05',1522,1),(9,'RZ-NN0EG','Honda','Odyssey',59567,2,'pomaranczowy','automatyczna','benzyna','sredni',25,'2022-05-18','2022-05-18',888,1),(10,'RZ-ACFQT','Mazda','RX-8',185799,4,'niebieski','manualna','LPG','SUV',45,'2022-09-10','2022-09-10',1372,1),(11,'RZ-9FUJS','Toyota','Tercel',153853,4,'pomaranczowy','automatyczna','LPG','kombi',19,'2022-05-24','2022-05-24',1122,1),(12,'RZ-XX6AG','Ford','F150',95552,4,'bialy','manualna','olej napedowy','SUV',41,'2022-05-13','2022-05-13',882,1),(13,'RZ-JFC4G','Ford','E350',164321,4,'brazowy','automatyczna','benzyna','minivan',21,'2022-07-05','2022-07-05',1618,1),(14,'RZ-EN61C','Mazda','Millenia',192929,4,'pomaranczowy','automatyczna','olej napedowy','sredni',34,'2022-06-17','2022-06-17',1597,1),(15,'RZ-RJIZ4','Kia','Forte',179957,2,'zielony','manualna','LPG','duzy',46,'2022-06-27','2022-06-27',1260,1),(16,'RZ-PQXP4','Toyota','Avalon',108923,4,'bialy','automatyczna','olej napedowy','duzy',41,'2022-06-22','2022-06-22',1168,1),(17,'RZ-22NOP','Honda','Accord',19975,4,'niebieski','manualna','LPG','sredni',15,'2022-06-13','2022-06-13',1371,1),(18,'RZ-471YE','Audi','S8',102457,2,'bezowy','automatyczna','LPG','maly',47,'2022-08-23','2022-08-23',1380,1),(19,'RZ-TI252','Ford','Ranger',65793,4,'zielony','manualna','LPG','sredni',28,'2022-08-12','2022-08-12',1715,1),(20,'RZ-IT5VP','Mercedes-Benz','190E',110249,2,'brazowy','manualna','benzyna','SUV',47,'2022-06-16','2022-06-16',1448,1),(21,'RZ-ERHHD','Jeep','Cherokee',163429,2,'zielony','automatyczna','LPG','premium',29,'2022-07-09','2022-07-09',1375,1),(22,'RZ-VJ9NN','Ford','Explorer',107457,4,'niebieski','automatyczna','LPG','kombi',26,'2022-05-25','2022-05-25',1010,1),(23,'RZ-0HD8P','Audi','Coupe GT',66967,2,'brazowy','automatyczna','olej napedowy','premium',23,'2022-06-13','2022-06-13',1383,1),(24,'RZ-EGLY1','Volkswagen','rio',158490,2,'bezowy','automatyczna','LPG','duzy',39,'2022-07-19','2022-07-19',1582,1),(25,'RZ-C9J9V','Mazda','626',67088,4,'czarny','automatyczna','olej napedowy','sredni',41,'2022-07-06','2022-07-06',1485,1),(26,'RZ-CE6KD','Audi','5000S',67937,4,'niebieski','automatyczna','LPG','duzy',30,'2022-08-08','2022-08-08',872,1),(27,'RZ-7931Z','Honda','Odyssey',150791,4,'bezowy','manualna','benzyna','premium',43,'2022-08-05','2022-08-05',1450,1),(28,'RZ-KUF09','Audi','RS4',168404,4,'zielony','manualna','LPG','sredni',33,'2022-08-22','2022-08-22',1359,1),(29,'RZ-KQRYZ','Mazda','Miata MX-5',179227,2,'czerwony','manualna','benzyna','minivan',42,'2022-08-20','2022-08-20',1618,1),(30,'RZ-4HEIJ','Ford','F-Series',155546,2,'niebieski','automatyczna','LPG','premium',47,'2022-07-15','2022-07-15',973,1),(31,'RZ-N0F9W','Mazda','Miata MX-5',57957,2,'bezowy','automatyczna','olej napedowy','sredni',19,'2022-09-14','2022-09-14',1064,1),(32,'RZ-ODTJ8','Mazda','MX-5',170046,4,'zielony','automatyczna','olej napedowy','premium',24,'2022-09-10','2022-09-10',1238,1),(33,'RZ-KC8UL','Ford','Taurus X',110221,4,'czerwony','manualna','olej napedowy','maly',36,'2022-07-21','2022-08-13',1256,1),(34,'RZ-ISJL5','Toyota','Avalon',13168,4,'brazowy','manualna','benzyna','duzy',21,'2022-08-02','2022-08-02',1549,1),(35,'RZ-7QIZ0','Volkswagen','New Beetle',158585,4,'brazowy','manualna','benzyna','premium',35,'2022-05-19','2022-05-19',1528,1),(36,'RZ-9OC7M','BMW','745',57563,4,'zielony','manualna','benzyna','duzy',40,'2022-06-12','2022-06-12',896,1),(37,'RZ-XVU9T','Mercedes-Benz','SL-Class',48623,4,'pomaranczowy','manualna','olej napedowy','minivan',40,'2022-08-15','2022-08-15',856,1),(38,'RZ-FECXV','Mazda','929',36640,2,'bialy','automatyczna','LPG','premium',24,'2022-07-12','2022-07-12',999,1),(39,'RZ-8YU85','Ford','F-Series Super Duty',164938,2,'niebieski','automatyczna','LPG','maly',46,'2022-07-22','2022-07-22',1507,1),(40,'RZ-JIGN8','Porsche','Boxster',80247,4,'bezowy','automatyczna','LPG','kombi',26,'2022-06-22','2022-06-22',1679,1),(340,'RZ-FDGFD','Volkswagen','Jetta',455454,4,'Czarny','manualna','lpg','duzy',53,'0000-00-00','0000-00-00',1543,1);
/*!40000 ALTER TABLE `samochody` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wyposazenie`
--

DROP TABLE IF EXISTS `wyposazenie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wyposazenie` (
  `ID_wyposazenia` int NOT NULL,
  `wyposazenie` varchar(33) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wyposazenie`
--

LOCK TABLES `wyposazenie` WRITE;
/*!40000 ALTER TABLE `wyposazenie` DISABLE KEYS */;
/*!40000 ALTER TABLE `wyposazenie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wypozyczalnia`
--

DROP TABLE IF EXISTS `wypozyczalnia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wypozyczalnia` (
  `ID_wypozyczenia` int NOT NULL AUTO_INCREMENT,
  `ID_auta` int DEFAULT NULL,
  `ID_klienta` int DEFAULT NULL,
  `Data_godzina_wypozyczenia` datetime DEFAULT NULL,
  `Termin_zwrotu` datetime DEFAULT NULL,
  `Data_zwrotu` datetime DEFAULT NULL,
  `Kaucja` int DEFAULT NULL,
  `Czy_w_terminie` tinyint DEFAULT NULL,
  `Kara` int DEFAULT NULL,
  PRIMARY KEY (`ID_wypozyczenia`)
) ENGINE=InnoDB AUTO_INCREMENT=764 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wypozyczalnia`
--

LOCK TABLES `wypozyczalnia` WRITE;
/*!40000 ALTER TABLE `wypozyczalnia` DISABLE KEYS */;
INSERT INTO `wypozyczalnia` VALUES (1,1,1,'2022-05-19 00:00:00','2022-06-03 00:00:00','2022-05-30 14:52:34',124,1,0),(2,2,2,'2022-05-19 00:00:00','2022-06-03 00:00:00','2022-05-30 14:52:34',1632,1,0),(3,3,2,'2022-05-30 10:40:00','2022-06-14 00:00:00','2022-05-30 14:52:34',100,1,0),(4,6,1,'2022-05-30 02:11:13','2022-06-14 02:11:13','2022-05-30 14:52:34',199,1,0),(5,5,1,'2022-05-30 01:42:39','2022-06-14 01:42:39','2022-05-30 14:52:34',100,1,0),(6,4,1,'2022-05-19 00:00:00','2022-06-03 00:00:00','2022-05-30 14:52:34',543,1,0),(7,11,1,'2022-05-30 14:57:48','2022-06-14 14:57:48','2022-05-30 14:57:59',188,1,0),(8,9,1,'2022-05-30 14:52:25','2022-06-14 14:52:25','2022-05-30 14:52:34',100,1,0),(9,1,1,'2022-05-30 16:16:28','2022-06-14 16:16:28','2022-05-30 16:17:01',100,1,0),(10,7,1,'2022-05-30 14:20:41','2022-06-14 14:20:41','2022-05-30 14:52:34',100,1,0),(11,1,1,'2022-05-30 20:17:04','2022-06-14 20:17:04','2022-05-30 20:17:26',323,1,0);
/*!40000 ALTER TABLE `wypozyczalnia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wypozyczenia_klient`
--

DROP TABLE IF EXISTS `wypozyczenia_klient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wypozyczenia_klient` (
  `ID_klienta` int NOT NULL,
  `Nr_prawojazdy` varchar(44) NOT NULL,
  `Imie_klienta` varchar(44) NOT NULL,
  `Nazwisko_klienta` varchar(44) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wypozyczenia_klient`
--

LOCK TABLES `wypozyczenia_klient` WRITE;
/*!40000 ALTER TABLE `wypozyczenia_klient` DISABLE KEYS */;
INSERT INTO `wypozyczenia_klient` VALUES (1,'654754754','Lukasz ','Koziol');
/*!40000 ALTER TABLE `wypozyczenia_klient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wypozyczenia_pracownik`
--

DROP TABLE IF EXISTS `wypozyczenia_pracownik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wypozyczenia_pracownik` (
  `ID_pracownika` int NOT NULL,
  `Imie_pracownika` varchar(44) NOT NULL,
  `Identyfikator` varchar(44) NOT NULL,
  `Haslo` varchar(44) NOT NULL,
  PRIMARY KEY (`ID_pracownika`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wypozyczenia_pracownik`
--

LOCK TABLES `wypozyczenia_pracownik` WRITE;
/*!40000 ALTER TABLE `wypozyczenia_pracownik` DISABLE KEYS */;
INSERT INTO `wypozyczenia_pracownik` VALUES (1,'Damian','Admin1','1234'),(2,'Piotr','Admin2','1234'),(3,'Łukasz','Admin3','1234');
/*!40000 ALTER TABLE `wypozyczenia_pracownik` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-05 14:59:36
