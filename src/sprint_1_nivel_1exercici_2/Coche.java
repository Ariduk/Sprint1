package sprint_1_nivel_1exercici_2;

public class Coche {
	//ATRIBUTOS
	private static final String MARCA = "Chevrolet";
	private static String modelo;
	private final int potencia;
	
	//METODO CONSTRUCTOR
	public Coche(String modelo, int potencia) {		
		this.modelo = modelo;
		this.potencia = potencia;
	}
	//GETTER	
	public String getMarca() {
		return this.MARCA;
	}
	public String getModelo() {
		return this.modelo;		
	}
	//SETTER
	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
	
	public static void frenar() {
		System.out.println("El coche esta frenando");
	}
	
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	public String toString() {
		return"El coche marca " + MARCA + " y modelo " + modelo + " con una potencia " + potencia+ " esta acelerando";
	}
}




