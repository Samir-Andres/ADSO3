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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		bntoperadores.setBounds(26, 229, 61, 57);
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
		btnpaquetes.setBounds(157, 229, 61, 57);
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
		btnpromotores.setBounds(281, 229, 61, 57);
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
		btnvehiculos.setBounds(412, 229, 61, 57);
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
		bnttiposvehiculos.setBounds(546, 229, 61, 57);
		contentPane.add(bnttiposvehiculos);
		
		JLabel lblNewLabel = new JLabel("Bienvenidos al centro de información");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 19));
		lblNewLabel.setBounds(172, 22, 329, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Compañia");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(26, 188, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Agencia");
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(157, 188, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Medios");
		lblNewLabel_1_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(422, 188, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipos de Medios");
		lblNewLabel_1_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(269, 188, 87, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Clientes");
		lblNewLabel_1_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(556, 188, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Tipos de Vehículos");
		lblNewLabel_1_5.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_5.setBounds(520, 313, 112, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Vehículos");
		lblNewLabel_1_6.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_6.setBounds(412, 313, 61, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Promotores");
		lblNewLabel_1_7.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_7.setBounds(281, 313, 75, 14);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Paquetes");
		lblNewLabel_1_8.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_8.setBounds(157, 313, 61, 14);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Operadores");
		lblNewLabel_1_9.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1_9.setBounds(26, 313, 75, 14);
		contentPane.add(lblNewLabel_1_9);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 297, 61, 20);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 168, 61, 20);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(157, 168, 61, 20);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(281, 168, 61, 20);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(412, 168, 61, 20);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(546, 168, 61, 20);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(157, 297, 61, 20);
		contentPane.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(281, 297, 61, 20);
		contentPane.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(412, 297, 61, 20);
		contentPane.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(546, 297, 61, 20);
		contentPane.add(separator_9);
	}
}
