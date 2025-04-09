package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Tipotransportes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Jtipostransportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	
	Tipotransportes cr = new Tipotransportes();
	private JTextField txtidtipotransporte1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtipostransportes frame = new Jtipostransportes();
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
	public Jtipostransportes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(51, 116, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(152, 110, 131, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Observacion");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(34, 176, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(152, 170, 131, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtnombre.getText(), txtobservacion.getText());
			}
			
			
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(10, 287, 72, 54);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(168, 370, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.DELETE(Integer.parseInt(txtidtipotransporte1.getText()));
			
			}
			
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnEliminar.setBounds(131, 287, 53, 54);
		contentPane.add(btnEliminar);
		
		
		
		JLabel lblNewLabel = new JLabel("ID Tipos de transporte");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 242, 131, 14);
		contentPane.add(lblNewLabel);
		
		txtidtipotransporte1 = new JTextField();
		txtidtipotransporte1.setBounds(153, 236, 130, 20);
		contentPane.add(txtidtipotransporte1);
		txtidtipotransporte1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidtipotransporte1.getText()), txtnombre, txtobservacion);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnNewButton.setBounds(246, 287, 60, 54);
		contentPane.add(btnNewButton);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtidtipotransporte1.getText()), txtnombre.getText(), txtobservacion.getText());
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnupdate.setBounds(353, 287, 60, 54);
		contentPane.add(btnupdate);
		
		JLabel lblNewLabel_3 = new JLabel("Información De Tipos de Transportes");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_3.setBounds(76, 27, 313, 44);
		contentPane.add(lblNewLabel_3);
		
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtnombre.setText("");
		txtobservacion.setText("");
		txtidtipotransporte1.setText("");
		
	}
}
