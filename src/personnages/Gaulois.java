package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;

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

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}

	public int boirePotion(int forceDeLaPotion) {
		effetPotion = forceDeLaPotion;
		parler("Merci je sens que ma force est " + effetPotion + " décuplé");
		return effetPotion;
	}
	/*
	 * @Override public String toString() { return "Gaulois [nom=" + nom +
	 * ", force=" + force + ", effetPotion=" + effetPotion + "]"; }
	 */

}
