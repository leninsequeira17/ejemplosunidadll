package ciclos;

public class Demociclodowhile {

	public static void main(String[] args) {
		int contador = 1;
		do {
			if(contador % 2 == 0) {
				System.out.println("Numero = " + contador);
			}
			contador++;
		}while(contador < 21);

	}

}
