package atelier4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Registre3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		affichage(dataRegistre());


	}
	
	public static ArrayList<ArrayList<String>> dataRegistre() {
		ArrayList<ArrayList<String>> datas = new ArrayList<>();

		String controle;
		do {
			
			datas.add(new ArrayList<>());
			
			Scanner clavier = new Scanner(System.in);
			
			System.out.println("Entrer un nom");
			datas.get(0).add(clavier.nextLine());
			
			System.out.println("Entrer un prénom");
			datas.get(0).add(clavier.nextLine());
			
			System.out.printf("Entrer le matricule%n");
			datas.get(0).add(clavier.nextLine());
			
			System.out.printf("Entrer l'adresse%n");
			datas.get(0).add(clavier.nextLine());
			
			System.out.printf("Entrer votre date de naissance %n");
			datas.get(0).add(clavier.nextLine());
			
			System.out.printf("Entrer votre lieu de naissance %n");
			datas.get(0).add(clavier.nextLine());
			
			System.out.printf("Entrer votre numéro de téléphone %n");
			datas.get(0).add(clavier.nextLine());
			System.out.println("Voulez - vous continuer Y/N ?");

			controle = clavier.nextLine();
			
		} while(controle.equalsIgnoreCase("Yes"));

		return datas;
	}
	public static void affichage(ArrayList<ArrayList<String>> arrayList) {
		for(ArrayList<String> donne : arrayList) {
			System.out.println("----------Informations---------------");
			for (int i = 0; i < donne.size(); i++) {
				System.out.println(donne.get(i));
			}
		}
	}

}
