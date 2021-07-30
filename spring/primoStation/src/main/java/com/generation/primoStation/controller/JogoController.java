package com.generation.primoStation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.primoStation.model.Jogo;
import com.generation.primoStation.repository.JogoRepository;

@RestController
@RequestMapping ("/jogos")
@CrossOrigin ("*")
public class JogoController {
	
	@Autowired
	private JogoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Jogo>> buscarTodos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Jogo> buscarPeloId(@PathVariable long id){
		return repositorio.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/titulo/{titulo}")
	public ResponseEntity<List<Jogo>> buscarPeloTitulo (@PathVariable String titulo){
		return ResponseEntity.ok(repositorio.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Jogo> criarCategoria(@RequestBody @Valid Jogo post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Jogo> atualizarCategoria(@RequestBody @Valid Jogo put){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(put));
	}
	
	@DeleteMapping ("/{id}")
	public void deletarCategoria(@PathVariable long id) {
		repositorio.deleteById(id);
	}
}