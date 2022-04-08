
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example_1 extends JFrame {
	private JPanel panel;
	private JTextField texto1, texto2, texto3;
	private JButton button;
	private JTextArea resultado;
	public static void main(String[] args) {
		new Example_1();
		
	}
	//Contructor de la clase
	public Example_1() {
		
		this.setSize(500,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		IniciarComponentes();
		
		
	}	
	private void IniciarComponentes() {
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
		//NUMERO 1
		texto1 = new JTextField(); 
		texto1.setBounds(10, 30, 100, 30);
		texto1.setForeground(Color.CYAN);
		texto1.setEditable(true);
		texto1.setBackground(Color.BLACK);
		
		//NUMERO 2
		texto2 = new JTextField();
		texto2.setBounds(10, 100, 100, 30);
		texto2.setBackground(Color.BLACK);
		texto2.setForeground(Color.CYAN);
		
		//NUMERO 3
		texto3 = new JTextField();
		texto3.setBounds(10, 200, 100, 30);
		texto3.setBackground(Color.BLACK);
		texto3.setForeground(Color.CYAN);
		
		//AÑADIENDO LOS BOTONES AL PANEL
		panel.add(texto1);
		panel.add(texto2);
		panel.add(texto3);
	}
	private void Botones() {
		button = new JButton("MAYOR");
		button.setBounds(200, 100, 100, 30);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		panel.add(button);
	}
	private void Area_De_Resultado() {
		resultado = new JTextArea();
		resultado.setBounds(350, 100, 100, 30);
		resultado.setBackground(Color.BLACK);
		resultado.setForeground(Color.CYAN);
		panel.add(resultado);
		Accion_resultado();
	}
	private void Accion_resultado() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1 = Integer.valueOf(texto1.getText());
				int num2 = Integer.valueOf(texto2.getText());
				int num3 = Integer.valueOf(texto3.getText());
				if(num1 > num2 && num1 > num3) {
					resultado.setText(String.valueOf(num1));
				}
				else if(num2 > num1 && num2 > num3) {
					resultado.setText(String.valueOf(num2));
				}
				else {
					resultado.setText(String.valueOf(num3));
				}
			}
			
		});
	}
}

