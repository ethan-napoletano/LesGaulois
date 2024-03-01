package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
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
		int forceD = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("j'abandonne...");
		}
		assert forceD>force;
	}
	
	
	public void sEquiper(Equipement equipement) {
		
		
		switch (nbEquipement) {
		
		case 2:
			System.out.println("Le soldat" + nom +"est déjà bien protégé !");
			
		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("Le soldat" + nom +"a deja "+ equipement +" !");
			}
			else {
				this.equipement[1]=equipement;
			}
			
		
		default:
			this.equipement[0]=equipement;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Romain minus =new Romain("Minus",6);
		minus.parler("Bonjour");
		minus.recevoirCoup(5);
		minus.recevoirCoup(8);	
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
	}	
}
