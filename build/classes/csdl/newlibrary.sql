create database `ewlibary`;

CREATE TABLE `users` (
  `id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `usertype` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `book_genres` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `author` (
  `id` INT NOT NULL,
  `firstName` VARCHAR(100) NULL,
  `lastName` VARCHAR(100) NULL,
  `expertise` VARCHAR(100) NULL,
  `about` TEXT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `members` (
  `id` INT NOT NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `email` TEXT(50) NULL,
  `picture` LONGBLOB NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `books` (
  `id` INT NOT NULL,
  `isbn` VARCHAR(250) NULL,
  `name` VARCHAR(250) NULL DEFAULT NULL,
  `author_id` INT NULL DEFAULT NULL,
  `genre_id` INT NULL DEFAULT NULL,
  `quantity` INT NULL DEFAULT NULL,
  `publisher` VARCHAR(250) NULL DEFAULT NULL,
  `price` DOUBLE NULL DEFAULT NULL,
  `date_received` DATETIME NULL DEFAULT NULL,
  `description` TEXT NULL DEFAULT NULL,
  `cover_image` LONGBLOB NULL DEFAULT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `issue_book` (
  `book_id` INT NOT NULL,
  `member_id` INT NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  `issue_date` DATE NULL DEFAULT NULL,
  `return_date` DATE NULL DEFAULT NULL,
  `note` TEXT NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`));

CREATE TABLE `users_table` (
  `id` INT NOT NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `user_type` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
