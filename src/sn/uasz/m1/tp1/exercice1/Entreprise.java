package sn.uasz.m1.tp1.exercice1;

public class Entreprise {
	private String nom;
	private String mission;
	private float capital;

	public Entreprise(String nom, String mission, float capital) {
		this.nom = nom;
		this.mission = mission;
		this.capital = capital;
	}

	public Entreprise(String nom, float capital) {
		this.nom = nom;
		this.capital = capital;
	}

	public Entreprise(String nom,String mission) {
		this.nom = nom;
		this.mission = mission;
	}

	public Entreprise() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}
	/*
	 * public float getCapital() { return capital; }
	 */

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public String mission() throws SecretMissionException {
		return mission;
	}

	public float capital() throws NonProfitException {
		return capital;
	}

}
