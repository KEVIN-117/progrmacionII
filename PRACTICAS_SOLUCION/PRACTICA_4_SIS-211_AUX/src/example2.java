import java.util.ArrayList;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		for(int i=0; i<=N; i++) {
			System.out.print("");
			String nombre= entrada.nextLine();
			String buscar = "SA";
			nombres.add(nombre);
			for(int j=0; j<nombres.size() ; j++) {
				if(nombres.contains(i)) {
					System.out.println(nombres);
				}
				
			}
			System.out.println();
			
		}

	}

}//"ANA", "LUIS", "LUISA", "PEDRO", "ISABEL", "SANDRO", "MARIA"
