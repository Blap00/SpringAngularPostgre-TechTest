package com.fabianpalma.techtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabianpalma.techtest.repositories.ServiciosRepository;

@Service
public class ServiciosService {
	@Autowired
	private final ServiciosRepository serviciosService;
	
	public ServiciosService(ServiciosRepository serviciosService) {
		this.serviciosService = serviciosService;
	}
}
