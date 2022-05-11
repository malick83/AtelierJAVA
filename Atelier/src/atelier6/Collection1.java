package atelier6;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> registreLivre = new ArrayList<>();
		registreLivre.add("L'enfant noir");
		registreLivre.add("Une si longue lette");
		registreLivre.add("Vol de nuit");
		registreLivre.add("Soleil des indépendances");
		
		for (String item : registreLivre) {
			System.out.println(item);
		}

	}

}
