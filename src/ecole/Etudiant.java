package ecole;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Etudiant {
	
		private String prenom;
		private String nom;
		private int age;
		private char sexe;
		private String note[];
		
		/**
		 * Constructeur avancé
		 * @param nom_etu
		 * @param prenom_etu
		 * @param age_etu
		 * @param sexe_etu
		 */
		public Etudiant(String nom_etu, String prenom_etu, int age_etu, char sexe_etu) {
			this.nom=nom_etu;
			this.prenom=prenom_etu;
			this.age=age_etu;
			this.sexe=sexe_etu;
		}


		public Etudiant() {
	        this("nom", "prenom",0,'x');
		}


		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getSexe() {
			return sexe;
		}

		public void setSexe(char sexe) {
			this.sexe = sexe;
		}
		
		public int[] getNote() {
			int i=0;
			int tableauNote[];
			while( i <= this.note.length) {
				tableauNote[i]=this.note[i];
				i++;
			}
			return tableauNote[];
		}

		public void setNote(String[] note) {
			int i=0;
			while( i <= note.length) {
				this.note[i]=note[i];
				i++;
			}
		}
		
		public static Etudiant saisirEtudiant(Scanner scan) {
			Etudiant etudiant1 = new Etudiant();
			System.out.println("Veuillez saisir un nom :");
			try {
				String nom = scan.next();
				etudiant1.setNom(nom);
			} catch (InputMismatchException e) {
				System.out.print("Erreur de saisie ! Valeur par défaut choisie.");
				etudiant1.setNom("Dupont");
			} 
			System.out.println("Veuillez saisir son prenom :");
			try {
				String prenom = scan.next();
				etudiant1.setPrenom(prenom);
			} catch (InputMismatchException e) {
				System.out.print("Erreur de saisie, Valeur par défaut choisie.");
				etudiant1.setPrenom("Albert");				
			} 
			System.out.println("Veuillez saisir son age :");
			try {
				int age = scan.nextInt();
				etudiant1.setAge(age);
			} catch (InputMismatchException e) {
				System.out.print("Erreur de saisie, Valeur par défaut choisie.");
				etudiant1.setAge(0);
			} 
			System.out.println("Veuillez saisir son sexe :");
			try {
				String sexe_string = scan.next();
				char sexe = sexe_string.charAt(0);
				etudiant1.setSexe(sexe);
			} catch (InputMismatchException e) {
				System.out.print("Erreur de saisie ! Valeur par défaut choisie.");
				etudiant1.setSexe('X');
			}
			System.out.println("Veuillez saisir sa note :");
			try {
				String chaine = scan.next();
				String note[] = chaine.split("\\|");
				etudiant1.setNote(note[]);
			} catch (InputMismatchException e) {
				System.out.print("Erreur de saisie ! Valeur par défaut choisie.");
			}
			return etudiant1;
		}
}
