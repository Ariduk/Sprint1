package sprint_1_ex1_arianna_gallardo;

public class Viento extends Instrumento{

	public Viento(String nombre, int precio) {
		super(nombre, precio);
		
	}
	public String tocar() {
		return "Esta sonando una " + getNombre();
	}

}
