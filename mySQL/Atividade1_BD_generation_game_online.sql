CREATE DATABASE db_generation_game_online;

use db_generation_game_online;

CREATE TABLE tb_classe (
    id_classe INT AUTO_INCREMENT,
    nome_classe VARCHAR(15) NOT NULL,
    poder_especial VARCHAR(50),
    PRIMARY KEY (id_classe)
);

create table tb_personagem (

	id_personagem int AUTO_INCREMENT,
    nome_personagem VARCHAR(50) not null,
    ataque INT not NULL,
    defesa INT NOT NULL,
    classe INT,
    
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (classe) REFERENCES tb_classe (id_classe)
);

INSERT INTO tb_classe 
(nome_classe, poder_especial) 
values ("Mago", "Bola de fogo"),
("Arqueiro", "Chuva de flechas"),
("Assassino", "Ataque das sombras"),
("Guerreiro","Espada da fúria"),
("Protetor","Escudo benevolente");

INSERT INTO tb_personagem 
(nome_personagem, ataque, defesa, classe)
values
("Harry Potter", 2850, 1650, 1),
("Robin Hood", 2550, 1950, 2),
("Astolfo", 3950, 550, 3),
("Xena",1550,2950,4),
("Arthur", 500, 4000, 5),
("Sabrina", 3150, 1350, 1),
("Geralda", 2700, 1800, 2),
("Asterix", 1900, 2600, 4);

select nome_personagem 
from 
tb_personagem
where
ataque > 2000;

select nome_personagem 
from 
tb_personagem
where
defesa > 1000 and defesa < 2000;

select * 
from 
tb_personagem
where
nome_personagem like "%c%";

select tb_personagem.nome_personagem,
tb_classe.nome_classe from tb_personagem
inner join
tb_classe on 
tb_classe.id_classe = tb_personagem.classe;

select * FROM tb_personagem
INNER JOIN tb_classe on
tb_classe.id_classe = tb_personagem.classe
where tb_classe.nome_classe = "Mago";