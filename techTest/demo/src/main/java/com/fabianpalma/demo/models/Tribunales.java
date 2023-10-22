package com.fabianpalma.demo.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tribunales")
public class Tribunales {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;  //PK
	
	@Column(nullable = false, length = 50)
	private String nom_tribunal;
	
	@Column(nullable = false)
	private boolean activo;
	
	@OneToMany(mappedBy = "tribunales")  
    private List<Escritos> escritos;
	
	@Column(updatable = false, nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	
	public Tribunales() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom_tribunal() {
		return nom_tribunal;
	}


	public void setNom_tribunal(String nom_tribunal) {
		this.nom_tribunal = nom_tribunal;
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
