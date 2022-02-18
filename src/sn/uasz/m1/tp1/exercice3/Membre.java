package sn.uasz.m1.tp1.exercice3;

public class Membre {
	private int identifiant;
	private String prenom;
	private String nom;
	private String profession;
	private String sexe;
	private String telephone;

	public Membre(int identifiant, String prenom, String nom, String profession, String sexe, String telephone) {
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.profession = profession;
		this.sexe = sexe;
		this.telephone = telephone;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Membre [identifiant=" + identifiant + ", prenom=" + prenom + ", nom=" + nom + ", profession="
				+ profession + ", sexe=" + sexe + ", telephone=" + telephone + "]";
	}
	
}
