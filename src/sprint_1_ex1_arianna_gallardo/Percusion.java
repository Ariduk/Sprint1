package sprint_1_ex1_arianna_gallardo;

public class Percusion extends Instrumento{

	public Percusion(String nombre, int precio) {
		super(nombre, precio);
		
	}
	public String tocar() {
		return "Esta sonando una" + this.getNombre();
	}
}
