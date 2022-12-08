/*Listas*/
/* in */
SELECT * FROM productos;
SELECT * FROM productos where precio in (5,6,7,8,9,10);

SELECT * FROM productos where precio not in (5,6,7,8,9,10);

SELECT * FROM productos where date (fecha_alta) between '2015-01-01' and '2016-07-24';
SELECT * FROM productos where precio = 10/2;
/*avg*/
SELECT nombre, avg(precio) as promedio_precios FROM productos where idCategoria =2 group by nombre;