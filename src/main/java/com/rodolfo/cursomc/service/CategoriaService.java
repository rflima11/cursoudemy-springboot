package com.rodolfo.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodolfo.cursomc.domain.Categoria;
import com.rodolfo.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	public Categoria buscar(long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElse(null); 
	}
	
	public void salvar(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

}
