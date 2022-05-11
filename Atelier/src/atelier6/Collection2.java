package atelier6;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);

		ArrayList<String> registreLivre = new ArrayList<>();
		registreLivre.add("L'enfant noir");
		registreLivre.add("Une si longue lette");
		registreLivre.add("Vol de nuit");
		registreLivre.add("Soleil des indépendances");
		
		for (int i = 0; i<3; i++) {
			System.out.println("Entrer un livre dans la collection");
			registreLivre.add(clavier.nextLine());
		}
		
		for (String item : registreLivre) {
			System.out.println(item);
		}
	}

}
