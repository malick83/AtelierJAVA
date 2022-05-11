package com.allSafe.dao;

import com.allSafe.entitie.Produit;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProduitImpl produit = new ProduitImpl();
		Produit monPrduit = new Produit("Sabou", "laver", 799.00, 89);
		produit.ajouter(monPrduit);

	}

}
