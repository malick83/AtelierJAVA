package hello;

public class Personne {
	
	public String _nom;
	public String _prenom;

	
	public Personne(String nom, String prenom) {

		this._nom = nom;
		this._prenom = prenom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p1 = new Personne("Kebe", "Malick");
		System.out.println(p1._nom);


	}
	
	

}
