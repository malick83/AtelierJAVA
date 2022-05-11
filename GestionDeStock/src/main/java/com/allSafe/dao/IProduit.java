package com.allSafe.dao;

import java.sql.ResultSet;

import com.allSafe.entitie.Produit;

public interface IProduit {
	public Produit ajouter(Produit p);
	public void supprimer(int id);
	public ResultSet liste();
	public Produit modifier(Produit p);
	
}
