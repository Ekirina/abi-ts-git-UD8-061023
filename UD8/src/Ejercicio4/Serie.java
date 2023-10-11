package Ejercicio4;

public class Serie {

	protected String title;
	protected int numTemp;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	protected final int NUMTEMP = 3;
	protected final boolean ENTREGADO = false;
	protected final String TITLE = "D'Artacán y los tres mosqueperros";
	protected final String GENERO = "animación";
	protected final String CREADOR = "BRB Internacional";
	
	public Serie() {
		this.numTemp = NUMTEMP;
		this.entregado = ENTREGADO;
		this.title = TITLE;
		this.genero = GENERO;
		this.creador = CREADOR;
	}
		
	public Serie(String titulo, String creator) {
		this.title = "titulo";
		this.creador = "creator";
		this.numTemp = NUMTEMP;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
	}
	
	public Serie(String titulo, int numero, String creator, String gen) {
		this.entregado = ENTREGADO;
		this.numTemp = numero;
		this.title = titulo;
		this.genero = gen;
		this.creador = creator;
	}

	public void setTitle(String titulo) {
		this.title = titulo;
	}

	public void setCreador(String creator) {
		this.creador = creator;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Serie [title=" + title + ", numTemp=" + numTemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
}
