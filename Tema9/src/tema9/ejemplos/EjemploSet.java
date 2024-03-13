package tema9.ejemplos;

import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

	public static void main(String[] args) {
		Set<String> conjuntoParticipantes = new TreeSet<>();
		
		conjuntoParticipantes.add("Zoilo");
		conjuntoParticipantes.add("Pepe");
		conjuntoParticipantes.add("Pepe");
		conjuntoParticipantes.add("María");
		conjuntoParticipantes.add("Luisa");
		
		for (String participante : conjuntoParticipantes) {
			System.out.println(participante);
		}
	}

}
