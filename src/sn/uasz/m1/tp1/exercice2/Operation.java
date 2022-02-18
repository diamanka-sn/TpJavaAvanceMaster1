package sn.uasz.m1.tp1.exercice2;

public class Operation {
	private int operande1;
	private int operande2;

	public Operation(int operande1, int operande2) {
		this.operande1 = operande1;
		this.operande2 = operande2;
	}

	public int getOperande1() {
		return operande1;
	}

	public void setOperande1(int operande1) {
		this.operande1 = operande1;
	}

	public int getOperande2() {
		return operande2;
	}

	public void setOperande2(int operande2) {
		this.operande2 = operande2;
	}

	public double Division() throws OperationException {
		if (operande1 / operande2 == 0)
			throw new OperationException("Désoler !! la division est nulle");
		return (double) operande1 / operande2;
	}

	public double racineDeLaSomme() throws OperationException {
		int somme;
		somme = operande1 + operande2;
		if (somme < 0)
			throw new OperationException("La somme est negatif!!! désolé");
		return Math.sqrt(somme);

	}

	public boolean estDivisible() throws OperationException {
		boolean r;
		if (operande2 < 0)
			throw new OperationException("Operande 2 est inferieur à zero");
		if (operande1 % operande2 == 0)
			r = true;
		else
			r = false;
		return r;
	}

	public boolean sontTousPremiers() throws OperationException {
		boolean retour = false;
		if ((operande1 < 0) || (operande2 < 0))
			throw new OperationException("Désolez!!! un des operandes est inferieure à zero");
		if (((operande1 == 1) || (operande1 == 2) || (operande1 == 3) || (operande1 == 11))
				&& ((operande2 == 1) || (operande2 == 2) || (operande2 == 3) || (operande2 == 11)))
			retour = true;
		else if (((operande1 % 2 == 0) || (operande1 % 3 == 0) || (operande1 % 5 == 0) || (operande1 % 11 == 0))
				|| ((operande2 % 2 == 0) || (operande2 % 3 == 0) || (operande2 % 5 == 0) || (operande2 % 11 == 0)))
			retour = false;
		else
			retour = true;
		return retour;
	}

	public boolean sontPremiersENtreEux() throws OperationException {
		boolean retour = false;
		if ((operande1 <= 0) || (operande2 <= 0))
			throw new OperationException("Désolez!!! un des operandes est inferieure ou egale à zero");
		if (((operande1 == 1) || (operande1 == 2) || (operande1 == 3) || (operande1 == 11))
				|| ((operande2 == 1) || (operande2 == 2) || (operande2 == 3) || (operande2 == 11)))
			retour = true;
		else if (((operande1 % 2 == 0) || (operande1 % 3 == 0) || (operande1 % 5 == 0) || (operande1 % 11 == 0))
				|| (operande2 % 2 == 0) || (operande2 % 3 == 0) || (operande2 % 5 == 0) || (operande2 % 11 == 0))
			retour = false;
		else
			retour = true;
		return retour;
	}

}
