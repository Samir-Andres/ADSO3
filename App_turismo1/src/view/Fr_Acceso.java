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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Fr_Acceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JPasswordField txtcontraseña;
	
	Acc_Promotores in = new Acc_Promotores();
	private JTable table;
	private JTable table_1;
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 493, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 151, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(178, 96, 125, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Documento");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 16));
		lblNewLabel.setBounds(53, 96, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setFont(new Font("Serif", Font.BOLD, 16));
		lblContrasea.setBounds(53, 163, 121, 14);
		contentPane.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setIcon(null);
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
		btnNewButton.setBounds(178, 188, 125, 29);
		contentPane.add(btnNewButton);
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setEchoChar('*');
		txtcontraseña.setBounds(178, 157, 125, 20);
		contentPane.add(txtcontraseña);
		
		JLabel lblNewLabel_1 = new JLabel("Control de acceso");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_1.setBounds(161, 28, 172, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCrear = new JButton("Crear ");
		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jpromotores promotores = new Jpromotores();
				promotores.setVisible(true);
			}
		});
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrear.setIcon(null);
		btnCrear.setFont(new Font("Serif", Font.BOLD, 16));
		btnCrear.setBounds(342, 123, 81, 29);
		contentPane.add(btnCrear);
		
		table = new JTable();
		table.setBackground(new Color(0, 79, 79));
		table.setBounds(0, 0, 121, 25);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(0, 79, 79));
		table_1.setBounds(0, 236, 121, 25);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(0, 79, 79));
		table_2.setBounds(0, 11, 25, 226);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setBackground(new Color(0, 79, 79));
		table_3.setBounds(452, 11, 25, 226);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBackground(new Color(0, 79, 79));
		table_4.setBounds(356, 0, 121, 25);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBackground(new Color(0, 79, 79));
		table_5.setBounds(356, 236, 121, 25);
		contentPane.add(table_5);
	}
}
