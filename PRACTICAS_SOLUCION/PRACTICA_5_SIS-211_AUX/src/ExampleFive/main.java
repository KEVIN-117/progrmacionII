package ExampleFive;

import java.io.FileWriter;
import java.io.IOException;
public class main {

	public static void main(String[] args) {
		
		String escribir = ("E:\\KEVIN RODRIGUEZ\\INGENIERIA DE SISTEMAS KEVIN\\SEMESTRE II 2021\\TECNICAS DE PROGRAMACION II- SIS-211\\practicas");
		// TODO Auto-generated method stub
		/*ClienteA c1 = new ClienteA("LUIS", 18, 150);
		ClienteB c2 = new ClienteB("MARCO", 12, 5);
		c2.setTiemppoDelContrato(24);
		c1.setMontoMensualAPagar(300);
		System.out.println(c1.getNombreDelCliente() + " " + c1.getTiemppoDelContrato() + " " + c1.getMontoMensualAPagar());
		System.out.println(c2.getNombreDelCliente() + " " + c2.getTiemppoDelContrato() + " " + c2.getMontoMensualAPagar());
		System.out.println(c2.getNombreDelCliente());
		*/
		try {
			FileWriter escritura = new FileWriter("E:/KEVIN RODRIGUEZ/INGENIERIA DE SISTEMAS KEVIN/SEMESTRE II 2021/TECNICAS DE PROGRAMACION II- SIS-211/practicas", true);
			escritura.write("\n");
			/*for(int i=0; i<escribir.length(); i++) {
				escritura.write(escribir.charAt(i));
				
			}*/
			escritura.write(escribir);
			escritura.close();
			System.out.println("Datos Enviados");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace("ERROR");
			System.out.println("ERROR");
			System.out.println(e);
		}

	}

}
