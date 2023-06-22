package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {

	@GetMapping
	public String Objetivo() {
		return "Meu objetivo é aprender o máximo que eu conseguir de MySQL e Spring.";
	}

}
