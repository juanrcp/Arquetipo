package utils;

public class VariablesConexion {
	
	//Clase con los datos para establecer la conexion con la BBDD
	static final String USER = "postgres";
	static final String PASS = "fp13DAW";
	static final String PORT = "5432";
	static final String HOST = "localhost";
	static final String DB = "EjemploInicial";	
	
	public static String getUser() {
		return USER;
	}
	public static String getPass() {
		return PASS;
	}
	public static String getPort() {
		return PORT;
	}
	public static String getHost() {
		return HOST;
	}
	public static String getDb() {
		return DB;
	}
}
