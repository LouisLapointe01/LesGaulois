package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nbEquipement = nbEquipement;
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "La force d'un romain est toujours positive";
		equipement = new Equipement[2];
	}

	public int getForce() {
		return force;
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

	/*
	 * public void recevoirCoup(int forceCoup) { int forceInitial = force; if
	 * (forceCoup < force){ force -= forceCoup; } else { force -= forceCoup; if
	 * (force > 0) { parler("Aïe"); assert (force == forceInitial) :
	 * "La force du romain n'a pas varié"; } else { parler("J'abandonne... " ); }
	 * 
	 * } }
	 */
	public void sEquiper(Equipement nouveauEquipement) {
		switch (nbEquipement) {
		case 0:
			equipement[0] = nouveauEquipement;
			System.out.println("Le soldat " + getNom() + " s'équipe avec un/une " + nouveauEquipement.toString());
			nbEquipement++;
			break;
		case 1:
			if (nouveauEquipement == equipement[0]) {
				System.out.println("Le soldat " + getNom() + " posséde déja un " + equipement[0].toString() + " !");
			} else {
				equipement[1] = nouveauEquipement;
				System.out.println("Le soldat " + getNom() + " s'équipe avec un/une " + nouveauEquipement.toString());
				nbEquipement++;
			}
			break;
		case 2:
			System.out.println(getNom() + " est deja bien protégé");
			break;

		}
	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;

		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force <= oldForce : "la force n'a pas varié"+ forceCoup +" "+ oldForce+" "+ force;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if(forceCoup >= 0) {
			return forceCoup;
		}
		else return forceCoup = 0;
		}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
	}

}
