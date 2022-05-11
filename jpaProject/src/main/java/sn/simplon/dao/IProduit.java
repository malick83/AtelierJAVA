package sn.simplon.dao;

import java.util.List;

import sn.simplon.entities.Produit;

public interface IProduit {
	public int add(Produit produit);
	public int delete(int id);
	public int update(Produit produit);
	public List<Produit> getAll();
	public Produit getId(int id);

}
