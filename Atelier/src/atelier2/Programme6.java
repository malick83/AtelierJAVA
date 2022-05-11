package atelier2;

import java.util.Scanner;

public class Programme6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] registre = new int[5];
		final int TAILLE_TAB = registre.length;
		for (int i = 0; i < TAILLE_TAB; i++){
			Scanner saisie = new Scanner(System.in);
			System.out.println("Entrer un nombre positif");
			if (!saisie.hasNextInt()) {
				System.out.println("vous devez entrer un nombre positif");
				saisie.next();
				continue;
			}
			else {
				registre[i] = saisie.nextInt();
				if (registre[i] < 0) {
					System.out.println("Le nombre doit être positif");
					System.exit(0);
				}
			}
//			saisie.close();
		}
		int som = 0;
		int moy = 0;
		for (int i = 0; i < TAILLE_TAB; i++) {
			som += registre[i];
			moy = som/TAILLE_TAB;
		}
		System.out.printf("La moyenne est de %d", moy);
	}
}
