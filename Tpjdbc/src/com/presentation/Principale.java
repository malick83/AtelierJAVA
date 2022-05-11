package com.presentation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.agence.dao.ClientImpl;
import com.agence.entities.Client;

public class Principale {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		int monChoix;
		boolean controle = false;
		ClientImpl clientImpl = new ClientImpl();
		Client client = new Client();
		
		System.out.println("Tableau de bord de l'application");
		
		int sizei = 4;
		int sizej = 39;
         
        for(int i =0;i<sizei;i++){
             
            for(int j =0;j<sizej;j++)
            {
                if (i == 0 || i == sizei-1 ||j == 0 || j == sizej-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        System.out.print("\n");
        }
        System.out.println("Veuillez tapez un chiffre correspondant\n");
        System.out.println("1: Voir tous les clients");
        System.out.println("2: Faire un enregistrement de client");
        System.out.println("3: Voir un client");
        System.out.println("4: Modifier un client");
        System.out.println("5: Supprimer un client");
		
		do {
			System.out.println("\nEntrez votre choix, SVP");
			if (clavier.hasNextInt()) {
				monChoix = clavier.nextInt();
				switch (monChoix) {
				case 1:
					ResultSet resultats = null;
					try {
						resultats = clientImpl.selectQuery();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Liste des enregistrements\n");
					while(resultats.next()) {
						System.out.println(resultats.getInt(1)+" "+resultats.getInt(2)+ " "+ resultats.getString(3)+"  "+resultats.getString(4)+" "+resultats.getString(5)+ " " +resultats.getString(6)+ " " +resultats.getString(7));											
					}
					controle = true;
					break;

				case 2:
					boolean result = false;
					
					Client myClient = clientImpl.saisie(client, clavier);
					result = clientImpl.insertQuery(myClient);
					
					if(result) {
						System.out.println("Aucun probéme d'insertion");
					}
					controle = true;
					break;
				case 3:
					System.out.println("Informations d'un client");
					clavier.nextLine();
					System.out.println("Entrer une information de recherche sur client(téléphone, email)");
					String key = clavier.nextLine();
					
					ResultSet result2  = clientImpl.selectOneQuery(key);
					if (result2 != null) {
						while(result2.next()) {
							System.out.println(result2.getInt(1)+" "+result2.getInt(2)+ " "+ result2.getString(3)+"  "+result2.getString(4)+" "+result2.getString(5)+ " " +result2.getString(6)+ " " +result2.getString(7));											
						}
					}else {
						System.out.println("Client introuvable !!");
					}
					
//					System.out.println(result2.getMetaData());
					
					controle = true;
					break;
				case 4:
					System.out.println("\nModification de client");
					
					clavier.nextLine();
					System.out.println("Entrer une information du client à modifier(téléphone, email)");
					
					String key2 = clavier.nextLine();
					
					ResultSet result3  = clientImpl.selectOneQuery(key2);
					if (result3 != null) {
						while(result3.next()) {
							System.out.println(result3.getInt(1)+" "+result3.getInt(2)+ " "+ result3.getString(3)+"  "+result3.getString(4)+" "+result3.getString(5)+ " " +result3.getString(6)+ " " +result3.getString(7));											
						}
					}else {
						System.out.println("Client introuvable !!");
					}
					System.out.println("\nPour modifier ce client, tapez :");
					System.out.println("1- pour modifier le numéro du client");
					System.out.println("2- pour modifier le nom");
					System.out.println("3- pour modifier le prénom");
					System.out.println("4- pour modifier l'adresse");
					System.out.println("5- pour modifier le numéro de téléphone");
					System.out.println("6- pour modifier l'email");
					
					int value = clavier.nextInt();
					switch (value) {
					case 1:
						clavier.nextLine();
						System.out.println("\nEntrer le nouveau numéro");
						client.setNumero(clavier.nextInt());
						clientImpl.updateQueryNumero(client, key2);
						ResultSet result6  = clientImpl.selectOneQuery(key2);
						if (result6 != null) {
							while(result6.next()) {
								System.out.println(result6.getInt(1)+" "+result6.getInt(2)+ " "+ result6.getString(3)+"  "+result6.getString(4)+" "+result6.getString(5)+ " " +result6.getString(6)+ " " +result6.getString(7));											
							}
						}else {
							System.out.println("Client introuvable !!");
						}
						
						break;
						
					case 2:
						clavier.nextLine();
						System.out.println("\nEntrer le nouveau nom");
						client.setNom(clavier.nextLine());
						clientImpl.updateQueryNom(client, key2);
						ResultSet result4  = clientImpl.selectOneQuery(key2);
						if (result4 != null) {
							while(result4.next()) {
								System.out.println(result4.getInt(1)+" "+result4.getInt(2)+ " "+ result4.getString(3)+"  "+result4.getString(4)+" "+result4.getString(5)+ " " +result4.getString(6)+ " " +result4.getString(7));											
							}
						}else {
							System.out.println("Client introuvable !!");
						}
						break;
						
					case 3:
						clavier.nextLine();
						System.out.println("\nEntrer le nouveau prénom");
						client.setPrenom(clavier.nextLine());
						clientImpl.updateQueryPrenom(client, key2);
						ResultSet result5  = clientImpl.selectOneQuery(key2);
						if (result5 != null) {
							while(result5.next()) {
								System.out.println(result5.getInt(1)+" "+result5.getInt(2)+ " "+ result5.getString(3)+"  "+result5.getString(4)+" "+result5.getString(5)+ " " +result5.getString(6)+ " " +result5.getString(7));											
							}
						}else {
							System.out.println("Client introuvable !!");
						}
						break;
						
					case 4:
						clavier.nextLine();
						System.out.println("\nEntrer la nouvelle adresse");
						client.setAdresse(clavier.nextLine());
						clientImpl.updateQueryAdresse(client, key2);
						ResultSet result7  = clientImpl.selectOneQuery(key2);
						if (result7 != null) {
							while(result7.next()) {
								System.out.println(result7.getInt(1)+" "+result7.getInt(2)+ " "+ result7.getString(3)+"  "+result7.getString(4)+" "+result7.getString(5)+ " " +result7.getString(6)+ " " +result7.getString(7));											
							}
						}else {
							System.out.println("Client introuvable !!");
						}
						break;	
						
					case 5:
						clavier.nextLine();
						System.out.println("\nEntrer le nouveau numéro de téléphone");
						client.setTel(clavier.nextLine());
						clientImpl.updateQueryTel(client, key2);
						ResultSet result8  = clientImpl.selectOneQuery(key2);
						if (result8 != null) {
							while(result8.next()) {
								System.out.println(result8.getInt(1)+" "+result8.getInt(2)+ " "+ result8.getString(3)+"  "+result8.getString(4)+" "+result8.getString(5)+ " " +result8.getString(6)+ " " +result8.getString(7));											
							}
						}else {
							System.out.println("Client introuvable !!");
						}
						break;
						
					default:
						break;
					}
				
					
					controle = true;
					break;
					
				case 5:
					System.out.println("Suppression de client");
					clavier.nextLine();
					System.out.println("Entrer une information de recherche sur client(téléphone, email)");
					String key3 = clavier.nextLine();
					
					boolean result4  = clientImpl.deleteOneQuery(key3);
					if (result4 == true) {
						System.out.println("Client supprimé");
					}else {
						System.out.println("Client non supprimé");
					}			
					
					ResultSet mesResultats = null;
					try {
						mesResultats = clientImpl.selectQuery();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Liste des enregistrements\n");
					while(mesResultats.next()) {
						System.out.println(mesResultats.getInt(1)+" "+mesResultats.getInt(2)+ " "+ mesResultats.getString(3)+"  "+mesResultats.getString(4)+" "+mesResultats.getString(5)+ " " +mesResultats.getString(6)+ " " +mesResultats.getString(7));											
					}
					
					controle = true;
					break;
					
				default:
					System.out.println("Choix introuvable");
					controle = true;
					break;
				}
			}else {
				System.out.println("Il faut entrer un chiffre");
				clavier.nextLine();
				controle = true;
			}
			
		} while(controle);
		
		

	}

}
