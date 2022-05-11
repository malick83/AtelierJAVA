package com.allsafe.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Fichier2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path monDossier = Paths.get("./monDossier1");

		if (!Files.exists(monDossier)) {
			Files.createDirectory(monDossier);
		} else {
			System.out.println("Le dossier existe déjà");
		}

		Path source = Paths.get("./monDossier/nouveauFichier.txt");

		Files.move(source, monDossier.resolve("nouveauFichier.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		
	
	}

}
