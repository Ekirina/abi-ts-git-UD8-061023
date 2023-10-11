package Ejercicio4;

public class mainApp {

	public static void main(String[] args) {
		Serie anime1 = new Serie("Naruto", "Masashi Kishimoto");
		
		anime1.setTitle("Naruto");
		anime1.setCreador("Masashi Kishimoto");
		
		System.out.println(anime1);
		
		
		Serie serieHBO = new Serie ("Tokyo Vice", 1, "J.T. Rogers", "suspense");
		
		serieHBO.setTitle("Tokyo Vice");
		serieHBO.setNumTemp(1);
		serieHBO.setCreador("J.T. Rogers");
		serieHBO.setGenero("suspense");
		
		System.out.println("\n"+serieHBO);
	}
	 	
}	
