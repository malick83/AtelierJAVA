package com.agence.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.agence.entities.Client;

public class ClientImpl implements IClient{

	@Override
	public ResultSet selectQuery() {
		// TODO Auto-generated method stub
		Connection instance = DB.getMyconnection();
		ResultSet result = null;
		try {
			String resquest = "SELECT * FROM client";
			Statement stmt = instance.createStatement();
			result = stmt.executeQuery(resquest);
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean insertQuery(Client client) {
		// TODO Auto-generated method stub
		Connection instance = DB.getMyconnection();
		boolean result = false;
		try {
			PreparedStatement resquest = instance.prepareStatement("INSERT INTO client(numero, nom, prenom, adresse, tel, email) VALUES(?, ?, ?, ?, ?, ?)");
			resquest.setInt(1, client.getNumero());
			resquest.setString(2, client.getNom());
			resquest.setString(3, client.getPrenom());
			resquest.setString(4, client.getAdresse());
			resquest.setString(5, client.getTel());
			resquest.setString(6, client.getEmail());
			resquest.executeUpdate();
			result = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Client saisie(Client client, Scanner clavier) {
		// TODO Auto-generated method stub
		
		clavier.nextLine();
		System.out.println("Entrer le nom du client");
		client.setNom(clavier.nextLine());
		
		System.out.println("Entrer le prenom du client");
		client.setPrenom(clavier.nextLine());
		
		System.out.println("Entrer le numéro du client");
		client.setNumero(clavier.nextInt());
		
		clavier.nextLine();
		
		System.out.println("Entrer le téléphone du client");
		client.setTel(clavier.nextLine());
		
		System.out.println("Entrer l'email du client");
		client.setEmail(clavier.nextLine());
		
		System.out.println("Entrer l'adresse du client");
		client.setAdresse(clavier.nextLine());
		
		clavier.nextLine();
		
		
		return client;
	}
	@Override
	public ResultSet selectOneQuery(String key) {
		Connection instance = DB.getMyconnection();
		ResultSet result = null;
		try {
			PreparedStatement resquest = instance.prepareStatement("SELECT * FROM client WHERE tel = ? OR email = ?");
			resquest.setString(1, key);
			resquest.setString(2, key);
			

			result = resquest.executeQuery();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return result;
		
	}

	@Override
	public boolean updateQueryNom(Client client, String key) {
		Connection instance = DB.getMyconnection();
		boolean result3 = false;
		
		try {
			PreparedStatement resquest;
			resquest = instance.prepareStatement("UPDATE client SET nom = ? WHERE tel = ? OR email = ?");
			resquest.setString(1, client.getNom());
			resquest.setString(2, key);
			resquest.setString(3, key);
			resquest.executeUpdate();
			
			result3 = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result3;
	}
	
	@Override
	public boolean updateQueryPrenom(Client client, String key) {
		Connection instance = DB.getMyconnection();
		boolean result3 = false;
		
		try {
			PreparedStatement resquest;
			resquest = instance.prepareStatement("UPDATE client SET prenom = ? WHERE tel = ? OR email = ?");
			resquest.setString(1, client.getPrenom());
			resquest.setString(2, key);
			resquest.setString(3, key);
			resquest.executeUpdate();
			
			result3 = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result3;
	}
	
	@Override
	public boolean updateQueryNumero(Client client, String key) {
		Connection instance = DB.getMyconnection();
		boolean result3 = false;
		
		try {
			PreparedStatement resquest;
			resquest = instance.prepareStatement("UPDATE client SET numero = ? WHERE tel = ? OR email = ?");
			resquest.setInt(1, client.getNumero());
			resquest.setString(2, key);
			resquest.setString(3, key);
			resquest.executeUpdate();
			
			result3 = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result3;
	}
	
	@Override
	public boolean deleteOneQuery(String key) {
		Connection instance = DB.getMyconnection();
		boolean result3 = false;
		
		try {
			PreparedStatement resquest;
			resquest = instance.prepareStatement("DELETE FROM client WHERE tel = ? OR email = ?");
			resquest.setString(1, key);
			resquest.setString(2, key);
			resquest.executeUpdate();
			
			result3 = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result3;
	}
	@Override
	public boolean updateQueryAdresse(Client client, String key) {
		Connection instance = DB.getMyconnection();
		boolean result3 = false;
		
		try {
			PreparedStatement resquest;
			resquest = instance.prepareStatement("UPDATE client SET adresse = ? WHERE tel = ? OR email = ?");
			resquest.setString(1, client.getAdresse());
			resquest.setString(2, key);
			resquest.setString(3, key);
			resquest.executeUpdate();
			
			result3 = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result3;
	}
	
	@Override
	public boolean updateQueryTel(Client client, String key) {
		Connection instance = DB.getMyconnection();
		boolean result3 = false;
		
		try {
			PreparedStatement resquest;
			resquest = instance.prepareStatement("UPDATE client SET tel = ? WHERE tel = ? OR email = ?");
			resquest.setString(1, client.getTel());
			resquest.setString(2, key);
			resquest.setString(3, key);
			resquest.executeUpdate();

			result3 = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result3;
	}

}
