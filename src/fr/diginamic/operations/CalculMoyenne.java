package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	public double[] array;

	public CalculMoyenne(int arraylength) {
		if (arraylength <= -1) {
			throw new RuntimeException(
					"impossible de cr�er un tableau avec une taille n�gative veuillez entrez une valeur >= 0");
		}
		this.array = new double[arraylength];
	}

//	 Cette classe a �galement une m�thode ajout qui permet d�ajouter un double au tableau.
//	 Pour r�aliser cette m�thode vous aurez peut-�tre besoin de g�rer un index en interne de la classe
	public void ajout(double a) {
		this.array = new double[array.length + 1];
		array[array.length - 1] = a;
	}
//	Cr�ez une m�thode calcul qui calcule et retourne la moyenne des �l�ments du tableau

	@Override
	public String toString() {
		return "CalculMoyenne [array=" + Arrays.toString(array) + "]";
	}

	public double calcul() {
		double moy = 0;
		for (int i = 0; i < this.array.length; i++) {
			moy = this.array[i];
		}
		moy = moy / this.array.length;
		return moy;
	}

}
