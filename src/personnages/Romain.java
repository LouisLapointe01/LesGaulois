package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "La force d'un romain est toujours positive";
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
	int forceInitial  = force;
		if (forceCoup < force){
			force -= forceCoup;
		}
		else {
			force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
			assert (force == forceInitial) : "La force du romain n'a pas varié";
		} else {
			parler("J'abandonne... " );
		}
	}
}
}
