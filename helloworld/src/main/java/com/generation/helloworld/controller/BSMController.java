package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSMController {
	
	@GetMapping
	public String bsm() {
		return "GEN's BSMs: Mentalidade de crescimento, Orientação ao futuro, Persistência, Responsabilidade pessoal, Orientação ao detalhe, Trabalho em equipe, Proatividade, Comunicação.";
	}
	
	
}
