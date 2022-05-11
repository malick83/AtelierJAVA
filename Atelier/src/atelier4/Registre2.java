package atelier4;

import java.util.Scanner;

public class Registre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		affichage(dataRegistre(2));

	}
	
	public static String[][] dataRegistre(int nombre) {
		String[][] data = new String[nombre][7];
		for (int i = 0; i < nombre; i++) {
			
			Scanner clavier = new Scanner(System.in);
			
			System.out.println("Entrer un nom");
			data[i][1] = clavier.nextLine();
			
			System.out.println("Entrer un prénom");
			data[i][2] = clavier.nextLine();
			
			System.out.printf("Entrer le matricule de %s%n", data[i][1]);
			data[i][0] = clavier.nextLine();
			
			System.out.printf("Entrer l'adresse de %s%n", data[i][1]);
			data[i][3] = clavier.nextLine();
			
			System.out.printf("Entrer votre date de naissance de %s%n", data[i][1]);
			data[i][4] = clavier.nextLine();
			
			System.out.printf("Entrer votre lieu de naissance de %s%n", data[i][1]);
			data[i][5] = clavier.nextLine();
			
			System.out.printf("Entrer votre numéro de téléphone de %s%n", data[i][1]);
			data[i][6] = clavier.nextLine();
			System.out.println("-----------------------------------------------------");
		}
		return data;
	}
	public static void affichage(String [][] mesDonnees) {
		for(String[] donne : mesDonnees) {
			System.out.println("----------Informations d'une personne----------");
			for (String item : donne) {
				System.out.println(item);
			}
		}
	}

}
