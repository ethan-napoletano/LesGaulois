package personnages;

import java.util.Random;
<<<<<<< HEAD

public class Gaulois {
	public String nom;
	public int force;
	public int effetpotion = 1;
=======
>>>>>>> 45dec4069035f21c3d8a72d78f3d10f1f1632022

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

<<<<<<< HEAD
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetpotion);
	}
		
	public void boirePotion(int forcePotion) {
		
		effetpotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+forcePotion+" fois décuplée");
=======
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetpotion);
//	}
		
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la"
				+ "m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetpotion);
			for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
				this.trophees[nb_trophees] = trophees[i];
			}
		return;
		}

	public void boirePotion(int forcePotion) {
		effetpotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+forcePotion+" fois d�cupl�e");
>>>>>>> 45dec4069035f21c3d8a72d78f3d10f1f1632022
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetpotion + "]";
//		System.out.println(asterix);
<<<<<<< HEAD
=======
//		ca affiche le nom de asterix 
>>>>>>> 45dec4069035f21c3d8a72d78f3d10f1f1632022

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Druide panoramix = new Druide("Panoramix",5,10);
		Random random1 = new Random();
		int forcePotion = panoramix.preparerPotion(random1);
<<<<<<< HEAD
//	System.out.println(asterix.toString()); ca n'affiche pas le nom du gaulois 
=======
//	System.out.println(asterix.toString()); ca n'affiche pas le nom du nouveau gaulois 
>>>>>>> 45dec4069035f21c3d8a72d78f3d10f1f1632022
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour !");
		asterix.frapper(minus);
		asterix.boirePotion(forcePotion);
	}
}