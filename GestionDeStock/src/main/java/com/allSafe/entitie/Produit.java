package com.allSafe.entitie;

public class Produit {
	private int id;
	private String nom;
	private String designation;
	private Double prix;
	private int quantite;
	
	public Produit() {
		super();
	}

	
	public Produit(String nom, String designation, Double prix, int quantite) {
		super();
		this.nom = nom;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
