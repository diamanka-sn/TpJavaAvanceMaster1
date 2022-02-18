package sn.uasz.m1.tp1.exercice5;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ManipulationTexte<Entry> {
	private String texte;
	private HashMap<String, Integer> frequenceMots;

	public ManipulationTexte(String texte) {
		this.texte = texte;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public HashMap<String, Integer> compte() {
		StringTokenizer t = new StringTokenizer(this.texte, " .;");
		frequenceMots = new HashMap<String, Integer>();

		while (t.hasMoreElements()) {
			String mot = t.nextToken();
			if (frequenceMots.containsKey(mot)) {
				frequenceMots.put(mot, frequenceMots.get(mot) + 1);
			} else {
				frequenceMots.put(mot, 1);
			}
		}
		return frequenceMots;

	}

	public Entry plusFrequent() {
		// StringTokenizer t = new StringTokenizer(this.texte, " .;");
		frequenceMots = this.compte();
		String plusFrequent = "";
		int f = 0;

		for (Map.Entry<String, Integer> e : frequenceMots.entrySet()) {
			if (e.getValue() > f) {
				plusFrequent = e.getKey();
				f = e.getValue();
			}
		}
		return (Entry) Map.entry(plusFrequent, f);
	}

	public void affichageMots() {
		frequenceMots = this.compte();
		
		for (Map.Entry<String, Integer> e : frequenceMots.entrySet()) {
			System.out.println("("+e.getKey()+"----"+e.getValue()+" )");
		}
	}
}
