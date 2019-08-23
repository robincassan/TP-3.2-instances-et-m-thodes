package fr.diginamic.entities;

public class Cercle {

	public double rayon ;
	public Cercle(double rayon) {
		this.rayon = rayon; 
	}
	
	public double perimeter(double rayon) {
		return 2*Math.PI*rayon; 
	}
	
	public double surface(double rayon) {
		return Math.PI*rayon*rayon; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	Dans le package fr.diginamic.entites, créez une classe Cercle
//	o cette classe a un seul attribut d’instance : son rayon de type double
//	• Créez un constructeur pour cette classe avec le rayon en paramètre.
//	• Créez une méthode qui retourne le périmètre du cercle
//	• Créez une méthode qui retourne la surface du cercle.
//	• Dans le package fr.diginamic.essais, crééz une classe TestCercle
//	o Instanciez 2 cercles différents et affichez les résultats des méthodes de calcul
//	de périmètre et de calcul de surface
}
