package com.generation.primoStation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.primoStation.model.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {
 
	public List<Jogo> findAllByTituloContainingIgnoreCase(String titulo);
}