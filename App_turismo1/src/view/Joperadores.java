package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Operadores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Joperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtidoperadores;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnRegistrar;
	private JButton btnLimpiar;
	private JTextField txtDocumento;
	Operadores cr = new Operadores();
	private JButton btnNewButton;
	private JTextField txtidvehiculo;
	private JLabel lblNewLabel_8;
	private JButton btnupdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Joperadores frame = new Joperadores();
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
	public Joperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(10, 65, 118, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(364, 65, 118, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(10, 139, 118, 20);
		contentPane.add(txtapellido);
		txtapellido.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(199, 139, 118, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(364, 139, 118, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(10, 197, 118, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtidoperadores = new JTextField();
		txtidoperadores.setBounds(364, 195, 118, 20);
		contentPane.add(txtidoperadores);
		txtidoperadores.setColumns(10);
		
		lblNewLabel = new JLabel("Tipo de Documento");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 40, 118, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(386, 40, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(40, 114, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Dirección");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(233, 114, 84, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(400, 114, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(41, 172, 73, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("ID Operadores");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(386, 170, 82, 14);
		contentPane.add(lblNewLabel_6);
		
		btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			cr.create(Integer.parseInt(txttipodocumento.getText()), txtnombre.getText(), txtapellido.getText(), txtdireccion.getText(), txtcorreo.getText(), txttelefono.getText(), 
			Integer.parseInt(txtidoperadores.getText()), Integer.parseInt(txtDocumento.getText()));
				
				
				
				
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(20, 238, 58, 57);
		contentPane.add(btnRegistrar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(221, 320, 111, 23);
		contentPane.add(btnLimpiar);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(202, 65, 115, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Documento");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(233, 40, 70, 14);
		contentPane.add(lblNewLabel_7);
		
		txtidvehiculo = new JTextField();
		txtidvehiculo.setText("");
		txtidvehiculo.setColumns(10);
		txtidvehiculo.setBounds(199, 197, 118, 20);
		contentPane.add(txtidvehiculo);
		
		lblNewLabel_8 = new JLabel("ID Vehiculo");
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_8.setBounds(233, 172, 84, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidoperadores.getText()));
			}
		});
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnEliminar.setBounds(157, 238, 58, 57);
		contentPane.add(btnEliminar);
		
		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidoperadores.getText()), txttipodocumento, txtnombre, txtapellido, txtdireccion, txtcorreo, txttelefono, txtidvehiculo, txtDocumento);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnNewButton.setBounds(274, 238, 58, 57);
		contentPane.add(btnNewButton);
		
		btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			cr.update(Integer.parseInt(txtidoperadores.getText()), Integer.parseInt(txttipodocumento.getText()), txtnombre.getText(), txtapellido.getText(), 
			txtdireccion.getText(), txtcorreo.getText(), txttelefono.getText(), Integer.parseInt(txtidvehiculo.getText()), Integer.parseInt(txtDocumento.getText()));
			
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnupdate.setBounds(416, 226, 58, 57);
		contentPane.add(btnupdate);
		
	
		
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txttipodocumento.setText("");
		txttelefono.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txtnombre.setText("");
		txtidoperadores.setText("");
		txtDocumento.setText("");
		txtapellido.setText("");
}
}