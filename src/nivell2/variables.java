package nivell2;

public class variables {

	public static void main(String[] args) {
		
		double dec = 3.1416;
		int entero = 3;
		float flotante = 3.1416f;
		String cadena = "3.1416";
		
		double enter = (double)entero;
		System.out.println(enter);
	
		double flotant = (float)flotante;
		System.out.println(flotant);
		
		double cad = Double.parseDouble(cadena);
		System.out.println(cad);
	}
}
