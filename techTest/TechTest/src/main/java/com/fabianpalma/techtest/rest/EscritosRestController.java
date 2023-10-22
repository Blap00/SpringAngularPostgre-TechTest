package com.fabianpalma.techtest.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabianpalma.techtest.models.Escritos;
import com.fabianpalma.techtest.services.EscritosService;

@RestController
@RequestMapping("/Escritos")
public class EscritosRestController {
	
	private final EscritosService escritoService ;
	
	
	public EscritosRestController(EscritosService escritoService) {
		this.escritoService = escritoService;
	}


	@GetMapping("/getAllData")
	public ResponseEntity<List<Escritos>> findData() {
		return ResponseEntity.ok(escritoService.findAll());
		
	}
}
