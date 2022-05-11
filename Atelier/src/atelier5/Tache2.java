package atelier5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tache2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		ArrayList<Integer> registre = new ArrayList<>();
		String controle;
		do {
			System.out.println("Entrer un entier");
			registre.add(clavier.nextInt());
			clavier.nextLine();
			System.out.println("Voulez-vous continuer yes/no");
			controle = clavier.nextLine();
			
		} while (controle.equalsIgnoreCase("yes"));
		final int TAILLE = registre.size();
		float somme=0;
		for (int i=0; i<TAILLE; i++) {
			somme+=(float) registre.get(i);
		}
		System.out.printf("La moyenne est de %.2f", (somme/TAILLE));
		clavier.close();
	}

}
