import java.util.Scanner;
public class EXAMPLE_3 {
	public static void main(String[] args) 
	{
		Scanner numeros = new Scanner(System.in);
		int sumaPatos=0, sumaNopatos=0;
		int numerosSuma;
		System.out.print("");
		int numerosN = numeros.nextInt();
		for(int i = 1; i <= numerosN; i++) 
		{
			System.out.print("");
			numerosSuma= numeros.nextInt();
			if(numerosSuma%2==0 && numerosSuma>10) 
			{
				sumaPatos += numerosSuma;
			}
			if(numerosSuma%2!=0 || numerosSuma<10) 
			{
				sumaNopatos +=numerosSuma;
			}
		}
		if(sumaPatos!=0) 
		{
			System.out.print("Patos " + sumaPatos);
		}
		if(sumaNopatos!=0) 
		{
			System.out.print(" No patos " + sumaNopatos);
		}
	}
}
