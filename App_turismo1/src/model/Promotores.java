package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Promotores {
	public int idpromotores ;
	public int tipodocumento;
	public int documento ;
	public String nombres ;
	public String apellidos ;
	public String direccion ; 
	public String  correopersonal ;
	public String correocorp ;
	public String  fechanacimiento;
	public String telefono;
	public String contraseña;
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdpromotores() {
		return idpromotores;
	}
	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	public void create(int tipodocumento, int documento, String nombres, String apellidos, String direccion,String correopersonal,
			String correocorp, String fechanacimiento, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tblpromotores (tipodocumento, documento, nombres, apellidos, direccion, correopersonal,correocorp,fechanacimiento, telefono) values (?,?,?,?,?,?,?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorp);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public void read(int idoperadores, JTextField tipodocumento, JTextField documento, JTextField nombres, JTextField apellidos, JTextField direccion,JTextField correopersonal,
			JTextField correocorp, JTextField fechanacimiento, JTextField telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "SELECT * FROM tblpromotores WHERE idpromotores = ? ";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idoperadores);
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correopersonal.setText(rs.getString(7));
				correocorp.setText(rs.getString(8));
				fechanacimiento.setText(rs.getString(9));
				telefono.setText(rs.getString(10));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public void update(int idoperadores,int tipodocumento, int documento, String nombres, String apellidos, String direccion,String correopersonal,
			String correocorp, String fechanacimiento, String telefono, String contraseña) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblpromotores SET tipodocumento = ?, documento= ?, nombres= ?, apellidos= ?, direccion= ?, correopersonal= ?,correocorp= ?,fechanacimiento= ?, telefono= ?, contraseña = ? WHERE idpromotores=?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	       
	        pst.setInt(1, tipodocumento);
	        pst.setInt(2, documento);
	        pst.setString(3, nombres);
	        pst.setString(4, apellidos);
	        pst.setString(5, direccion);
	        pst.setString(6, correopersonal);
	        pst.setString(7, correocorp);
	        pst.setString(8, fechanacimiento);
	        pst.setString(9, telefono);
	        pst.setString(10, contraseña);
	        pst.setInt(11, idoperadores);
	       

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idoperadores + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idoperadores + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	
	
	
	
	public void delete(int  idpromotores) {
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		

		String script = "DELETE FROM tblpromotores WHERE idpromotores = ? ";
		
try {
	
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idpromotores);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}