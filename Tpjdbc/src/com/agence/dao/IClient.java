package com.agence.dao;

import java.sql.ResultSet;
import java.util.Scanner;

import com.agence.entities.Client;

public interface IClient {
	public ResultSet selectQuery();
	public boolean insertQuery(Client client);
	public Client saisie(Client client, Scanner clavier);
	public ResultSet selectOneQuery(String key);
	public boolean updateQueryNom(Client client, String key);
	public boolean updateQueryPrenom(Client client, String key);
	public boolean updateQueryNumero(Client client, String key);
	public boolean deleteOneQuery(String key);
	public boolean updateQueryAdresse(Client client, String key);
	public boolean updateQueryTel(Client client, String key);
	
}
