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
        	JOptionPane.showConfirmDialog(null,"Usuario o contraseñas incorrectas"); 
       
        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	public void recupercontraseña(int documento, String contraseña,String contraseña1) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    
	    String script = "Update tblpromotores set contraseña = ?, contraseña1 = ? where documento = ?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setString(1, contraseña);
	        pst.setString(2, contraseña1);
	        pst.setInt(3, documento);
	        
	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea recuperar la contraseña al usuario " + documento + " ?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	          
	        }
	              
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	

}
