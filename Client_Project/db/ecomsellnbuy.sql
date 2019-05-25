-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2019 at 07:05 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecomsellnbuy`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(11);

-- --------------------------------------------------------

--
-- Table structure for table `shipping`
--

CREATE TABLE `shipping` (
  `id` bigint(20) NOT NULL,
  `arrival_time_date` datetime DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `company_contact_no` varchar(255) DEFAULT NULL,
  `depart_from` varchar(255) DEFAULT NULL,
  `depart_time_date` datetime DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `ship_name` varchar(255) DEFAULT NULL,
  `shipping_cost` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `trvelling_description` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shipping`
--

INSERT INTO `shipping` (`id`, `arrival_time_date`, `company`, `company_contact_no`, `depart_from`, `depart_time_date`, `destination`, `ship_name`, `shipping_cost`, `status`, `trvelling_description`) VALUES
(6, '2019-05-20 15:10:00', 'wanamy', '0112341283', 'USA', '2019-04-20 05:00:00', 'Srilanka', ' Cleopatra_new', '2', 'Onboard', 'Stop near every country'),
(7, '2019-05-20 15:10:00', 'jjbrothers', '011234122', 'UA', '2019-04-20 05:00:00', '', 'Darker2', '2', 'Onboard', 'weerh'),
(8, '2019-07-20 15:10:00', 'jjbrothers', '011234122', 'UA', '2019-06-20 05:00:00', '', 'Avenger', '2', 'ondeck', 'weerh'),
(9, '2019-05-20 15:10:00', 'wanamy', '0112341283', 'USA', '2019-04-20 05:00:00', 'Srilanka', ' Cleopatra_new', 'free', 'Onboard', 'Stop near every country');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `shipping`
--
ALTER TABLE `shipping`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
