import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>cadenas = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		System.out.print("");
		int N = entrada.nextInt();
		for(int i = 0; i <= N; i++) {
			System.out.print("");
			String cadena = entrada.nextLine();
			cadenas.add(cadena);
		}
		Collections.sort(cadenas);
		for(String nombres:cadenas) {
			System.out.print(nombres+ " ");
		}
	}
}//ANA PEDRO LUISA CARLOS MARCO ALVARO MARIA
