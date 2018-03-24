package main;

import java.util.*;

import ecole.Etudiant;
import ecole.Promotion;

public class Main {

	/**
	 * Menu principal / Accueil du projet
	 * @param args
	 */
	public static void main(String[] args) {
		int numReponse=0;
		Etudiant etudiant1 = new Etudiant();
		Promotion promotion1 = new Promotion();
		Scanner scan = new Scanner(System.in);
		while(numReponse!=4) {
			System.out.println("Menu principal :");
			System.out.println("1- Creation Promotion");
			System.out.println("2- Creation Etudiant");
			System.out.println("3- Afficher liste Etudiant");
			System.out.println("4- Afficher moyenne promotion");
			System.out.println("5- Quitter");
			numReponse=scan.nextInt();
			
			
			switch(numReponse) {
			case 1:
				System.out.println("Veuillez saisir le nom de la promotion :");
				try {
					String nom_Prom=scan.next();
					promotion1.setNom(nom_Prom);
				} catch(InputMismatchException e) {
					System.out.println("Erreur de saisie ! Valeur par défaut choisie.");
					promotion1.setNom("PromDefault");
				}
				System.out.println("Veuillez saisir l'année de la promotion :");
				try {
					String annee_Prom=scan.next();
					promotion1.setAnnee(annee_Prom);
				} catch(InputMismatchException e) {
					System.out.println("Erreur de saisie ! Valeur par défaut choisie.");
					promotion1.setAnnee("1990/1991");
				} 
				break;
			case 2:
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
					int note = scan.nextInt();
					etudiant1.setNote(note);
				} catch (InputMismatchException e) {
					System.out.print("Erreur de saisie ! Valeur par défaut choisie.");
					etudiant1.setNote(0);
				}
				System.out.println("Test : " + promotion1.getNom());
				System.out.println("Etudiant créé !\nL'etudiant se nomme " + etudiant1.getPrenom() + " " + etudiant1.getNom() + " et il a " + etudiant1.getAge() + " ans.");
				promotion1.alEtudiants.add(etudiant1);
				break;
			case 3:
				int i=0;
				while(i < promotion1.getTailleListe()) {
					Etudiant etudiantAfficher = promotion1.getEtudiant(i);
					System.out.println("Etudiant" + i+1 + " : " + etudiantAfficher.getPrenom() + " " + etudiantAfficher.getNom());
				}
				break;
			case 4:
				int j=0;
				while(j < promotion1.getTailleListe()) {
					Etudiant etudiantAfficher = promotion1.getEtudiant(j);
					System.out.println("Etudiant" + j+1 + " : " + etudiantAfficher.getPrenom() + " " + etudiantAfficher.getNom());
				}
				break;
			default:
				System.out.print("Saisie invalide, Veuillez choisir un chiffre corect.");
				break;
			}
		}
		scan.close();
	}
}