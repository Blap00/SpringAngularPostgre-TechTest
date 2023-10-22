package com.fabianpalma.techtest.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipos")
public class Tipos {
	@Id
	private Long id;  //PK
	
	@Column(nullable = false, length = 50)
	private String nom_tipo;
	
	@Column(nullable = false)
	private boolean activo;

	
	@Column(updatable = false, nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	public Tipos() {
	}
	

	public Tipos(Long id, String nom_tipo, boolean activo, Date createdAt, Date updatedAt) {
		this.id = id;
		this.nom_tipo = nom_tipo;
		this.activo = activo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_tipo() {
		return nom_tipo;
	}

	public void setNom_tipo(String nom_tipo) {
		this.nom_tipo = nom_tipo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
