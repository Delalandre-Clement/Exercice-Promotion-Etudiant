package ecole;

import java.util.Scanner;

public class Note {
	int note;
	
	public Note() {
		this.note=0;
	}
	
	public static void afficherNote(Scanner scan, Promotion promotion1) {
		int i=1;
		int j=0;
		while(i-1 < promotion1.getTailleListe()) {
			Etudiant etudiantAfficher = promotion1.getEtudiant(i-1);
			System.out.println("Etudiant n°" + i + " : " + etudiantAfficher.getPrenom() + " " + etudiantAfficher.getNom() +" avec les notes suivantes : ");
			while(j < etudiantAfficher.getTailleNotes()) {
				System.out.println(etudiantAfficher.getNote(j));
				j++;
			}
			i++;
		}
	}
	
	public static void calculMoyenne(Scanner scan, Promotion promo) {
		int i=1;
		int j=0;
		float moyenne;
		float moyennePromo = 0;
		while(i-1 < promo.getTailleListe()) {
			moyenne = 0;
			Etudiant etudiantAfficher = promo.getEtudiant(i-1);
			while(j < etudiantAfficher.getTailleNotes()) {
				moyenne=moyenne + etudiantAfficher.getNote(j);
				j++;
			}
			moyenne=(moyenne/etudiantAfficher.getTailleNotes());
			System.out.println("Etudiant " + etudiantAfficher.getPrenom() + " " + etudiantAfficher.getTailleNotes() +" : " + moyenne);
			moyennePromo=+moyenne;
			i++;
		}
		moyennePromo=(moyennePromo/promo.getTailleListe());
		System.out.println("Moyenne de la promotion :" + moyennePromo);
	}
}
