package com.ixgo.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping ("/app")
public class indexController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo","Inicio artículos");
		return "index";
	}
	
	@RequestMapping ("/art")
	public String articulos(Model model) {
		model.addAttribute("titulo", "Artículos");
		return "articulos";
	}
	
	
	
	
	/*
	*Lista:
	*-Crear un paquete, dentro una clase Java llamada Artiulos con los atributos chidos, set y get.
	*-Crear un html "articulos.html" con lo "mismo" de "index.html".
	*-Crear una tabla en el "articulos.hmtl" con los titulos de sus atributos de "heading", y 
	*desplegar todo el contenido que tenga el objeto "Articulos" con el "th:each".
	*-y YA! :D
	*quedo bien
	*/
}
	