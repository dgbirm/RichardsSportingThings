CREATE DATABASE  IF NOT EXISTS `hackathondb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hackathondb`;
-- MySQL dump 10.13  Distrib 8.0.19, for macos10.15 (x86_64)
--
-- Host: localhost    Database: hackathondb
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `image_url` varchar(255) DEFAULT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `special_key` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'https://dks.scene7.com/is/image/dkscdn/16TACUCMPTTNVLLYBVLL_is/?$DSG_ProductCard$','Tachikara CV-NET Regulation Net',124.99,NULL),(2,'https://dks.scene7.com/is/image/dkscdn/20ADIWSVWMNSJCKTXVLL_White_Navy_Red_is/?$DSG_ProductCard$','adidas Women\'s USA Volleyball Jacket',100,NULL),(3,'https://dks.scene7.com/is/image/dkscdn/19ADIWSVLLYBLLTNKVLL_Light_Grey_is/?$DSG_ProductCard$','adidas Women\'s USA Volleyball Tank Top',35,'DicksExclusive'),(4,'https://dks.scene7.com/is/image/dkscdn/16TANURPRTCHTTNSNVLL_is/?$DSG_ProductCard$','Tandem Volleyball Net Tensioning System',29.99,NULL),(5,'https://dks.scene7.com/is/image/dkscdn/19ADIMSWRMPJCKTMNVLL_Team_Navy_Blue_White_Red_is/?$DSG_ProductCard$','adidas Men\'s USA Volleyball Warm-Up Jacket',100,'Extended Sizes'),(6,'https://dks.scene7.com/is/image/dkscdn/20ADIMMNSSVTRDXXXVLL_Red_is/?$DSG_ProductCard$','adidas Men\'s USA Volleyball T-Shirt',35,NULL),(7,'https://dks.scene7.com/is/image/dkscdn/18MIZALGNVLLYBLLPVLL_Charcoal_is/?$DSG_ProductCard$','Mizuno Women\'s Align Volleyball Pants',45.99,NULL),(8,'https://dks.scene7.com/is/image/dkscdn/20MIZWWVLGHTNNGZ6FTW_Whte_Navy_is/?$DSG_ProductCard$','Mizuno Women\'s Wave Lightning Z6 Volleyball Shoes',119.99,'DicksExclusive'),(9,'https://dks.scene7.com/is/image/dkscdn/18ADIULTKNPDSXXXXVLL_Black_White_is/?$DSG_ProductCard$','adidas Elite Volleyball Knee Pads',30,NULL),(10,'https://dks.scene7.com/is/image/dkscdn/16PORUPWRVLLYBLLNVLL_is/?$DSG_ProductCard$','Porter Power Volleyball Net',199.99,NULL),(11,'https://dks.scene7.com/is/image/dkscdn/16TACUSFTTCVX2VLLVLL_Black_Scarlet_is/?$DSG_ProductCard$','Tachikara VX2 SofTec Indoor/Outdoor Volleyball',17.99,NULL),(12,'https://dks.scene7.com/is/image/dkscdn/16TACUTCHKRSV18SCVLL_Black_Red_is/?$DSG_ProductCard$','Tachikara SV18S Indoor Volleyball',29.99,NULL),(14,'https://dks.scene7.com/is/image/dkscdn/20WILUPTXVPTRGMBLVLL_Yellow_Black_is/?$DSG_ProductCard$','Wilson OPTX AVP Tour Outdoor Volleyball',69.99,'TopSeller'),(16,'https://dks.scene7.com/is/image/dkscdn/20WILUPTXVPTRRPLCVLL_Yellow_Black_is/?$DSG_ProductCard$','Wilson OPTX AVP Replica Outdoor Volleyball',24.99,NULL),(18,'https://dks.scene7.com/is/image/dkscdn/20MIKUKNGFTHBCHGMVLL_Black_White_is/?$DSG_ProductCard$','Mikasa King of the Beach Pro Game Ball Volleyball',49.99,'NewArrivals'),(19,'https://dks.scene7.com/is/image/dkscdn/20UARWTMSHRTY4NXXAPB_Midnight_Navy_is/?$DSG_ProductCard$','Under Armour Women\'s Team Shorty Volleyball Shorts',30,'NewArrivals'),(20,'https://dks.scene7.com/is/image/dkscdn/20MIZWWVSPRSNC2WHFTW_Black_Grey_is/?$DSG_ProductCard$','Mizuno Women\'s Wave Supersonic 2 Volleyball Shoes',84.99,'NewArrivals'),(21,'https://dks.scene7.com/is/image/dkscdn/19QYFUDSGSLNVLLYBVLLA_No_Color_is/?$DSG_ProductCard$','DSG Solana Indoor/Outdoor Volleyball',14.99,'DicksExclusive'),(22,'https://dks.scene7.com/is/image/dkscdn/16MIKULYMPCBCHCHMVLL_White_Blue_Lemon_is/?$DSG_ProductCard$','Mikasa Official FIVB Beach Volleyball',69.99,'TopSeller'),(23,'https://dks.scene7.com/is/image/dkscdn/16BDNUMTCHPNTPNKXVLL_Pink_is/?$DSG_ProductCard$','Baden Pink Match Point Outdoor Volleyball',14.99,NULL),(24,'https://dks.scene7.com/is/image/dkscdn/16MOLUSPRTCHNCVBNVLL_Black_White_Blue_is/?$DSG_ProductCard$','Molten Super Touch Indoor Volleyball',64.99,'TopSeller'),(25,'https://dks.scene7.com/is/image/dkscdn/18NIKWZMHYPRC2XXXFTW_Black_White_is/?$DSG_ProductCard$','Nike Women\'s Zoom HyperAce 2 Volleyball Shoes',114.99,'TopSeller'),(26,'https://dks.scene7.com/is/image/GolfGalaxy/16MOLAMLTNNCFLSTTVLL_Red_White_Blue?wid=1000&fmt=pjpeg','Molten NCAA FLISTATEC Competition Volleyball',69.99,'TopSeller'),(27,'https://dks.scene7.com/is/image/GolfGalaxy/16MOLUMLTNCMPBLLXVLL_Neon_Tye_Dye?qlt=70&wid=1100&fmt=webp','Molten Camp Print Indoor/Outdoor Volleyball',16.99,'LimitedStock'),(28,'https://dks.scene7.com/is/image/GolfGalaxy/16TACUTB18TRNNGBLVLL_White_Red?qlt=70&wid=1100&fmt=webp','Tachikara The Setter Heavyweight Training V',54.99,NULL),(29,'https://dks.scene7.com/is/image/GolfGalaxy/16TACUSV5WSNDRBLLVLL_White?qlt=70&wid=1100&fmt=webp','Tachikara SV-5WS Gold Indoor Volleyball',45.99,NULL),(30,'https://dks.scene7.com/is/image/GolfGalaxy/16TACUSV5WGLDNDRBVLL_Blue_White?qlt=70&wid=1100&fmt=webp','Tachikara SV-5W Gold Indoor Volleyball',59.99,NULL),(33,'https://dks.scene7.com/is/image/GolfGalaxy/16MIKUNVLRPLCBLLXVLL_White_Pink_Black?qlt=70&wid=1100&fmt=webp','Mikasa Official NVL-VX Replica Beach Volleyball',19.99,'LimitedStock'),(35,'https://dks.scene7.com/is/image/GolfGalaxy/16MIKULYMPCBCHRPLVLL_Blue_Yellow?qlt=70&wid=1100&fmt=webp','Mikasa VLX30 Olympic Replica Beach Volleyball',19.99,NULL),(36,'https://dks.scene7.com/is/image/GolfGalaxy/20MIKUKNGFTHBCHRPVLL_Black_White?qlt=70&wid=1100&fmt=webp','Mikasa King of the Beach Replica Volleyball',24.99,'NewArrivals'),(37,'https://dks.scene7.com/is/image/GolfGalaxy/16WILUGRFFTBLLXXXVLL_Multi?qlt=70&wid=1100&fmt=webp','Wilson Graffiti Outdoor Volleyball',19.99,NULL),(38,'https://dks.scene7.com/is/image/GolfGalaxy/17WILUVPRPLCBCHXXVLL_White_Yellow?qlt=70&wid=1100&fmt=webp','Wilson AVP Replica II Beach Volleyball',19.99,NULL),(39,'https://dks.scene7.com/is/image/GolfGalaxy/16WILUNCBCHFFCLGMVLL_White_Blue?qlt=70&wid=1100&fmt=webp','Wilson NCAA Official Beach Championship Game Volleyball',69.99,'TopSeller'),(40,'https://dks.scene7.com/is/image/GolfGalaxy/20NIKWRCTHYPRSTBLFTW_Black_White?qlt=70&wid=1100&fmt=webp','Nike Women\'s React Hyperset Volleyball Shoes',124.99,NULL),(41,'https://dks.scene7.com/is/image/GolfGalaxy/20NIKWHYPRSPDCRTBFTW_Black_White?qlt=70&wid=1100&fmt=webp','Nike Women\'s Court HyperSpeed Volleyball Shoes',78.99,NULL);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_tag`
--

DROP TABLE IF EXISTS `item_tag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_tag` (
  `item_tag_id` int NOT NULL AUTO_INCREMENT,
  `item_id` int NOT NULL,
  `tag_id` int NOT NULL,
  PRIMARY KEY (`item_tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=182 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_tag`
--

LOCK TABLES `item_tag` WRITE;
/*!40000 ALTER TABLE `item_tag` DISABLE KEYS */;
INSERT INTO `item_tag` VALUES (1,1,1),(2,1,11),(3,1,12),(4,2,1),(5,2,2),(6,2,4),(7,2,10),(8,2,12),(9,2,20),(10,3,1),(11,3,2),(12,3,4),(13,3,9),(14,3,12),(15,3,20),(16,4,1),(17,4,11),(18,4,12),(19,5,1),(20,5,12),(21,5,3),(22,5,4),(23,5,10),(24,5,20),(25,6,1),(26,6,3),(27,6,12),(28,6,4),(29,6,9),(30,6,20),(31,7,1),(32,7,2),(33,7,4),(34,7,6),(35,7,12),(36,7,17),(37,8,1),(38,8,2),(39,8,5),(40,8,17),(41,9,20),(42,9,12),(43,9,7),(44,9,4),(45,10,1),(46,10,11),(47,10,12),(48,11,1),(49,11,12),(50,11,13),(51,11,21),(52,11,24),(53,12,1),(54,12,12),(55,12,13),(56,12,21),(57,12,24),(58,13,1),(59,13,12),(60,13,13),(61,13,24),(62,14,1),(63,14,12),(64,14,24),(65,14,15),(66,14,14),(67,15,1),(68,15,12),(69,15,13),(70,15,18),(71,15,24),(72,16,1),(73,16,12),(74,16,14),(75,16,15),(76,16,24),(77,17,1),(78,17,12),(79,17,14),(80,17,24),(81,18,1),(82,18,12),(83,18,18),(84,18,14),(85,18,24),(86,19,1),(87,19,2),(88,19,4),(89,19,8),(90,19,23),(91,20,1),(92,20,2),(93,20,5),(94,20,17),(95,21,1),(96,21,2),(97,21,3),(98,21,12),(99,21,13),(100,21,24),(101,21,14),(102,22,1),(103,22,12),(104,22,14),(105,22,24),(106,22,18),(107,23,1),(108,23,2),(109,23,3),(110,23,12),(111,23,24),(112,23,14),(113,24,1),(114,24,12),(115,24,13),(116,24,24),(117,24,16),(118,25,1),(119,25,5),(120,25,19),(121,26,1),(122,26,12),(123,26,13),(124,26,16),(125,26,24),(126,27,1),(127,27,12),(128,27,13),(129,27,16),(130,27,24),(131,28,1),(132,28,12),(133,28,13),(134,28,21),(135,28,24),(136,29,1),(137,29,12),(138,29,13),(139,29,21),(140,29,24),(141,30,1),(142,30,12),(143,30,13),(144,30,21),(145,30,24),(146,33,1),(147,33,12),(148,33,14),(149,33,18),(150,33,24),(151,35,1),(152,35,12),(153,35,14),(154,35,18),(155,35,24),(156,36,1),(157,36,12),(158,36,14),(159,36,24),(160,36,18),(161,37,1),(162,37,12),(163,37,14),(164,37,24),(165,37,15),(166,38,1),(167,38,12),(168,38,24),(169,38,15),(170,38,14),(171,39,1),(172,39,12),(173,39,24),(174,39,15),(175,39,14),(176,40,1),(177,40,5),(178,40,19),(179,41,1),(180,41,5),(181,41,19);
/*!40000 ALTER TABLE `item_tag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tag`
--

DROP TABLE IF EXISTS `tag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tag` (
  `tag_id` int NOT NULL AUTO_INCREMENT,
  `is_final` int NOT NULL,
  `level` int NOT NULL,
  `preceding_node` varchar(255) DEFAULT NULL,
  `tag_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tag`
--

LOCK TABLES `tag` WRITE;
/*!40000 ALTER TABLE `tag` DISABLE KEYS */;
INSERT INTO `tag` VALUES (1,0,1,NULL,'Sports'),(2,0,0,NULL,'Women'),(3,0,0,NULL,'Men'),(4,0,3,'Volleyball','Clothes'),(5,0,3,'Volleyball','Shoes'),(6,0,4,'Clothes','Pants'),(7,0,4,'Clothes','Knee Pads'),(8,0,4,'Clothes','Shorts'),(9,0,4,'Clothes','Shirt'),(10,0,4,'Clothes','Jacket'),(11,0,3,'Volleyball','Net'),(12,0,2,'Sports','Volleyball'),(13,0,4,'Volleyballs','Indoor'),(14,0,4,'Volleyballs','Outdoor'),(15,1,5,'Outdoor','Wilson'),(16,1,5,'Indoor','Molten'),(17,1,5,'Shoes','Mizuno'),(18,1,5,'Outdoor','Mikasa'),(19,1,5,'Shoes','Nike'),(20,1,5,'Clothes','Adidas'),(21,1,5,'Indoor','Tachikara'),(22,0,0,NULL,'Accessories'),(23,1,5,'Clothes','UnderArmour'),(24,0,3,'Volleyball','Volleyballs'),(25,0,1,NULL,'Exercise & Wellness '),(26,0,1,NULL,'Outdoor & Recreation'),(27,0,2,'Sports','Basketball'),(28,0,2,'Sports','Baseball');
/*!40000 ALTER TABLE `tag` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-09 12:22:18
