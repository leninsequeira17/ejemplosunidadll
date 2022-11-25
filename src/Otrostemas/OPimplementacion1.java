package Otrostemas;

public class OPimplementacion1 implements Operaciones {
    int x=10,y=15;
	
	@Override
	public int sumar(int x, int y ) {
		
		return x+y;
	}
	
	public int ObtenerX() {
		
		return x;
	}
	
	public static void main(String[]args) {
		
		System.out.println(new OPimplementacion1().ObtenerX());
		new OPimplementacion1().Mostrar();
		Operaciones.MostrarY();
	}
}