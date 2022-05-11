package atelier3;

public class BoucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IntStream.rangeClosed(1, 5).forEach(nombre->System.out.println(nombre));
		int [] monTab = {1, 2, 3, 4, 5};
		for(int i = 0; i < 5; i++) {
			System.out.println(monTab[i]);
		}
	}

}
