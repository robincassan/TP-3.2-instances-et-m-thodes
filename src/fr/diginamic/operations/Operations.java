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
		throw new RuntimeException("Le caract�re pass� en param�tre ne correspond pas � une des 4 op�rations");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 