package com.allsafe.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Fichier4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		Path source = Paths.get("monDossier", "monFichier2.txt");
		String monTexte = "Python est cool.\nC'est le meilleur de tous les langages existants\n";
		
		Files.write(source, monTexte.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
	}

}
