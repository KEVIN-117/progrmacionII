package ExampleFive;

public class ClienteA extends Cliente{
	private Integer MontoMensualAPagar;
	public ClienteA(String NombreDelCliente, Integer TiempoDelContrato, Integer MontoMensualAPagar) {
		super(NombreDelCliente, TiempoDelContrato);
		// TODO Auto-generated constructor stub
		this.MontoMensualAPagar = MontoMensualAPagar;
	}
	public Integer getMontoMensualAPagar() {
		return MontoMensualAPagar;
	}
	public void setMontoMensualAPagar(Integer montoMensualAPagar) {
		MontoMensualAPagar = montoMensualAPagar;
	}
}