package com.allSafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.allSafe.entitie.Produit;

public class ProduitImpl implements IProduit {

	@Override
	public Produit ajouter(Produit p) {
		// TODO Auto-generated method stub
		Connection connection = Database.getConnection();
		
		try {
			PreparedStatement resquest = connection.prepareStatement("INSERT INTO produit(nom, designation, prix, quantite) VALUES(?, ?, ?, ?)");
			resquest.setString(1, p.getNom());
			resquest.setString(2, p.getDesignation());
			resquest.setDouble(3, p.getPrix());
			resquest.setInt(4, p.getQuantite());
			
			resquest.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultSet liste() {
		// TODO Auto-generated method stub
		Connection connection = Database.getConnection();
		ResultSet result = null;
		try {
			String resquest = "SELECT * FROM produit";
			Statement stmt = connection.createStatement();
			result = stmt.executeQuery(resquest);
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public Produit modifier(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

}
