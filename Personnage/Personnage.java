package Personnage;

public class Personnage {
	private String nom;
	private int vie;
	
	public Personnage(String a, int b) {
		this.nom = a;
		this.vie = b;
	}
	
	public String LeNom() {
		return this.nom;
	}
	
	public int LaVie() {
		return this.vie;
	}
	
	public void AugmenterVie(int a) {
		this.vie += a;
	}
	
	public void Attaque(Personnage a, int b) {
		a.vie -= b/2;
		this.vie -= b/2;
	}
}

