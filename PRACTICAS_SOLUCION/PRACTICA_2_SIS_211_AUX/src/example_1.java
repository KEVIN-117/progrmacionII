import java.util.Arrays;
import java.util.Scanner;

public class example_1 {

	public static void main(String[] args) {
		float decimal;
		float multiplicador , contador = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("");
		float number = entrada.nextFloat();
		//decimal = number %1;
		for(float i=number; i>=0; i++) {
			multiplicador =number*10;
			contador ++;
			if(multiplicador==0) {
				System.out.println(multiplicador);
			}
		}

	}
}
