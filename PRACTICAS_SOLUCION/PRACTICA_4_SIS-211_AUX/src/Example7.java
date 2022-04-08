import java.util.ArrayList;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int number = input.nextInt();
		result(number);
	}
	public static int result(int number) {
		int resultado = 0;
		int sumaPares = 0;
		int digitos2 = Integer.toString(number).length();
		while(number > 0) {
			resultado = number % 10;
			number = number / 10;
			
			System.out.println("Resultado " + resultado);
			System.out.println("Number " + number);
		}
		while(number > 1){
			int digito = number % 10;
			number = (number/10);
			if(digito % 2 == 0){
				sumaPares = sumaPares + digito;
			}
			
		}
		System.out.println("total Pares " + sumaPares);
		System.out.println((float)resultado/digitos2 );
		return 0;
		
	}

}
