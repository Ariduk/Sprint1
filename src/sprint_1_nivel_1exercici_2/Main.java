package sprint_1_nivel_1exercici_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche1 = new Coche("Aveo", 2500);
		Coche coche2 = new Coche ("Yaris", 3000);
		
		System.out.println(coche1);		System.out.println(coche2);
		
		
		coche1.setModelo("Cruzy");
		
		System.out.println(coche1);
		System.out.println(coche2);
		
		//MODELO ESTATICO FRENAR
		Coche.frenar();
		
		//METODO NO ESTATICO ACELERAR
		coche1.acelerar();
	}

}
