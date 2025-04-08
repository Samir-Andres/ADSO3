package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Compania;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Jcompania extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtrazonsocial;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtweb;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnguardar;
	private JButton btnLimpiar;
	private JTextField txtFechadecreacion;
	Compania cr = new Compania();
	private JTextField txtidcompania;
	private JLabel lblNewLabel_5_1;
	private JLabel lblNewLabel_5_2;
	private JButton btnNewButton;
	private JButton btnread;
	private JButton btnupdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jcompania frame = new Jcompania();
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
	public Jcompania() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setBounds(163, 75, 159, 20);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(163, 122, 159, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(163, 171, 159, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(163, 221, 159, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(163, 270, 159, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		lblNewLabel = new JLabel("Información de Compañia");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setBounds(129, 25, 235, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Razonn Social");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(46, 77, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Dirección");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(59, 124, 80, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(59, 173, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(59, 223, 80, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Web");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(59, 272, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtrazonsocial.getText(), txtdireccion.getText(), txtcorreo.getText(), txttelefono.getText(), txtFechadecreacion.getText(), txtweb.getText());
			}
		});
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnguardar.setFont(new Font("Serif", Font.BOLD, 13));
		btnguardar.setBounds(367, 64, 58, 57);
		contentPane.add(btnguardar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(354, 373, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtFechadecreacion = new JTextField();
		txtFechadecreacion.setBounds(163, 318, 159, 20);
		contentPane.add(txtFechadecreacion);
		txtFechadecreacion.setColumns(10);
		
		txtidcompania = new JTextField();
		txtidcompania.setText("");
		txtidcompania.setColumns(10);
		txtidcompania.setBounds(163, 362, 159, 20);
		contentPane.add(txtidcompania);
		
		lblNewLabel_5_1 = new JLabel("Fecha de Creación");
		lblNewLabel_5_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(29, 321, 110, 14);
		contentPane.add(lblNewLabel_5_1);
		
		lblNewLabel_5_2 = new JLabel("ID Compañia");
		lblNewLabel_5_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5_2.setBounds(29, 365, 110, 14);
		contentPane.add(lblNewLabel_5_2);
		
		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnNewButton.setBounds(367, 132, 58, 65);
		contentPane.add(btnNewButton);
		
		btnread = new JButton("");
		btnread.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				cr.read(Integer.parseInt(txtidcompania.getText()), txtrazonsocial, txtdireccion, txtcorreo, txttelefono, txtFechadecreacion, txtweb);
			}
		});
		btnread.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnread.setBounds(367, 221, 58, 65);
		contentPane.add(btnread);
		
		btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtidcompania.getText()), txtrazonsocial.getText(), txtdireccion.getText(), txtcorreo.getText(), txttelefono.getText(), 
				txtFechadecreacion.getText(), txtweb.getText());
				
				
				
				
				
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnupdate.setBounds(367, 297, 58, 65);
		contentPane.add(btnupdate);
		
		
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtrazonsocial.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txttelefono.setText("");
		txtdireccion.setText("");
		txtweb.setText("");
		txtFechadecreacion.setText("");
		txtidcompania.setText("");
		
	}
}
