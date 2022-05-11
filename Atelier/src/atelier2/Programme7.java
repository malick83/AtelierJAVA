package atelier2;

import java.util.Scanner;

public class Programme7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre ");
		int nombre = clavier.nextInt();
		if(nombre == 0) {
			System.out.println("Le nombre est null");
		}else if(nombre < 0){
			System.out.println("Le nombre est négatif");
		}
		else {
			System.out.println("Le nombre est positif");
		}
		clavier.close();
	}
}
