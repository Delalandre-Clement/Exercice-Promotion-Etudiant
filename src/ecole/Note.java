package ecole;

import java.util.Scanner;

public class Note {
	int note;
	
	public Note() {
		this.note=0;
	}
	
	public int getAlNote() {
		return note;
	}
	
	public void setAlNote(int note) {
		this.note=note;
	}

	public static void afficherNote(Scanner scan, Promotion promotion1) {
		int i=1;
		int j=0;
		while(i-1 < promotion1.getTailleListe()) {
			Etudiant etudiantAfficher = promotion1.getEtudiant(i-1);
			System.out.println("Etudiant n�" + i + " : " + etudiantAfficher.getPrenom() + " " + etudiantAfficher.getNom() +" avec les notes suivantes : ");
			while(j < etudiantAfficher.getTailleNotes()) {
				System.out.println(etudiantAfficher.getNote(j));
				j++;
			}
			i++;
		}
	}
	
	public static void calculMoyenne(Scanner scan, Promotion promo) {
		
	}
}
