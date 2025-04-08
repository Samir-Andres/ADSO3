package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import javax.swing.JSeparator;

public class Interfaz_promotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_promotor frame = new Interfaz_promotor();
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
	public Interfaz_promotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnagencia = new JButton("");
		btnagencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jagencia agencia = new Jagencia();
				
				agencia.setVisible(true);
			}
		});
		btnagencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5452481_buildings_center_mal_mall_shopping_icon.png"));
		btnagencia.setBounds(157, 100, 61, 57);
		contentPane.add(btnagencia);
		
		JButton btncompañia = new JButton("");
		btncompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncompañia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jcompania compania = new Jcompania();
				compania.setVisible(true);
				
				
				
			}
		});
		btncompañia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5452468_buildings_holidays_hotel_vacations_icon.png"));
		btncompañia.setBounds(26, 100, 61, 57);
		contentPane.add(btncompañia);
		
		JButton btntiposdemedios = new JButton("");
		btntiposdemedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jtiposmedios tiposmedios = new Jtiposmedios();
				tiposmedios.setVisible(true);
			}
		});
		btntiposdemedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\12174226_worldwide_globe_internet_global_connection_icon.png"));
		btntiposdemedios.setBounds(281, 100, 61, 57);
		contentPane.add(btntiposdemedios);
		
		JButton btnmedios = new JButton("");
		btnmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				Jmedios medios = new Jmedios();
				
				medios.setVisible(true);
			
			
			
			}
		});
		btnmedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4417125_email_@_envelope_letter_icon.png"));
		btnmedios.setBounds(412, 100, 61, 57);
		contentPane.add(btnmedios);
		
		JButton btnclientes = new JButton("");
		btnclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jcliente clientes = new Jcliente();
				
				clientes.setVisible(true);
			}
		});
		btnclientes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\403023_avatar_user_woman_female_person_icon.png"));
		btnclientes.setBounds(546, 100, 61, 57);
		contentPane.add(btnclientes);
		
		JButton bntoperadores = new JButton("");
		bntoperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jpromotores promotores = new Jpromotores();
				promotores.setVisible(true);
			}
		});
		bntoperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4715004_actor_avatar_people_person_profile_icon.png"));
		bntoperadores.setBounds(26, 202, 61, 57);
		contentPane.add(bntoperadores);
		
		JButton btnpaquetes = new JButton("");
		btnpaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Jpaquetes paquetes = new Jpaquetes();
				paquetes.setVisible(true);
				
			}
		});
		btnpaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\6791621_box_package_product_products_icon.png"));
		btnpaquetes.setBounds(157, 202, 61, 57);
		contentPane.add(btnpaquetes);
		
		JButton btnpromotores = new JButton("");
		btnpromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Joperadores operadores = new Joperadores();
				
				operadores.setVisible(true);
				
				
				
			}
		});
		btnpromotores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4417115_headset_operator_person_support_mic_icon.png"));
		btnpromotores.setBounds(281, 202, 61, 57);
		contentPane.add(btnpromotores);
		
		JButton btnvehiculos = new JButton("");
		btnvehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jvehiculo vehiculo = new Jvehiculo();
				
				vehiculo.setVisible(true);
				
				
				
			}
		});
		btnvehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnvehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4288586_and_cargo_delivery_shipping_transport_icon.png"));
		btnvehiculos.setBounds(412, 202, 61, 57);
		contentPane.add(btnvehiculos);
		
		JButton bnttiposvehiculos = new JButton("");
		bnttiposvehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jtipostransportes tipostransporte = new Jtipostransportes();
				
				tipostransporte.setVisible(true);
				
				
			}
		});
		bnttiposvehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5978677_airplane_corona_coronavirus_plane_travel_icon.png"));
		bnttiposvehiculos.setBounds(546, 202, 61, 57);
		contentPane.add(bnttiposvehiculos);
		
		JLabel lblNewLabel = new JLabel("Bienvenidos al centro de información");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 19));
		lblNewLabel.setBounds(172, 22, 329, 25);
		contentPane.add(lblNewLabel);
	}
}
