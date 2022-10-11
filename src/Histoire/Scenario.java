package Histoire;
import personnages.*;
public class Scenario {

	public static void main(String[] args) {
		
		System.out.println("TP1: \n");
		
		
		Gaulois asterix = new Gaulois("asterix",8);
		Romain minus = new Romain("Minus",6);
		
		System.out.println(asterix);
		System.out.println(asterix.getNom());
		
		System.out.println("\n");
		
		asterix.parler("Bonjour à tous");
		minus.parler("Un GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		panoramix.preparerPotion();
		panoramix.preparerPotion();
		panoramix.preparerPotion();
		
		System.out.println("\n");	
		System.out.println("TP2: \n");
		
		
		Village village = new Village("Village des Irréductibles",30);
		
	
		//Gaulois gaulois = village.trouverHabitant(30);
		//Prob: Nous sommes hors tableau
		
		Chef Abraracourcix = new Chef("Abraracourcix",6,0,village);
		
		village.ajouterChef();
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// null car j'ai du incrémenter de 1 le tableau car nous avons un habitant en plus dans un tableau de gaulois mais le chef est un Chef et pas un Gaulois (INSTRUCTION DU PROFESSEUR)

		Gaulois Enzo = new Gaulois("Enzo",10);
		
		Gaulois Rayan = new Gaulois("Rayan",10);
		
		Gaulois Obelix = new Gaulois("Obelix",25);
		
		village.ajouterHabitant(Enzo);
		
		village.ajouterHabitant(Rayan);
		
		village.ajouterHabitant(Obelix);
		
		village.afficherVillageois(Abraracourcix);
		
	}

}