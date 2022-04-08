
import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println();
		int resultado=0;
		String numero = entrada.nextLine();
		resultado(numero);
	}
	public static char resultado(String numero) {
		char[] lista = numero.toCharArray();
		Arrays.sort(lista);
		System.out.print(lista[lista.length-1]);
		return lista[0];
	}
}
