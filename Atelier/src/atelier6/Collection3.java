package atelier6;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		ArrayList<String> registre = new ArrayList<>();
		registre.add("L'enfant noir");
		registre.add("Une si longue lette");
		registre.add("Vol de nuit");
		registre.add("Soleil des indépendances");
		registre.add("Une vie de boy");
		registre.add("nini");
		
//		affichage(registre);
		suppression(registre);
		

	}
	public static void affichage(ArrayList<String> registre) {
		System.out.printf("L'élément d'indice 3 est %s", registre.get(3));		
	}
	
	public static void suppression(ArrayList<String> registre) {
		System.out.println("----------------Avant suppression-----------------\n");
		for (String item : registre) {
			System.out.println(item);
		}
		registre.remove(5);
		System.out.println("L'élément d'indice 5 a été supprimé\n");
		
		System.out.println("----------------Aprés suppression-----------------\n");
		for (String item : registre) {
			System.out.println(item);
		}
	}

}
