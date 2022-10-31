package utils;

import java.sql.Connection;
import java.sql.SQLException;

public class CierreConexion {
	
	//Clase con metodo que cierra una conexion a una BBDD
	public static void Cerrar(Connection conexion) {
		try {
			conexion.close();
			System.out.println("CierreConexion - Cerrar --> Conexion Cerrada.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
