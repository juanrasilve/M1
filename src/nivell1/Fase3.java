package nivell1;

public class Fase3 {
	
	public static boolean booleanAnyTraspas= false;
	public static int any=1948;
	public static int any_naixement= 1968;
	public static int num_anys_traspas = 0;
	
	public static String frase1="";
	public static String frase2="";

	public static void main(String[] args) {
		
		any_traspas(booleanAnyTraspas,any,any_naixement,num_anys_traspas);
		
	}
	
	public static void any_traspas(boolean booleanAnyTraspas, int any, int any_naixement, int num_anys_traspas) {
		for (int i =any; i<=any_naixement;i=i+4) {
			num_anys_traspas++;
			
			if (i==any_naixement) {
				booleanAnyTraspas = true;
				frase1 = "L'any "+ i +" es de traspàs";
				System.out.print(frase1);
				break;
			}
		}
		if (!booleanAnyTraspas) {
			frase2 = "L'any "+ any_naixement +" no es de traspàs";
			System.out.print(frase2);
		}
	}

}
