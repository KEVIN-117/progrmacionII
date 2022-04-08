package ExampleFive;

public class ClienteB  extends Cliente{
	private Integer MontoMensualAPagar;
	public ClienteB(String NombreDelCliente, Integer TiempoDelContrato, Integer MontoMensualAPagar) {
		super(NombreDelCliente, TiempoDelContrato);
		this.MontoMensualAPagar = MontoMensualAPagar;
		// TODO Auto-generated constructor stub
	}
	public Integer getMontoMensualAPagar() {
		return MontoMensualAPagar;
	}
	public void setMontoMensualAPagar(Integer montoMensualAPagar) {
		MontoMensualAPagar = montoMensualAPagar;
	}
	
}


