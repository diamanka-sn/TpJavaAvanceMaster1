package sn.uasz.m1.tp1.exercice1;

public class EntrepriseSecrete extends Entreprise {
	public EntrepriseSecrete(String nom, String mission, float capital) {
		super(nom, mission, capital);
	}

	public String mission() throws SecretMissionException {
		throw new SecretMissionException("Desolez c'est une entreprise secrete impossible d'afficher sa mission");
	}

}
