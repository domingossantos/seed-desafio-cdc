package com.jornadadev.casadocodigo.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

@Entity
public class Autor implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String nome;
	@Email
	private String email;
	@NotNull
	@Length(max = 400)
	private String descricao;
	private LocalDateTime instante = LocalDateTime.now();
	
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Autor(String nome, String email, String descricao) {
		super();
		this.nome = nome;
		this.email = email;
		this.descricao = descricao;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getInstante() {
		return instante;
	}
	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}
	
	
	
}
