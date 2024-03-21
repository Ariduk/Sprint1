package sprint_1_ex1_arianna_gallardo;

public abstract class Instrumento {

	//ATRIBUTOS
	
	private String nombre = "";
	private int precio = 0;
	
	//COSTRUCTOR
	
	public Instrumento (String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//GETTER
	
	public String getNombre() {
		return this.nombre;
	}
	public int getPrecio() {
		return this.precio;
	}
	//SETTER
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//METODO ABSTRACTO TOCAR()
	
	public abstract String tocar();
	
	public static void metodoEstatico() {
		System.out.println("Metodo estatico");
	}
	//BLOQUES DE INICIALIZACION ESTATICA
	static {
		System.out.println("El metodo estatico ha sido cargado");
	}
}
