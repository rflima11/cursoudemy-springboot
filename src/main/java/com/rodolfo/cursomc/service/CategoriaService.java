package com.rodolfo.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodolfo.cursomc.domain.Categoria;
import com.rodolfo.cursomc.repository.CategoriaRepository;
import com.rodolfo.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	public Categoria buscar(long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " +id + ", Tipo: " + Categoria.class.getName())); 
	}
	
	public Categoria salvar(Categoria categoria) {
	
		return categoriaRepository.save(categoria);
	}

}
