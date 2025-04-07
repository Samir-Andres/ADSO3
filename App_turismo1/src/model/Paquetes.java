package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Paquetes {

	public int codigo ;
	public int iddestino ; 
	public int idorigen; 
	public String fechaventa ; 
	public String horaventa;
	public String fechaejecucion;
	public String horasalida ;
	public String observacion;
	public int idagencia;
	public int idmedios ;
	public int idpromotores; 
	public int idvehiculo; 
	public String precios ;
	public int idclientes;
	Conexion conector = new Conexion();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public int getIdmedios() {
		return idmedios;
	}
	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}
	public int getIdpromotores() {
		return idpromotores;
	}
	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public String getPrecios() {
		return precios;
	}
	public void setPrecios(String precios) {
		this.precios = precios;
	}
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public void create( int iddestino, int idorigen, String fechaventa, String horaventa, String fechaejecucion, 
			String horasalida, String observacion, int idagencia, int idmedios, int idpromotores, int idvehiculo, String precios, int idclientes) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // prepara la txc
			
			String script = "INSERT INTO tblpaquetes (iddestino, idorigen, fechaventa, horaventa, fechaejecucion, horasalida,observacion,idagencia,idmedios,idpromotores,idvehiculo,precios,idclientes) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			try {
				
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setInt(1, iddestino);
				pst.setInt(2, idorigen);
				pst.setString(3, fechaventa);
				pst.setString(4, horaventa);
				pst.setString(5, fechaejecucion);
				pst.setString(6, horasalida);
				pst.setString(7, observacion);
				pst.setInt(8, idagencia);
				pst.setInt(9, idmedios);
				pst.setInt(10, idpromotores);
				pst.setInt(11, idvehiculo);
				pst.setString(12, precios);
				pst.setInt(13, idclientes);
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "Registro con exito");
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
	
	public void read(int codigo,  JTextField iddestino, JTextField idorigen, JTextField fechaventa, JTextField horaventa, JTextField fechaejecucion, 
			JTextField horasalida, JTextField observacion, JTextField idagencia, JTextField idmedios, JTextField idpromotores, JTextField idvehiculo, JTextField precios, JTextField idclientes) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // 
		
		String script = "SELECT * FROM tblpaquetes WHERE codigo = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, codigo);
			
			ResultSet rs = pst.executeQuery();
			
			
			while (rs.next()) {
				iddestino.setText(rs.getString(2));
				idorigen.setText(rs.getString(3));
				fechaventa.setText(rs.getString(4));
				horaventa.setText(rs.getString(5));
				fechaejecucion.setText(rs.getString(6));
				horasalida.setText(rs.getString(7));
				observacion.setText(rs.getString(8));
				idagencia.setText(rs.getString(9));
				idmedios.setText(rs.getString(10));
				idpromotores.setText(rs.getString(11));
				idvehiculo.setText(rs.getString(12));
				precios.setText(rs.getString(13));
				idclientes.setText(rs.getString(14));
					
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void update(int codigo, int iddestino, int idorigen, String fechaventa, String horaventa, String fechaejecucion, 
			String horasalida, String observacion, int idagencia, int idmedios, int idpromotores, int idvehiculo, String precios, int idclientes) {
	    Connection dbconnection = null;
	    PreparedStatement pst = null;
	    String script = "UPDATE tblpaquetes SET iddestino =?, idorigen =?,  fechaventa=?, horaventa=?, fechaejecucion=?, horasalida=?, observacion =?, idagencia =?, idmedios=?, idpromotores =?, idvehiculo=?, precios=?, idclientes=? WHERE codigo = ?";

	    try {
	        dbconnection = conector.conectarBD();
	        pst = dbconnection.prepareStatement(script);
	        
	        pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, fechaejecucion);
			pst.setString(6, horasalida);
			pst.setString(7, observacion);
			pst.setInt(8, idagencia);
			pst.setInt(9, idmedios);
			pst.setInt(10, idpromotores);
			pst.setInt(11, idvehiculo);
			pst.setString(12, precios);
			pst.setInt(13, idclientes);
			pst.setInt(14, codigo);

	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + codigo + "?");
	        if (resp == JOptionPane.YES_OPTION) {
	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro No. " + codigo + " actualizado");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	
	
	public void delete(int codigo) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		
		String script = "DELETE FROM tblpaquetes WHERE codigo = ?";
		try {
			
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, codigo);
			
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	
		
	}
	
	                                                                                                                                                                                                                                                                                                                                                                               
	

}
