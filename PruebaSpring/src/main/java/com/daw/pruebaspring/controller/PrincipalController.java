package com.daw.pruebaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrincipalController {
	@GetMapping({ "/", "/bienvenida" })
	public String bienvenida(@RequestParam(required = false, defaultValue = "Mundo") String nombre, Model modelo) {
		modelo.addAttribute("nombre", nombre);
		return "principal";
	}
}