package com.testecredimoveis.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testecredimoveis.domain.model.Nota;
import com.testecredimoveis.domain.repository.NotaRespository;

@RestController
@RequestMapping(value = "/notas")
public class NotaController {
	
	@Autowired
	private NotaRespository notaRepository;
	
	@GetMapping
	public List<Nota> listar(){
		return notaRepository.findAll();
	}
	
	@GetMapping("/{numeroNfe}")
	public ResponseEntity<Nota> buscar(@PathVariable Long numeroNfe){
		Optional<Nota> nota = notaRepository.findById(numeroNfe);
		
		if (nota.isPresent()) {
			return ResponseEntity.ok(nota.get());
		}
		
		return ResponseEntity.notFound().build();
	}

}
