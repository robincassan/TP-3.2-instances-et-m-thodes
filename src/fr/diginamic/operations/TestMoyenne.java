package fr.diginamic.operations;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne a = new CalculMoyenne(9);
		a.ajout(23);
		System.out.println(a);
		System.out.println(a.calcul());

		CalculMoyenne b = new CalculMoyenne(-2);
		System.out.println(b);

	}

}
