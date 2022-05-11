package atelier2;

import java.util.Scanner;

public class Programme4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un entier :");
		if (clavier.hasNextInt()) {
			int nombre1 = clavier.nextInt();
			System.out.println("Entrer un autre entier :");
			if (clavier.hasNextInt()) {
				int nombre2 = clavier.nextInt();
				try {
					int res = nombre1 / nombre2;
					System.out.printf("le quotient est %d", res);
				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println("La division par zéro n'est pas possible");
				}

			}else {
				System.out.println("Vous devez entrer un entier waay ");
				System.exit(0);
			}
		}else {
			System.out.println("Vous devez entrer un entier ");
			System.exit(0);
		}
		clavier.close();
	}

}
