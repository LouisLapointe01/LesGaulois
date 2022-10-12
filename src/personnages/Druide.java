package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int forcePotion;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMin, effetPotionMax);
		if (forcePotion > 7) {
			parler("J'ai preparé une super potion de force de " + forcePotion);
			return forcePotion;
		} else {
			parler("Je n'ai pas trouvé les bons ingrédients, ma potion est seulement de force " + forcePotion);
			return forcePotion;
		}
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obelix") {
			parler("Non, Obélix... Tu n'auras pas de potion magique");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}

}
