create database bd_escola;

use bd_escola;

create table estudantes(
	registro_de_aluno bigInt auto_increment,
    nome VARCHAR(50) NOT NULL,
    media_das_notas DECIMAl NOT NULL,
    unidade VARCHAR(50) NOT NULL,
    matriculado boolean,
    
    primary key (registro_de_aluno)
);

insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Antonieta","Santana",8,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Julia","Santo Amaro",5,false);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Geraldo","Centro",6,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Maria","Santo Amaro",9,false);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ótavio","Centro",4,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ronaldo","Santana",8.7,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Melissa","Centro",8.1,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Arthur","Centro",2.6,true);

select nome from estudantes where media_das_notas > 7;
select nome from estudantes where media_das_notas < 7;

update estudantes set media_das_notas = 9 where registro_de_aluno = 8;