package ecole;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Etudiant {
	
		private String prenom;
		private String nom;
		private int age;
		private char sexe;
		private ArrayList<Float> note;
		
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
			ArrayList<Float> note = new ArrayList<Float>();
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

		public float[] getNotes() {
			int i=0;
			float[] tabNote= {};
			while( i <= this.note.size()) {
				tabNote[i] = note.get(i);
				i++;
			}
			return tabNote;
		}
		
		public Float getNote(int index) {
			return note.get(index);
		}

		public float getMoyenne() {
			int i=0;
			float additionNote=0;
			while( i <= this.note.size()) {
				additionNote = additionNote + note.get(i);
				i++;
			}
			return (additionNote/this.note.size());
		}

		public void setNote(ArrayList<Float> listeNotes1) {
				note = listeNotes1;
		} 
		
		public int getTailleNotes() {
			return note.size();
		}
		
		/**
		 * Saisie d'un nom d'étudiant
		 * @param scan
		 * @return
		 */
		public static String saisieNom(Scanner scan) {
			String nom = null;
			while (nom == null ) {
				try {
					System.out.println("Veuillez saisir un nom :");
					nom = scan.next();
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				} 
			}
			return nom;
		}
		
		/**
		 * Saisie d'un prenom d'étudiant
		 * @param scan
		 * @return
		 */
		public static String saisiePrenom(Scanner scan) {
			String prenom = null;
			while (prenom == null ) {
				try {
					System.out.println("Veuillez saisir un prenom :");
					prenom = scan.next();
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				}
			}
			return prenom;
		}
		
		/**
		 * Création d'un étudiant
		 * @param scan
		 * @return
		 */
		public static Etudiant saisirEtudiant(Scanner scan) {
			Etudiant etudiant1 = new Etudiant();
			String nom = saisieNom(scan);
			etudiant1.setNom(nom);

			String prenom = saisiePrenom(scan);
			etudiant1.setPrenom(prenom);
			
			int age =0;
			while (age == 0 ) {
				try {
					System.out.println("Veuillez saisir son age :");
					age = scan.nextInt();
					etudiant1.setAge(age);
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				} 
			}
			
			String sexe_string = null;
			while (sexe_string == null ) {
				try {
					System.out.println("Veuillez saisir son sexe :");
					sexe_string = scan.next();
					char sexe = sexe_string.charAt(0);
					etudiant1.setSexe(sexe);
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				}
			}
			
			String listeNotes = null;
			while (listeNotes == null ) {
				try {
					System.out.println("Veuillez saisir ses notes :");
					listeNotes= scan.next();
					ArrayList<Float> listeNotes1 = new ArrayList<Float>();
					float note = 0;
					for(String x : listeNotes.split("\\|")) {
						note = Float.valueOf(x.trim()).floatValue(); 
						listeNotes1.add(note);
					}
					etudiant1.setNote(listeNotes1);
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				}
			}
			return etudiant1;
		}
}
