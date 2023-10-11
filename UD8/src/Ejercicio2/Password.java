package Ejercicio2;

public class Password {
	protected double longitud;
	private String contraseña;
	
	protected final double LONGITUD = 8;
	protected final String CONTRASEÑA = "";
	
	public Password(){
		this.longitud = LONGITUD;
		this.contraseña = CONTRASEÑA;
	}
	
	public Password (double num) {
		this.longitud = num;
		
		//¿hacer un parse y luego un for?
	}
	

}
