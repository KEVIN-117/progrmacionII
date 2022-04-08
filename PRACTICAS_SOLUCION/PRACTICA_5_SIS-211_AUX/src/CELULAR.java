
public class CELULAR {
	String marca;
	Integer numero;
	Integer precio;
	public CELULAR(String marca, Integer numero, Integer precio) {
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
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CELULAR C1 = new CELULAR("SAMSUNG", 77234345, 700);
		CELULAR C2 = new CELULAR("NOKIA", 68234342, 200);
		CELULAR C3 = new CELULAR("LG", 66557843, 300);
		
		System.out.println(C1.getMarca() + " " + C1.getNumero() + " " + C1.getPrecio() + "\n");
		C2.setMarca("MOTOROLA");
		
		System.out.println(C2.getMarca() + " " + C2.getNumero() + " " + C2.getPrecio() + "\n");
		
		C3.setPrecio(400);
		System.out.println(C3.getMarca() + " " + C3.getNumero() + " " + C3.getPrecio() + "\n");
		
	}
	
}

