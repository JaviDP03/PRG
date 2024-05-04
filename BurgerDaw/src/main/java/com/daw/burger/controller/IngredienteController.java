package com.daw.burger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.daw.burger.model.Ingrediente;
import com.daw.burger.service.IngredienteService;

@Controller
@RequestMapping("/ingrediente")
public class IngredienteController {
	@Autowired
	private IngredienteService IngredienteService;

	@GetMapping("/")
	public String listarIngredientes(Model modelo) {
		modelo.addAttribute("listaIngredientes", IngredienteService.getAll());
		
		return "ingrediente/listar";
	}

	@GetMapping("/{id}")
	public String verIngrediente(@PathVariable(name = "id") Long id, Model modelo, RedirectAttributes redirAttrs) {
		Ingrediente item = IngredienteService.getById(id);

		if (item == null) {
			redirAttrs.addFlashAttribute("error", true);
			redirAttrs.addFlashAttribute("mensaje", "No existe el elemento");
			return "redirect:.";
		}

		modelo.addAttribute("ingrediente", item);

		return "ingrediente/ver";
	}

	@GetMapping("/borrar/{id}")
	public String borrarIngrediente(@PathVariable(name = "id") Long id, Model modelo) {
		modelo.addAttribute("ingrediente", IngredienteService.getById(id));

		return "ingrediente/borrar";
	}

	@GetMapping("/borrar-definitivamente/{id}")
	public String borrarDefinitivamenteIngrediente(@PathVariable(name = "id") Long id) {
		IngredienteService.deleteById(id);

		return "redirect:..";
	}

	@GetMapping("/editar/{id}")
	public String editarIngrediente(@PathVariable(name = "id") Long id, Model modelo) {
		Ingrediente item = IngredienteService.getById(id);

		modelo.addAttribute("ingrediente", item);

		return "ingrediente/formulario";
	}

	@PostMapping("/editar/enviar")
	public String guardarIngrediente(@ModelAttribute("ingrediente") Ingrediente Ingrediente, Model modelo) {

		IngredienteService.update(Ingrediente);

		return "redirect:..";
	}

	@GetMapping("/nuevo/item")
	public String nuevoIngrediente(Model modelo) {
		Ingrediente item = new Ingrediente();

		// Aquí puedo poner algunos valores por defecto al crear un nuevo Ingrediente
		item.setNombre("Escriba aquí la descripción");
		item.setLactosa(true);

		modelo.addAttribute("ingrediente", item);

		return "ingrediente/formulario";
	}

	@PostMapping("/nuevo/enviar")
	public String guardarNuevoIngrediente(@ModelAttribute("ingrediente") Ingrediente Ingrediente, Model modelo) {
		IngredienteService.create(Ingrediente);

		return "redirect:..";
	}

}