package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Vehiculos {
	public int idvehiculo ;
	public String matricula ;
	public String marca ;
	public int puestos ;
	public String modelo;
	public int numeromotor;
	public String categoria ;
	public int idtipotransporte ;
	
	Conexion conector = new Conexion();
	
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdtipotransporte() {
		return idtipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}
	
	public void create(String matricula, String marca,int puestos,String modelo,int numeromotor, String categoria, int idtipotransporte ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la txc
		
		String script = "INSERT INTO tblvehiculo (matricula, marca,puestos,modelo,numeromotor, categoria, idtipotransporte) values (?,?,?,?,?,?,?)";
		
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, matricula);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4, modelo);
			pst.setInt(5, numeromotor);
			pst.setString(6, categoria);
			pst.setInt(7, idtipotransporte);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void read(int idvehiculo, JTextField matricula, JTextField marca,JTextField puestos,JTextField modelo,JTextField numeromotor, JTextField categoria, JTextField idtipotransporte) {
	Connection dbConnection = null;
	PreparedStatement pst = null; // 
	
	String script = "SELECT * FROM tblvehiculo WHERE idvehiculo = ?";
	try {
		
		dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		
		pst.setInt(1, idvehiculo);
		
		ResultSet rs = pst.executeQuery();
		
		
		while (rs.next()) {
			matricula.setText(rs.getString(2));
			marca.setText(rs.getString(3));
			puestos.setText(rs.getString(4));
			modelo.setText(rs.getString(5));
			numeromotor.setText(rs.getString(6));
			categoria.setText(rs.getString(7));
			idtipotransporte.setText(rs.getString(8));
				
			
		}
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
	
	
}
	
	public void update(int idvehiculo,String matricula, String marca,int puestos,String modelo,int numeromotor, String categoria, int idtipotransporte   ) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblvehiculo SET  matricula=?, marca=?,puestos=?,modelo=?,numeromotor=?, categoria=?, idtipotransporte=?  WHERE idvehiculo=?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setString(1, matricula);
	        pst.setString(2, marca);
	        pst.setInt(3, puestos);
	        pst.setString(4, modelo);
	        pst.setInt(5, numeromotor);
	        pst.setString(6, categoria);
	        pst.setInt(7, idtipotransporte);
	        pst.setInt(8, idvehiculo);
	        
	       

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idvehiculo + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + idvehiculo + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	public void delete(int idvehiculo) {
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		
		String script = "DELETE FROM tblvehiculo WHERE idvehiculo = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, idvehiculo);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
//	line
	

}
