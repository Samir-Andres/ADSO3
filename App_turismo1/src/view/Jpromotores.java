package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Clientes;
import model.Promotores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class Jpromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreopersonal;
	private JTextField txtcorreocorp;
	private JTextField txtfechanacimiento;
	private JTextField txttelefono;
	private JTextField txtid;
	Promotores cr = new Promotores();
	private JTextField txtcontraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jpromotores frame = new Jpromotores();
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
	public Jpromotores() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(31, 124, 108, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(163, 124, 116, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(307, 124, 116, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(31, 174, 108, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(163, 174, 116, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBounds(307, 174, 116, 20);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);
		
		txtcorreocorp = new JTextField();
		txtcorreocorp.setBounds(31, 227, 108, 20);
		contentPane.add(txtcorreocorp);
		txtcorreocorp.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(163, 227, 116, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(307, 227, 116, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Correo Corporativo");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(31, 205, 124, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha De Nacimiento");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(163, 205, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(329, 204, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(52, 154, 79, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(186, 154, 68, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Correo Personal");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(317, 154, 94, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de documento");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(31, 99, 100, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Documento");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(186, 99, 93, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Nombres");
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_8.setBounds(329, 99, 76, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				
				cr.create(Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()), txtnombres.getText(), 
				txtapellidos.getText(), txtdireccion.getText(), txtcorreopersonal.getText(), txtcorreocorp.getText(), 
				txtfechanacimiento.getText(), txttelefono.getText(), txtcontraseña.getText());
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(53, 328, 68, 55);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(31, 422, 116, 35);
		contentPane.add(btnLimpiar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtid.getText()));
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnNewButton.setBounds(160, 328, 68, 56);
		contentPane.add(btnNewButton);
		
		txtid = new JTextField();
		txtid.setBounds(31, 284, 116, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Id Promotor");
		lblNewLabel_9.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_9.setBounds(54, 258, 68, 14);
		contentPane.add(lblNewLabel_9);
		
		JButton btnread = new JButton("");
		btnread.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtid.getText()), txttipodocumento, txtdocumento, txtnombres, txtapellidos, txtdireccion, txtcorreopersonal, txtcorreocorp, txtfechanacimiento, txttelefono);
				
				
			}
		});
		btnread.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnread.setBounds(276, 326, 58, 57);
		contentPane.add(btnread);
		
		JButton BTNUPDATE = new JButton("");
		BTNUPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BTNUPDATE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				cr.update(Integer.parseInt(txtid.getText()), Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()),
				txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(), txtcorreopersonal.getText(), txtcorreocorp.getText(), txtfechanacimiento.getText(), txttelefono.getText(), txtcontraseña.getText());
			
			}
		});
		BTNUPDATE.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		BTNUPDATE.setBounds(379, 328, 58, 57);
		contentPane.add(BTNUPDATE);
		
		txtcontraseña = new JTextField();
		txtcontraseña.setText("");
		txtcontraseña.setColumns(10);
		txtcontraseña.setBounds(163, 284, 116, 20);
		contentPane.add(txtcontraseña);
		
		JLabel lblNewLabel_9_1 = new JLabel("Contraseña");
		lblNewLabel_9_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_9_1.setBounds(186, 258, 68, 14);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10 = new JLabel("Información De Promotores");
		lblNewLabel_10.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_10.setBounds(116, 42, 248, 27);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("Iniciar sesión");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Fr_Acceso acceso = new Fr_Acceso();
				
				acceso.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 13));
		btnNewButton_1.setBounds(307, 276, 116, 35);
		contentPane.add(btnNewButton_1);
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txttipodocumento.setText("");
		txtdocumento.setText("");
		txtnombres.setText("");
		txtapellidos.setText("");
		txtdireccion.setText("");
		txtcorreopersonal.setText("");
		txtcorreocorp.setText("");
		txtfechanacimiento.setText("");
		txttelefono.setText("");
		txtid.setText("");
	}
}
