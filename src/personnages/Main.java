package personnages;

public class Main {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("asterix",100);
		
		System.out.println(asterix);
		
		Village village = new Village("Village des Irréductibles",30);
		
	
		//Gaulois gaulois = village.trouverHabitant(30);
		//Prob: Nous sommes hors tableau
		
		Chef Abraracourcix = new Chef("Abraracourcix",6,0,village);
		
		village.ajouterChef();
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// null car j'ai du incrémenter de 1 le tableau car nous avons un habitant en plus dans un tableau de gaulois mais le chef est un Chef et pas un Gaulois (INSTRUCTION DU PROFESSEUR)

		village.afficherVillageois();
		

	}
}
