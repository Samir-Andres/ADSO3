package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Medios {
	
	public int idmedios ;
	public String nombre ;
	public String observacion ; 
	public int idtiposmedios ;
	Conexion conector = new Conexion();
	
	public int getIdmedios() {
		return idmedios;
	}
	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdtiposmedios() {
		return idtiposmedios;
	}
	public void setIdtiposmedios(int idtiposmedios) {
		this.idtiposmedios = idtiposmedios;
	}
	
	public void create(String nombre, String observacion, int idtiposmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tblmedios (nombre,observacion,idtiposmedios) values (?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, idtiposmedios);
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void read(int idmedios, JTextField nombre, JTextField observacion, JTextField idtiposmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // 
		
		String script = "SELECT * FROM tblmedios WHERE idmedios = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idmedios);
			
			ResultSet rs = pst.executeQuery();
			
			
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				idtiposmedios.setText(rs.getString(4));				
					
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void update(int idmedios,String nombre, String observacion, int idtiposmedios) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblmedios SET nombre = ?, observacion = ?,idtiposmedios = ?  WHERE idmedios=?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setString(1, nombre);
	        pst.setString(2, observacion);
	        pst.setInt(3, idtiposmedios);
	        pst.setInt(4, idmedios);
	       

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idmedios + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idmedios + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	
	public void delete(int idmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		
		String script = "DELETE FROM tblmedios WHERE idmedios = ?";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idmedios);
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
}

