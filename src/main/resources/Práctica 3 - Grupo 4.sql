create schema practica;

create table arbol (
  numero int not null auto_increment,
  nombre varchar(50) not null,
  tipo_flor varchar(50),
  dureza int,
  ruta_imagen varchar(1024),
  vivo bool,
  primary key (numero));

create user 'usuario_practica'@'%' identified by 'la_Clave';

grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;