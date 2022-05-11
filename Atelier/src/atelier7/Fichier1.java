package atelier7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Fichier1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		Path registre = Paths.get("mesDossiers/registre.txt");

		String entrer;
		do {
			System.out.println("Entrer un produit");
			entrer = clavier.nextLine()+"\n";
			Files.write(registre, entrer.getBytes(Charset.defaultCharset()), StandardOpenOption.CREATE,
					StandardOpenOption.WRITE, StandardOpenOption.APPEND);

		} while(!entrer.equalsIgnoreCase("fin\n"));

	}

}
