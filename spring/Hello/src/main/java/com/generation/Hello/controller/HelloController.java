package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //quem vai controlar as rotas da aplicação

//mapeia a rota, que recebe como argumento, sempre um string
//endereço, caminho da aplicação
//o local da minha aplicação vai ser localhost:8080/hello, mas poderia ser outra URI se não fosse local
@RequestMapping("/hello-world")	
public class HelloController {
	
	//vai fazer algo quando requisitar get na aplicação
	@GetMapping
	public String hello() {
		return "Olá mundão, \nPara realizar a atividade utilizei as mentaldades de Persistência e Mentalidade de crescimento\n"
				+ "e a habilidade de Atenção aos detalhes.\n\n"
				+ "Para próxima semana meus objetivos são aprender sobre Spring, REST API e estrutura de dados.";
	}
}