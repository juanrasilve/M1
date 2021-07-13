package nivell1;

public class Fase2 {

	private static int any=1948;
	private static int any_naixement= 1968;
	private static int num_anys_traspas = 0;
	
	public static void main(String[] args) {	
		
		System.out.println("Anys de traspas desde "+ any + " fins a " + any_naixement + ":");
		for (int i =any; i<=any_naixement;i=i+4) {
			num_anys_traspas++;
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println("");
		System.out.println("Nombre d'anys de traspas desde "+ any + " fins a " + any_naixement + ":" + num_anys_traspas);
	}

}
