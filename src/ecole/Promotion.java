package ecole;

import java.util.*;


public class Promotion {

	/**
	 * Variables de classe
	 */
	private String nom;
	private String annee;
	public ArrayList<Etudiant> alEtudiants;
	
	/**
	 * Constructeur avancé
	 * @param Nom_Prom
	 * @param Annee_Prom
	 */
	public Promotion(String Nom_Prom, String Annee_Prom) {
        this.nom=Nom_Prom;
        this.annee=Annee_Prom;
	}
	
	/**
	 * Constructeur par defaut
	 */
	public Promotion() {
		this.nom = "nomPromotion";
		this.annee ="1999/2000";
	}

	/**
	 * Ajoute un Etudiant à la promotion
	 * @param student
	 */
	public void AddEtudiant(Etudiant student) {
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
}
