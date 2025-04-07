package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLEditorKit.Parser;

import model.Agencia;
import model.Tipomedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Jtiposmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	private boolean isSecondNumber = false;
	private JTextField txtidtiposmedios;
	Tipomedios cr = new Tipomedios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtiposmedios frame = new Jtiposmedios();
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
	public Jtiposmedios() {
		setTitle("TIPOS DE MEDIOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(157, 68, 106, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(157, 134, 106, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(67, 70, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observacion");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(67, 136, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtnombre.getText(), txtobservacion.getText());
				
			}
			
           
			
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 13));
		btnNewButton.setBounds(30, 270, 63, 54);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(157, 99, 106, 14);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(157, 165, 106, 14);
		contentPane.add(separator_2);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(157, 361, 106, 23);
		contentPane.add(btnLimpiar);
		
		JLabel lblNewLabel = new JLabel("Gestion de Tipos De Medios");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(133, 25, 173, 14);
		contentPane.add(lblNewLabel);
		
		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBounds(157, 204, 106, 20);
		contentPane.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ID Tipos de Medios");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(30, 206, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidtiposmedios.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnEliminar.setBounds(138, 270, 63, 54);
		contentPane.add(btnEliminar);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidtiposmedios.getText()), txtnombre, txtobservacion);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnNewButton_1.setBounds(244, 271, 62, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.update(Integer.parseInt(txtidtiposmedios.getText()), txtnombre.getText(), txtobservacion.getText());
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnupdate.setBounds(350, 271, 62, 53);
		contentPane.add(btnupdate);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(157, 235, 106, 14);
		contentPane.add(separator_2_1);
		btnLimpiar.addActionListener(e -> clearFields());
		
	}

	private void clearFields() {
		txtnombre.setText("");
		txtobservacion.setText("");
		txtidtiposmedios.setText("");
	
		isSecondNumber = false;
	}
}
