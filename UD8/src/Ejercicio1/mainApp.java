package Ejercicio1;

public class mainApp {

	public static void main(String[] args) {
		Persona usuario1 = new Persona();
		
		System.out.println("\n" +usuario1+ "\n");
		
		Persona usuario2 = new Persona("Maite", 64, 'M');
		
		//usuario2.setSexo('');
		
		System.out.println(usuario2);
		
		Persona usuario3 = new Persona ("Gerardo", 62, "12277548T", 'H', 90.50, 1.83);
		
		System.out.println("\n"+usuario3);
	}

}
