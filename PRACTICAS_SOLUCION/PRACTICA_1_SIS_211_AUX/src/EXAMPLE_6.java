import java.util.Scanner;
import java.util.Arrays;

public class EXAMPLE_6 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int n=entrada.nextInt();
		double estatura, suma1=0;
		int edad, suma2=0;
		System.out.println("digite: ");
		int estudiantesN=entrada.nextInt();
		for(int i = 1; i <= estudiantesN; i++) {
			System.out.print("");
			edad=entrada.nextInt();
			System.out.print("");
			estatura=entrada.nextDouble();
			double[] lista1 ={estatura};
			Arrays.sort(lista1);
			for(int j=lista1.length; j>=0; j++) {
				suma1+=j;
			}
			System.out.print(suma1);
			int[] lista2= {edad};
			Arrays.sort(lista2);
			for(int k=lista2.length; k>=0; k++) {
				suma2+=k;
			}
			System.out.print(suma2);
		}
	}
}
