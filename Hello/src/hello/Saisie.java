package hello;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Saisie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] monTableau = new int[3];
		int [] monTableau = {9, 23, 78, 90};
//		for(int tab:monTableau) {
//			System.out.println(tab);
//		}
		
		for(int i = 0; i < monTableau.length; i++) {
			System.out.println(monTableau[i]);
		}
		ArrayList<String> monTab = new ArrayList<String>();
		System.out.println(monTab.size());
//		add(<>), set(<>, <>), get(<>), clear(), isEmpty(), remove(<indice>), contains(<>), indexOf(<>)
		direBonjour("Malick");
		direBonjour("Modou");
		direBonjour("Fatou");
//		.equals(<chaine>)
	}
	
	static void direBonjour(String nom) {
		System.out.printf("Bonjour %s%n", nom);
		
	}
	

}
