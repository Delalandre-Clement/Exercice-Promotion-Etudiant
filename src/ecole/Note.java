package ecole;

import java.util.ArrayList;
import java.util.Scanner;

public class Note {
	private ArrayList<Note> alNote;
	
	public Note() {
		this.alNote = new ArrayList<Note>();
	}
	
	public ArrayList<Note> getAlNote() {
		return alNote;
	}
	
	public void setAlNote(ArrayList<Note> alNote) {
		this.alNote = alNote;
	}
	
	public void addNote(Note note) {
		this.alNote.add(note);
	}

	public static void afficherNote(Scanner scan, Promotion promotion1) {
		int i=1;
		while(i-1 < promotion1.getTailleListe()) {
			Etudiant etudiantAfficher = promotion1.getEtudiant(i-1);
			System.out.println("Etudiant n°" + i + " : " + etudiantAfficher.getPrenom() + " " + etudiantAfficher.getNom() +" avec une note de " + etudiantAfficher.getNote());
			i++;
		}
		
	}
	
}
