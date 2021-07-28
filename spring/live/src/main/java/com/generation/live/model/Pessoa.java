package com.generation.live.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long pessoa_id;
	
	@NotBlank (message = "Não pode ser nulo ou vazio") // nem nulo e nem vazio, a mensagem vai pra requisição http
	@Size (min = 2, max = 100, message = "Nome muito curto ou muito longo")
	private String nome;
	
	@Min(value = 13, message = "Idade mínima para entrar na plataforma: 13 anos") //valor minimo
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa() {
		
	}
}
