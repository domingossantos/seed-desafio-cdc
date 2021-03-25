package com.jornadadev.casadocodigo.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jornadadev.casadocodigo.AutorForm;
import com.jornadadev.casadocodigo.models.Autor;
import com.jornadadev.casadocodigo.repository.AutorRepository;

@RestController
@RequestMapping("/autor")
public class AutorController {

	@PersistenceContext
	EntityManager entityManager;
	
	@GetMapping
	public List<Autor> list(){
		return entityManager.createQuery("select a from Autor a").getResultList();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<?> save(@RequestBody @Valid AutorForm autorForm){
		try {
			Autor autor = autorForm.converter();	
			entityManager.persist(autor);
			return new ResponseEntity<Autor>(autor, HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
