package sn.uasz.m1.tp1.exercice1;

public class EntrepriseSansProfit extends Entreprise {

	public EntrepriseSansProfit(String nom, String mission,float capital) {
		super(nom, mission, capital);
	}
	
	
	public float capital() throws NonProfitException {
		throw new NonProfitException("Desolez cette entreprise n'a pas de capital!!!");	
	}
	
}
