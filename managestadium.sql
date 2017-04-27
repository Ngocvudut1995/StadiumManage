-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2017 at 12:19 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `managestadium`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `IDAccount` char(36) COLLATE utf8_unicode_ci NOT NULL,
  `NameAccount` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Birthday` datetime DEFAULT NULL,
  `Phone` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `Address` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Identification` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CreatedDay` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`IDAccount`, `NameAccount`, `Email`, `Password`, `Birthday`, `Phone`, `Address`, `Identification`, `CreatedDay`) VALUES
('bfd1ddff-8dbc-4727-bbb9-b321c116f5a9', 'Nguyễn Văn V', 'vannguyen1sdsd995@gmail.com', 'toilangocvu', '1995-04-29 00:00:00', '01266555022', 'Dien ban', '205748441', '2017-04-01 00:00:00'),
('c3550a28-1497-457f-9cbd-0e1a825a96b6', 'Đặng Ngọc Vũ', 'ngocvuduts1995@gmail.com', '619B5A9FFADE3EA43E768CF8C50DAF53', NULL, '01266555022', 'sdasd', NULL, '2017-04-21 21:48:58');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `IDBill` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `IDStaff` char(36) COLLATE utf8_unicode_ci NOT NULL,
  `IDYard` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `IDCustomer` char(36) COLLATE utf8_unicode_ci NOT NULL,
  `IDTimeSlot` int(11) NOT NULL,
  `ListIDService` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Status` tinyint(1) NOT NULL,
  `PriceYard` float NOT NULL,
  `PriceService` float NOT NULL,
  `Promotion` int(11) NOT NULL,
  `DatePay` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`IDBill`, `IDStaff`, `IDYard`, `IDCustomer`, `IDTimeSlot`, `ListIDService`, `Status`, `PriceYard`, `PriceService`, `Promotion`, `DatePay`) VALUES
('HD10001', 'c3550a28-1497-457f-9cbd-0e1a825a96b6', 'SB1001', 'bfd1ddff-8dbc-4727-bbb9-b321c116f5a9', 1, NULL, 1, 200000, 40000, 0, '2017-04-27 00:00:00'),
('HD10002', 'c3550a28-1497-457f-9cbd-0e1a825a96b6', 'SB1002', 'bfd1ddff-8dbc-4727-bbb9-b321c116f5a9', 3, NULL, 1, 200000, 40000, 0, '2017-04-27 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `bookyard`
--

CREATE TABLE `bookyard` (
  `IDBook` int(11) NOT NULL,
  `DateBook` datetime NOT NULL,
  `IDCustomer` char(36) COLLATE utf8_unicode_ci NOT NULL,
  `Status` tinyint(1) NOT NULL,
  `Contents` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `IDYard` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `IDTimeSlot` int(11) NOT NULL,
  `ListIDService` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `IDCustomer` char(36) COLLATE utf8_unicode_ci NOT NULL,
  `Level` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`IDCustomer`, `Level`) VALUES
('bfd1ddff-8dbc-4727-bbb9-b321c116f5a9', 1);

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `IDService` int(11) NOT NULL,
  `NameService` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `IDStaff` char(36) COLLATE utf8_unicode_ci NOT NULL,
  `Salary` float NOT NULL,
  `Position` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`IDStaff`, `Salary`, `Position`) VALUES
('2a5333a0-2b30-11e7-8685-f01faf11b5d3', 5000000, 'Manager');

-- --------------------------------------------------------

--
-- Table structure for table `timeslot`
--

CREATE TABLE `timeslot` (
  `IDTimeSlot` int(11) NOT NULL,
  `TimeSlot` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `timeslot`
--

INSERT INTO `timeslot` (`IDTimeSlot`, `TimeSlot`) VALUES
(1, '4h-5h'),
(2, '5h-6h'),
(3, '6h-7h'),
(4, '7h-8h'),
(5, '8h-9h'),
(6, '9h-10h'),
(7, '10h-11h'),
(8, '11h-12h'),
(9, '13h-14h'),
(10, '14h-15h'),
(11, '15h-16h'),
(12, '16h-17h'),
(13, '17h-18h'),
(14, '18h-19h'),
(15, '19h-20h'),
(16, '20h-21h');

-- --------------------------------------------------------

--
-- Table structure for table `yard`
--

CREATE TABLE `yard` (
  `IDYard` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `NameYard` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `TypeYard` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Status` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Price` float NOT NULL,
  `Image` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Decription` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `yard`
--

INSERT INTO `yard` (`IDYard`, `NameYard`, `TypeYard`, `Status`, `Price`, `Image`, `Decription`) VALUES
('SB1001', 'Sân 5A', '5', 'activiting', 200000, NULL, NULL),
('SB1002', 'Sân 7A', '7', 'reparing', 200000, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`IDAccount`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`IDBill`),
  ADD KEY `IDStaff` (`IDStaff`),
  ADD KEY `IDCustomer` (`IDCustomer`),
  ADD KEY `IDTimeSlot` (`IDTimeSlot`),
  ADD KEY `IDYard` (`IDYard`);

--
-- Indexes for table `bookyard`
--
ALTER TABLE `bookyard`
  ADD PRIMARY KEY (`IDBook`),
  ADD KEY `IDTimeSlot` (`IDTimeSlot`),
  ADD KEY `IDYard` (`IDYard`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`IDService`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`IDStaff`);

--
-- Indexes for table `timeslot`
--
ALTER TABLE `timeslot`
  ADD PRIMARY KEY (`IDTimeSlot`);

--
-- Indexes for table `yard`
--
ALTER TABLE `yard`
  ADD PRIMARY KEY (`IDYard`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookyard`
--
ALTER TABLE `bookyard`
  MODIFY `IDBook` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`IDStaff`) REFERENCES `account` (`IDAccount`),
  ADD CONSTRAINT `bill_ibfk_2` FOREIGN KEY (`IDCustomer`) REFERENCES `account` (`IDAccount`),
  ADD CONSTRAINT `bill_ibfk_3` FOREIGN KEY (`IDTimeSlot`) REFERENCES `timeslot` (`IDTimeSlot`),
  ADD CONSTRAINT `bill_ibfk_4` FOREIGN KEY (`IDYard`) REFERENCES `yard` (`IDYard`);

--
-- Constraints for table `bookyard`
--
ALTER TABLE `bookyard`
  ADD CONSTRAINT `bookyard_ibfk_1` FOREIGN KEY (`IDTimeSlot`) REFERENCES `timeslot` (`IDTimeSlot`),
  ADD CONSTRAINT `bookyard_ibfk_2` FOREIGN KEY (`IDYard`) REFERENCES `yard` (`IDYard`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
