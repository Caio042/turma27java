package com.generation.live.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.live.model.Pessoa;

@Repository
public interface LiveRepository extends JpaRepository<Pessoa, Long>{
	
	public List<Pessoa> findAllByNomeContainingIgnoreCase (String titulo);
}
