import java.util.Scanner;

public class Pregunta_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		//String A[] = frase.split(" ");
		for(int i = 0; i<frase.length(); i++) {
			if(frase.charAt(i) == 'a') {
				System.out.println(frase);
			}
			//System.out.println(A[i].charAt(A[i].length()-1)+ " ");
		}
		System.out.println();
	}

}
