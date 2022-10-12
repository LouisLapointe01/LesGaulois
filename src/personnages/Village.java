package personnages;

public class Village {

	private String nom;
	private Chef chef;
	private int nbVillageois = 1;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;

	}

	public void ajouterChef() {
		nbVillageois++;
	}

	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}

	public void afficherVillageois(Chef chef) {
		int i = 2;
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		while (i < nbVillageois) {
			System.out.println(villageois[i].getNom());
			i++;
		}

	}
}
