package sn.uasz.m1.tp1.exercice3;

import java.util.*;

public class Club {
	private HashMap<Integer, Membre> listeMembre;

	public Club(HashMap<Integer, Membre> listeMembre) {
		this.listeMembre = listeMembre;
	}

	public Club() {
		this.listeMembre = new HashMap<Integer, Membre>();
	}

	public boolean ajuoterMembre(Membre membre) throws IdentifiantExistantException {
		if (this.listeMembre.containsKey(membre.getIdentifiant()))
			throw new IdentifiantExistantException();
		listeMembre.put(membre.getIdentifiant(), membre);
		return true;

	}

	public boolean modifierMelbre(int identifiant) throws InexistantMembreException {
		if (listeMembre.containsKey(identifiant)) {
			Membre membre = listeMembre.get(identifiant);
			Scanner sc = new Scanner(System.in);
			membre.setNom(sc.nextLine());
			membre.setPrenom(sc.nextLine());
			membre.setProfession(sc.nextLine());
			membre.setSexe(sc.nextLine());

			listeMembre.put(identifiant, membre);

			return true;
		} else
			throw new InexistantMembreException();
	}

	public boolean supprimerMembre(int identifiant) throws InexistantMembreException {
		if (listeMembre.containsKey(identifiant)) {
			listeMembre.remove(identifiant);
			return true;
		} else
			throw new InexistantMembreException();
	}

	public void listeMembres() {
		for (Membre membre : listeMembre.values()) {
			System.out.println(membre);
		}
	}

	public static void main(String[] args) {
		Club club = new Club();
		try {
			club.ajuoterMembre(new Membre(1002, "Abdou", "Ba", "Enseignant", "Homme", "7777777777"));
			club.ajuoterMembre(new Membre(1003, "Abdou", "Ba", "Enseignant", "Homme", "7777777777"));

			club.listeMembres();
			club.supprimerMembre(1002);
			
			System.out.println("apres suppression");
			
			club.listeMembres();
			club.modifierMelbre(1003);
			
			System.out.println("apres modification");
			club.listeMembres();
			
		} catch (InexistantMembreException e) {
			System.out.println("Membre inexistant");
		} catch (IdentifiantExistantException e) {
			System.out.println("Identifiant inexist");
		}

	}
}
