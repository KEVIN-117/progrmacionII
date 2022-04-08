import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>nombres = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		System.out.println();
		int N = entrada.nextInt();
		for(int i=0; i<N; i++) {
			System.out.print("");
			String nombre = entrada.nextLine();
			nombres.add(nombre);
			System.out.println(nombres);
			for(int  j=0; j < nombres.size(); j++) {
				for(int k=0; k<nombres.size(); k++) {
					if(j!=k) {
						System.out.println(nombre);
					}
				}
			}
		}
	}

}//ANA LUIS LUISA PEDRO ANA PACO LUISA
