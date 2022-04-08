import java.util.Scanner;
import java.util.*;

public class pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.print("");
		int number = input.nextInt();
		result(number);*/
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Kevin");
        nombres.add("Maria");
        nombres.add("Lorena");
        nombres.add("Samuel");

        Collections.sort(nombres);
		for(String nombre: nombres) {
			System.out.println(nombre);
		}

	}
	/*public static int result(int number) {
		//int sumaPares = 0;
        int sumaImpares = 0;
		while(number > 0){
			int digito = number % 10;
			number = (number/10);
			if(digito % 2 != 0){
				//sumaPares = sumaPares + digito;
                sumaImpares = sumaImpares + digito;
			}
			
		}
		//System.out.println("total Pares " + sumaPares);
        System.out.println("total Impares " + sumaImpares);
		return 0;
		
	}*/

}
