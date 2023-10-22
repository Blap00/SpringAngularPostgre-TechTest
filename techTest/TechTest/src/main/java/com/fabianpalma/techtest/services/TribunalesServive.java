package com.fabianpalma.techtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabianpalma.techtest.repositories.TribunalesRepository;

@Service
public class TribunalesServive {
	@Autowired
	private final TribunalesRepository tribunalesRepository;
	
	public TribunalesServive(TribunalesRepository tribunalesRepository) {
		this.tribunalesRepository = tribunalesRepository;
	}
}
