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
		 * Constructeur avanc�
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
			note = new ArrayList<Float>();
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
		 * Saisie d'un nom d'�tudiant
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
		 * Saisie d'un prenom d'�tudiant
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
		 * Saisie de l'age d'un etudiant
		 * @param scan
		 * @return
		 */
		public static int saisieAge(Scanner scan) {
			int age =0;
			while (age == 0 ) {
				try {
					System.out.println("Veuillez saisir son age :");
					age = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				} 
			}
			return age;
		}
		
		/**
		 * Saisie du sexe d'un Etudiant
		 * @param scan
		 * @return
		 */
		public static char saisieSexe(Scanner scan) {
			String sexe_string = null;
			while (sexe_string == null ) {
				try {
					System.out.println("Veuillez saisir son sexe :");
					sexe_string = scan.next();
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie !");
				}
			}
			return sexe_string.charAt(0);
		}
		
		/**
		 * Cr�ation d'un �tudiant
		 * @param scan
		 * @return
		 */
		public static Etudiant saisirEtudiant(Scanner scan) {
			Etudiant etudiant1 = new Etudiant();
			String nom = saisieNom(scan);
			etudiant1.setNom(nom);

			String prenom = saisiePrenom(scan);
			etudiant1.setPrenom(prenom);
			
			int age = saisieAge(scan);
			etudiant1.setAge(age);
			
			char sexe = saisieSexe(scan);
			etudiant1.setSexe(sexe);
			
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
