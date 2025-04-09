package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Clientes {
	
	public int tipodocumento; 
	public int documento;
	public String nombres ;
	public String apellidos ;
	public String eps ;
	public String alergias ;
	public int fechanacimiento ;
	public String correo ;
	public String estadocivil ;
	public String telefono;
	public String direccion;
	
	Conexion conector = new Conexion();
	
	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public int getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(int fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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
	public void create(int tipodocumento, int documento, String nombres, String apellidos, String eps,String alergias,
			int fechanacimiento, String correo, String estadocivil, String telefono, String direccion) {
		Connection dbConnection = null; 
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tblclientes (tipodocumento, documento, nombres, apellidos, alergias, eps, fechanacimiento, correo, estadocivil, telefono, direccion) values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setInt(7, fechanacimiento);
			pst.setString(8, correo);
			pst.setString(9, estadocivil);
			pst.setString(10, telefono);
			pst.setString(11, direccion);
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void read(int idclientes, JTextField tipodocumento, JTextField documento, JTextField nombres, JTextField apellidos, JTextField eps,JTextField alergias,
			JTextField fechanacimiento, JTextField correo, JTextField estadocivil, JTextField telefono, JTextField direccion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // 
		
		String script = "SELECT * FROM tblclientes WHERE idclientes = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idclientes);
			
			ResultSet rs = pst.executeQuery(); 
			
			
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));				
				apellidos.setText(rs.getString(5));
				eps.setText(rs.getString(6));
				alergias.setText(rs.getString(7));				
				fechanacimiento.setText(rs.getString(8));;
				correo.setText(rs.getString(9));
				estadocivil.setText(rs.getString(10));
				telefono.setText(rs.getString(11));				
				direccion.setText(rs.getString(12));;
				
				
				
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	public void update(int idclientes, int tipodocumento, int documento, String nombres, String apellidos, String eps,String alergias,
			String fechanacimiento, String correo, String estadocivil, String telefono, String direccion) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblclientes SET tipodocumento = ?, documento = ? , nombres = ?, apellidos = ?,eps = ?, alergias =? , fechanacimiento =? , correo =? , estadocivil =? , telefono =?  , direccion =? WHERE idclientes = ?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setInt(1, tipodocumento);
	        pst.setInt(2, documento);
	        pst.setString(3, nombres);
	        pst.setString(4, apellidos);
	        pst.setString(5, eps);
	        pst.setString(6, alergias);
	        pst.setString(7, fechanacimiento);
	        pst.setString(8, correo);
	        pst.setString(9, estadocivil);
	        pst.setString(10, telefono);
	        pst.setString(11, direccion);
	        pst.setInt(12, idclientes);

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idclientes + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idclientes + " actualizado");
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
	
	
	public void delete(int idclientes) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // 
		
		String script = "DELETE FROM tblclientes WHERE idclientes = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idclientes);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	

}
