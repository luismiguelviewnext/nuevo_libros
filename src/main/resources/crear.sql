CREATE SCHEMA `nuevo_libros` ;

CREATE TABLE `nuevo_libros`.`libros` (
  `isbn` INT NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `tematica` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`isbn`));
