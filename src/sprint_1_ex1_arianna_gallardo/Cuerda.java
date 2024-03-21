package sprint_1_ex1_arianna_gallardo;

public class Cuerda extends Instrumento{

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
		
	}
	public String tocar() {
		return "Esta sonando una " + this.getNombre();
	}
	

}
