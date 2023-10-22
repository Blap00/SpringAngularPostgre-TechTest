package com.fabianpalma.techtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabianpalma.techtest.repositories.EstadosRepository;

@Service
public class EstadosService {
	@Autowired
	private final EstadosRepository estadosRepository;
	
	public EstadosService(EstadosRepository estadosRepository) {
		this.estadosRepository = estadosRepository;
	}
}
