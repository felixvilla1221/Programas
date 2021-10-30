package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class HomeController {
	
	
	
	
@GetMapping("home")
public String home(Model model) {
model.addAttribute("Hola", "Titulo");	
return null;	
}


@GetMapping("home")
public String salvar(Model model) {
model.addAttribute("Hola", "Titulo");	
return null;	
}

}
