package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Medios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Jmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jmedios;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	private JTextField txtidtiposmedios;
	private JTextField txtidmedios;
	Medios cr = new Medios();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jmedios frame = new Jmedios();
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
	public Jmedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 360);
		jmedios = new JPanel();
		jmedios.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jmedios);
		jmedios.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(10, 79, 122, 20);
		jmedios.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(163, 79, 122, 20);
		jmedios.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBounds(312, 79, 122, 20);
		jmedios.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(30, 54, 122, 14);
		jmedios.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Observacion");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(187, 54, 89, 14);
		jmedios.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id Tipos de Medios");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(322, 54, 112, 14);
		jmedios.add(lblNewLabel_2);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				cr.create(txtnombre.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));
				
				
				
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(10, 231, 66, 62);
		jmedios.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(217, 169, 122, 23);
		jmedios.add(btnLimpiar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidmedios.getText()));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnNewButton.setBounds(121, 231, 66, 62);
		jmedios.add(btnNewButton);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(10, 171, 122, 20);
		jmedios.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Medios");
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(34, 146, 89, 14);
		jmedios.add(lblNewLabel_1_1);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtidmedios.getText()) , txtnombre.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnupdate.setBounds(347, 231, 66, 62);
		jmedios.add(btnupdate);
		
		JButton btnbuscar = new JButton("");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtidmedios.getText()), txtnombre, txtobservacion, txtidtiposmedios);
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnbuscar.setBounds(243, 231, 66, 62);
		jmedios.add(btnbuscar);
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtidtiposmedios.setText("");
		txtnombre.setText("");
		txtobservacion.setText("");
		txtidmedios.setText("");
	}
}