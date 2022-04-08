import java.util.Scanner;

public class EXAMPLE_5 {
	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.print("");
		int numero= reader.nextInt();
		int divisores=0;
		for(int i=1; i<=numero; i++) {
			if(numero%i==0) {
				divisores++;
			}
		}if(divisores==2) {
			System.out.print("PRIMO");
		}else {
			System.out.print("NO PRIMO");
		}
	}
}
