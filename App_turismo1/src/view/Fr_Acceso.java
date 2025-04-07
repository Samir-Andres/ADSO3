package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Acc_Promotores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Fr_Acceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JPasswordField txtcontraseña;
	
	Acc_Promotores in = new Acc_Promotores();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fr_Acceso frame = new Fr_Acceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fr_Acceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 151, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(206, 97, 125, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Documento");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 16));
		lblNewLabel.setBounds(75, 97, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setFont(new Font("Serif", Font.BOLD, 16));
		lblContrasea.setBounds(75, 164, 121, 14);
		contentPane.add(lblContrasea);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211621_c_right_arrow_icon.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				try {
					in.ControlAcceso(Integer.parseInt(txtdocumento.getText()), txtcontraseña.getText());
				} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, "No has ingresado datos");
				}
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton.setBounds(206, 208, 112, 29);
		contentPane.add(btnNewButton);
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setEchoChar('*');
		txtcontraseña.setBounds(206, 158, 125, 20);
		contentPane.add(txtcontraseña);
		
		JLabel lblNewLabel_1 = new JLabel("Control de acceso");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_1.setBounds(176, 27, 172, 29);
		contentPane.add(lblNewLabel_1);
	}
}
