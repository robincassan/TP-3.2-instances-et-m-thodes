package fr.diginamic.operations;

public class Operations {
	
	public static double calcul(double a, double b, char c) {
		if (c =='+') {	
			return a+b;
		}else if(c =='-') {
			return a-b;
		}else if (c =='*') {
			return a*b;
		}else if (c =='/') {
			return a/b; 
		}
		throw new RuntimeException("Le caractère passé en paramètre ne correspond pas à une des 4 opérations");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 