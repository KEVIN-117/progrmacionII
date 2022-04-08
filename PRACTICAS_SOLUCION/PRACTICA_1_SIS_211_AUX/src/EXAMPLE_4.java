import java.util.Scanner;

public class EXAMPLE_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=entrada.nextInt();
		int cen = (numero-(numero%100))/100;
		int res = numero%100;
		int dec = (res-(res%10))/10;
		int uni = res%10;
		if(uni==0 && dec==0) {
			System.out.print("cien");
		}
		System.out.println(numero);
		System.out.println(cen );
		//System.out.println(res);
		System.out.println(dec);
		System.out.println(uni);
	}

}
