package com.daw.pruebaspring.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.daw.pruebaspring.models.Producto;

@Controller
public class PruebaController {
	@GetMapping("/prueba")
	public String prueba(Model modelo) {
		Producto unProducto = new Producto("Patatas", 1.20);
		Map<String, Integer> telefonos = new HashMap<>();
		String[] colores = { "rojo", "verde", "azul" };

		modelo.addAttribute("hoy", LocalDate.now());
		modelo.addAttribute("producto", unProducto);
		telefonos.put("Antonio", 600600600);
		modelo.addAttribute("telefonos", telefonos);
		modelo.addAttribute("colores", colores);

		return "prueba";
	}

}
