package com.testecredimoveis.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testecredimoveis.domain.model.Nota;
import com.testecredimoveis.domain.repository.NotaRespository;

@Service
public class CadastroNotaService {
	
	@Autowired
	private NotaRespository notaRespository;
	
	public Nota salvar(Nota nota) {
		return notaRespository.save(nota);
	}

}
