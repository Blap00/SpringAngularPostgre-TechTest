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
@Table(name="estados")
public class Estados {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;  //PK
	
	@Column(nullable = false, length = 50)
	private String nom_estado;
	
	@Column(nullable = false)
	private boolean activo;
	
	@OneToMany(mappedBy = "estados")  
    private List<Escritos> escritos;
	
	@Column(updatable = false, nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	public Estados() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom_estado() {
		return nom_estado;
	}

	public void setNom_estado(String nom_estado) {
		this.nom_estado = nom_estado;
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
