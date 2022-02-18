package sn.uasz.m1.tp1.exercice2;

public class TestOperations {

	public static void main(String[] args) {
		Operation o = new Operation(12, -15);

		try {
			System.out.println(o.Division());
			System.out.println(o.racineDeLaSomme());
			System.out.println(o.estDivisible());
			System.out.println(o.sontTousPremiers());
			System.out.println(o.sontPremiersENtreEux());
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}

}
