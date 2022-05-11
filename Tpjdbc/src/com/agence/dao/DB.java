package com.agence.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	private static Connection instance = null;
	private static final String DB_PATH = "com.mysql.cj.jdbc.Driver";
	private static final String DB_DSN = "jdbc:mysql://localhost:3306/agencedb";
	private static final String DB_USER = "m3ta";
	private static final String DB_PASSWORD = "";
	
    /**
     * 
     * Retourne une connexion à la base de données
     * 
     * @return Connection
     * J'utilise un singleton qui est un design pattern appartenant à la catégorie de Creational pattern.
     * le singleton fait référence à la simplicité(single)
     * Le modéle de création offre un moyen de créer des objets tout en masquant la logique de création plutôt que 
     * d'instancier des objets directement à l'aide de l'opérateur new. 
    */
	
	public static Connection getMyconnection() {
		if (instance == null) {
			try {
				Class.forName(DB_PATH); 
				instance = DriverManager.getConnection(DB_DSN, DB_USER, DB_PASSWORD);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException ex) {
				ex.printStackTrace();
			}return instance;			
		}
		return instance;
	}

}
