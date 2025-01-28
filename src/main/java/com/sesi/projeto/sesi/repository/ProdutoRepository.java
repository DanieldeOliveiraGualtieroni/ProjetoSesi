package com.sesi.projeto.sesi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.sesi.entidade.ProdutoEntities;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntities, Long>{
	

}
