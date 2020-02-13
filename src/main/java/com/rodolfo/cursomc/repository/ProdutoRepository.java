package com.rodolfo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodolfo.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
