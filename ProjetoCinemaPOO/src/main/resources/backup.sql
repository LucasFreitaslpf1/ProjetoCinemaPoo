-- MySQL dump 10.13  Distrib 5.7.17, for Win32 (AMD64)
--
-- Host: localhost    Database: projetocinema
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `filme`
--

DROP TABLE IF EXISTS `filme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filme` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `duracao` int(11) NOT NULL,
  `classificacao` enum('LIVRE','_10','_12','_14','_16','_18') DEFAULT NULL,
  `generoprincipal_id` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `generoprincipal_id` (`generoprincipal_id`),
  CONSTRAINT `filme_ibfk_1` FOREIGN KEY (`generoprincipal_id`) REFERENCES `genero` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filme`
--

LOCK TABLES `filme` WRITE;
/*!40000 ALTER TABLE `filme` DISABLE KEYS */;
INSERT INTO `filme` VALUES (1,'Velozes e Furiosos',123,'LIVRE',1),(2,'Vingadores',123,'LIVRE',1),(3,'Pedro',240,'LIVRE',1),(4,'Joao no pé de mamão',10,'LIVRE',1),(5,'asd',1,'_10',2),(6,'Tico e teco',125,'LIVRE',5),(7,'ASd',1,'LIVRE',2),(8,'asdasdasd',123,'_12',1),(9,'Teste',123,'_12',2);
/*!40000 ALTER TABLE `filme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `senha` varchar(32) NOT NULL,
  `tipofuncionario` enum('GERENTE','CAIXA') DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'Lucas','2d8a90a8793dc50f701da4eca2458923','GERENTE'),(2,'Joao','2d8a90a8793dc50f701da4eca2458923','CAIXA');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genero` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Ação'),(2,'Aventura'),(3,'P'),(4,'asd'),(5,'Comédia'),(6,'Romance');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guiche`
--

DROP TABLE IF EXISTS `guiche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guiche` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `numero` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `numero` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guiche`
--

LOCK TABLES `guiche` WRITE;
/*!40000 ALTER TABLE `guiche` DISABLE KEYS */;
INSERT INTO `guiche` VALUES (1,1),(2,6),(3,12);
/*!40000 ALTER TABLE `guiche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guichevenda_id`
--

DROP TABLE IF EXISTS `guichevenda_id`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guichevenda_id` (
  `guiche_id` bigint(20) unsigned DEFAULT NULL,
  `venda_id` bigint(20) unsigned DEFAULT NULL,
  KEY `guiche_id` (`guiche_id`),
  KEY `venda_id` (`venda_id`),
  CONSTRAINT `guichevenda_id_ibfk_1` FOREIGN KEY (`guiche_id`) REFERENCES `guiche` (`id`),
  CONSTRAINT `guichevenda_id_ibfk_2` FOREIGN KEY (`venda_id`) REFERENCES `venda` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guichevenda_id`
--

LOCK TABLES `guichevenda_id` WRITE;
/*!40000 ALTER TABLE `guichevenda_id` DISABLE KEYS */;
/*!40000 ALTER TABLE `guichevenda_id` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingresso`
--

DROP TABLE IF EXISTS `ingresso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ingresso` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `meiaentrada` tinyint(1) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  `venda_id` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_id_venda` (`venda_id`),
  CONSTRAINT `fk_id_venda` FOREIGN KEY (`venda_id`) REFERENCES `venda` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingresso`
--

LOCK TABLES `ingresso` WRITE;
/*!40000 ALTER TABLE `ingresso` DISABLE KEYS */;
INSERT INTO `ingresso` VALUES (1,0,12.4,5),(2,0,12.4,5),(3,0,12.4,5),(4,0,12.4,5),(5,0,12.4,5),(6,0,12,6),(7,0,12,6),(8,0,12,6),(9,0,12,6),(10,0,12,7),(11,0,12,7),(12,0,12.4,8),(13,0,123,9),(14,0,123,10),(15,0,1,11),(16,0,123,12),(17,0,123,12);
/*!40000 ALTER TABLE `ingresso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sala` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `numero` tinyint(4) NOT NULL,
  `capacidade` smallint(6) NOT NULL,
  `tela` enum('_3D','_2D') DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES (1,1,120,'_2D'),(2,2,123,'_2D'),(3,5,2,'_2D'),(4,10,1,'_2D'),(5,12,120,'_3D');
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sessao`
--

DROP TABLE IF EXISTS `sessao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sessao` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `horario` datetime NOT NULL,
  `audio` enum('LEGENDADO','DUBLADO') DEFAULT NULL,
  `ingressosvendidos` int(11) DEFAULT NULL,
  `valorsessao` float DEFAULT NULL,
  `filme_id` bigint(20) unsigned DEFAULT NULL,
  `sala_id` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `filme_id` (`filme_id`),
  KEY `sala_id` (`sala_id`),
  CONSTRAINT `sessao_ibfk_1` FOREIGN KEY (`filme_id`) REFERENCES `filme` (`id`),
  CONSTRAINT `sessao_ibfk_2` FOREIGN KEY (`sala_id`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessao`
--

LOCK TABLES `sessao` WRITE;
/*!40000 ALTER TABLE `sessao` DISABLE KEYS */;
INSERT INTO `sessao` VALUES (1,'2022-07-01 16:31:00','DUBLADO',6,12.4,1,1),(2,'2022-07-01 16:31:00','DUBLADO',10,12,1,1),(3,'2022-07-08 17:22:00','DUBLADO',2,12,1,2),(4,'2022-07-08 22:00:00','DUBLADO',1,1,4,4),(5,'2022-07-07 10:10:00','DUBLADO',0,10,2,1),(6,'2022-07-22 10:12:00','DUBLADO',2,123,3,2),(7,'2022-07-08 10:46:00','DUBLADO',2,123,2,3),(8,'2022-07-16 12:37:00','DUBLADO',0,123,9,2);
/*!40000 ALTER TABLE `sessao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `quantidade` smallint(6) DEFAULT NULL,
  `guiche_id` bigint(20) unsigned DEFAULT NULL,
  `sessao_id` bigint(20) unsigned DEFAULT NULL,
  `valortotal` float DEFAULT NULL,
  `funcionario_id` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `guiche_id` (`guiche_id`),
  KEY `sessao_id` (`sessao_id`),
  KEY `funcionario_id` (`funcionario_id`),
  CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`guiche_id`) REFERENCES `guiche` (`id`),
  CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`sessao_id`) REFERENCES `sessao` (`id`),
  CONSTRAINT `venda_ibfk_3` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,2,1,2,24,1),(2,1,1,3,12,1),(3,1,1,3,12,1),(4,4,1,2,48,1),(5,5,1,1,62,1),(6,4,2,2,48,1),(7,2,1,2,24,1),(8,1,1,1,12.4,1),(9,1,1,6,123,1),(10,1,1,6,123,1),(11,1,1,4,1,1),(12,2,1,7,246,1);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projetocinema'
--

--
-- Dumping routines for database 'projetocinema'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-08 13:14:04
