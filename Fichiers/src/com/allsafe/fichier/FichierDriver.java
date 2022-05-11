package com.allsafe.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FichierDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*Path path = Paths.get("mesFichiers/monFichier.txt");
		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS)); */
		
		Path source = Paths.get("mesFichiers/monFichier.txt");
 
		
		Path destination = Paths.get("mesFichiers/monFichier_copie.txt");
		
//		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		
		Files.deleteIfExists(destination);


	}

}
