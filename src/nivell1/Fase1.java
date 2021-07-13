package nivell1;

public class Fase1 {
	
	public static String nom="Lionel";
	public static String cognom1="Messi";
	public static String cognom2="Cuccittini";
	
	public static int dia=24;
	public static int mes=6;
	public static int any=1987;

	public static void main(String[] args) {
		nom_data(nom,cognom1,cognom2,dia,mes,any);
	}
	
	public static void nom_data(String nom, String cognom1,String cognom2, int dia, int mes,int any) {
		System.out.println(cognom1+ " " + cognom2 + "," + nom);
		System.out.println(dia+ "/" + mes + "/" + any);
	}

}
