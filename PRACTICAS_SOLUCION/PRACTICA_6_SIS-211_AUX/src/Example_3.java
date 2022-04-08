import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example_3 extends JFrame{
	private JPanel panel;
	private JTextField Palabra1, Palabra2, palabra3;
	private JButton button;
	private JTextArea PalabrasOrdenados;
	private ArrayList<String> palabras;
	public static void main(String[] args) {
		new Example_3();
		
	}
	//Contructor de la clase
	public Example_3() {
		
		this.setSize(600,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		IniciarComponentes();
		
		
	}	
	private void IniciarComponentes() {
		// TODO Auto-generated method stub
		panel = new JPanel();
		panel.setBounds(0, 0, 600, 500);
		panel.setBackground(new Color(75, 119, 141));
		panel.setLayout(null);
		this.add(panel);
		Palabras();
		Botones();
		Area_De_Resultado();
		panel.revalidate();
		panel.repaint();
	}
	private void Palabras() {
		// TODO Auto-generated method stub
		//PALABRA 1
		Palabra1 = new JTextField(); 
		Palabra1.setBounds(5, 10, 170, 30);
		Palabra1.setForeground(Color.CYAN);
		Palabra1.setEditable(true);
		Palabra1.setFont(new Font("Georgia", 0, 12));
		Palabra1.setBackground(Color.BLACK);
				
		//PALABRA 2
		Palabra2 = new JTextField();
		Palabra2.setBounds(200, 10, 170, 30);
		Palabra2.setFont(new Font("Georgia", 0, 12));
		Palabra2.setBackground(Color.BLACK);
		Palabra2.setForeground(Color.CYAN);
				
		//PALABRA 3
		palabra3 = new JTextField();
		palabra3.setBounds(425, 10, 160, 30);
		palabra3.setBackground(Color.BLACK);
		palabra3.setFont(new Font("Georgia", 0, 12));
		palabra3.setForeground(Color.CYAN);	
		panel.add(Palabra1);
		panel.add(Palabra2);
		panel.add(palabra3);
			
			
	}
	private void Botones() {
		// TODO Auto-generated method stub
		button = new JButton("ORDENAR");
		button.setBounds(235, 160, 100, 30);
		button.setFont(new Font("Georga", 0, 12));
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		panel.add(button);
	}
	private void Area_De_Resultado() {
		// TODO Auto-generated method stub
		PalabrasOrdenados = new JTextArea ();
		PalabrasOrdenados.setBounds(100, 250, 400, 30);
		PalabrasOrdenados.setBackground(Color.BLACK);
		PalabrasOrdenados.setForeground(Color.CYAN);
		panel.add(PalabrasOrdenados);
		Accion_resultado();
	}
	private void Accion_resultado() {
		// TODO Auto-generated method stub
		button.addActionListener((accion) -> {
			palabras = new ArrayList<>();
			palabras.add(Palabra1.getText());//String.valueOf()
			palabras.add(Palabra2.getText());//String.valueOf()
			palabras.add(palabra3.getText());//String.valueOf()
			Collections.sort(palabras);
			for(Integer i = 0; i <= palabras.size(); i++) {
				PalabrasOrdenados.setText(palabras.get(i));
			}
			
		});
	}
}

