/*joins*/
select * from productos;
select * from categoria;

select * from productos, categoria where idCategoria = id;

select p.nombre, p.precio, p.existencia, c.nombre from productos as p inner join categoria as c 
where p.idCategoria = c.id;

select p.nombre, p.precio, p.existencia, t.nombre from productos as p right join temp as t
on p.idCategoria = t.id;

select * from proveedores;
select * from categoria UNION  
Select nombre, precio from productos;

/*multi consulta*/
select p.nombre, p.precio, p.existencia from productos as p;

select * from categoria;
SELECT p.nombre as nom_producto, c.nombre as nom_categoria
FROM productos AS p 
left JOIN categoria AS c 
ON p.idCategoria = c.id
left join detalle_producto_proveedor as det
on p.idProducto = det.idProducto
left join proveedores as;
