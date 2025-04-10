package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Acc_Promotores;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTable;

public class Jrecuperarcontraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JPasswordField txtcontraseña1;
	private JPasswordField txtcontraseña2;
	private JTable table;
	private final JTable table_1 = new JTable();
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jrecuperarcontraseña frame = new Jrecuperarcontraseña();
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
	public Jrecuperarcontraseña() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 572, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(78, 154, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(194, 71, 141, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtcontraseña1 = new JPasswordField();
		txtcontraseña1.setBounds(194, 125, 141, 20);
		contentPane.add(txtcontraseña1);
		
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Fr_Acceso acc = new Fr_Acceso();
				acc.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 13));
		btnNewButton.setBounds(376, 123, 122, 23);
		contentPane.add(btnNewButton);
		
		txtcontraseña2 = new JPasswordField();
		txtcontraseña2.setBounds(194, 177, 141, 20);
		contentPane.add(txtcontraseña2);
		
		JButton btnrecuperar = new JButton("Recuperar\r\n");
		btnrecuperar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Acc_Promotores pr = new Acc_Promotores();
				
				try {
				pr.recupercontraseña(Integer.parseInt(txtdocumento.getText()), txtcontraseña1.getText(), txtcontraseña2.getText());
				
				String contraseña1 = txtcontraseña1.getText();
				String contraseña2 = txtcontraseña1.getText();
				
				
				
				if(txtcontraseña1.getText().equals(txtcontraseña2.getText())) {
					JOptionPane.showConfirmDialog(null, "Contraseña recuperada" );
					
				}else{
					JOptionPane.showConfirmDialog(null, "La contraseña que confirmaste no es la misma que " + txtcontraseña1.getText() );
				}
				
			}catch(Exception r) {
				JOptionPane.showConfirmDialog(null, "No has ingresado datos");
			}
			}
		});
		btnrecuperar.setFont(new Font("Serif", Font.BOLD, 13));
		btnrecuperar.setBounds(208, 227, 103, 23);
		contentPane.add(btnrecuperar);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(68, 74, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNuevaContrasea = new JLabel("Nueva contraseña");
		lblNuevaContrasea.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea.setFont(new Font("Serif", Font.BOLD, 13));
		lblNuevaContrasea.setBounds(68, 128, 116, 14);
		contentPane.add(lblNuevaContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contraseña");
		lblConfirmarContrasea.setForeground(new Color(255, 255, 255));
		lblConfirmarContrasea.setFont(new Font("Serif", Font.BOLD, 13));
		lblConfirmarContrasea.setBounds(53, 180, 131, 14);
		contentPane.add(lblConfirmarContrasea);
		
		JLabel lblNewLabel_1 = new JLabel("Restablecer contraseña");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(171, 11, 222, 39);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setBackground(new Color(31, 61, 61));
		table.setBounds(0, 0, 23, 261);
		contentPane.add(table);
		table_1.setBackground(new Color(31, 61, 61));
		table_1.setBounds(0, 243, 69, 20);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(31, 61, 61));
		table_2.setBounds(0, 0, 69, 20);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setBackground(new Color(31, 61, 61));
		table_3.setBounds(487, 0, 69, 20);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBackground(new Color(31, 61, 61));
		table_4.setBounds(533, 0, 23, 261);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBackground(new Color(31, 61, 61));
		table_5.setBounds(487, 243, 69, 20);
		contentPane.add(table_5);
	}
}
