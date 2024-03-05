package personnages;


public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
		equipements= new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int force1=force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		}
		else {
			parler("J'abandonne...");
		}
		assert force1>force;
	}
	
	public void  sEquiper (Equipement equipement) {
		switch (nbEquipement) {
		case 0: {
			System.out.println("Le soldat "+nom+" s'equipe avec un "+ equipement+".");
			equipements[nbEquipement]=equipement;
			nbEquipement++;
			break;
			
		}
		case 1: {
			if (equipements[nbEquipement-1]==equipement) {
				System.out.println("Le soldat "+nom+" possede d�ja un "+ equipement+".");
			}
			else {
				equipements[nbEquipement]=equipement;
				System.out.println("Le soldat "+nom+" s'equipe d'un "+ equipement+".");
				System.out.println("Le soldat "+ nom +" est d�j� bien prot�g�!");
				nbEquipement++;
				break;
			}
		}
		default:
			break;
		}
		
	}
	
	public static void main(String[] args) {
		Romain minus =new Romain("Minus",6);
		minus.parler("Bonjour");
		minus.recevoirCoup(5);
		minus.recevoirCoup(8);	
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		
	}
} 
