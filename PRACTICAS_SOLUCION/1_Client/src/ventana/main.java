package ventana;
import java.awt.*;

public class main {
	
	public static class MainLayouts extends javax.swing.JFrame {
	    // Variables                     
	    private javax.swing.JButton BotonEnviar;
	    private javax.swing.JTextField CampoEnviarMensage;
	    public static javax.swing.JTextArea CampoMensajes;
	    private javax.swing.JLabel N_IP;
	    private javax.swing.JLabel N_mensage;
	    private javax.swing.JPanel Panel;
	    private javax.swing.JButton botonConectar;
	    private javax.swing.JTextField campoIP;
	    private javax.swing.JScrollPane jScrollPane1;
	    // End of variables declaration 
	    //Contructor de la clase
	    public MainLayouts() {
	        initComponents();
	    }
                         
	    private void initComponents() {

	        Panel = new javax.swing.JPanel();
	        campoIP = new javax.swing.JTextField();
	        botonConectar = new javax.swing.JButton();
	        N_IP = new javax.swing.JLabel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        CampoMensajes = new javax.swing.JTextArea();
	        CampoEnviarMensage = new javax.swing.JTextField();
	        BotonEnviar = new javax.swing.JButton();
	        N_mensage = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
	        setResizable(false);

	        Panel.setBackground(new java.awt.Color(0, 0, 0));

	        campoIP.setBackground(new java.awt.Color(0, 102, 153));
	        campoIP.setForeground(Color.white);
	        campoIP.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

	        botonConectar.setForeground(new java.awt.Color(0, 153, 204));
	        botonConectar.setText("conectar");

	        N_IP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
	        N_IP.setForeground(new java.awt.Color(0, 153, 204));
	        N_IP.setText("Ingrese su IP");

	        CampoMensajes.setBackground(new java.awt.Color(0, 102, 153));
	        CampoMensajes.setColumns(20);
	        CampoMensajes.setRows(5);
	        CampoMensajes.setForeground(Color.white);
	        jScrollPane1.setViewportView(CampoMensajes);

	        CampoEnviarMensage.setBackground(new java.awt.Color(0, 102, 153));
	        CampoEnviarMensage.setFont(new java.awt.Font("verdana", 0, 12)); // NOI18N
	        CampoEnviarMensage.setForeground(Color.white);

	        BotonEnviar.setForeground(new java.awt.Color(0, 153, 204));
	        BotonEnviar.setText("Enviar");

	        N_mensage.setBackground(new java.awt.Color(0, 0, 0));
	        N_mensage.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
	        N_mensage.setForeground(new java.awt.Color(0, 153, 204));
	        N_mensage.setText("Ingrese su mensaje");

	        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
	        Panel.setLayout(PanelLayout);
	        PanelLayout.setHorizontalGroup(
	            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(PanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
	                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(PanelLayout.createSequentialGroup()
	                                .addComponent(N_mensage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(CampoEnviarMensage))
	                            .addGroup(PanelLayout.createSequentialGroup()
	                                .addGap(12, 12, 12)
	                                .addComponent(N_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(campoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(PanelLayout.createSequentialGroup()
	                                .addComponent(botonConectar)
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
	                                .addGap(0, 0, Short.MAX_VALUE)
	                                .addComponent(BotonEnviar))))
	                    .addComponent(jScrollPane1))
	                .addContainerGap())
	        );
	        PanelLayout.setVerticalGroup(
	            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(PanelLayout.createSequentialGroup()
	                .addGap(14, 14, 14)
	                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(campoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(botonConectar)
	                    .addComponent(N_IP))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(CampoEnviarMensage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(BotonEnviar)
	                    .addComponent(N_mensage))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        );

	        pack();
	    }// </editor-fold>                                       


	    public static void main(String args[]) {
	       
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MainLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MainLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MainLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MainLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                MainLayouts ventana = new MainLayouts();//
	                ventana.setVisible(true);
	                ventana.setLocationRelativeTo(null);
	            }
	        });
	    }

                 
	}


}

