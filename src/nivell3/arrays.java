package nivell3;

public class arrays {

	public static void main(String[] args) {

		int array[] = {1,2,3,4,5,6,7,8,9,10};
		
		int array2[] = new int[10];
		
		int j =10;
		
		for (int i=0;i<array.length;i++) {
			array2[i]=array[j-1];
			j--;
		}	
		
		//Imprimir Datos de Nuevo Array
		for (int x=0;x<array2.length;x++) {
			System.out.println(array2[x]);
		}	
	}
}
