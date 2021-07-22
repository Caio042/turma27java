create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria (
	id_categoria int auto_increment,
    nome_categoria varchar(20) not null,
	disponivel_entrega boolean,
    
    primary key (id_categoria)
);

create table tb_produto(
	id_produto int auto_increment,
    nome_produto varchar(70) not null,
    valor decimal (9,2) not null,
    marca_propria boolean not null,
    id_categoria int not null,
    
    primary key (id_produto),
    
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (nome_categoria, disponivel_entrega) values 
("iluminação", false),
("elétrico", true),
("piso", true),
("decoração", false),
("madeira", true);

insert into tb_produto (nome_produto, marca_propria, valor, id_categoria) values 
("interrupitor", true, 12.75, 2),
("tomada", false, 18.99, 2),
("almofada", true, 35.99, 4),
("azulejo para garagem", false, 75.22, 3),
("madeira pinnus", true, 19.99, 5),
("lampada led", false, 23.99, 1),
("piso laminado", true, 122.99, 3),
("capa para botijão", false, 9.99, 4);

select * from tb_produto where valor > 50;

select * from tb_produto where valor > 3 and valor < 60;

select * from tb_produto where nome_produto like "%c%";

select tb_produto.nome_produto, tb_categoria.nome_categoria 
from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_categoria;

select tb_produto.nome_produto, tb_categoria.nome_categoria 
from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_categoria
where tb_categoria.nome_categoria = "decoração";