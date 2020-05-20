package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Saludo;

@RestController
public class SaludoController {

@GetMapping(value = "/saludos", produces="application/json")
public Saludo funcionSaludo() {
	
	Saludo saludo = new Saludo();	
	
	saludo.setNombre("Erika");
	saludo.setDescripcion("Hola!! ");
	

	return saludo;
	
}

@PostMapping(value = "/saludos2", produces="application/json")
public Saludo funcionParametrosSaludos(@RequestBody Saludo saludo) {
	
saludo.setNombre("Erika");
	
return saludo;
 
}

	
}
