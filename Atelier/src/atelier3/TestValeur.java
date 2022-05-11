package atelier3;

import java.util.Scanner;

public class TestValeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre");
		int nombre1 = clavier.nextInt();
		
		System.out.println("Entrer un autre nombre");
		int nombre2 = clavier.nextInt();
		System.out.printf("La somme de ces deux nombres est %d%n", nombre1+nombre2);
		if(nombre1>nombre2) {
			System.out.printf("Le nombre %d est plus grand que %d%n", nombre1, nombre2);
		}else if(nombre1<nombre2){
			System.out.printf("Le nombre %d est plus grand que %d%n", nombre2, nombre1);
		}else {
			System.out.printf("Les nombres %d et %d sont égaux%n", nombre2, nombre1);
		}

	}

}
