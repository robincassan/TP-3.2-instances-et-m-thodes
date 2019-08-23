package fr.diginamic.utils;

public class TriTableau {

	public static double[] tri(double[] a) {
		int longueur = a.length;
		double tampon = 0;
		boolean permut;

		do {
			// hypothèse : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (a[i] > a[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					tampon = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
		return a;
	}
}
