import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example_2 extends JFrame{
	private JPanel panel;
	private JTextArea SumaDigitos, SumaPares, SumaImpares;
	private JButton button;
	private JTextField numero;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	public static void main(String[] args) {
		new Example_2();
		
	}
	//Contructor de la clase
	public Example_2() {
		
		this.setSize(500,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		IniciarComponentes();
		Etiquetas();
		
	}	
	private void Etiquetas() {
		// TODO Auto-generated method stub
		etiqueta1 = new JLabel("Suma de los Digitos:");
		etiqueta1.setBounds(226, 30, 150, 30);
		etiqueta1.setForeground(Color.CYAN);
		etiqueta1.setFont(new Font("Georga", 0, 12));
		panel.add(etiqueta1);
		
		etiqueta2 = new JLabel("Suma digitos pares:");
		etiqueta2.setBounds(226, 100, 150, 30);
		etiqueta2.setForeground(Color.CYAN);
		etiqueta2.setFont(new Font("Georga", 0, 12));
		panel.add(etiqueta2);
		etiqueta2.revalidate();
		etiqueta2.repaint();
		
		etiqueta3 = new JLabel("Suma digitos impares:");
		etiqueta3.setBounds(215, 175, 150, 30);
		etiqueta3.setForeground(Color.CYAN);
		etiqueta3.setFont(new Font("Georga", 0, 12));
		panel.add(etiqueta3);
		etiqueta3.revalidate();
		etiqueta3.repaint();
	}
	private void IniciarComponentes() {
		// TODO Auto-generated method stub
		panel = new JPanel();
		panel.setBounds(0, 0, 500, 300);
		panel.setBackground(new Color(75, 119, 141));
		panel.setLayout(null);
		this.add(panel);
		Numeros();
		Botones();
		Area_De_Resultado();
		panel.revalidate();
		panel.repaint();
	}
	private void Numeros() {
		// TODO Auto-generated method stub
		numero = new JTextField ();
		numero.setBounds(10, 100, 100, 30);
		numero.setBackground(Color.BLACK);
		numero.setForeground(Color.CYAN);
		panel.add(numero);
		
	}
	private void Botones() {
		// TODO Auto-generated method stub
		button = new JButton("CALCULAR");
		button.setBounds(115, 100, 100, 30);
		button.setFont(new Font("Georga", 0, 12));
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		panel.add(button);
	}
	private void Area_De_Resultado() {
		// TODO Auto-generated method stub
		//NUMERO 1
		SumaDigitos = new JTextArea(); 
		SumaDigitos.setBounds(350, 30, 100, 30);
		SumaDigitos.setForeground(Color.CYAN);
		SumaDigitos.setEditable(true);
		SumaDigitos.setFont(new Font("Georgia", 0, 12));
		SumaDigitos.setBackground(Color.BLACK);
				
		//NUMERO 2
		SumaPares = new JTextArea();
		SumaPares.setBounds(350, 100, 100, 30);
		SumaPares.setFont(new Font("Georgia", 0, 12));
		SumaPares.setBackground(Color.BLACK);
		SumaPares.setForeground(Color.CYAN);
				
		//NUMERO 3
		SumaImpares = new JTextArea();
		SumaImpares.setBounds(350, 175, 100, 30);
		SumaImpares.setBackground(Color.BLACK);
		SumaImpares.setFont(new Font("Georgia", 0, 12));
		SumaImpares.setForeground(Color.CYAN);	
		panel.add(SumaDigitos);
		panel.add(SumaPares);
		panel.add(SumaImpares);
		Accion_resultado();
	}
	private void Accion_resultado() {
		button.addActionListener((accion) -> {
			int numeros = Integer.valueOf(numero.getText());
			int resultado = 0;
			while(numeros > 0) {
				resultado += numeros % 10;
				numeros = numeros / 10;
			}
			SumaDigitos.setText(String.valueOf(resultado));
		});
		button.addActionListener((accion) -> {
			int numeros = Integer.valueOf(numero.getText());
			int sumaPares = 0;
			int sumaImpares = 0;
			while(numeros > 1){
				int digito = numeros % 10;
				numeros = (numeros/10);
				if(digito % 2 == 0){
					sumaPares = sumaPares + digito;
				}
			}
			SumaPares.setText(String.valueOf(sumaPares));
		});
		button.addActionListener((accion) -> {
			int numeros = Integer.valueOf(numero.getText());
			int sumaImpares = 0;
			while(numeros > 0){
				int digito = numeros % 10;
				numeros = (numeros/10);
				if(digito % 2 != 0){
					sumaImpares = sumaImpares + digito;
				}
			}
			SumaImpares.setText(String.valueOf(sumaImpares));
		});
	}
}

