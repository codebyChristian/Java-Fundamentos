package com.codebychristian.estrutura.main;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyIterator {

	public static void main(String[] args) {
		// An Iterator is an object that can be used to loop through collections
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		// iterator
		Iterator<String> it = names.iterator();
		// primeiro da lista
		System.out.println(it.next());
		// loop  --hasBext()-- or --next()--
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// remover numeros
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(21);
		numbers.add(43);
		numbers.add(4);
		// Iterator
		Iterator<Integer> its = numbers.iterator();
		// loop
		while(its.hasNext()) {
			Integer j = its.next();
			if(j > 10) {
				its.remove();
			}
		}
		System.out.println(numbers);
		
		// Utilizando convertendo Integer para toString
		Integer myInt = 900;
		String myStri = myInt.toString();
		System.out.println(myStri.length());

	}

}
