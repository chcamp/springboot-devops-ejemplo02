

/*algunos clientes*/


INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Christian', 'Campos',41235578, 'ccampos@gmail.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Artulo', 'Lopez',40051237, 'clopez23@bolsadeideas.com', '1980-02-02');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Lara', 'Alonso',41235578, 'alonso44@hotmail.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Sasha', 'Grey',12444023, 'ss345@gmail.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Leandro', 'Paredes',80123456, 'pparedes@yahoo.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Artuto', 'Vicuña',84512003, 'avicunar@gmail.com', '2017-03-03');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Sandro', 'Alvarez',45677889, 'alvarez_444@hotmail.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Carlos', 'Castro',77889944, 'carlitos55@gmail.com', '1987-02-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Maria', 'Gutierrez',40578123, 'Maria_g_45@yahoo.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, nro_documento, email, create_at) VALUES('Ronaldo', 'Nazario',45120777, 'ronnie566@hotmail.com', '2018-01-01');

/*productos algunos*/
INSERT INTO productos(descripcion, cantidad, estado) values ('Equipo de Musica SamSung',5, 42);
INSERT INTO productos(descripcion, cantidad, estado) values ('Panasonic Pantalla LED 55 Pulgadas',2, 42);
INSERT INTO productos(descripcion, cantidad, estado) values ('PlayStation 4',4, 42);
INSERT INTO productos(descripcion, cantidad, estado) values ('Laptop LEGION Lenovo',5, 42);
INSERT INTO productos(descripcion, cantidad, estado) values ('PlayStation 5',3, 42);
INSERT INTO productos(descripcion, cantidad, estado) values ('Bicicleta montañeta Goliatt',1, 42);
INSERT INTO productos(descripcion, cantidad, estado) values ('Equipo de Musica SamSung',6, 42);


/*algunas ventas id=1*/
INSERT INTO ventas(fecha, numero, serie, total,cliente_id_cliente) values ('2018-01-01','5', 'ABC541233',3200.87,1);

/*Detalles de las ventas id=1*/
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (1,2000.5, 2000.5,3,1);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (2,600.2, 1200.4,7,1);

/*venta id=2*/

INSERT INTO ventas(fecha, numero, serie, total,cliente_id_cliente) values ('2020-05-04','6', 'ABC22222',500.2,1);
/*Detalles de las ventas id=2*/
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (2,2000.5, 4000.10,5,2);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (3,2500.0, 7500.0,4,2);

INSERT INTO ventas(fecha, numero, serie, total,cliente_id_cliente) values ('1977-05-02','8', 'ABC5555',500.2,2);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (2,2000.5, 4000.10,5,3);

/*Detalles de las ventas id=2*/
INSERT INTO ventas(fecha, numero, serie, total,cliente_id_cliente) values ('1982-06-04','15', 'ABC5555',1500.0,3);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (1,3000.80, 3000.80,2,4);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (2,650.0, 1300.0,1,4);

/*Detalles de las ventas id=4*/

INSERT INTO ventas(fecha, numero, serie, total,cliente_id_cliente) values ('1982-06-04','15', 'ABC9999',3000.0,4);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (1,3000.80, 3000.80,5,5);
INSERT INTO detalle_ventas(cantidad,precio,sub_total,id_producto,venta_id) values (2,650.0, 1300.0,1,5);




