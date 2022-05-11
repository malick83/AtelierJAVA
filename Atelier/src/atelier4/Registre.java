package atelier4;

import java.util.Scanner;

public class Registre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		affichage(dataRegistre());

	}
	
	public static String[] dataRegistre() {
		String [] data = new String[7];
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer votre matricule");
		data[0] = clavier.nextLine();

		System.out.println("Entrer votre nom");
		data[1] = clavier.nextLine();
		
		System.out.println("Entrer votre prénom");
		data[2] = clavier.nextLine();
		
		System.out.println("Entrer votre adresse");
		data[3] = clavier.nextLine();
		
		System.out.println("Entrer votre date de naissance");
		data[4] = clavier.nextLine();
		
		System.out.println("Entrer votre lieu de naissance");
		data[5] = clavier.nextLine();
		
		System.out.println("Entrer votre numéro de téléphone");
		data[6] = clavier.nextLine();
		
		clavier.close();
		return data;
	}
	public static void affichage(String [] mesDonnees) {
		for(String donne : mesDonnees) {
			System.out.println(donne);
		}
	}

}
