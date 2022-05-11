package atelier5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tache1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> registre = new ArrayList<>();
		Scanner clavier = new Scanner(System.in);
		String controle;
		do {
			System.out.println("Enregistrer des entiers");
			registre.add(clavier.nextInt());
			System.out.println("Entier enregistré\n");
			clavier.nextLine();
			System.out.println("Voulez-vous continuer Yes/No");
			controle = clavier.nextLine();
			
			
		} while (controle.equalsIgnoreCase("yes"));
		System.out.println(registre);

		clavier.close();
	}

}
