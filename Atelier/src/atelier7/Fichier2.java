package atelier7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Fichier2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path source = Paths.get("mesDossiers/registre.txt");
		List<String> lignes = Files.readAllLines(source);
		
		for (String line : lignes) {
			System.out.println(line);
		}

	}

}
