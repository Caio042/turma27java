create database db_rh;

use db_rh;

create table funcionaries (
	matricula bigInt auto_increment,
    nome VARCHAR(50) NOT NULL,
    salario DECIMAL(10 , 2 ) NOT NULL,
    cargo varchar (50) NOT NULL,
    vale_refeicao DECIMAL (10, 2),
    primary key (matricula)
);

insert into funcionaries (nome, cargo, salario, vale_refeicao) 
values ("Antônio", "Desenvolvedor", 3400.00, 900.00);

insert into funcionaries (nome, cargo, salario, vale_refeicao) 
values ("Josefa", "Gerente", 3600.00, 1100.00);

insert into funcionaries (nome, cargo, salario, vale_refeicao) 
values ("Mario", "Encanador", 1800.00, 500.00);

insert into funcionaries (nome, cargo, salario, vale_refeicao) 
values ("Carla", "Estagiária de finanças", 1100.00, 200.00);

insert into funcionaries (nome, cargo, salario, vale_refeicao) 
values ("Carlos", "auxiliar de RH", 1750.00, 600.00);

select * from funcionaries where salario > 2000;

select * from funcionaries where salario < 2000;

update funcionaries set cargo = "Auxiliar de finanças", 
salario = 1600, vale_refeicao = 550 where matricula = 4;