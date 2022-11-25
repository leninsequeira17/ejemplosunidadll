package Otrostemas;

public class OPimplementacion2 implements Operaciones {
int x=10, y=15;
	
	@Override
	public int sumar(int x, int y) {
		
		return x+y+10;
	}
	
	@Override
	public int ObtenerX() {
		return x;
	}
}