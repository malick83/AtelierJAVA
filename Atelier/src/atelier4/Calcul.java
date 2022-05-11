package atelier4;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre");
		int nombre1 = clavier.nextInt();
		
		System.out.println("Entrer un autre nombre");
		int nombre2 = clavier.nextInt();
		
//		System.out.printf("La somme de ces deux nombres est : %d", addition(nombre1, nombre2));
//		System.out.printf("La différence de ces deux nombres est : %d", soustraction(nombre1, nombre2));
//		division(nombre1, nombre2);
		System.out.printf("La multiplication de ces deux nombres est : %d", multiplication(nombre1, nombre2));


	}
	public static int addition(int ...items) {
		int somme=0;
		for(int item:items) {
			somme+=item;
		}
		return somme;
	}
	public static int soustraction(int nombre1, int nombre2) {
		return nombre1 - nombre2;
	}
	public static void division(float nombre1, float nombre2) {
		if (nombre2 == 0) {
			System.out.println("La division par zéro n'est pas possible");
		}else {
			float res = nombre1 / nombre2;
			System.out.printf("le quotient est %.2f", res);			
		}
	}
	public static int multiplication(int nombre1, int nombre2) {
		return nombre1 * nombre2;
	}
}
