package sn.uasz.m1.tp1.exercice4;

public class Voiture {
	//static int p = 0;
	//private int place;
	private int numeroIm;
	private String marque;
	private double kilometrage;
	private String typeCarburant;
	private String couleur;

	public Voiture(int numeroIm, String marque, double kilometrage, String typeCarburant, String couleur) {
		this.numeroIm = numeroIm;
		this.marque = marque;
		this.kilometrage = kilometrage;
		this.typeCarburant = typeCarburant;
		this.couleur = couleur;
	}

	/*public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
*/
	public int getNumeroIm() {
		return numeroIm;
	}

	public void setNumeroIm(int numeroIm) {
		this.numeroIm = numeroIm;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture [numero Immatriculation: " + numeroIm + ", marque: " + marque
				+ ", kilometrage: " + kilometrage + ", type de Carburant: " + typeCarburant + ", couleur: " + couleur
				+ "]";
	}

}
