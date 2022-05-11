package com.allsafe.fichier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Fichier3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * Path monDossier = Paths.get("./monDossier2");
		 * 
		 * if (!Files.exists(monDossier)) { Files.createDirectory(monDossier); } else {
		 * System.out.println("Le dossier existe déjà");
		 * 
		 * }
		 * 
		 * 
		 * Path monFichier = Paths.get("./monDossier2/monFichier.txt");
		 * 
		 * Files.copy(source, monFichier, StandardCopyOption.REPLACE_EXISTING);
		 * System.out.println(monFichier);
		 */

		Path source = Paths.get("monDossier1", "nouveauFichier.txt");
		System.out.println(Charset.defaultCharset());

//		List<String> mesLines = Files.readAllLines(source, Charset.forName("UTF-8"));
//		List<String> mesLines =  Files.readAllLines(source, Charset.forName("ISO-8859-1"));
//		List<String> mesLines =  Files.readAllLines(source, StandardCharsets.UTF_8);
		List<String> mesLines =  Files.readAllLines(source, Charset.defaultCharset());
		for (String lines : mesLines) {
			System.out.println(lines);
		}
	}

}
