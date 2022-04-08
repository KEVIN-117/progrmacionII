import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pregunta_5 extends JFrame{
	private JPanel panel;
	private JTextArea resultado;
	private JButton button;
	private JTextField numero;
	public static void main(String[] args) {
		new Pregunta_5();
		
	}
	//Contructor de la clase
	public Pregunta_5() {
		
		this.setSize(600,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		IniciarComponentes();
		
		
	}	
	private void IniciarComponentes() {
		panel = new JPanel();
		panel.setBounds(0, 0, 600, 300);
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
		numero = new JTextField ();
		numero.setBounds(10, 100, 100, 30);
		numero.setBackground(Color.BLACK);
		numero.setForeground(Color.CYAN);
		panel.add(numero);
		
	}
	private void Botones() {
		button = new JButton("CALCULAR");
		button.setBounds(120, 100, 100, 30);
		button.setFont(new Font("Georgia", 0, 12));
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		panel.add(button);
	}
	private void Area_De_Resultado() {
		//NUMERO 1
		resultado = new JTextArea(); 
		//resultado.setBounds(230, 93, 350, 30);
		resultado.setBounds(230,93,350,30);
		resultado.setForeground(Color.CYAN);
		resultado.setFont(new Font("Georgia", 0, 12));
		resultado.setBackground(Color.BLACK);
		//panel.add(resultado);
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(resultado);
		scroll.setSize(new Dimension(350, 50));
		scroll.setLocation(new Point(230, 93));
		panel.add(scroll);
		Accion_resultado();
	} 
	private void Accion_resultado() {
		button.addActionListener((accion) -> {
			int NumeroFibonacci = Integer.parseInt(numero.getText());
			int num_1=0; 
			int num_2=1; 
			int sum = 0 ;
			resultado.setText(" \n ");
			for(int i=1; i<=NumeroFibonacci; ++i) {
				num_1 = num_2;
				num_2=sum; 
				sum = num_1 + num_2; 
				resultado.append(String.valueOf(sum)+ " - ");
			}
		});
	}
}