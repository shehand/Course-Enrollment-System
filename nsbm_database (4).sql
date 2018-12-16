-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2018 at 09:46 AM
-- Server version: 5.6.11
-- PHP Version: 5.5.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `nsbm_database`
--
CREATE DATABASE IF NOT EXISTS `nsbm_database` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `nsbm_database`;

-- --------------------------------------------------------

--
-- Table structure for table `assignments`
--

CREATE TABLE IF NOT EXISTS `assignments` (
  `assignment_id` int(10) NOT NULL AUTO_INCREMENT,
  `subject_name` varchar(50) NOT NULL,
  `date` varchar(10) NOT NULL,
  `place` varchar(20) NOT NULL,
  `poster_id` varchar(50) NOT NULL,
  `fac_name` varchar(30) NOT NULL,
  PRIMARY KEY (`assignment_id`),
  KEY `subject_name` (`subject_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `assignments`
--

INSERT INTO `assignments` (`assignment_id`, `subject_name`, `date`, `place`, `poster_id`, `fac_name`) VALUES
(1, 'Programming - III', '12/05/2018', 'Lab - A', 'I-SOC-0001', ''),
(2, 'Programming - III', '01-5-2018', 'Lab b', 'I-SOC-0001', 'School of Computing'),
(3, 'Programming - I', '12-12-2018', 'Lab D', 'I-SOC-0001', 'School of Computing');

-- --------------------------------------------------------

--
-- Table structure for table `instrucor_details`
--

CREATE TABLE IF NOT EXISTS `instrucor_details` (
  `reg_number` varchar(20) NOT NULL,
  `instructor_name` varchar(50) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `nic_number` varchar(10) NOT NULL,
  `password` varchar(16) NOT NULL,
  `faculty` varchar(25) NOT NULL,
  PRIMARY KEY (`reg_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instrucor_details`
--

INSERT INTO `instrucor_details` (`reg_number`, `instructor_name`, `dob`, `email`, `nic_number`, `password`, `faculty`) VALUES
('I-SOC-0001', 'Sirini Kariyawasam', '05/18/1995', 'siri@gmail.com', '958745236v', '0', 'School of Computing'),
('I-SOE-0001', 'Kiruni Madanayaka', '06/12/1990', 'kiri@nsbm.lk', '905687412v', '0', 'School of Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `lab_sessions`
--

CREATE TABLE IF NOT EXISTS `lab_sessions` (
  `subject_name` varchar(50) NOT NULL,
  `place` varchar(20) NOT NULL,
  `date` varchar(10) NOT NULL,
  `poster_id` varchar(30) NOT NULL,
  `fac_name` varchar(30) NOT NULL,
  PRIMARY KEY (`subject_name`,`place`,`date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lab_sessions`
--

INSERT INTO `lab_sessions` (`subject_name`, `place`, `date`, `poster_id`, `fac_name`) VALUES
('Programming - III', 'Lab D', 'Lab D', 'I-SOC-0001', 'School of Computing');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE IF NOT EXISTS `lecturer` (
  `lec_id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone_number` int(10) NOT NULL,
  `position` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `faculty` varchar(25) NOT NULL,
  `subject` varchar(50) NOT NULL,
  PRIMARY KEY (`lec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lec_id`, `name`, `email`, `phone_number`, `position`, `password`, `faculty`, `subject`) VALUES
('L-SOC-0001', 'W.K. Dayananda', 'daya@gmail.com', 451236987, 'Senior Lecturer', '0', 'School of Computing', 'Programming'),
('L-SOE-0001', 'K.P. Kumarasiri', 'kuma@gmail.com', 456236584, 'Senior Lecturer', '0', 'School of Engineering', 'Mathematics');

-- --------------------------------------------------------

--
-- Table structure for table `lec_notes`
--

CREATE TABLE IF NOT EXISTS `lec_notes` (
  `note_id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(50) NOT NULL,
  `size` int(10) NOT NULL,
  `file` longblob NOT NULL,
  `faculty` varchar(25) NOT NULL,
  `subject_id` varchar(20) NOT NULL,
  PRIMARY KEY (`note_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `login_sessions`
--

CREATE TABLE IF NOT EXISTS `login_sessions` (
  `reg_number` varchar(10) NOT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY (`reg_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE IF NOT EXISTS `payments` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `payment_amount` varchar(10) NOT NULL,
  `semester` int(1) NOT NULL,
  `course` varchar(25) NOT NULL,
  `reg_number` varchar(30) NOT NULL,
  `yos` varchar(15) NOT NULL,
  PRIMARY KEY (`payment_id`,`payment_amount`,`semester`,`course`,`reg_number`,`yos`),
  KEY `reg_number` (`reg_number`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate_student`
--

CREATE TABLE IF NOT EXISTS `postgraduate_student` (
  `reg_number` varchar(10) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `nic_number` varchar(10) NOT NULL,
  `address` varchar(80) NOT NULL,
  `phone_number` int(10) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `institute` varchar(50) NOT NULL,
  `yoc` int(4) NOT NULL,
  `qualification` varchar(80) NOT NULL,
  `faculty` varchar(25) NOT NULL,
  `degree_type` varchar(5) NOT NULL,
  PRIMARY KEY (`reg_number`),
  UNIQUE KEY `nic_number` (`nic_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ranking`
--

CREATE TABLE IF NOT EXISTS `ranking` (
  `reg_number` varchar(20) NOT NULL,
  `gpa` varchar(10) NOT NULL,
  `yos` varchar(10) NOT NULL,
  `sub1` varchar(50) NOT NULL,
  `res1` varchar(5) NOT NULL,
  `sub2` varchar(50) NOT NULL,
  `res2` varchar(5) NOT NULL,
  `sub3` varchar(50) NOT NULL,
  `res3` varchar(5) NOT NULL,
  `sub4` varchar(50) NOT NULL,
  `res4` varchar(5) NOT NULL,
  `sub5` varchar(50) NOT NULL,
  `res5` varchar(5) NOT NULL,
  `sub6` varchar(50) NOT NULL,
  `res6` varchar(5) NOT NULL,
  `sub7` varchar(50) NOT NULL,
  `res7` varchar(5) NOT NULL,
  `sub8` varchar(50) NOT NULL,
  `res8` varchar(5) NOT NULL,
  `semester` varchar(5) NOT NULL,
  PRIMARY KEY (`reg_number`,`yos`,`semester`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE IF NOT EXISTS `results` (
  `subject_code` varchar(20) NOT NULL,
  `length` int(255) NOT NULL,
  `pdf_file` longblob NOT NULL,
  `file_name` varchar(50) NOT NULL,
  PRIMARY KEY (`subject_code`,`file_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`subject_code`, `length`, `pdf_file`, `file_name`) VALUES

-- --------------------------------------------------------

--
-- Table structure for table `semester_1_subjects`
--

CREATE TABLE IF NOT EXISTS `semester_1_subjects` (
  `reg_number` varchar(10) NOT NULL,
  `semester` int(1) NOT NULL,
  `first` varchar(30) NOT NULL,
  `second` varchar(30) NOT NULL,
  `third` varchar(30) NOT NULL,
  `fourth` varchar(30) NOT NULL,
  `yos` varchar(20) NOT NULL,
  PRIMARY KEY (`reg_number`,`semester`,`yos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semester_1_subjects`
--

INSERT INTO `semester_1_subjects` (`reg_number`, `semester`, `first`, `second`, `third`, `fourth`, `yos`) VALUES
('SU/001/001', 1, 'Web Development - I', 'Ethical Hacking - I', 'UI Designing - I', 'Creative Designing - I', '1 st Year');

-- --------------------------------------------------------

--
-- Table structure for table `semester_2_subjects`
--

CREATE TABLE IF NOT EXISTS `semester_2_subjects` (
  `reg_number` varchar(20) NOT NULL,
  `semester` int(1) NOT NULL,
  `first` varchar(50) NOT NULL,
  `second` varchar(30) NOT NULL,
  `third` varchar(30) NOT NULL,
  `fourth` varchar(30) NOT NULL,
  `yos` varchar(20) NOT NULL,
  PRIMARY KEY (`reg_number`,`semester`,`yos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semester_2_subjects`
--

INSERT INTO `semester_2_subjects` (`reg_number`, `semester`, `first`, `second`, `third`, `fourth`, `yos`) VALUES
('SU/001/001', 2, 'Database - II', 'UI Designing - II', 'Mathematical Methods - I', 'Creative Designing - II', '1 st Year');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `reg_number` varchar(20) NOT NULL,
  `faculty` varchar(25) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`reg_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`reg_number`, `faculty`, `email`) VALUES
('SU/001/001', 'School of Computing', 'sonodewcomplex@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE IF NOT EXISTS `subjects` (
  `subject_code` varchar(15) NOT NULL,
  `name` varchar(50) NOT NULL,
  `semester` int(1) NOT NULL,
  `num_of_credits` int(1) NOT NULL,
  `course` varchar(25) NOT NULL,
  `course_fee` int(10) NOT NULL,
  `compulsory` varchar(10) NOT NULL,
  `yos` varchar(15) NOT NULL,
  `degree_type` varchar(10) NOT NULL,
  PRIMARY KEY (`subject_code`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`subject_code`, `name`, `semester`, `num_of_credits`, `course`, `course_fee`, `compulsory`, `yos`, `degree_type`) VALUES
('SOB1001', 'Economics - I', 1, 2, 'School of Business', 5000, 'C', '1 st Year', 'BSc'),
('SOC1001', 'Programming - I', 1, 2, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1002', 'Database - I', 1, 2, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1003', 'Computer Networks - I', 1, 2, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1004', 'Softwre Engineering - I', 1, 2, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1005', 'Web Development - I', 1, 2, 'School of Computing', 4500, 'NC', '1 st Year', 'BSc'),
('SOC1006', 'Ethical Hacking - I', 1, 2, 'School of Computing', 12000, 'NC', '1 st Year', 'BSc'),
('SOC1007', 'System Designing - I', 1, 2, 'School of Computing', 2600, 'NC', '1 st Year', 'BSc'),
('SOC1008', 'UI Designing - I', 1, 2, 'School of Computing', 3100, 'NC', '1 st Year', 'BSc'),
('SOC1009', 'System Architectr - I', 1, 2, 'School of Computing', 5400, 'NC', '1 st Year', 'BSc'),
('SOC1010', 'Creative Designing - I', 1, 2, 'School of Computing', 4500, 'NC', '1 st Year', 'BSc'),
('SOC1030', 'Programming - Begginers', 1, 2, 'School of Computing', 5000, 'C', '1 st Year', 'Msc'),
('SOC1031', 'Database - Begginers', 1, 2, 'School of Computing', 38000, 'C', '1 st Year', 'Msc'),
('SOC1051', 'Programming - II', 2, 2, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1052', 'Data Structures & Algorithms', 2, 2, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1053', 'Enhancement - I', 2, 1, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1054', 'Computer Systems - I', 2, 1, 'School of Computing', 5000, 'C', '1 st Year', 'BSc'),
('SOC1055', 'Database -II', 2, 2, 'School of Computing', 4500, 'NC', '1 st Year', 'BSc'),
('SOC1056', 'Web Development - II', 2, 2, 'School of Computing', 3800, 'NC', '1 st Year', 'BSc'),
('SOC1057', 'Software Engineering - II', 2, 2, 'School of Computing', 2300, 'NC', '1 st Year', 'BSc'),
('SOC1058', 'UI Designing - II', 2, 2, 'School of Computing', 4600, 'NC', '1 st Year', 'BSc'),
('SOC1059', 'Creative Designing - II', 2, 2, 'School of Computing', 5600, 'NC', '1 st Year', 'BSc'),
('SOC1060', 'Mathematical Methods - I', 2, 2, 'School of Computing', 8500, 'NC', '1 st Year', 'BSc'),
('SOC2001', 'Programming - III', 1, 2, 'School of Computing', 5000, 'C', '2 nd Year', 'BSc'),
('SOC2002', 'Data Structures & Algorithms - II', 1, 2, 'School of Computing', 5000, 'C', '2 nd Year', 'BSc'),
('SOC2003', 'Database - II', 1, 2, 'School of Computing', 5000, 'C', '2 nd Year', 'BSc'),
('SOC2004', 'Software Engineering - III', 1, 2, 'School of Computing', 5000, 'C', '2 nd Year', 'BSc'),
('SOC2051', 'Computer Networks - II', 1, 2, 'School of Computing', 15000, 'NC', '2 nd Year', 'BSc'),
('SOC2052', 'Ethical Hacking - II', 1, 2, 'School of Computing', 58000, 'NC', '2 nd Year', 'BSc'),
('SOC2053', 'Command Line Learning - I', 1, 2, 'School of Computing', 45000, 'NC', '2 nd Year', 'BSc');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate_student`
--

CREATE TABLE IF NOT EXISTS `undergraduate_student` (
  `reg_number` varchar(10) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `nic_number` varchar(10) NOT NULL,
  `address` varchar(80) NOT NULL,
  `phone_number` int(10) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `al_index` int(10) NOT NULL,
  `stream` varchar(20) NOT NULL,
  `z_score` varchar(8) NOT NULL,
  `island_rank` int(3) NOT NULL,
  `faculty` varchar(25) NOT NULL,
  PRIMARY KEY (`reg_number`),
  UNIQUE KEY `nic_number` (`nic_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate_student`
--

INSERT INTO `undergraduate_student` (`reg_number`, `full_name`, `nic_number`, `address`, `phone_number`, `dob`, `email`, `password`, `al_index`, `stream`, `z_score`, `island_rank`, `faculty`) VALUES
('SU/001/001', 'Piyumitha Nirman', '789658421v', 'polhena,matara', 789654123, '23-06-1998', 'sonodewcomplex@gmail.com', '0', 5461236, 'science', 'science', 1658, 'School of Computing');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;