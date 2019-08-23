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
//	Dans le package fr.diginamic.entites, cr�ez une classe Cercle
//	o cette classe a un seul attribut d�instance : son rayon de type double
//	� Cr�ez un constructeur pour cette classe avec le rayon en param�tre.
//	� Cr�ez une m�thode qui retourne le p�rim�tre du cercle
//	� Cr�ez une m�thode qui retourne la surface du cercle.
//	� Dans le package fr.diginamic.essais, cr��z une classe TestCercle
//	o Instanciez 2 cercles diff�rents et affichez les r�sultats des m�thodes de calcul
//	de p�rim�tre et de calcul de surface
}
