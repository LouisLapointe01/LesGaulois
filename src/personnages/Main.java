package personnages;

public class Main {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("asterix",100);
		
		System.out.println(asterix);
		
		Village rennes = new Village("Village des Irréductibles",30);
		
		Gaulois gaulois = rennes.trouverHabitant(30);

	}
}
