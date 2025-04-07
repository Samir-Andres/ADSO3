package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Clientes;


import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Jcliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txteps;
	private JTextField txtalergias;
	private JTextField txtfechanacimiento;
	private JTextField txtcorreo;
	private JTextField txtestadocivil;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private boolean isSecondNumber = false;
	Clientes cr = new Clientes();
	private JTextField txtidclientes;
	private JLabel lblNewLabel_11;
	private JButton btnEliminar;
	private JButton btnconsultar;
	private JButton btnconsultar_1;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jcliente frame = new Jcliente();
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
	public Jcliente() {
		setTitle("Registro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(49, 44, 86, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(174, 44, 100, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(304, 44, 86, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(433, 44, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txteps = new JTextField();
		txteps.setBounds(49, 113, 86, 20);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtalergias = new JTextField();
		txtalergias.setBounds(174, 113, 100, 20);
		contentPane.add(txtalergias);
		txtalergias.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(308, 113, 86, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(433, 113, 86, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setBounds(49, 190, 86, 20);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(174, 190, 100, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(314, 190, 100, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		lblNewLabel = new JLabel("Tipo de documento");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(47, 18, 100, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(189, 19, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(315, 19, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(450, 19, 69, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Eps");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(66, 86, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Alergias");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(198, 86, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(304, 86, 110, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Correo");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(456, 89, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Estado civil");
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_8.setBounds(64, 165, 71, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Telefono");
		lblNewLabel_9.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_9.setBounds(198, 165, 62, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Dirección");
		lblNewLabel_10.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_10.setBounds(336, 165, 59, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnregistrar = new JButton("");
		btnregistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnregistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()), txtnombres.getText(), 
				txtapellidos.getText(), txteps.getText(), txtalergias.getText(), Integer.parseInt(txtfechanacimiento.getText()), 
				txtcorreo.getText(), txtestadocivil.getText(),txttelefono.getText(), txtdireccion.getText());
			}
		});
		btnregistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnregistrar.setBounds(49, 221, 63, 57);
		contentPane.add(btnregistrar);
		
		JButton btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnlimpiar.setBounds(250, 299, 89, 23);
		contentPane.add(btnlimpiar);
		
		txtidclientes = new JTextField();
		txtidclientes.setBounds(433, 190, 92, 20);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Id Clientes");
		lblNewLabel_11.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_11.setBounds(444, 163, 81, 14);
		contentPane.add(lblNewLabel_11);
		
		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidclientes.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnEliminar.setBounds(201, 221, 59, 57);
		contentPane.add(btnEliminar);
		
		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtidclientes.getText()), txttipodocumento ,txtdocumento, txtnombres, 
				txtapellidos, txteps, txtalergias, txtfechanacimiento, txtcorreo, txtestadocivil, txttelefono, txtdireccion);
				
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnconsultar.setBounds(335, 221, 59, 57);
		contentPane.add(btnconsultar);
		
		btnconsultar_1 = new JButton("");
		btnconsultar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.update(Integer.parseInt(txtidclientes.getText()), Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txttipodocumento.getText()), txtnombres.getText(),
				txtapellidos.getText(), txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txtcorreo.getText(), txtestadocivil.getText(), txttelefono.getText(), txtdireccion.getText());
				
				
			}
		});
		btnconsultar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar_1.setBounds(466, 221, 59, 57);
		contentPane.add(btnconsultar_1);
		btnlimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txttipodocumento.setText("");
		txtdocumento.setText("");
		txtnombres.setText("");
		txtapellidos.setText("");
		txteps.setText("");
		txtalergias.setText("");
		txtfechanacimiento.setText("");
		txtcorreo.setText("");
		txtestadocivil.setText("");
		txtdireccion.setText("");
		txttelefono.setText("");
		txtidclientes.setText("");
		isSecondNumber = false;
	}
}