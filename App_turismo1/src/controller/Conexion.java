package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	public Connection conectarBD() {
		
		Connection connection = null;
		
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo", "root", "2556229");
			System.out.println("Conectado a la base de datos exitosamente");
			
		}	catch(SQLException e){
			System.out.println("Error en la conexion a la base de datos");
			
		}
		
		return connection;
	}
}