package Funciones;

public class Funciones {
	
	static void Dibujar() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
			for (int j = i; j >= 0; j--) {
				System.out.print("-");
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		//LLamada del metodo 
		Dibujar();
		Dibujar();
		Dibujar();
		Dibujar();
	}
}
