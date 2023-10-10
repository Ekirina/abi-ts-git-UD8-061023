package Ejercicio3;

public class mainApp {

	public static void main(String[] args) {
		Electrodomestico electro1 = new Electrodomestico('A', 90, 51, "lila");
		
		electro1.setColor("rojo");
		
		System.out.println(electro1);
		
		electro1.setColor("amarillo");
		
		System.out.println(electro1);

	}
}
