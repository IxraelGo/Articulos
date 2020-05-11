package com.ixgo.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ixgo.springboot.web.app.models.Articulos;

@Controller

@RequestMapping ("/app")
public class indexController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo","Inicio artículos");
		return "index";
	}
	
	@RequestMapping ("/articulos")
	public String articulos(Model model) {
		model.addAttribute("titulo", "Artículos");
		return "articulos";
	}
	@ModelAttribute("articulos")
	public List<Articulos> llenarArticulos(){
		List<Articulos> usuarios= Arrays.asList(
				new Articulos("Perros verdes",123.2f,"Chevrolet",2,"Mc Donalds"),
				new Articulos("Perros Rojos",883.0f,"Chevrolet",1,"Logitech"),
				new Articulos("Perros Rosados",24.4f,"Chevrolet",6,"SEMARNAT"),
				new Articulos("Perros Azules",50.0f,"Chevrolet",3,"Bimbo")
				);
		return usuarios;
	}
}
	