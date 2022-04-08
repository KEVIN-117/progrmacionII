
import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println();
		String cadena1 = entrada.nextLine();
		String cadena2 = entrada.nextLine();
		String cadena3 = entrada.nextLine();
		palabras(cadena1, cadena2, cadena3);

	}
	public static String palabras(String cadena1, String cadena2, String cadena3) {
		int leer = cadena1.length();
		int leer2 = cadena2.length();
		int leer3 = cadena3.length();

		
		if(leer < leer2 && leer< leer3) {
			System.out.println(cadena1);
		}
		if (leer2 < leer && leer2<leer3) {
			System.out.println(cadena2);
		}
		if(leer3 < leer && leer3< leer2) {
			System.out.println(cadena3);
		}
		return " ";
		
	}
}
