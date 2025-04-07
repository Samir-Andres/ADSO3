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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(32, 80, 108, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(164, 80, 116, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(308, 80, 116, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(32, 130, 108, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(164, 130, 116, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBounds(308, 130, 116, 20);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);
		
		txtcorreocorp = new JTextField();
		txtcorreocorp.setBounds(32, 183, 108, 20);
		contentPane.add(txtcorreocorp);
		txtcorreocorp.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(164, 183, 116, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(308, 183, 116, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Correo Corporativo");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(32, 161, 124, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha De Nacimiento");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(164, 161, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(330, 160, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(53, 110, 79, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(187, 110, 68, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Correo Personal");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(318, 110, 94, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de documento");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(32, 55, 100, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Documento");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(187, 55, 93, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Nombres");
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_8.setBounds(330, 55, 76, 14);
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
				txtfechanacimiento.getText(), txttelefono.getText());
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(53, 281, 68, 55);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(195, 374, 116, 23);
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
		btnNewButton.setBounds(160, 281, 68, 56);
		contentPane.add(btnNewButton);
		
		txtid = new JTextField();
		txtid.setBounds(32, 240, 116, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Id Promotor");
		lblNewLabel_9.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_9.setBounds(55, 214, 68, 14);
		contentPane.add(lblNewLabel_9);
		
		JButton btnread = new JButton("");
		btnread.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtid.getText()), txttipodocumento, txtdocumento, txtnombres, txtapellidos, txtdireccion, txtcorreopersonal, txtcorreocorp, txtfechanacimiento, txttelefono);
				
				
			}
		});
		btnread.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnread.setBounds(276, 279, 58, 57);
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
		BTNUPDATE.setBounds(379, 281, 58, 57);
		contentPane.add(BTNUPDATE);
		
		txtcontraseña = new JTextField();
		txtcontraseña.setText("");
		txtcontraseña.setColumns(10);
		txtcontraseña.setBounds(164, 240, 116, 20);
		contentPane.add(txtcontraseña);
		
		JLabel lblNewLabel_9_1 = new JLabel("Contraseña");
		lblNewLabel_9_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_9_1.setBounds(187, 214, 68, 14);
		contentPane.add(lblNewLabel_9_1);
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
