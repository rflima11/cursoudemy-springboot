package com.rodolfo.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodolfo.cursomc.domain.Categoria;
import com.rodolfo.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable long id) {
		Categoria obj = categoriaService.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Categoria categoria){
		categoriaService.salvar(categoria);
		return ResponseEntity.ok().body(categoria);
	}

}