package Otrostemas;

public class Jugarralgomain {

	public static void main(String[] args) {
		
		
		
		jugarralgo MiJugarAlgo = (x,y)-> {
			
			System.out.println("Implementando expresiones Lambda");
			System.out.println("X="+x);
			System.out.println("Y="+y);
			
			System.out.println("Ya inicio el juego!");
		};

		
		MiJugarAlgo.jugar(3,7);
		
		
		OtraClaseJuego MiInstanciaJuego = new OtraClaseJuego();
		MiInstanciaJuego.jugar();
	}
	
	static class OtraClaseJuego implements jugarralgo{
		public void jugar() {
			
			System.out.println("No implementando expresiones Lambda");
			System.out.println("Ya inicio el juego!");
		}
		
		
		
	}
}
