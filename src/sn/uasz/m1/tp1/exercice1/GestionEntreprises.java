package sn.uasz.m1.tp1.exercice1;

public class GestionEntreprises {

	public static void main(String[] args) {
		Entreprise E[] = new Entreprise[4];

		E[0] = new Entreprise("test", "mission", 112233);
		E[1] = new Entreprise("test", "mission", 112233);
		E[2] = new EntrepriseSecrete("test", "mission", 112233);
		E[3] = new EntrepriseSansProfit("test", "mission", 112233);

		/*try {
			System.out.println(E[0].capital());
			System.out.println(E[1].capital());
			System.out.println(E[2].capital());
			System.out.println(E[3].capital());

		} catch (NonProfitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println(E[0].mission());
			System.out.println(E[1].mission());
			System.out.println(E[2].mission());
			System.out.println(E[3].mission());
		} catch (SecretMissionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(Entreprise e: E) {
			System.out.println("Nom: "+e.getNom());
			try {
				System.out.println("Mission: "+e.mission());
				
			} catch (SecretMissionException e1) {
				e1.printStackTrace();
			}
			try {
				System.out.println("Capital: "+e.capital());
			} catch(NonProfitException r) {
				r.printStackTrace();
			}
			
		}

	}

}
