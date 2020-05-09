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
		return "index";
	}
	//asdasd
	//sdasd
}
	