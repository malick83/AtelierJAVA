package atelier2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Programme8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre ");
		int nombres = clavier.nextInt();
		IntStream.rangeClosed(1, nombres).forEach(System.out::println);
//		IntStream.rangeClosed(1, nombres).forEach(nombre->System.out.println(nombre));

	}
}
