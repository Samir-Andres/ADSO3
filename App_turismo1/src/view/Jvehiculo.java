package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Vehiculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jvehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmatricula;
	private JTextField txtmarca;
	private JTextField txtpuestos;
	private JTextField txtmodelo;
	private JTextField txtnumeromotor;
	private JTextField txtcategoria;
	private JTextField txtidtipotransporte;
	private JButton btnRegistrar;
	private JButton btnLimpiar;
	private JTextField txtidvehiculo;

	Vehiculos cr = new Vehiculos();
	private JButton btnNewButton_1;
	private JButton BTNUPDATE;
	private JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jvehiculo frame = new Jvehiculo();
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
	public Jvehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(54, 89, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		txtmatricula = new JTextField();
		txtmatricula.setBounds(29, 114, 86, 20);
		contentPane.add(txtmatricula);
		txtmatricula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(175, 89, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtmarca = new JTextField();
		txtmarca.setBounds(162, 114, 86, 20);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Puestos");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(311, 89, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtpuestos = new JTextField();
		txtpuestos.setBounds(295, 114, 86, 20);
		contentPane.add(txtpuestos);
		txtpuestos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(54, 162, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(29, 187, 86, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Numero del motor");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(157, 162, 128, 14);
		contentPane.add(lblNewLabel_5);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setBounds(162, 187, 86, 20);
		contentPane.add(txtnumeromotor);
		txtnumeromotor.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Categoria");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(311, 162, 70, 14);
		contentPane.add(lblNewLabel_6);
		
		txtcategoria = new JTextField();
		txtcategoria.setBounds(295, 187, 86, 20);
		contentPane.add(txtcategoria);
		txtcategoria.setColumns(10);
		
		txtidtipotransporte = new JTextField();
		txtidtipotransporte.setBounds(32, 258, 86, 20);
		contentPane.add(txtidtipotransporte);
		txtidtipotransporte.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Id tipo de transporte");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(30, 233, 115, 14);
		contentPane.add(lblNewLabel_7);
		
		btnRegistrar = new JButton("");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				cr.create(txtmatricula.getText(), txtmarca.getText(), Integer.parseInt(txtpuestos.getText()), txtmodelo.getText(), Integer.parseInt(txtnumeromotor.getText()), 
			   txtcategoria.getText(), Integer.parseInt(txtidtipotransporte.getText()));
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(29, 315, 54, 57);
		contentPane.add(btnRegistrar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(175, 385, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidvehiculo.getText()));
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnNewButton.setBounds(121, 315, 61, 57);
		contentPane.add(btnNewButton);
		
		txtidvehiculo = new JTextField();
		txtidvehiculo.setText("");
		txtidvehiculo.setColumns(10);
		txtidvehiculo.setBounds(164, 258, 86, 20);
		contentPane.add(txtidvehiculo);
		
		JLabel lblNewLabel_7_1 = new JLabel("ID Vehiculo");
		lblNewLabel_7_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_7_1.setBounds(175, 233, 115, 14);
		contentPane.add(lblNewLabel_7_1);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt( txtidvehiculo.getText()), txtmatricula, txtmarca, txtpuestos, txtmodelo, txtnumeromotor, txtcategoria, txtidtipotransporte);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnNewButton_1.setBounds(229, 315, 59, 57);
		contentPane.add(btnNewButton_1);
		
		BTNUPDATE = new JButton("");
		BTNUPDATE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.update(Integer.parseInt(txtidvehiculo.getText()), txtmatricula.getText(), txtmarca.getText(),Integer.parseInt(txtpuestos.getText()),
					txtmodelo.getText(),Integer.parseInt(txtnumeromotor.getText()), txtcategoria.getText(), Integer.parseInt(txtidtipotransporte.getText()));
			
			
			}
		});
		BTNUPDATE.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		BTNUPDATE.setBounds(322, 315, 59, 57);
		contentPane.add(BTNUPDATE);
		
		lblNewLabel = new JLabel("Información de Vehículos");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setBounds(110, 23, 260, 42);
		contentPane.add(lblNewLabel);
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtnumeromotor.setText("");
		txtidtipotransporte.setText("");
		txtcategoria.setText("");
		txtmodelo.setText("");
		txtpuestos.setText("");
		txtmarca.setText("");
		txtmatricula.setText("");
		txtidvehiculo.setText("");
}
}
