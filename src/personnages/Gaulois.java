package personnages;

import java.util.Random;

public class Gaulois {
	public String nom;
	private int effetpotion = 1;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	

	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetpotion);
//	}
		
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la"
				+ "mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetpotion);
			for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
				this.trophees[nb_trophees] = trophees[i];
			}
		return;
		}

	public void boirePotion(int forcePotion) {
		effetpotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+forcePotion+" fois décuplée");
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetpotion + "]";
//		System.out.println(asterix);
//		ca affiche le nom de asterix 

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Druide panoramix = new Druide("Panoramix",5,10);
		Random random1 = new Random();
		int forcePotion = panoramix.preparerPotion(random1);
//	System.out.println(asterix.toString()); ca n'affiche pas le nom du nouveau gaulois 
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour !");
		asterix.frapper(minus);
		asterix.boirePotion(forcePotion);
	}
}