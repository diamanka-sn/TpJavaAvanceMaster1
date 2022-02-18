package sn.uasz.m1.tp1.exercice4;

import java.util.HashMap;
import java.util.Map.Entry;

public class Parking {
	// private int place;
	private int capacite;
	private HashMap<Integer, Voiture> listeVoiture;

	public Parking(int capacite, HashMap<Integer, Voiture> listeVoiture) {
		this.capacite = capacite;
		this.listeVoiture = listeVoiture;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public HashMap<Integer, Voiture> getListeVoiture() {
		return listeVoiture;
	}

	public void setListeVoiture(HashMap<Integer, Voiture> listeVoiture) {
		this.listeVoiture = listeVoiture;
	}

	public void garer(Voiture v, int place) throws PlaceInexistanteException, PlaceOccupeeException {
		if (place > this.capacite)
			throw new PlaceInexistanteException("D�solez!!!"+place+" place inexistante");
		if (this.listeVoiture.containsKey(place))
			throw new PlaceOccupeeException("D�solez!!!"+place+" place occup�e");

		listeVoiture.put(place, v);
	}

	public Voiture retirer(int place) throws PlaceInexistanteException, PlaceNonOccupeException {
		if (place > this.capacite)
			throw new PlaceInexistanteException("D�solez!!!"+place+" place inexistante");
		if (!this.listeVoiture.containsKey(place))
			throw new PlaceNonOccupeException("D�solez!!! place "+place+" non occup�e");
		Voiture voiture = listeVoiture.get(place);
		listeVoiture.remove(place);

		return voiture;
	}

	public int placeOccupee(int numero) {
		int result = -1;
		for (Entry<Integer, Voiture> v : listeVoiture.entrySet()) {
			int place = v.getKey();
			Voiture voiture = v.getValue();
			if (voiture.getNumeroIm() == numero) {
				result = place;
				break;
			} else
				result = -1;
			// System.out.println("place: " + place + ", est occup�e par: " + voiture);
		}
		return result;
	}

	public void afficher() {
		for (Entry<Integer, Voiture> v : listeVoiture.entrySet()) {
			int place = v.getKey();
			Voiture voiture = v.getValue();
			System.out.println("place: " + place + ", est occup�e par: " + voiture);
		}
	}
	
}
