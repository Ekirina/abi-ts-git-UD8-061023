package Ejercicio3;

public class Electrodomestico {

	protected String color;
	protected char energia;
	protected double precioBase;
	protected double peso;
	
	protected final String COLOR = "BLANCO";
	protected final char ENERGIA = 'F';
	protected final double PRECIOBASE = 100;
	protected final double PESO = 5;

	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.energia = ENERGIA;
		this.peso = PESO;
	}
	
	public Electrodomestico(double p, double k) {
		this.precioBase = p;
		this.peso = k;
		this.color = COLOR;
		this.energia = ENERGIA;
	}
	
	public Electrodomestico(char energy, double p, double k, String colour) {
		this.color = elegirColor(colour);
		this.peso = k;
		this.precioBase = p;
		this.energia = energy;
	}

	public String elegirColor(String colour) {
			if (colour.equals (COLOR)) {
				System.out.println("El color escogido es el blanco");
				
			} else if (colour.equalsIgnoreCase("negro")||colour.equalsIgnoreCase("rojo")||colour.equalsIgnoreCase("azul")||colour.equalsIgnoreCase("gris")) {;
				System.out.println("El color escogido es: "+colour);

			}else{
				colour=COLOR;
				System.out.println("Tu color por defecto es el blanco");
			}
		return colour;
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [color=" + color + ", energia=" + energia + ", precioBase=" + precioBase + ", peso="
				+ peso + "]";
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = elegirColor(color);
	}
}
