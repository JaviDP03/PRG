package ejemplos;

public class Pizza {
	public static int totalServidas = 0;
	private String tamaño;
	private String receta;

	public Pizza(String tamaño, String receta) {
		super();
		this.tamaño = tamaño;
		this.receta = receta;
		this.totalServidas++;
	}

	@Override
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", receta=" + receta + "]";
	}

}
