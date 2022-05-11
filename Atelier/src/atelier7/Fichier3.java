package atelier7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Fichier3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		Path registre = Paths.get("mesDossiers/registre.txt");
		
		System.out.println("\n******Menu de choix******");
		System.out.println("Pour faire votre choix, tapez le chiffre correspondant\n");
		System.out.println("1: Ajouter la liste des produits pour mes courses");
		System.out.println("2: Voir la liste des produits pour ma prochaine course au marché");
		System.out.println("3: Arrêter le programme\n");
		
		int monChoix;
		boolean controle = false;
		
		do {
			System.out.println("\nEntrez votre choix, SVP");
			if (clavier.hasNextInt()) {
				monChoix = clavier.nextInt();
				switch (monChoix) {
				case 1:
					System.out.println("-**-Enregistrement de produits-**-");
					clavier.nextLine();

					String entrer;
					do {
						System.out.println("Entrer un produit");
						entrer = clavier.nextLine()+"\n";
						Files.write(registre, entrer.getBytes(Charset.defaultCharset()), StandardOpenOption.CREATE,
								StandardOpenOption.WRITE, StandardOpenOption.APPEND);

					} while(!entrer.equalsIgnoreCase("---\n"));
					controle = true;
					break;
					
				case 2:
					List<String> mesLignes = Files.readAllLines(registre, Charset.defaultCharset());
					for (String maLigne : mesLignes) {
						System.out.println(maLigne);
					}
					controle = true;
					
					break;
					
				case 3:
					System.out.println("Au revoir !!");
					clavier.close();
					System.exit(0);
					break;

				default:
					
					System.out.println("Choix introuvable");
					clavier.nextLine();
					controle = true;
					break;
					
				}
			}else {
				System.out.println("Vous n'avez pas entré un chiffre");
				clavier.nextLine();
				controle = true;
			}
			
		} while (controle);
		

	}

}
