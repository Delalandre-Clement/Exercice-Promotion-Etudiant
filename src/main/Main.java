package main;

import java.util.*;

import ecole.Etudiant;
import ecole.Promotion;
import ecole.Note;

public class Main {
	public static final int CHOIX_CREATION_PROMO = 1;
	public static final int CHOIX_CREATION_ETUDIANT = 2;
	public static final int CHOIX_AFFICHER_NOTES = 3;
	public static final int CHOIX_CALCUL_MOYENNE = 4;
	public static final int CHOIX_QUITTER = 5;
	/**
	 * Menu principal / Accueil du projet
	 * @param args
	 */
	public static void main(String[] args) {
		int numReponse=0;
		Promotion promotion1 = new Promotion();
		Scanner scan = new Scanner(System.in);
		while(numReponse!=5) {
			System.out.println("Menu principal :");
			System.out.println("1- Creation Promotion");
			System.out.println("2- Creation Etudiant");
			System.out.println("3- Afficher liste étudiant");
			System.out.println("4- Afficher notes étudiants");
			System.out.println("5- Quitter");
			numReponse=scan.nextInt();

			switch(numReponse) {
			case CHOIX_CREATION_PROMO:
				promotion1 = Promotion.creationPromotion(scan);
			break;
			case CHOIX_CREATION_ETUDIANT:
				Etudiant etudiant1 = Etudiant.saisirEtudiant(scan);
				promotion1.addEtudiant(etudiant1);
				break;
			case CHOIX_AFFICHER_NOTES:
				Note.afficherNote(scan, promotion1);
				break;
			case CHOIX_CALCUL_MOYENNE:
				
				break;
			case CHOIX_QUITTER:
				System.out.println("Merci pour votre passage, A bientot !");
				break;
			default:
				System.out.print("Saisie invalide, Veuillez choisir un chiffre corect.");
				break;
			}
		}
		scan.close();
	}
}