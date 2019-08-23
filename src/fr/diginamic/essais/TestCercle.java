package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(4);
		Cercle c2 = new Cercle(1);

		System.out.println(c1.perimeter(c1.rayon));
		System.out.println(c2.perimeter(c2.rayon));
		System.out.println(c1.surface(c1.rayon));
		System.out.println(c2.surface(c2.rayon));

//	CREATION de cercle grâce à la méthode statique de la classe CercleFactory

		System.out.println(CercleFactory.creation(4).perimeter(CercleFactory.creation(4).rayon));
		System.out.println(CercleFactory.creation(1).surface(CercleFactory.creation(1).rayon));

	}

}
