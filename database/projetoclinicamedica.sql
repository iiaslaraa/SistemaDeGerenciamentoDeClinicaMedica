-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projetoclinicamedica
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB
CREATE DATABASE IF NOT EXISTS projetoclinicamedica;
USE projetoclinicamedica;

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
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta` (
  `idConsulta` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(10) NOT NULL,
  `hora` time NOT NULL,
  `cpfMedico` varchar(11) NOT NULL,
  `cpfPaciente` varchar(11) NOT NULL,
  PRIMARY KEY (`idConsulta`),
  KEY `fk_Consulta_Medico_idx` (`cpfMedico`),
  KEY `fk_Consulta_Paciente1_idx` (`cpfPaciente`),
  CONSTRAINT `fk_Consulta_Medico` FOREIGN KEY (`cpfMedico`) REFERENCES `medico` (`cpfMedico`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Consulta_Paciente1` FOREIGN KEY (`cpfPaciente`) REFERENCES `paciente` (`cpfPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
INSERT INTO `consulta` VALUES (1,'24/06/2026','08:00:00','10101010101','11111111111'),(2,'24/06/2026','09:00:00','20202020202','22222222222'),(3,'24/06/2026','10:00:00','77777777777','33333333333'),(4,'25/06/2026','08:30:00','88888888888','44444444444'),(5,'25/06/2026','09:30:00','99999999999','55555555555'),(6,'25/06/2026','10:30:00','10101010101','66666666666'),(7,'26/06/2026','08:00:00','20202020202','77777777777'),(8,'26/06/2026','09:00:00','77777777777','88888888888'),(9,'26/06/2026','10:00:00','88888888888','11111111111'),(10,'27/06/2026','14:00:00','99999999999','22222222222');
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultorio`
--

DROP TABLE IF EXISTS `consultorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultorio` (
  `numConsultorio` int(10) unsigned NOT NULL,
  `corredor` varchar(5) NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`numConsultorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultorio`
--

LOCK TABLES `consultorio` WRITE;
/*!40000 ALTER TABLE `consultorio` DISABLE KEYS */;
INSERT INTO `consultorio` VALUES (1,'A','Clínica Geral Atualizada'),(2,'B','Cardiologia'),(3,'C','Pediatria'),(4,'D','Ortopedia'),(5,'E','Dermatologia');
/*!40000 ALTER TABLE `consultorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exame`
--

DROP TABLE IF EXISTS `exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exame` (
  `idExame` int(11) NOT NULL AUTO_INCREMENT,
  `tipoExame` varchar(45) NOT NULL,
  `resultado` varchar(45) NOT NULL,
  `valor` double unsigned NOT NULL,
  PRIMARY KEY (`idExame`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame`
--

LOCK TABLES `exame` WRITE;
/*!40000 ALTER TABLE `exame` DISABLE KEYS */;
INSERT INTO `exame` VALUES (1,'Hemograma','Normal',80),(2,'Raio-X','Sem alterações',150),(3,'Ressonância','Em análise',850);
/*!40000 ALTER TABLE `exame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `cpfMedico` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `especialidade` varchar(45) NOT NULL,
  `crm` varchar(45) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `numConsultorio` int(10) unsigned NOT NULL,
  PRIMARY KEY (`cpfMedico`),
  UNIQUE KEY `cpfMedico_UNIQUE` (`cpfMedico`),
  KEY `fk_Medico_Consultorio1_idx` (`numConsultorio`),
  CONSTRAINT `fk_Medico_Consultorio1` FOREIGN KEY (`numConsultorio`) REFERENCES `consultorio` (`numConsultorio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES ('10101010101','Vitória Félix','Ortopedia','876','61989876543','vitoria@gmail.com',4),('20202020202','Lázaro Ribeiro','Dermatologia','543','61988765432','lazaro@gmail.com',5),('77777777777','Eric Felipe','Clínica Geral','123','61989876543','eric@gmail.com',1),('88888888888','Ianara Portela','Cardiologia','456','61988765432','ianara@gmail.com',2),('99999999999','Dhecy Reis','Pediatria','789','61987654321','dhecy@gmail.com',3);
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico_exame`
--

DROP TABLE IF EXISTS `medico_exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico_exame` (
  `cpfMedico` varchar(11) NOT NULL,
  `idExame` int(11) NOT NULL,
  PRIMARY KEY (`cpfMedico`,`idExame`),
  KEY `fk_Medico_has_Exame_Exame1_idx` (`idExame`),
  KEY `fk_Medico_has_Exame_Medico1_idx` (`cpfMedico`),
  CONSTRAINT `fk_Medico_has_Exame_Exame1` FOREIGN KEY (`idExame`) REFERENCES `exame` (`idExame`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Medico_has_Exame_Medico1` FOREIGN KEY (`cpfMedico`) REFERENCES `medico` (`cpfMedico`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico_exame`
--

LOCK TABLES `medico_exame` WRITE;
/*!40000 ALTER TABLE `medico_exame` DISABLE KEYS */;
INSERT INTO `medico_exame` VALUES ('10101010101',1),('20202020202',2),('77777777777',3);
/*!40000 ALTER TABLE `medico_exame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico_paciente`
--

DROP TABLE IF EXISTS `medico_paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico_paciente` (
  `cpfMedico` varchar(11) NOT NULL,
  `cpfPaciente` varchar(11) NOT NULL,
  PRIMARY KEY (`cpfMedico`,`cpfPaciente`),
  KEY `fk_Medico_has_Paciente_Paciente1_idx` (`cpfPaciente`),
  KEY `fk_Medico_has_Paciente_Medico1_idx` (`cpfMedico`),
  CONSTRAINT `fk_Medico_has_Paciente_Medico1` FOREIGN KEY (`cpfMedico`) REFERENCES `medico` (`cpfMedico`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Medico_has_Paciente_Paciente1` FOREIGN KEY (`cpfPaciente`) REFERENCES `paciente` (`cpfPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico_paciente`
--

LOCK TABLES `medico_paciente` WRITE;
/*!40000 ALTER TABLE `medico_paciente` DISABLE KEYS */;
INSERT INTO `medico_paciente` VALUES ('10101010101','11111111111'),('20202020202','22222222222'),('77777777777','33333333333');
/*!40000 ALTER TABLE `medico_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `cpfPaciente` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `dataNascimento` varchar(45) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`cpfPaciente`),
  UNIQUE KEY `cpfPaciente_UNIQUE` (`cpfPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES ('11111111111','Alana Gonçalves','Taguatinga Norte','22/05/2007','61981234567','alana@gmail.com'),('22222222222','Clara De Assis','Arniqueiras','13/08/2006','61982345678','clara@gmail.com'),('33333333333','Fernanda Nascimento','Águas Claras','15/05/2008','61985678910','fernanda@gmail.com'),('44444444444','Daniel Henrique','Santo Antônio do Descoberto','27/06/2005','61983456789','daniel@gmail.com'),('55555555555','Davi Faustino','Samambaia Sul','10/06/2005','61984567891','davi@gmail.com'),('66666666666','Guilherme Arthur','Recanto das Emas','22/06/2008','61986789101','guilherme@gmail.com'),('77777777777','Henrique Montalvão','Taguatinga Sul','03/09/2006','61987891011','henrique@gmail.com'),('88888888888','Mikaella Heloísa','Estrutural','18/01/2009','61988910111','mikaella@gmail.com');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente_exame`
--

DROP TABLE IF EXISTS `paciente_exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente_exame` (
  `cpfPaciente` varchar(11) NOT NULL,
  `idExame` int(11) NOT NULL,
  PRIMARY KEY (`cpfPaciente`,`idExame`),
  KEY `fk_Paciente_has_Exame_Exame1_idx` (`idExame`),
  KEY `fk_Paciente_has_Exame_Paciente1_idx` (`cpfPaciente`),
  CONSTRAINT `fk_Paciente_has_Exame_Exame1` FOREIGN KEY (`idExame`) REFERENCES `exame` (`idExame`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Paciente_has_Exame_Paciente1` FOREIGN KEY (`cpfPaciente`) REFERENCES `paciente` (`cpfPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente_exame`
--

LOCK TABLES `paciente_exame` WRITE;
/*!40000 ALTER TABLE `paciente_exame` DISABLE KEYS */;
INSERT INTO `paciente_exame` VALUES ('22222222222',2),('33333333333',3);
/*!40000 ALTER TABLE `paciente_exame` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-24 13:40:04
