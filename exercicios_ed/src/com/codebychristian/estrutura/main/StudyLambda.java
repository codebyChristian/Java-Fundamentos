package com.codebychristian.estrutura.main;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
	  String run(String str);
	}

public class StudyLambda {
	
	public static void main(String[] args) {
		// Lambda expressions are usually passed as parameters to a function
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(12);
		number.add(3);
		number.add(43);
		number.add(9);
		// usando lambda
		number.forEach( (n) -> { System.out.println(n); });
		System.out.println("----------");
		number.add(19);
		number.add(32);
		// usando Consumer para armazenar
		Consumer<Integer> method = (n) -> { System.out.println(n); };
		number.forEach(method);
		// Create a method which takes a lambda expression as a parameter
		StringFunction explicar  = (s) -> s + "!";
		StringFunction perguntar = (s) -> s + "?";
		printFormatted("Hello", explicar);
		printFormatted("Hello", perguntar);
		
	}

	  public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }

}
