package com.codebychristian.estrutura.main;

import java.util.HashSet;

public class StudyHashSet {

	public static void main(String[] args) {
		// HashSet where every item is unique
		HashSet<String> cars = new HashSet<String>();
		cars.add("BMW");   // por ter dois iguais so irá aparecer 1
		cars.add("Ferrari");
		cars.add("Jeep");
		cars.add("Combe");
		cars.add("BMW");  //  por ter dois iguais so irá aparecer 1
		cars.add("SUV");
		System.out.println(cars);
		// verificar existencia
		cars.contains("Combe");
		// remove
		cars.remove("Combe");
		// for each
		for(String i : cars) {
			System.out.println(i);
		}
		// usando Integer
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(12);
		numbers.add(3);
		numbers.add(42);
		numbers.add(7);
		numbers.add(3);
		numbers.add(9);
		numbers.add(21);
		// numeros entre 1 e 10
		for(int j = 1; j <= 10; j++) {
			if(numbers.contains(j)) {
				System.out.println(j + " Contem no Hash");
			} else {
				System.out.println(j + " Não contém no Hash:");
			}
		}

	}

}
