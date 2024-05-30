package com.daw.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daw.examen.model.Profesor;
import com.daw.examen.service.ProfesorServicio;

@Controller
@RequestMapping("/profesor")
public class ProfesorControlador {
	@Autowired
	private ProfesorServicio profesorService;

	@GetMapping("/")
	public String listarProfesores(Model modelo) {
		modelo.addAttribute("listaProfesores", profesorService.getAll());
		return "profesor/listar";
	}

	@GetMapping("/borrar-definitivamente/{id}")
	public String borrarDefinitivamenteProfesor(@PathVariable(name = "id") Long id) {
		profesorService.deleteById(id);

		return "redirect:..";
	}

	@GetMapping("/clases/{id}")
	public String clases(Model modelo, @PathVariable(name = "id") Long id) {
		Profesor unProfesor = profesorService.getById(id);
		
		modelo.addAttribute("profesor", unProfesor);
		
		return "profesor/clases";
	}

}
