package com.generation.live.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.live.model.Pessoa;
import com.generation.live.repository.LiveRepository;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping ("/live")
@CrossOrigin ("*")
public class LiveController {
	
	
	@Autowired //sem isso precisaria instanciar a classe, e precisaria sobrescrever varios metodos de JPArepository
	private LiveRepository repositorio;
	
	
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
	
	@GetMapping ("/pegarTudo")
	public ResponseEntity<List<Pessoa>> pegarTudo(){ //cria um objeto padrão http
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Pessoa> getById(@PathVariable long id){ //busca a variavel pelo caminho
		/*
		 Optional<Pessoa> pessoa = repositorio.findById(id);
		
		if (pessoa.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.ok(pessoa.get());
		*/
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build()); //metodo mais curto usando lambda
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> post(@Valid @RequestBody Pessoa pessoa){ //request body pra pedir o body do objeto, valid pra validar
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repositorio.save(pessoa)); //save vai salvar no repositorio
	}
	
	@PutMapping
	public ResponseEntity<Pessoa> put(@Valid @RequestBody Pessoa pessoa){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repositorio.save(pessoa)); //metodo igual do post
	}
	
}