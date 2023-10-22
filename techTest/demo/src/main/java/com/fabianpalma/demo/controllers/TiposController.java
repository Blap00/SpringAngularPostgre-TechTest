package com.fabianpalma.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabianpalma.demo.repositories.TiposRepository;

@RestController
@RequestMapping("/Tipos")
public class TiposController {
	@Autowired
	private final TiposRepository tiposRepository;
	
	public TiposController(TiposRepository tiposRepository) {
		this.tiposRepository= tiposRepository;
	}
	@GetMapping
	public ResponseEntity getAllTipos() {
		return ResponseEntity.ok(this.tiposRepository.findAll());
	}
	
}
