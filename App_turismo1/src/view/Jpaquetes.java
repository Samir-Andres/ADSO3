package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Paquetes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jpaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtiddestino;
	private JTextField txtidorigen;
	private JTextField txtfechaventa;
	private JTextField txthoraventa;
	private JTextField txtfechaejecucion;
	private JTextField txthorasalida;
	private JTextField txtobservacion;
	private JTextField txtidagencia;
	private JTextField txtidmedios;
	private JTextField txtidpromotores;
	private JTextField txtidvehiculo;
	private JTextField txtprecios;
	private JTextField txtidclientes;
	private JTextField txtcodigo;
	Paquetes cr = new Paquetes();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jpaquetes frame = new Jpaquetes();
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
	public Jpaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtiddestino = new JTextField();
		txtiddestino.setBounds(22, 52, 103, 20);
		contentPane.add(txtiddestino);
		txtiddestino.setColumns(10);
		
		txtidorigen = new JTextField();
		txtidorigen.setBounds(158, 52, 103, 20);
		contentPane.add(txtidorigen);
		txtidorigen.setColumns(10);
		
		txtfechaventa = new JTextField();
		txtfechaventa.setBounds(305, 52, 103, 20);
		contentPane.add(txtfechaventa);
		txtfechaventa.setColumns(10);
		
		txthoraventa = new JTextField();
		txthoraventa.setBounds(22, 111, 103, 20);
		contentPane.add(txthoraventa);
		txthoraventa.setColumns(10);
		
		txtfechaejecucion = new JTextField();
		txtfechaejecucion.setBounds(158, 111, 103, 20);
		contentPane.add(txtfechaejecucion);
		txtfechaejecucion.setColumns(10);
		
		txthorasalida = new JTextField();
		txthorasalida.setBounds(305, 111, 103, 20);
		contentPane.add(txthorasalida);
		txthorasalida.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(22, 172, 103, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(158, 172, 103, 20);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(305, 172, 103, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setBounds(22, 236, 103, 20);
		contentPane.add(txtidpromotores);
		txtidpromotores.setColumns(10);
		
		txtidvehiculo = new JTextField();
		txtidvehiculo.setBounds(158, 236, 103, 20);
		contentPane.add(txtidvehiculo);
		txtidvehiculo.setColumns(10);
		
		txtprecios = new JTextField();
		txtprecios.setBounds(305, 236, 103, 20);
		contentPane.add(txtprecios);
		txtprecios.setColumns(10);
		
		txtidclientes = new JTextField();
		txtidclientes.setBounds(22, 303, 103, 20);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Destino");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setBounds(22, 27, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblI = new JLabel("Id Origen");
		lblI.setFont(new Font("Serif", Font.BOLD, 13));
		lblI.setBounds(158, 27, 103, 14);
		contentPane.add(lblI);
		
		JLabel lblFechaDeVenta = new JLabel("Fecha de Venta");
		lblFechaDeVenta.setFont(new Font("Serif", Font.BOLD, 13));
		lblFechaDeVenta.setBounds(305, 27, 103, 14);
		contentPane.add(lblFechaDeVenta);
		
		JLabel lblHoraDeVenta = new JLabel("Hora de Venta");
		lblHoraDeVenta.setFont(new Font("Serif", Font.BOLD, 13));
		lblHoraDeVenta.setBounds(22, 86, 103, 14);
		contentPane.add(lblHoraDeVenta);
		
		JLabel lblFechaDeEjecucin = new JLabel("Fecha de Ejecución");
		lblFechaDeEjecucin.setFont(new Font("Serif", Font.BOLD, 13));
		lblFechaDeEjecucin.setBounds(158, 86, 103, 14);
		contentPane.add(lblFechaDeEjecucin);
		
		JLabel lblHoraDeSalida = new JLabel("Hora de Salida");
		lblHoraDeSalida.setFont(new Font("Serif", Font.BOLD, 13));
		lblHoraDeSalida.setBounds(305, 86, 103, 14);
		contentPane.add(lblHoraDeSalida);
		
		JLabel lblObservacin = new JLabel("Observación");
		lblObservacin.setFont(new Font("Serif", Font.BOLD, 13));
		lblObservacin.setBounds(22, 154, 103, 14);
		contentPane.add(lblObservacin);
		
		JLabel lblIdAgencia = new JLabel("Id Agencia");
		lblIdAgencia.setFont(new Font("Serif", Font.BOLD, 13));
		lblIdAgencia.setBounds(158, 154, 103, 14);
		contentPane.add(lblIdAgencia);
		
		JLabel lblIdMedios = new JLabel("Id Medios");
		lblIdMedios.setFont(new Font("Serif", Font.BOLD, 13));
		lblIdMedios.setBounds(305, 147, 103, 14);
		contentPane.add(lblIdMedios);
		
		JLabel lblIdPromotores = new JLabel("Id Promotores");
		lblIdPromotores.setFont(new Font("Serif", Font.BOLD, 13));
		lblIdPromotores.setBounds(22, 211, 103, 14);
		contentPane.add(lblIdPromotores);
		
		JLabel lblIdVehiculo = new JLabel("Id Vehiculo");
		lblIdVehiculo.setFont(new Font("Serif", Font.BOLD, 13));
		lblIdVehiculo.setBounds(158, 211, 103, 14);
		contentPane.add(lblIdVehiculo);
		
		JLabel lblPrecios = new JLabel("Precios");
		lblPrecios.setFont(new Font("Serif", Font.BOLD, 13));
		lblPrecios.setBounds(305, 211, 103, 14);
		contentPane.add(lblPrecios);
		
		JLabel lblIdClientes = new JLabel("Id Clientes");
		lblIdClientes.setFont(new Font("Serif", Font.BOLD, 13));
		lblIdClientes.setBounds(22, 278, 103, 14);
		contentPane.add(lblIdClientes);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9027370_save_icon.png"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		
				
				cr.create(Integer.parseInt(txtiddestino.getText()), Integer.parseInt(txtidorigen.getText()), txtfechaventa.getText(), txthoraventa.getText(), txtfechaejecucion.getText(), txthorasalida.getText(), txtobservacion.getText(), Integer.parseInt(txtidagencia.getText()),
						Integer.parseInt(txtidmedios.getText()), Integer.parseInt(txtidpromotores.getText()), Integer.parseInt(txtidvehiculo.getText()), txtprecios.getText(), Integer.parseInt(txtidclientes.getText()));
				
				
				
				
				
			}
		});
		btnRegistrar.setFont(new Font("Serif", Font.BOLD, 13));
		btnRegistrar.setBounds(22, 345, 68, 57);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiar.setBounds(158, 442, 103, 23);
		contentPane.add(btnLimpiar);
		
		txtcodigo = new JTextField();
		txtcodigo.setText("");
		txtcodigo.setColumns(10);
		txtcodigo.setBounds(158, 303, 103, 20);
		contentPane.add(txtcodigo);
		
		JLabel lblCodigoPaquete = new JLabel("Codigo Paquete");
		lblCodigoPaquete.setFont(new Font("Serif", Font.BOLD, 13));
		lblCodigoPaquete.setBounds(158, 278, 103, 14);
		contentPane.add(lblCodigoPaquete);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
				cr.delete(Integer.parseInt(txtcodigo.getText()));
								
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\9004743_trash_delete_bin_remove_icon.png"));
		btnNewButton.setBounds(122, 345, 68, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtcodigo.getText()), txtiddestino, txtidorigen, txtfechaventa, txthoraventa, txtfechaejecucion, txthorasalida, txtobservacion, txtidagencia, txtidmedios, txtidpromotores, txtidvehiculo, txtprecios, txtidclientes);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\3827704_color_lineal_magnifying glass_sale_search_icon.png"));
		btnNewButton_1.setBounds(224, 345, 60, 57);
		contentPane.add(btnNewButton_1);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.update(Integer.parseInt(txtcodigo.getText()), Integer.parseInt(txtiddestino.getText()), Integer.parseInt(txtidorigen.getText()), 
			    txtfechaventa.getText(), txthoraventa.getText(), txtfechaejecucion.getText(), txthorasalida.getText(), txtobservacion.getText(), Integer.parseInt(txtidagencia.getText()), 
			    Integer.parseInt(txtidmedios.getText()), Integer.parseInt(txtidpromotores.getText()), Integer.parseInt(txtidvehiculo.getText()), txtprecios.getText(),
			    Integer.parseInt(txtidclientes.getText()));
			}
		});
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Iconos\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnupdate.setBounds(324, 345, 60, 57);
		contentPane.add(btnupdate);
		btnLimpiar.addActionListener(e -> ClearFields());
		
		
		
	}

	private void ClearFields() {
		txtiddestino.setText("");
		txtidorigen.setText("");
		txtfechaventa.setText("");
		txthoraventa.setText("");
		txtfechaejecucion.setText("");
		txthorasalida.setText("");
		txtidpromotores.setText("");
		txtidagencia.setText("");
		txtidmedios.setText("");
		txtobservacion.setText("");
		txtidclientes.setText("");
		txtprecios.setText("");
		txtidvehiculo.setText("");
	}
}