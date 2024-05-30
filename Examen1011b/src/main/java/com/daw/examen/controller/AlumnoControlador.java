package com.daw.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.daw.examen.model.Alumno;
import com.daw.examen.service.AlumnoServicio;

@Controller
@RequestMapping("/alumno")
public class AlumnoControlador {
	@Autowired
	private AlumnoServicio alumnoService;

	@GetMapping("/")
	public String listarAlumnos(Model modelo) {
		modelo.addAttribute("listaAlumnos", alumnoService.getAll());
		return "alumno/listar";
	}

	@GetMapping("/editar/{id}")
	public String editarAlumno(@PathVariable(name = "id") Long id, Model modelo) {
		Alumno item = alumnoService.getById(id);

		modelo.addAttribute("alumno", item);
		modelo.addAttribute("listaTurnos", List.of("MAÑANA", "TARDE"));


		return "alumno/formulario";
	}

	@PostMapping("/editar/enviar")
	public String guardarAlumno(@ModelAttribute("pan") Alumno alumno, Model modelo, RedirectAttributes redirAttrs) {
		try {
			alumnoService.update(alumno);

			return "redirect:..";
		} catch (Exception e) {
			redirAttrs.addFlashAttribute("error", true);
			redirAttrs.addFlashAttribute("mensaje", e.getMessage());

			return "redirect:..";
		}
	}

	@GetMapping("/nuevo/item")
	public String nuevoAlumno(Model modelo) {
		Alumno item = new Alumno();

		item.setNombre("Introduce el nombre");
		item.setApellidos("Introduce los apellidos");

		modelo.addAttribute("alumno", item);
		modelo.addAttribute("listaTurnos", List.of("MAÑANA", "TARDE"));

		return "alumno/formulario";
	}

	@PostMapping("/nuevo/enviar")
	public String guardarNuevoAlumno(@ModelAttribute("alumno") Alumno alumno, Model modelo) {
		alumnoService.create(alumno);

		return "redirect:..";
	}
}
