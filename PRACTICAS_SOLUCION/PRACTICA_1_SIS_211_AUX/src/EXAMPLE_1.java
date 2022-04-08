import java.util.Scanner;
import java.util.Arrays;

public class EXAMPLE_1 
{
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("");
		int numberOne= numbers.nextInt();
		System.out.println("");
		int numberTwo= numbers.nextInt();
		System.out.println("");
		int numberThree= numbers.nextInt();
		int[] numeros ={numberOne, numberTwo, numberThree};
		Arrays.sort(numeros);
		for(int i=numeros.length-1; i>=0; i--) {
			System.out.print(" "+ numeros[i]);
		}
	}
}