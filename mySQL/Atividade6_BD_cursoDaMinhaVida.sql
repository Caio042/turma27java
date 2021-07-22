create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria (
	id_categoria int auto_increment,
    nome_categoria varchar(20) not null,
	presencial boolean,
    
    primary key (id_categoria)
);

create table tb_curso(
	id_curso int auto_increment,
    nome_curso varchar(70) not null,
    valor decimal (9,2) not null,
    duracao_em_horas int not null,
    id_categoria int not null,
    
    primary key (id_curso),
    
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (nome_categoria, presencial) values 
("programação", false),
("administração", true),
("filosofia", true),
("matematica", false),
("linguas", true);

insert into tb_curso (nome_curso, duracao_em_horas, valor, id_categoria) values 
("java", 180, 79.99, 1),
("administração de empresas", 12, 29.99, 2),
("aprofundamento em Kant", 120, 39.99, 3),
("algebra linear", 22, 19.99, 4),
("ingles", 360, 120, 5),
("linguagem sql", 12, 59.99, 1),
("html e css", 36, 22.50, 1),
("angular", 28, 52.99, 1);

select * from tb_curso where valor > 50;

select * from tb_curso where valor > 3 and valor < 60;

select * from tb_curso where nome_curso like "%j%";

select tb_curso.nome_curso, tb_categoria.nome_categoria 
from tb_curso inner join tb_categoria 
on tb_categoria.id_categoria = tb_curso.id_categoria;

select tb_curso.nome_curso, tb_categoria.nome_categoria 
from tb_curso inner join tb_categoria 
on tb_categoria.id_categoria = tb_curso.id_categoria
where tb_categoria.nome_categoria = "programação";