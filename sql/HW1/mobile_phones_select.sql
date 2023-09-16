
-- 2. Выведите название, производителя и цену для товаров, количество которых превышает 2
SELECT `product_name`, `manufacturer`, `price` 
FROM `homework_database`.`mobile_phones`
WHERE `product_count` > 2;

-- 3. Выведите весь ассортимент товаров марки "Samsung"
SELECT * 
FROM `homework_database`.`mobile_phones`
WHERE `manufacturer` = 'Samsung';

-- 4. С помощью SELECT-запроса с оператором LIKE / REGEXP найти
-- 4.1. Выведите весь ассортимент товаров марки "Iphone"
SELECT * 
FROM `homework_database`.`mobile_phones`
WHERE `product_name` LIKE '%Iphone%';

--4.2. Товары, в которых есть упоминание "Samsung"
SELECT * 
FROM `homework_database`.`mobile_phones`
WHERE `product_name` LIKE '%Samsung%';

--4.3. Товары, в названии которых есть ЦИФРЫ
SELECT * 
FROM `homework_database`.`mobile_phones`
WHERE `product_name` REGEXP '[0-9]';

--4.4. Товары, в названии которых есть ЦИФРА "8"
SELECT * 
FROM `homework_database`.`mobile_phones`
WHERE `product_name` LIKE '%8%';