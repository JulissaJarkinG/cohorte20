Show columns from detalle_producto_proveedor;
INSERT INTO productos (nombre, precio, fecha_alta, idCategoria, existencia)
VALUES ('chicles', 1, curdate(), 15,100);
UPDATE productos SET nombre = 'Chilindrina', precio = 10.50, existencia = 2 WHERE idProducto =23;
alter table productos add column marca varchar(20) not null; 

update productos SET idCategoria = 8 where idProducto = 29;

update productos set precio = replace (precio, 3, 13);
select * from productos;
SELECT * FROM categoria;
insert into productos (nombre, precio, fecha_alta, idCategoria, existencia, marca)
values ("Ariel color", 25, curdate(), 8, 90, 'Ariel');
insert into categoria (nombre) Values ('d');

DELETE FROM productos WHERE idProducto = 23; 
delete from categoria where id= 12;
truncate table categoria;

SELECT count(idProducto), idCategoria FROM productos group by idCategoria;
select * from productos where idCategoria = 5;
