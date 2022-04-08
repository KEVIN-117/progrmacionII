import java.util.ArrayList;
import java.util.Scanner;

public class CELULAR_2 {
	private String marca;
	private String numero;
	private String precio;
	public CELULAR_2(String marca, String numero, String precio) {
		this.marca = marca;
		this.numero = numero;
		this.precio = precio;
		
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public static void main(String[] args) {
		ArrayList<String> celulares = new ArrayList<String>(); 
		Scanner entrada = new Scanner(System.in);
		Integer N = entrada.nextInt();
		for (Integer i = 0; i <= N; i++) {
			System.out.print("");
			String marca  = entrada.nextLine();
			String numero = entrada.nextLine();
			String precio = entrada.nextLine();
			CELULAR_2 celular = new CELULAR_2(marca, numero, precio);
			celulares.add(precio);
		}
		for(String A:celulares) {
			System.out.println(A + "  ");
		}
		
	}
		
}
