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

import com.daw.burger.model.Pan;
import com.daw.burger.service.PanService;

@Controller
@RequestMapping("/pan")
public class PanController {
	@Autowired
	private PanService panService;

	@GetMapping("/")
	public String listarPanes(Model modelo) {
		modelo.addAttribute("listaPanes", panService.getAll());
		return "pan/listar";
	}

	@GetMapping("/{id}")
	public String verPan(@PathVariable(name = "id") Long id, Model modelo, RedirectAttributes redirAttrs) {
		Pan item = panService.getById(id);

		if (item == null) {
			redirAttrs.addFlashAttribute("error", true);
			redirAttrs.addFlashAttribute("mensaje", "No existe el elemento");
			return "redirect:.";
		}

		modelo.addAttribute("pan", item);

		return "pan/ver";
	}

	@GetMapping("/borrar/{id}")
	public String borrarPan(@PathVariable(name = "id") Long id, Model modelo) {
		modelo.addAttribute("pan", panService.getById(id));

		return "pan/borrar";
	}

	@GetMapping("/borrar-definitivamente/{id}")
	public String borrarDefinitivamentePan(@PathVariable(name = "id") Long id) {
		panService.deleteById(id);

		return "redirect:..";
	}

	@GetMapping("/editar/{id}")
	public String editarPan(@PathVariable(name = "id") Long id, Model modelo) {
		Pan item = panService.getById(id);

		modelo.addAttribute("pan", item);

		return "pan/formulario";
	}

	@PostMapping("/editar/enviar")
	public String guardarPan(@ModelAttribute("pan") Pan pan, Model modelo) {
		panService.update(pan);

		return "redirect:..";
	}

	@GetMapping("/nuevo/item")
	public String nuevoPan(Model modelo) {
		Pan item = new Pan();

		// Aquí puedo poner algunos valores por defecto al crear un nuevo pan
		item.setDescripcion("Escriba aquí la descripción");
		item.setGluten(true);

		modelo.addAttribute("pan", item);

		return "pan/formulario";
	}

	@PostMapping("/nuevo/enviar")
	public String guardarNuevoPan(@ModelAttribute("pan") Pan pan, Model modelo) {
		panService.create(pan);

		return "redirect:..";
	}

}