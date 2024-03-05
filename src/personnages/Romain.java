package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	private String texte;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
		if (force < 0){
			throw new IllegalArgumentException("Invalid firce: " + force);
		}
		
	}

	public String getNom() {
		return nom;
	}
	
	public int getforce() {
		return force;
		
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		assert force>0;
//		int force1=force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("A�e");
//		}
//		else {
//			parler("J'abandonne...");
//		}
//		assert force1>force;
//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;

		forceCoup = calculResistanceEquipement(forceCoup);

		// if (force > 0) {
		// parler("A�e");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("A�e");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
		}
		// post condition la force a diminu�e
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du" + "coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace � mon �quipement sa" + "force est diminu� de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
			}
				
			}
			texte = +resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom.toString() + "" + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0: {
			System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement + ".");
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			break;

		}
		case 1: {
			if (equipements[nbEquipement - 1] == equipement) {
				System.out.println("Le soldat " + nom + " possede d�ja un " + equipement + ".");
			} else {
				equipements[nbEquipement] = equipement;
				System.out.println("Le soldat " + nom + " s'equipe d'un " + equipement + ".");
				System.out.println("Le soldat " + nom + " est d�j� bien prot�g�!");
				nbEquipement++;
				break;
			}
		}
		default:
			break;
		}

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
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
