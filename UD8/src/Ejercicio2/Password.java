package Ejercicio2;

public class Password {
	protected int longitud;
	private String contraseña;
	
	protected final int LONGITUD = 8;
	protected final String CONTRASEÑA = "";
	
	public Password(){
		this.longitud = LONGITUD;
		this.contraseña = CONTRASEÑA;
	}
	
	public Password (int num) {
		this.longitud = (num);
		generador(num);
		}
	
	public void generador(int num) {		
	String opciones = "abcdefghijklmnopqrstuvwyxzABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789";
	for(int i = 0; i<num; i++) {
        int contraseña = (int)(Math.random()*opciones.length()-1);
        char opcionesRandom = opciones.charAt(contraseña);
        this.contraseña += opcionesRandom;
  
		}
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
}
