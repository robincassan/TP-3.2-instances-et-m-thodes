package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	public double[] array;

	public CalculMoyenne(int arraylength) {
		if (arraylength <= -1) {
			throw new RuntimeException(
					"impossible de créer un tableau avec une taille négative veuillez entrez une valeur >= 0");
		}
		this.array = new double[arraylength];
	}

//	 Cette classe a également une méthode ajout qui permet d’ajouter un double au tableau.
//	 Pour réaliser cette méthode vous aurez peut-être besoin de gérer un index en interne de la classe
	public void ajout(double a) {
		this.array = new double[array.length + 1];
		array[array.length - 1] = a;
	}
//	Créez une méthode calcul qui calcule et retourne la moyenne des éléments du tableau

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
