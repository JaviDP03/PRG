package com.daw.burger.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrincipalControlador {
	@GetMapping("/")
	public String index() {
		return "base";
	}
}
