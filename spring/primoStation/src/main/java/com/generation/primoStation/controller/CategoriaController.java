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

import com.generation.primoStation.model.Categoria;
import com.generation.primoStation.repository.CategoriaRepository;

@RestController
@RequestMapping ("/categorias")
@CrossOrigin ("*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> retornarCategorias(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Categoria> retornarPeloTitulo(@PathVariable long id){
		return repositorio.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> retornarPelaDescricao (@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> criarCategoria(@RequestBody @Valid Categoria post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> atualizarCategoria(@RequestBody @Valid Categoria put){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(put));
	}
	
	@DeleteMapping ("/{id}")
	public void deletarCategoria(@PathVariable long id) {
		repositorio.deleteById(id);
	}
}