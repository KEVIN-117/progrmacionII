import java.util.Scanner;

public class example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("");
		String palbra1= entrada.nextLine();
		String palbra2= entrada.nextLine();
		String palbra3= entrada.nextLine();
		if(palbra1.equals(palbra2) && palbra1.equals(palbra3)) {
			System.out.println("iguales");
		}
		if(palbra1.equalsIgnoreCase(palbra2)) {
			if(palbra1.equalsIgnoreCase(palbra3)) {
				System.out.println("iguales");
			}
		}
		if(palbra1 == palbra2 && palbra2 != palbra3) {
			System.out.println("casi iguales");
		}
		if(palbra1!= palbra2 && palbra1!=palbra3 ) {
			if(palbra2!= palbra1 && palbra2!=palbra3)
				if(palbra3!= palbra2 && palbra3!=palbra1) {
					System.out.println("no son iguales");
				}
		    }
	   }

}
