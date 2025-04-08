package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Agencia {
	
	public int idagencia;
	public String nombre ;
	public String telefono ; 
	public String direccion ;
	public String correo;
	public String web ;
	public int idcompania ; 
	
	Conexion conector = new Conexion();
	

	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	
	public void create(String nombre, String telefono,String direccion,String correo,String web, int idcompania ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tblagencia (nombre, telefono,direccion,correo,web, idcompañia) values (?,?,?,?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, nombre);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, web);
			pst.setInt(6, idcompania);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void delete(int idagencia ) {
		Connection dbConnection = null;  // Se crea un objeto de la clase Connection
		PreparedStatement pst = null; // Se prepara la transaccion
		
//		El scrip 
		String script = "DELETE FROM tblagencia  WHERE idagencia = ?";
		
		try {
			
			dbConnection = conector.conectarBD(); // Se abre la conexion 
			pst = dbConnection.prepareStatement(script); // Se abre el buffer
			
//			parametros que se le envian 
			pst.setInt(1, idagencia);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public void read(int idagencia,JTextField nombre, JTextField telefono,JTextField direccion,JTextField correo,JTextField web, JTextField idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //
		
		String script = "SELECT * FROM tblagencia WHERE idagencia = ?";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idagencia);
						
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				nombre.setText(rs.getString(2));
				telefono.setText(rs.getString(3));
				direccion.setText(rs.getString(4));
				correo.setText(rs.getString(5));
				web.setText(rs.getString(6));
				idcompania.setText(rs.getString(7));
				
			}
		
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	public void update(int idagencia  ,String nombre, String telefono,String direccion, String correo,String web, int idcompañia ) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblagencia SET nombre = ?, telefono = ? , direccion = ?, correo = ?,web = ?, idcompañia =? WHERE idagencia = ?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        pst.setString(1, nombre);
	        pst.setString(2, telefono);
	        pst.setString(3, direccion);
	        pst.setString(4, correo);
	        pst.setString(5, web);
	        pst.setInt(6, idcompañia);
	        pst.setInt(7, idagencia);

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idagencia + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idagencia + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    } finally {
	        try {
	            if (pst != null) pst.close();
	            if (dbconnection != null) dbconnection.close();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	
	
	

}
