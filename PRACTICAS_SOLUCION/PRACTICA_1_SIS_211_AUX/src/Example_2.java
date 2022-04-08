import java.util.Scanner;
public class Example_2 {
	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		System.out.print("");
		int nota=n.nextInt();
		if(nota<5) {
			System.out.print("insuficiente");
		}if(nota==5) {
			System.out.print("suficiente");
		}if(nota==6) {
			System.out.print("bien");
		}if(nota==7 && nota<=8) {
			System.out.print("notable");
		}if(nota>8) {
			System.out.print("sobresaliente");
		}
	}
}
