package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Operadores {
	public int idoperadores ;
	public int tipodocumento  ;
	public String nombres ;
	public String apellidos;
	public String direccion;
	public String correo ;
	public String telefono;
	public int idvehiculo ;
	public int documento;
	Conexion conector = new Conexion();
	
	
	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNombre() {
		return nombres;
	}
	public void setNombre(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellidos;
	}
	public void setApellido(String apellidos) {
		this.apellidos = apellidos;
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
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public int getDocumento() {
		return tipodocumento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public void create(int tipodocumento, String nombres,String apellidos,String direccion,
			String correo, String telefono,int idvehiculo, int documento ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tbloperadores (tipodocumento, nombres,apellidos, direccion,correo, telefono,idvehiculo, documento) values (?,?,?,?,?,?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, tipodocumento);
			pst.setString(2, nombres);
			pst.setString(3, apellidos);
			pst.setString(4, direccion);
			pst.setString(5, correo);
			pst.setString(6, telefono);
			pst.setInt(7, idvehiculo);
			pst.setInt(8, documento);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void read(int idoperadores, JTextField tipodocumento, JTextField nombres,JTextField apellidos,JTextField direccion,
			JTextField correo, JTextField telefono,JTextField idvehiculo, JTextField documento) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "SELECT * FROM tbloperadores WHERE idoperadores = ? ";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idoperadores);
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				tipodocumento.setText(rs.getString(2));
				nombres.setText(rs.getString(3));
				apellidos.setText(rs.getString(4));
				direccion.setText(rs.getString(5));
				correo.setText(rs.getString(6));
				telefono.setText(rs.getString(7));
				idvehiculo.setText(rs.getString(8));
				documento.setText(rs.getString(9));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void update(int idoperadores, int tipodocumento, String nombres,String apellidos,String direccion,
			String correo, String telefono,int idvehiculo, int documento ) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tbloperadores SET tipodocumento = ?, nombres = ? , apellidos = ?, direccion = ?,correo = ?, telefono =?, idvehiculo = ?, documento = ? WHERE idoperadores = ?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	       
	        pst.setInt(1, tipodocumento);
	        pst.setString(2, nombres);
	        pst.setString(3, apellidos);
	        pst.setString(4, direccion);
	        pst.setString(5, correo);
	        pst.setString(6, telefono);
              pst.setInt(7, idvehiculo);
	        pst.setInt(8, documento);
	        pst.setInt(9, idoperadores);
	        
	        
	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idoperadores + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idoperadores + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    } 
	}
	
	
	public void delete(int idoperadores) {
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		
		String script = "DELETE FROM tbloperadores WHERE idoperadores = ?";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idoperadores);
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	


}
