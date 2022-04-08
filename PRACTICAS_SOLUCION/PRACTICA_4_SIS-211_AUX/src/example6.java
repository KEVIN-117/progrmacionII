import java.util.Scanner;

public class example6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println();
		int numero = entrada.nextInt();
		resultado(numero);

	}
	public static int resultado(int numero) {
		int fibo = numero -1;
		System.out.print(fibo);
		return fibo;
		
	}

}
