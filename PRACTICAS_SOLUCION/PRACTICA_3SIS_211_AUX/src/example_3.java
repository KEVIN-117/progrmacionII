
/*public class example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
import java.util.Scanner;

public class example_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println();
        frase = entrada.nextLine();
        //Convertimos la frase a un array de caracteres(tipo char)
        char[]conver = frase.toCharArray();
        //Bucle que recorre y muestra la frase invertidamente
        for(int x = conver.length-1; x !=-1; x--){
            System.out.print(conver[x]);
        }
    }
}