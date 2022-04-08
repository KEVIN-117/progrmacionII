import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class EXAMPLE_7 {
	public static void main(String[] args) {

		Scanner n=new Scanner (System.in);
		System.out.print("");
		int number=n.nextInt();
		int num_1=0; 
		int num_2=1; 
		int sum= 0 ;
		
		for(int i=1; i<=number; ++i) {
			num_1=num_2;
			num_2=sum; 
			sum=num_1 + num_2; 
			System.out.print("-- " + sum) ;
			
		}
	}
}