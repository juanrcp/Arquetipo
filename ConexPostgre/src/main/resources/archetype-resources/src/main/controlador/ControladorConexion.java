package controlador;

import java.sql.Connection;
import java.util.ArrayList;

import modelo.conexion.PostgreSQL;
import utils.CierreConexion;
import utils.VariablesConexion;

public class ControladorConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONSTANTES con las variables para establecer la conexion. 
		final String HOST = VariablesConexion.getHost();
		final String PORT = VariablesConexion.getPort();
		final String DB = VariablesConexion.getDb();
		final String USER = VariablesConexion.getUser();
		final String PASS = VariablesConexion.getPass();
		
		//Generamos la conexion con el metodo correspondiente a la clase que nos intera en este caso PostgreSQL 
		System.out.println("[INFORMACIÓN-controladorConexion-main] Lamada generaConexion");
		//PostgreSQL postgre = new PostgreSQL();
		Connection conexionGenerada = PostgreSQL.generaConexion(HOST,PORT,DB,USER,PASS);
				
		//Comprobamos que la conexion se ha realizado y que no es nula		
		if(conexionGenerada != null) {
			System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] CONEXION ESTABLECIDA");			
		}
		//Al terminar todas las operaciones cerramos la conexion. 		
		CierreConexion.Cerrar(conexionGenerada);					

	}

}
