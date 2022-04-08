
public class Vehiculo {
	private String placa;
	private String marca;
	private Integer precio;
	public Vehiculo(String placa, String marca, Integer precio) {
		this.placa = placa;
		this.marca = marca;
		this.precio = precio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v1 = new Vehiculo("2453HTP", "NISSAN", 1000);
		Vehiculo v2 = new Vehiculo("623BIG", "TOYOTA", 5000);
		
		System.out.println(v2.getPlaca() + " " + v2.getMarca() + " " + v2.getPrecio());
		v1.setPrecio(9000);
		System.out.println(v1.getPlaca() + " " + v1.getMarca() + " " + v1.getPrecio());

	}

}
