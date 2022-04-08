import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("");
		int number = entrada.nextInt();
		int sifra = number%10;
		int curioso =(int) Math.pow(number, 2);
		int cifraCurioso = curioso%10;
		if(sifra == cifraCurioso) {
			System.out.print("True");
		}else {
			System.out.print("False");
		}

	}

}
