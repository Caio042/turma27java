CREATE DATABASE db_pizzaria_legal;

use db_pizzaria_legal;

CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    tipo VARCHAR(15) NOT NULL,
    disponivel BOOLEAN,
    PRIMARY KEY (id_categoria)
);

create table tb_pizza (

	id_pizza int AUTO_INCREMENT,
    nome_pizza VARCHAR(15) not null,
    ingredientes VARCHAR(50) NOT NULL,
    preco INT NOT NULL,
    categoria INT,
    
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria 
(tipo, disponivel) 
values ("Bovina", true),
("Suina ou frango", true),
("Peixes", true),
("Vegetariana", true),
("Doce",true);

INSERT INTO tb_pizza 
(nome_pizza, ingredientes, preco, categoria)
values
("Mussarela", "Mussarela, tomate e orégano", 25.99, 4),
("Calabresa", "Calabresa, pimenta do reino", 26.99, 2),
("Bacon", "Mussarela, orégano e bacon", 39.99, 2),
("Frango","Frango e catupiry", 36.99, 2),
("Atum", "Atum e cebola", 32.50, 3),
("Carne seca", "Carne seca e mussarela", 75.99, 1),
("Romeu e julieta", "Goiabada e mussarela", 33.99, 5),
("Brocólis", "Mussarela e brócolis", 45.50, 4);

select nome_pizza, ingredientes
from 
tb_pizza
where
preco > 45;

select nome_pizza, ingredientes
from 
tb_pizza
where
preco > 29 and preco < 60;

select * 
from 
tb_pizza
where
nome_pizza like "%c%";

select tb_pizza.nome_pizza,
tb_categoria.tipo from tb_pizza
inner join
tb_categoria on 
tb_categoria.id_categoria = tb_pizza.categoria;

select * FROM tb_pizza
INNER JOIN tb_categoria on
tb_categoria.id_categoria = tb_pizza.categoria
where tb_categoria.tipo = "Doce";