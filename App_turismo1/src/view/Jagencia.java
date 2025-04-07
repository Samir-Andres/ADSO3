package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Agencia;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Jagencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txtweb;
	private JTextField txtidcompania;
	private JTextField txtidagencia;
	Agencia cr = new Agencia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jagencia frame = new Jagencia();
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
	public Jagencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(26, 64, 106, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(164, 64, 110, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(311, 64, 106, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(26, 136, 106, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(164, 136, 110, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(311, 136, 106, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(54, 39, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(186, 39, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(338, 39, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(54, 111, 64, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Web");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(197, 111, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Id Compania");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(326, 111, 78, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setForeground(new Color(17, 123, 132));
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				cr.create(txtnombres.getText(),txttelefono.getText(),txtdireccion.getText(),txtcorreo.getText(),txtweb.getText(), Integer.parseInt(txtidcompania.getText()));
				
	
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(146, 199, 57, 52);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(new Color(0, 0, 0));
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(248, 273, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(26, 202, 110, 20);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Agencia");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(54, 175, 64, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setForeground(new Color(17, 123, 132));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidagencia.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnEliminar.setBounds(230, 199, 64, 52);
		contentPane.add(btnEliminar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(new Color(17, 123, 132));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
	cr.read(Integer.parseInt(txtidagencia.getText()), txtnombres, txttelefono, txtdireccion, txtcorreo, txtweb, txtidcompania);
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnNewButton.setBounds(311, 199, 57, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(new Color(17, 123, 132));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.update( Integer.parseInt(txtidagencia.getText()),txtnombres.getText(), txttelefono.getText(), txtdireccion.getText(), txtcorreo.getText(), txtweb.getText(),Integer.parseInt(txtidcompania.getText()));
				
				
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnNewButton_1.setBounds(388, 199, 57, 52);
		contentPane.add(btnNewButton_1);
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtnombres.setText("");
		txttelefono.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txtweb.setText("");
		txtidcompania.setText("");
		txtidagencia.setText("");
		
}
}