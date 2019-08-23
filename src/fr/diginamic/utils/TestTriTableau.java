package fr.diginamic.utils;

import java.util.Arrays;

public class TestTriTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = { 8.6, 7, 4.6, 99, 87.567, 1, 90 };
		TriTableau.tri(array);
		System.out.println(Arrays.toString(array));
	}

}
