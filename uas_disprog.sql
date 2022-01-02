-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2021 at 06:34 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas_disprog`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `bookingid` int(11) NOT NULL,
  `houseId` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `status` enum('0','1','2') DEFAULT NULL,
  `dateStart` date DEFAULT NULL,
  `rentDuration` int(11) DEFAULT NULL,
  `bookTime` datetime DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookingid`, `houseId`, `username`, `status`, `dateStart`, `rentDuration`, `bookTime`, `userAddress`, `firstname`, `lastname`, `phone`) VALUES
(1, 1, 'cathrine', '0', '2021-06-02', 5, '2021-06-21 12:03:44', 'Tenggilis', 'Cathrine', 'Abigael', '08847294637'),
(2, 1, 'cathrine', '0', '2021-06-03', 4, '2021-06-21 12:03:45', 'Purimas', 'Intan', 'Permata', '08472947284'),
(7, 1, 'cathrine', '0', '2021-06-10', 5, '2021-06-21 17:44:50', 'Medokan', 'Iin', 'Joyo', '08819798703');

-- --------------------------------------------------------

--
-- Table structure for table `chat`
--

CREATE TABLE `chat` (
  `chatId` int(11) NOT NULL,
  `content` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `username` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `house`
--

CREATE TABLE `house` (
  `houseId` int(11) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `pricePerYear` int(11) DEFAULT NULL,
  `bathroom` int(11) DEFAULT NULL,
  `bedroom` int(11) DEFAULT NULL,
  `electricalPower` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `house`
--

INSERT INTO `house` (`houseId`, `address`, `pricePerYear`, `bathroom`, `bedroom`, `electricalPower`) VALUES
(1, 'Mulyosari Tengah', 12000000, 2, 2, 220),
(2, 'Taman Wisma Medokan Tengah f/21', 10000000, 2, 3, 220);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `pin` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `pin`, `email`) VALUES
('a', '123', '123', 'aaaa@gmail.com'),
('abiggael', '123', '123', 'baa@gmail.com'),
('b', '123', '12', 'b@gmail.com'),
('ba', '123', '12345', 'ba@gmail.com'),
('c', '123', '1234', 'c@gmail.com'),
('cathrine', '123', '123456', 'cathrine@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`bookingid`,`houseId`,`username`),
  ADD KEY `fk_user_has_house_house1_idx` (`houseId`),
  ADD KEY `fk_booking_user1_idx` (`username`);

--
-- Indexes for table `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`chatId`),
  ADD KEY `fk_chat_user1_idx` (`username`);

--
-- Indexes for table `house`
--
ALTER TABLE `house`
  ADD PRIMARY KEY (`houseId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `bookingid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `chat`
--
ALTER TABLE `chat`
  MODIFY `chatId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `house`
--
ALTER TABLE `house`
  MODIFY `houseId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `fk_booking_user1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_user_has_house_house1` FOREIGN KEY (`houseId`) REFERENCES `house` (`houseId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `fk_chat_user1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
