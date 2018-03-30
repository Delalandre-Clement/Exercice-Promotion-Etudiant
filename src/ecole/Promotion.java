package ecole;

import java.util.*;
import ecole.Etudiant;

public class Promotion {

	/**
	 * Variables de classe
	 */
	private String nom;
	private String annee;
	private ArrayList<Etudiant> alEtudiants;
	
	/**
	 * Constructeur avancé
	 * @param Nom_Prom
	 * @param Annee_Prom
	 */
	public Promotion(String Nom_Prom, String Annee_Prom) {
        this.nom=Nom_Prom;
        this.annee=Annee_Prom;
		this.alEtudiants = new ArrayList<Etudiant>();
	}
	
	/**
	 * Constructeur par defaut
	 */
	public Promotion() {
		this("nomPromotion", "2000");
	}

	/**
	 * Ajoute un Etudiant à la promotion
	 * @param student
	 */
	public void addEtudiant(Etudiant student) {
		this.alEtudiants.add(student);
	}
	
	public void setNom(String nomProm) {
		this.nom = nomProm;
	}

	public String getNom() {
		return nom;
	}
	
	public void setAnnee(String anneeProm) {
		this.annee = anneeProm;
	}

	public String getAnnee() {
		return annee;
	}
	
	public Etudiant getEtudiant(int index){
		return alEtudiants.get(index);
	}
	
	public int getTailleListe() {
		return alEtudiants.size();
	}
	
	/**
	 * Création d'une promotion
	 * @param scan
	 * @return
	 */
	public static Promotion creationPromotion(Scanner scan) {
		Promotion promotion1 = new Promotion();
		String nom_Prom = null;
		while(nom_Prom == null ) {
			try {
				System.out.println("Veuillez saisir le nom de la promotion :");
				nom_Prom=scan.next();
				promotion1.setNom(nom_Prom);
			} catch(InputMismatchException e) {
				System.out.println("Erreur de saisie ! Valeur par défaut choisie.");
			}
		}
		String annee_Prom =null;
		while(annee_Prom == null) {
			try {
				System.out.println("Veuillez saisir l'année de la promotion :");
				annee_Prom=scan.next();
				promotion1.setAnnee(annee_Prom);
			} catch(InputMismatchException e) {
				System.out.println("Erreur de saisie ! Valeur par défaut choisie.");
			} 
		}
		return promotion1;
	}

	/**
	 * Recherche et supprime un étudiant de la promotion
	 * @param scan
	 * @param promo
	 */
	public static void supprimeEtudiant(Scanner scan, Promotion promo) {
		int etudiantSuppr = 0;
		String nom = Etudiant.saisieNom(scan);
		String prenom = Etudiant.saisiePrenom(scan);
		
		for(Etudiant etu : promo.alEtudiants) {
			if(etu.getPrenom() == prenom && etu.getNom() == nom) {
				 promo.alEtudiants.remove(etu);
				 System.out.println("Etudiant supprimé.");
				 etudiantSuppr =1;
			}
		}
		if(etudiantSuppr == 0) {
			System.out.println("Aucun etudiant trouvé à ce nom.");
		}
	}
}
