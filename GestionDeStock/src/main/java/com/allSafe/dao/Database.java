package com.allSafe.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	private static Connection instance = null;
	private static final String DB_PATH = "com.mysql.cj.jdbc.Driver";
	private static final String DB_DSN = "jdbc:mysql://localhost:3306/atelierJdbcdb";
	private static final String DB_USER = "m3ta";
	private static final String DB_PASSWORD = "";
	
	private static Connection connection;
	static {
		try {
			Class.forName(DB_PATH);
			connection = DriverManager.getConnection(DB_DSN, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		return connection;
	}
	public static void setConnection(Connection connection) {
		Database.connection = connection;
	}
	
}
