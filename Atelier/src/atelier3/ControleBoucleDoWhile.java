package atelier3;

import java.util.Scanner;

public class ControleBoucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		
		int nombre = 0;
		do {
			System.out.println("Entrez un nombre positif");
			nombre = clavier.nextInt();
		}while(nombre<=0);
		System.out.printf("vous avez entrer %d%n", nombre);
		clavier.close();
	}

}
