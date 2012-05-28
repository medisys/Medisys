package co.uniquindio.software.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import co.uniquindio.software.medisys.entidades.Usuario;
import co.uniquindio.software.medisys.logica.GestorUsuario;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VentanaPrincipal extends javax.swing.JFrame {
	private JButton botonIngresar;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JPasswordField campoContrasena;
	private JTextField campoUsuario;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VentanaPrincipal inst = new VentanaPrincipal();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VentanaPrincipal() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				botonIngresar = new JButton();
				getContentPane().add(botonIngresar);
				botonIngresar.setText("Ingresar");
				botonIngresar.setBounds(336, 167, 97, 23);
				botonIngresar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						String usuario = campoUsuario.getText();
						String password = new String(campoContrasena.getPassword());
						//se valida que hayan ingresado los datos
						if(usuario.equals("") || password.equals("")){
							JOptionPane.showMessageDialog(VentanaPrincipal.this, "Ingrese usuario y contraseña");
							return;
						}
						GestorUsuario gu = new GestorUsuario();
						Usuario u = gu.consultarUsuario(usuario, password);
						if(u == null){
							JOptionPane.showMessageDialog(VentanaPrincipal.this, "El usuario no existe en base de datos");
						
						}else{
							JOptionPane.showMessageDialog(VentanaPrincipal.this, "Bienvenido a Medisys!");
							
						}
						
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Usuario:");
				jLabel1.setBounds(236, 94, 82, 16);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Contraseña:");
				jLabel2.setBounds(236, 122, 82, 16);
			}
			{
				campoUsuario = new JTextField();
				getContentPane().add(campoUsuario);
				campoUsuario.setBounds(336, 91, 166, 23);
			}
			{
				campoContrasena = new JPasswordField();
				getContentPane().add(campoContrasena);
				campoContrasena.setBounds(336, 119, 166, 23);
			}
			pack();
			this.setSize(712, 432);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
