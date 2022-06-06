create database projetocinema;

use projetocinema;

create table sala(
  id int(11) not null auto_increment,
  numero tinyint(2) not null,
  capacidade smallint(3) not null,
  tela ENUM('_3D','_2D'),
  primary key(id)
)engine=InnoDB;

create table ingresso(
  id int(11) not null auto_increment,
  meiaentrada tinyint(1),
  preco float(5,2),
  primary key(id)
)engine=InnoDB;

create table venda(
  id int(11) not null auto_increment,
  codigovenda bigint(20) not null,
  quantidade smallint(5),
  valortotal Double(10,2),
  primary key(id)
)engine=InnoDB;

create table filme(
id serial,
nome varchar(100) not null,
duracao int not null,
classificacao enum('LIVRE','_10','_12','_14','_16','_18'),
generoprincipal varchar(100),
primary key(id)
) engine = innodb;

create table genero(
id serial,
nome varchar(100) not null,
primary key(id)
) engine = innodb;

create table funcionario(
id serial,
nome varchar(100),
primary key(id)
);

create table guiche(
id serial,
numero tinyint not null,
primary key(id)
);
