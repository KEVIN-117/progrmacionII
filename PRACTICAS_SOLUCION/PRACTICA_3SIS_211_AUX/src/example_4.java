import java.util.Scanner;

public class example_4 
{
    public static void main(String[] args){
    	int contador;
    	Scanner entrada= new Scanner(System.in);
    	System.out.println();
    	String frase = entrada.nextLine();
    	String palabras[]=frase.split(" ");
    	//for(int i=0;i<=palabras.length;i++) {
    	String[] a=palabras; 
    	System.out.println(a);
    }
}
/*import java.util.Scanner;
public class example_4{
	public static void main(String arg[]){
	Scanner x=new Scanner(System.in);
	System.out.println("Digite la cadena: "); 
	String cadena=x.nextLine();
	char caracter[]=cadena.toCharArray();
	for(char a:caracter)
	{
	System.out.print(a+" - ");
	}
	//System.out.println("\n");
  }
}*/