package com.codebychistian.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.codebychristian.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		// List , ArrayList , Collections podem ser instanciados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "Chris"));
		pessoas.add(new Pessoa(2, "Japinha"));
		pessoas.add(new Pessoa(3, "Doquinha"));
		System.out.println("Loop com For:");
		// for é ideal para ArrayList
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa p = pessoas.get(i);
			System.out.println(p);
		}
		// Iterator: se usar LinkedList o iterator é a melhor maneira
		System.out.println("Usando iterator:");
		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
		while (iteratorPessoa.hasNext()) {
			Pessoa p = iteratorPessoa.next();
			System.out.println(p);
		}
		// for-each  -- ele utiliza Iterator
		System.out.println("Usando For-Each");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		

}
}