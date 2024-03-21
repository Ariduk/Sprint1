package sprint_1_ex1_arianna_gallardo;

public class SPRINT_1_EX1_ARIANNA_GALLARDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Viento viento = new Viento ("Flauta", 20);
		Cuerda cuerda = new Cuerda ("Guitarra", 100);
		Percusion percusion = new Percusion ("Bateria", 3000);
		
		System.out.println(viento.tocar());
		System.out.println(cuerda.tocar());
		System.out.println(percusion.tocar());
		
		Instrumento.metodoEstatico();
	}

}
