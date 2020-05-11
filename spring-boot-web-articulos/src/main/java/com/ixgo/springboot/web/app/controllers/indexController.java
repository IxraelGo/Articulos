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
				new Articulos("Refresco de cola de 3L",40.0f,"Coca cola",2,"Bepensa"),
				new Articulos("Teclado gamer",500.0f,"Logitech",1,"Coppel"),
				new Articulos("Guitarra eléctrica",7000.0f,"Fender",6,"Quintana Rock"),
				new Articulos("Tun-kul de madera",3000f,"Pakal",3,"Humbatz"),
				new Articulos("Bolsa de frijol de 1kg",14.0f,"El Sierra",1,"La Costeña"),
				new Articulos("Galleta Globitos",3000f,"Dondé",2,"ESR"),
				new Articulos("Sopa Nisisn",13.0f,"Cup Noodles",10,"NISSIN")
				);
		return usuarios;
	}
}
	