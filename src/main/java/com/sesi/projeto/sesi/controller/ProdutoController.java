package com.sesi.projeto.sesi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.sesi.entidade.ProdutoEntities;
import com.sesi.projeto.sesi.repository.ProdutoRepository;

@RestController
@RequestMapping("produto")
public class ProdutoController {

	@Autowired
	ProdutoRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<ProdutoEntities>> mostrarTodos(){
		List<ProdutoEntities> prod = repository.findAll();
		return ResponseEntity.ok(prod);
	}
}
