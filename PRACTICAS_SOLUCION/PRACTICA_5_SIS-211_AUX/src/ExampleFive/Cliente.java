package ExampleFive;

public class Cliente {
	private String NombreDelCliente;
	private Integer TiempoDelContrato;
	
	public Cliente(String NombreDelCliente, Integer TiempoDelContrato) {
		this.NombreDelCliente = NombreDelCliente;
		this.TiempoDelContrato = TiempoDelContrato;
	}
	public String getNombreDelCliente() {
		return NombreDelCliente;
	}
	public void setNombreDelCliente(String nombreDelCliente) {
		NombreDelCliente = nombreDelCliente;
	}
	public Integer getTiemppoDelContrato() {
		return TiempoDelContrato;
	}
	public void setTiemppoDelContrato(Integer tiemppoDelContrato) {
		TiempoDelContrato = tiemppoDelContrato;
	}
}
