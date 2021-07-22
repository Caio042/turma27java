create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria (
	id_categoria int auto_increment,
    nome_categoria varchar(20) not null,
    vegano boolean,
    
    primary key (id_categoria)
);

create table tb_produto(
	id_produto int auto_increment,
    nome_produto varchar(70) not null,
    valor decimal (9,2) not null,
    disponivel boolean not null,
    id_categoria int not null,
    
    primary key (id_produto),
    
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (nome_categoria, vegano) values 
("frutas", true),
("legumes", true),
("verduras", true),
("condimentos", true),
("ovos e laticineos", false);

insert into tb_produto (nome_produto, disponivel, valor, id_categoria) values 
("Melancia", true, 23.75, 1),
("Cenoura", false, 8.99, 2),
("Alface", true, 1.50, 3),
("Pimenta-do-reino", false, 0.99, 4),
("Queijo minas", true, 35.99, 5),
("Banana", false, 5.99, 1),
("Beterraba", true, 3.99, 2),
("Kiwi", false, 9.99, 1);

select * from tb_produto where valor > 50;

select * from tb_produto where valor > 3 and valor < 60;

select * from tb_produto where nome_produto like "%c%";

select tb_produto.nome_produto, tb_categoria.nome_categoria 
from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_categoria;

select tb_produto.nome_produto, tb_categoria.nome_categoria 
from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_categoria
where tb_categoria.nome_categoria = "legumes";