package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		this.nbEquipement = nbEquipement;
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "La force d'un romain est toujours positive";
		equipement = new Equipement[2];
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
	public void sEquiper (Equipement nouveauEquipement) {
		switch(nbEquipement){
		case 0 : 
			equipement[0] = nouveauEquipement;
			System.out.println("Le soldat " + getNom() +" s'équipe avec un/une "+ nouveauEquipement.toString());
			nbEquipement ++;
			break;
		case 1 : 	
			if(nouveauEquipement == equipement[0] ) {
				System.out.println("Le soldat "+ getNom()+" posséde déja un "+ equipement[0].toString()+" !");
			}
			else{
				equipement[1] = nouveauEquipement;
				System.out.println("Le soldat " + getNom() +" s'équipe avec un/une "+ nouveauEquipement.toString());
				nbEquipement ++;}
			break;
		case 2:		
			System.out.println(getNom()+" est deja bien protégé");
			break;
			
		}
	}
		/*if(nbEquipement > 2) {
			System.out.println(getNom()+" est deja bien protégé");}
		if(nbEquipement == 0) {
			equipement[0] = nouveauEquipement;
			System.out.println("Le soldat " + getNom() +" s'équipe avec un/une "+ nouveauEquipement.toString());
			nbEquipement ++;
		}
		if(nbEquipement == 1) {
			if(nouveauEquipement == equipement[0] ) {
				System.out.println("Le soldat "+ getNom()+" posséde déja un "+ equipement[0].toString()+" !");
			}
			else{
				equipement[1] = nouveauEquipement;
				System.out.println("Le soldat " + getNom() +" s'équipe avec un/une "+ nouveauEquipement.toString());
				nbEquipement ++;
			}
		}
	}*/
}
