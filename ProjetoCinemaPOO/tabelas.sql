create database projetocinema;

use projetocinema;

create table funcionario(
id serial,
nome varchar(100),
primary key(id)
) engine = innodb;

create table guiche(
id serial,
numero tinyint not null,
funcionario_id bigint unsigned references funcionario(id),
primary key(id),
foreign key(funcionario_id) references funcionario(id)
) engine = innodb;

create table genero(
id serial,
nome varchar(100) not null,
primary key(id)
) engine = innodb;

create table filme(
id serial,
nome varchar(100) not null,
duracao int not null,
classificacao enum('LIVRE','_10','_12','_14','_16','_18'),
generoprincipal_id bigint unsigned,
primary key(id),
foreign key(generoprincipal_id) references genero(id)
) engine = innodb;


create table sala(
  id serial,
  numero tinyint not null,
  capacidade smallint not null,
  tela ENUM('_3D','_2D'),
  primary key(id)
)engine=InnoDB;


create table sessao(
id serial,
horario datetime not null,
audio enum('LEGENDADO','DUBLADO'),
ingressosvendidos int,
valorsessao float,
primary key(id)
) engine=innodb;

create table venda(
  id serial,
  codigovenda bigint(20) not null,
  quantidade smallint,
  sessao_id bigint unsigned,
  valortotal float,
  primary key(id),
  constraint fk_id_sessao foreign key(sessao_id) references sessao(id)
)engine=InnoDB;


create table ingresso(
  id serial,
  meiaentrada tinyint(1),
  preco float,
  venda_id bigint unsigned,
  primary key(id),
  constraint fk_id_venda  foreign key(venda_id) references venda(id)
)engine=InnoDB;

create table guichevenda_id(
	guiche_id bigint unsigned references guiche(id),
	venda_id bigint unsigned references venda(id),
	foreign key(guiche_id) references guiche(id),
	foreign key (venda_id) references venda(id)
) engine = innodb;

alter table sessao add filme_id bigint unsigned references filme(id);
alter table sessao add foreign key(filme_id) references filme(id);
alter table sessao add sala_id bigint unsigned references sala(id);
alter table sessao add foreign key(sala_id) references sala(id);
