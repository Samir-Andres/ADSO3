package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Compania {
	public int idcompañia ; 
	public String razonsocial ;
	public String  direccion ;
	public String correo  ;
	public String  telefono ;
	public String fechacreacion ;
	public String web;
	Conexion conector = new Conexion();
	public int getIdcompañia() {
		return idcompañia;
	}
	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	public void create(String razonsocial, String direccion,String correo,String telefono,String fechacreacion, String web ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tblcompañia (razonsocial, direccion,correo,telefono,fechacreacion, web) values (?,?,?,?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public void read(int idcompañia, JTextField razonsocial, JTextField direccion,JTextField correo,JTextField telefono,JTextField fechacreacion, JTextField web ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // 
		
		String script = "SELECT * FROM tblcompañia WHERE idcompañia = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idcompañia);
			
			ResultSet rs = pst.executeQuery();
			
			
			while (rs.next()) {
				razonsocial.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				correo.setText(rs.getString(4));				
				telefono.setText(rs.getString(5));
				fechacreacion.setText(rs.getString(6));
				web.setText(rs.getString(7));				

					
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void update(int idcompañia,String razonsocial, String direccion,String correo,String telefono,String fechacreacion, String web  ) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblcompañia SET razonsocial = ?, direccion = ?,direccion =?, telefono=?, fechacreacion = ?, web =? WHERE idcompañia=?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setString(1, razonsocial);
	        pst.setString(2, direccion);
	        pst.setString(3, correo);
	        pst.setString(4, telefono);
	        pst.setString(5, fechacreacion);
	        pst.setString(6, web);
	        pst.setInt(7, idcompañia);
	       

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idcompañia + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idcompañia + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	
	
	public void delete(int idcompañia ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // 
		
		String script = "DELETE FROM  tblcompañia WHERE idcompañia = ?";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idcompañia);
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
}