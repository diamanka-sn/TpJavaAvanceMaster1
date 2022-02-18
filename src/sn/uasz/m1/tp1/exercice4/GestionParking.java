package sn.uasz.m1.tp1.exercice4;

import java.util.HashMap;

public class GestionParking {

	public static void main(String[] args) {
		Voiture v1 = new Voiture(2002, "Renault", 25.0, "diesel", "bleu");
		Voiture v2 = new Voiture(2003, "peugeot", 25.0, "diesel", "bleu");
		Voiture v3 = new Voiture(20002, "Camion", 25.0, "diesel", "bleu");
		Voiture v4 = new Voiture(20044, "Volvo", 25.0, "diesel", "bleu");
		Voiture v5 = new Voiture(20046, "Volvo", 25.0, "diesel", "bleu");
		Voiture v6 = new Voiture(20047, "Volvo", 25.0, "diesel", "bleu");

		HashMap<Integer, Voiture> listeVoiture = new HashMap<Integer, Voiture>();

		Parking p1 = new Parking(5, listeVoiture);
		try {
			p1.garer(v1, 1);
			p1.garer(v2, 2);
			p1.garer(v3, 3);
			p1.garer(v4, 4);
			p1.garer(v5, 5);
			// p1.garer(v6, 5);

			p1.retirer(1);
			//p1.retirer(7);
			// p1.retirer(1);

			System.out.println(p1.placeOccupee(2003));
			System.out.println(p1.placeOccupee(20002));
			System.out.println(p1.placeOccupee(20044));
			System.out.println(p1.placeOccupee(22222));

			// System.out.println(p1.placeOccupee(2002));
			// p1.retirer(2);
			// p1.retirer(3);

			p1.afficher();
		} catch (PlaceInexistanteException | PlaceOccupeeException | PlaceNonOccupeException e) {
			e.printStackTrace();
		}
	}

}
