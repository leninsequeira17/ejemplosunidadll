package Ciclos;

public class CicloForEach {
		public static void main(String[] args) {
			for(int i=1; i<=10;i++) {
				System.out.println("i="+i);
			}
			System.out.println("-------------------");
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			for(int i: arr) {
				System.out.println("i="+i);
			}
}
}
