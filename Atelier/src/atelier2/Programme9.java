package atelier2;

import java.util.Scanner;

public class Programme9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre réel");
		float reel = clavier.nextFloat();
		
		System.out.println("Entrer un nombre entier");
		int entier = clavier.nextInt();
		clavier.nextLine();
		
		System.out.println("Entrer une chaine");
		String chaine = clavier.nextLine();
		
		System.out.printf("Réel: %f%nEntier: %d%nChaine: %s%n", reel, entier, chaine);
		
		clavier.close();

	}
}
