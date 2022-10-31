package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import utils.VariablesConexion;

public class PostgreSQL {
		
		//CONSTANTES OBTENIDAS DE LA CLASE VariablesConexion
		final String HOST = VariablesConexion.getHost();
		final String PORT = VariablesConexion.getPort();
		final String DB = VariablesConexion.getDb();
		final String USER = VariablesConexion.getUser();
		final String PASS = VariablesConexion.getPass();
		
		//Metodo que establece la conexion. 
		public static Connection generaConexion(final String host, final String port, final String db, final String user, final String pass) {

			System.out.println("[INFORMACIÓN-conexionPostgresql-generaConexion] Entra en generaConexion");
			
	        /*Definimos connection a null y url a vacío para 
	         * asegurarnos de que ambas variables no contienen nada.
	         */
	        Connection conexion = null;
	        String url = "";            
	        url = "jdbc:postgresql://" + host + ":" + port + "/" + db;
			
	        try {
	        	
	        	/*Class.forName obtiene una instancia de la clase de java especificada.
				*En este caso registra la clase como driver JDBC
				*/
	            try {
	                Class.forName("org.postgresql.Driver");
	            } catch (ClassNotFoundException cnfe) {
	                System.out.println("[ERROR-conexionPostgresql-generaConexion] Error en registro driver PostgreSQL: " + cnfe);
	            }
	      
	            //Conexión a la base de datos en PostgreSQL y validación de esta
	            conexion = DriverManager.getConnection(url, user, pass);           
	            boolean esValida = conexion.isValid(50000);
	            if(esValida == false) {
	            	conexion = null;
	            }
	            System.out.println(esValida ? "[INFORMACIÓN-conexionPostgresql-generaConexion] Conexión a PostgreSQL válida" : "[ERROR-conexionPostgresql-generaConexion] Conexión a PostgreSQL no válida");
	            return conexion;
	            
	        } catch (java.sql.SQLException jsqle) {
	        	
	            System.out.println("[ERROR-conexionPostgresql-generaConexion] Error en conexión a PostgreSQL (" + url + "): " + jsqle);
	            return conexion;
	            
	        }
	}
		
}
