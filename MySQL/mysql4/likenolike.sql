/*Like*/
SELECT * FROM productos where nombre like 'limonada';

SELECT * FROM productos where nombre Like 'Limon%';

SELECT * FROM productos where nombre Like '%Limon';
SELECT * FROM productos where nombre NOT Like '%Limon%';