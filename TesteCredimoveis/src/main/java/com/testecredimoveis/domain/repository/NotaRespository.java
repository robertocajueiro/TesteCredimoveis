package com.testecredimoveis.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testecredimoveis.domain.model.Nota;

@Repository
public interface NotaRespository extends JpaRepository<Nota, Long>{
	
	

}
