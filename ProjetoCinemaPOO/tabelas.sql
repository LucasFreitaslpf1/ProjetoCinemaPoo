create database projetocinema;

use projetocinema;

drop table sala;
select *from sala;

create table sala(
  id int(11) not null auto_increment,
  numero tinyint(2) not null,
  capacidade smallint(3) not null,
  tela ENUM('3D','2D'),
  primary key(id)
)engine=InnoDB;

drop table ingresso;
select *from ingresso;

create table ingresso(
  id int(11) not null auto_increment,
  meiaentrada tinyint(1),
  preco float(5,2),
  primary key(id)
)engine=InnoDB;

drop table venda;
select *from venda;

create table venda(
  id int(11) not null auto_increment,
  codigovenda bigint(20) not null,
  quantidade smallint(5),
  valortotal Double(10,2),
  primary key(id)
)engine=InnoDB;