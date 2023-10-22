package com.fabianpalma.demo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "escritos")
public class Escritos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  //PK

	@Column(nullable = false)
	private int nro_escrito;
	
	@ManyToOne
    @JoinColumn(name = "tipos_id") 
    private Tipos tipos; 
	
	@ManyToOne
    @JoinColumn(name = "servicios_id") 
	private Servicios servicios; //FK2 CLASS TIPO 1:N
	
	@Column(nullable = false)
	private int jurisdiccion;
	
	@ManyToOne
    @JoinColumn(name = "tribunales_id") 
	private Tribunales tribunales; //FK3 CLASS TIPO 1:N
	
	@Column(nullable = false)
	private String asunto;
	
	@Column(nullable = false)
	private Date fec_ingreso;
	
	
	private int nro_causa;
	
	private String observacion;
	
	@ManyToOne
    @JoinColumn(name = "estados_id")
	private Estados estados; //FK4 CLASS TIPO 1:N
	
	@Column(updatable = false, nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
	public Escritos() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNro_escrito() {
		return nro_escrito;
	}
	public void setNro_escrito(int nro_escrito) {
		this.nro_escrito = nro_escrito;
	}
	
	public Tipos getTipos() {
		return tipos;
	}
	public void setTipos(Tipos tipos) {
		this.tipos = tipos;
	}
	public Servicios getServicio_id() {
		return servicios;
	}
	public void setServicio_id(Servicios servicios) {
		this.servicios = servicios;
	}
	public int getJurisdiccion() {
		return jurisdiccion;
	}
	public void setJurisdiccion(int jurisdiccion) {
		this.jurisdiccion = jurisdiccion;
	}
	public Tribunales gettribunales() {
		return tribunales;
	}
	public void settribunales(Tribunales tribunales) {
		this.tribunales = tribunales;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public Date getFec_ingreso() {
		return fec_ingreso;
	}
	public void setFec_ingreso(Date fec_ingreso) {
		this.fec_ingreso = fec_ingreso;
	}
	public int getNro_causa() {
		return nro_causa;
	}
	public void setNro_causa(int nro_causa) {
		this.nro_causa = nro_causa;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Estados getEstado_id() {
		return estados;
	}
	public void setEstado_id(Estados estados) {
		this.estados = estados;
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
