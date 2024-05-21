package com.daw.burger.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.daw.burger.modelo.Hamburguesa;
import com.daw.burger.modelo.Pan;
import com.daw.burger.servicio.HamburguesaServicio;
import com.daw.burger.servicio.PanServicio;

@Controller
@RequestMapping("/hamburguesa")
public class HamburguesaControlador {
	@Autowired
	private HamburguesaServicio hamburguesaService;

	@Autowired
	private PanServicio panService;

	@GetMapping("/")
	public String listarHamburguesas(Model modelo) {
		modelo.addAttribute("listaHamburguesas", hamburguesaService.getAll());
		return "hamburguesa/listar";
	}

	@GetMapping("/{id}")
	public String verHamburguesa(@PathVariable(name = "id") Long id, Model modelo, RedirectAttributes redirAttrs) {
		try {
			Hamburguesa item = hamburguesaService.getById(id);
			modelo.addAttribute("hamburguesa", item);
			return "hamburguesa/ver";
		} catch (Exception e) {
			redirAttrs.addFlashAttribute("error", true);
			redirAttrs.addFlashAttribute("mensaje", "No existe el elemento");
			return "redirect:.";
		}

	}

	@GetMapping("/borrar/{id}")
	public String borrarHamburguesa(@PathVariable(name = "id") Long id, Model modelo) {
		modelo.addAttribute("hamburguesa", hamburguesaService.getById(id));

		return "hamburguesa/borrar";
	}

	@GetMapping("/borrar-definitivamente/{id}")
	public String borrarDefinitivamenteHamburguesa(@PathVariable(name = "id") Long id) {
		hamburguesaService.deleteById(id);

		return "redirect:..";
	}

	@GetMapping("/editar/{id}")
	public String editarHamburguesa(@PathVariable(name = "id") Long id, Model modelo) {
		Hamburguesa item = hamburguesaService.getById(id);

		modelo.addAttribute("hamburguesa", item);
		modelo.addAttribute("listaPanes", panService.getAll());

		return "hamburguesa/formulario";
	}

	@PostMapping("/editar/enviar")
	public String guardarHamburguesa(@ModelAttribute("hamburguesa") Hamburguesa hamburguesa,
			RedirectAttributes redirAttrs) {
		try {
			hamburguesaService.update(hamburguesa);
		} catch (Exception e) {
			redirAttrs.addFlashAttribute("error", true);
			redirAttrs.addFlashAttribute("mensaje", "No se pudo enviar el formulario correctamente");
		}
		return "redirect:..";
	}

	@GetMapping("/nuevo/item")
	public String nuevoHamburguesa(Model modelo) {
		Hamburguesa item = new Hamburguesa();

		// Aquí puedo poner algunos valores por defecto al crear un nuevo pan
		item.setNombre("Escriba aquí el nombre");
		item.setPrecio(0);
		item.setPan(new Pan("Indeterminado", true));

		modelo.addAttribute("hamburguesa", item);
		modelo.addAttribute("listaPanes", panService.getAll());

		return "hamburguesa/formulario";
	}

	@PostMapping("/nuevo/enviar")
	public String guardarNuevoHamburguesa(@ModelAttribute("hamburguesa") Hamburguesa hamburguesa, Model modelo) {
		hamburguesaService.create(hamburguesa);

		return "redirect:..";
	}

}