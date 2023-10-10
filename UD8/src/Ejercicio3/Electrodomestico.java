package Ejercicio3;

public class Electrodomestico {

	protected String color;
	protected char energia;
	protected double precioBase;
	protected double peso;
	
	private final String COLOR = "BLANCO";
	private final char ENERGIA = 'F';
	private final double PRECIOBASE = 100;
	private final double PESO = 5;

	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.energia = ENERGIA;
		this.peso = PESO;
	}
	
	public static void main(String[] args) {
		
	}

}
