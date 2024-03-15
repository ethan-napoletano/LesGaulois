package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois= new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
		}
	}
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public String getNom() {
		return nom;
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	
	private void  afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef "+chef+ "vivent les legendaires gaulois:");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println(villageois[i].getNom());
		}
		
	}
	
	public static void main(String[] args) {
<<<<<<< HEAD
		Village village= new Village("Village des IrrÃ©ductibles",30);
// Gaulois gaulois = village.trouverHabitant(30); --> erreur:Index 30 out of bounds for length 30
=======
		Village village= new Village("Village des Irréductibles",30);
// Gaulois gaulois = village.trouverHabitant(30);
>>>>>>> 45dec4069035f21c3d8a72d78f3d10f1f1632022
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		Chef chef = new Chef("Abraracourcix",6,village);
//Gaulois gaulois = village.trouverHabitant(1);
<<<<<<< HEAD
//System.out.println(gaulois); y'a null a l'indice 1 donc erreur !!
=======
//System.out.println(gaulois);
>>>>>>> 45dec4069035f21c3d8a72d78f3d10f1f1632022
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(chef);	
	}
}