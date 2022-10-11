package personnages;
import java.util.Random;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

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
	
	public Random preparerPotion() {
		Random random = new Random();
		int value = random.nextInt(effetPotionMin,effetPotionMax);
		if ( value > 7) {
			parler("J'ai preparé une super potion de force de " + value);
			return random;
		}
		else {
			parler("Je n'ai pas trouvé les bons ingrédients, ma potion est seulement de force " + value);
			return random;
		}
		}

		
	}
