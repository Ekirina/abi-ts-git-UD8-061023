package Ejercicio1;

public class Persona {
		
	private String nombre;
	protected int edad;
	private String dni;
	private char sexo;
	protected double peso;
	protected double altura;	

	protected final String NOMBRE = "";
	protected final int EDAD = 0;
	protected final String DNI = "";
	protected final char SEXODEFECTO = 'H';
	protected final double PESO = 0;
	protected final double ALTURA = 0;	
	
	public Persona() {
		this.nombre = NOMBRE;
		this.edad = EDAD;
		this.sexo = SEXODEFECTO;
		this.peso = PESO;
		this.altura = ALTURA;
	}
	
	public Persona(String name, int años, char xyxx) {
		this.nombre = name;
		this.edad = años;
		this.sexo = hombremujer(xyxx);
		this.peso = PESO;
		this.altura = ALTURA;
	}
	
	public Persona(String name, int años, String carnet, char xyxx, double k, double h) {
		this.nombre = name;
		this.edad = años;
		this.dni = carnet;
		this.sexo = hombremujer(xyxx);
		this.peso = k;
		this.altura = h;
		
	}
	
	public char hombremujer(char xyxx) {
		
		/*if (sexo !='H' || sexo != 'M') {
			xyxx = SEXODEFECTO;	
			}
		return xyxx;*/
		
		/*He dejado las dos sentencias de función porque funcionan las dos, porque no me
		 * había dado cuenta que tenía metido el setSexo en el MainApp. Al llegar a hacer
		 * dos tipos diferentes de comprobación del char, me parece de utilidad guardarlo para
		 * cerciorarme en otros proyectos con alguna sentencia similar.
		 */
		if (xyxx == 'M') {
		}else {
			xyxx = (SEXODEFECTO);
		}
		return xyxx;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}	