package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];


	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	/*
	 * private String prendreParole() { return "Le gaulois " + nom + " : "; }
	 */
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	/*
	 * public void frapper(Romain romain) { System.out.println(nom +
	 * " envoie un grand coup dans la mâchoire de " + romain.getNom());
	 * romain.recevoirCoup((force / 3) * effetPotion); }
	 */
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement victoire[] = romain.recevoirCoup((force / 3) * effetPotion);  
		for (int i = 0; victoire != null && i < victoire.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = victoire[i];
		}
	}

	public int boirePotion(int forceDeLaPotion) {
		effetPotion = forceDeLaPotion;
		parler("Merci je sens que ma force est " + effetPotion + " décuplé");
		return effetPotion;
	}
	

}
