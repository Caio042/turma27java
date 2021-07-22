create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
	id_categoria int auto_increment,
    nome_categoria varchar(15) not null,
    precisa_receita boolean,
    
    primary key (id_categoria)
);

create table tb_produto(
	id_produto int auto_increment,
    nome_produto varchar(70) not null,
    valor decimal (9,2) not null,
    fabricante varchar(30) not null,
    id_categoria int not null,
    
    primary key (id_produto),
    
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (nome_categoria, precisa_receita) values 
("medicamentos", true),
("cosmeticos", false),
("higiene pessoal", false),
("vitaminas", false),
("nutrição",false);

insert into tb_produto (nome_produto, fabricante, valor, id_categoria) values 
("Aiprazolan", "Biolab", 23.75, 1),
("Forxiga", "AstraZeneca", 213.01, 1),
("Sabonete Líquido Actine", "Biocolor", 79.99, 2),
("Suplemento Vitamínico A - Z", "Lavitan", 19.79, 4),
("Absorvente Tripla Proteção", "Intimus", 7.29, 3),
("Suplemento Alimentar", "Biotina", 30.99, 5),
("Clonazepam", "Medley", 29.75, 1),
("Glyxambi", "Boehringer", 327.99, 1);

select * from tb_produto where valor > 50;

select * from tb_produto where valor > 3 and valor < 60;

select * from tb_produto where nome_produto like "%b%";

select tb_produto.nome_produto, tb_categoria.nome_categoria 
from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_categoria;

select tb_produto.nome_produto, tb_categoria.nome_categoria 
from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_categoria
where tb_categoria.nome_categoria = "medicamentos";