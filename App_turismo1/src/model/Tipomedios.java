package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Tipomedios {

	public String nombre; 
	public String observacion;
	public int idtiposmedios;
	
	Conexion conector = new Conexion();
	public int getIdtiposmedios() {
		return idtiposmedios;
	}
	public void setIdtiposmedios(int idtiposmedios) {
		this.idtiposmedios = idtiposmedios;
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
	
	public void create(String nombre, String observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tbltiposmedios (nombre, observacion) values (?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, nombre);
			pst.setString(2, observacion);
					
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void read(int codigo, JTextField nombre, JTextField observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //
		
		String script = " SELECT * FROM tbltiposmedios WHERE idtiposmedios = ?";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, codigo);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
			}
				
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	public void update(int idtiposmedios,String nombre, String observacion ) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tbltiposmedios SET nombre = ?, observacion = ? WHERE idtiposmedios=?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setString(1, nombre);
	        pst.setString(2, observacion);
	        pst.setInt(3, idtiposmedios);
	       

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idtiposmedios + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idtiposmedios + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	
	public void delete(int idtiposmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tbltiposmedios WHERE idtiposmedios = ?";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idtiposmedios);
			
					
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
}