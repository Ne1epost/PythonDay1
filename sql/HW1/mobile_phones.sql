/*
1. Создайте таблицу с мобильными телефонами, используя графический интерфейс. 
Необходимые поля таблицы: 
product_name (название товара), 
manufacturer (производитель), 
product_count (количество), 
price (цена). 
Заполните БД произвольными данными. 
*/

-- Создание базы для ДЗ
CREATE DATABASE homework_database;

-- Удаление таблицы
DROP TABLE `homework_database`.`mobile_phones`;

-- Создание таблицы с мобильными телефонами: 
CREATE TABLE `homework_database`.`mobile_phones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(80) NULL,
  `manufacturer` VARCHAR(80) NULL,
  `product_count` INT NULL,
  `price` NUMERIC(15, 2) NULL,
  PRIMARY KEY (`id`));

-- Заполнение  таблицы данными
INSERT INTO `homework_database`.`mobile_phones` 
  (`product_name`, `manufacturer`, `product_count`, `price`) 
VALUES 
('Alcatel 1068D', 'Alcatel', 5, 1599),
('BQ 2445 Dream синий', 'BQ', 1, 1250),
('DEXP C185', 'DEXP', 7, 750),
('Nokia 105DS', 'Nokia', 5, 1650),
('6.5 Смартфон Samsung Galaxy A03', 'Samsung', 2, 8499),
('6.1 Смартфон Apple iPhone 13 128 ГБ', 'Apple', 1, 76299);
