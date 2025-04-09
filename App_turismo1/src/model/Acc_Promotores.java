package model;

import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.Conexion;
import view.Fr_Acceso;
import view.Interfaz_promotor;

public class Acc_Promotores {
	
	public int documento;
	public String contraseña;
	
	Interfaz_promotor principal = new Interfaz_promotor();
	
	Conexion conector = new Conexion();
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void ControlAcceso(int documento, String contraseña) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "SELECT * FROM tblpromotores WHERE documento = ? AND contraseña = ?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setInt(1, documento);
	        pst.setString(2, contraseña);
	        
	        
	        ResultSet rs =  pst.executeQuery();
	        
        	if(rs.next()) {
            int seguir = JOptionPane.showConfirmDialog(null, "¡Desea iniciar sesion?");
        	if (seguir == JOptionPane.OK_OPTION) 
        		JOptionPane.showConfirmDialog(null, "Acceso permitido");
        		principal.show();
        	
        		
        } else {
        	JOptionPane.showConfirmDialog(null,"No se encuentra registrado en el sistema"); 
       
        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	

}
