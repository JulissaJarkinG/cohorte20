-- MySQL Script generated by MySQL Workbench
-- Mon Dec  5 16:28:33 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`orden_Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`orden_Producto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`productos` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `precio` INT NOT NULL,
  `orden_Producto_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_productos_orden_Producto1_idx` (`orden_Producto_id` ASC) VISIBLE,
  CONSTRAINT `fk_productos_orden_Producto1`
    FOREIGN KEY (`orden_Producto_id`)
    REFERENCES `mydb`.`orden_Producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`producto_categoria_R`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`producto_categoria_R` (
  `productos_id` INT NOT NULL AUTO_INCREMENT,
  `categoria_id` INT NOT NULL,
  `categoria_id1` INT NOT NULL,
  `productos_id1` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`productos_id`),
  INDEX `fk_producto_categoria_R_categoria1_idx` (`categoria_id1` ASC) VISIBLE,
  INDEX `fk_producto_categoria_R_productos1_idx` (`productos_id1` ASC) VISIBLE,
  CONSTRAINT `fk_producto_categoria_R_categoria1`
    FOREIGN KEY (`categoria_id1`)
    REFERENCES `mydb`.`categoria` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_producto_categoria_R_productos1`
    FOREIGN KEY (`productos_id1`)
    REFERENCES `mydb`.`productos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`orden` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `fecha` VARCHAR(45) NOT NULL,
  `orden_Producto_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_orden_orden_Producto1_idx` (`orden_Producto_id` ASC) VISIBLE,
  CONSTRAINT `fk_orden_orden_Producto1`
    FOREIGN KEY (`orden_Producto_id`)
    REFERENCES `mydb`.`orden_Producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `orden_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuario_orden_idx` (`orden_id` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_orden`
    FOREIGN KEY (`orden_id`)
    REFERENCES `mydb`.`orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`perfil` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_perfil_usuario1_idx` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_perfil_usuario1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `mydb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`lugar_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`lugar_orden` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ciudad` VARCHAR(45) NULL,
  `estado` VARCHAR(45) NULL,
  `orden_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_lugar_orden_orden1_idx` (`orden_id` ASC) VISIBLE,
  CONSTRAINT `fk_lugar_orden_orden1`
    FOREIGN KEY (`orden_id`)
    REFERENCES `mydb`.`orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`sistemas_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`sistemas_pago` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `orden_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_sistemas_pago_orden1_idx` (`orden_id` ASC) VISIBLE,
  CONSTRAINT `fk_sistemas_pago_orden1`
    FOREIGN KEY (`orden_id`)
    REFERENCES `mydb`.`orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
