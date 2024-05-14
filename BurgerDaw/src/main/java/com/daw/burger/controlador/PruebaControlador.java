package com.daw.burger.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daw.burger.modelo.Hamburguesa;
import com.daw.burger.modelo.Pan;
import com.daw.burger.repositorio.PanRepositorio;

@Controller
@RequestMapping("/prueba")
public class PruebaControlador {
	@Autowired
	private PanRepositorio panRepositorio;

	@GetMapping("/hamburguesa")
	public String testHamburguesa(Model modelo) {
		Pan unPan = new Pan("Rústico", true);
		Hamburguesa hamburguesa1 = new Hamburguesa("Jameña", 5.25, null);
		Hamburguesa hamburguesa2 = new Hamburguesa("Tijuana", 4.50, null);

		// Utilizamos el método auxiliar que, al añadir hamburguesa, le asigna el pan
		unPan.addHamburguesa(hamburguesa1);
		unPan.addHamburguesa(hamburguesa2);
		panRepositorio.save(unPan);

		return "redirect:/hamburguesa/";
	}
}
