package com.generation.live.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.live.model.Pessoa;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping ("/live")
public class LiveController {
	
	@GetMapping
	public String aovivo() {
		return "Live coding do dia 26/07";
	}
	
	// O endereço desse get vai ser /live/pessoa
	@GetMapping("/pessoa")
	public Pessoa getPessoa() {
		Pessoa caio = new Pessoa();
		caio.setNome("Caio");
		caio.setIdade(24);
		
		//irá retornar um json com os atributos do objeto
		return caio;
	}
	
	@GetMapping("/lista")
	public List<Pessoa> pegarLista(){
		
		List<Pessoa> lista = new LinkedList<>();
		
		lista.add(getPessoa());
		lista.add(new Pessoa ("Astolfo", 55));
		lista.add(new Pessoa ("Mario", 27));
		lista.add(new Pessoa ("Geralda", 72));
		
		//retorna uma lista em formato json
		return lista;
	}
}