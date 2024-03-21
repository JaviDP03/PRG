package tema9.relacion92;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {
	// Propiedades de la instancia
	private Map<LocalTime, String> agendaCitas;

	// Constructor
	public Agenda() {
		agendaCitas = new HashMap<>();
	}

	// Métodos
	public void añadirCita(String hora, String cliente) {
		LocalTime horaParseada = LocalTime.parse(hora);

		if (!agendaCitas.containsKey(horaParseada)) {
			agendaCitas.put(horaParseada, cliente);
		} else {
			System.out.println("Ya hay una cita a esta hora");
		}
	}

	public void cancelarCita(String hora, String cliente) {
		LocalTime horaParseada = LocalTime.parse(hora);

		if (agendaCitas.containsKey(horaParseada)) {
			agendaCitas.remove(horaParseada, cliente);
		} else {
			System.out.println("No hay cita a esta hora");
		}
	}

	public String consultarCita(String hora) {
		LocalTime horaParseada = LocalTime.parse(hora);

		if (agendaCitas.containsKey(horaParseada)) {
			return hora + " - " + agendaCitas.get(horaParseada);
		} else {
			return "No hay cita a esta hora";
		}
	}

	// toString
	public String toString() {
		StringBuilder citas = new StringBuilder();
		List<LocalTime> listaHoras = new ArrayList<>();

		citas.append("Citas:\n");
		listaHoras.addAll(agendaCitas.keySet());
		listaHoras.sort(null);

		for (LocalTime horas : listaHoras) {
			citas.append(horas + " - " + agendaCitas.get(horas) + "\n");
		}

		return citas.toString();
	}

}
