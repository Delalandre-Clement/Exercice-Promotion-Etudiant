package ecole;


public class Etudiant {
	
		private String prenom;
		private String nom;
		private int age;
		private char sexe;
		private int note;
		
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
	        this.nom="nom";
	        this.prenom="prenom";
	        this.age=0;
	        this.sexe='x';
	        this.note=0;
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
		
		public int getNote() {
			return note;
		}

		public void setNote(int note) {
			this.note = note;
		}
}
