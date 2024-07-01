package com.codebychistian.collections;

import java.util.ArrayList;
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
		pessoas.remove(new Pessoa(1, "Chris"));
		System.out.println(pessoas);
		// contens
		System.out.println(pessoas.contains(new Pessoa(2, "Japinha")));
		// for é ideal para ArrayList
//		for (int i = 0; i < pessoas.size(); i++) {
//			Pessoa p = pessoas.get(i);
//			System.out.println(p);
//		}
		// Iterator: se usar LinkedList o iterator é a melhor maneira, 
//		System.out.println("Usando iterator:");
//		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
//		while (iteratorPessoa.hasNext()) {
//			Pessoa p = iteratorPessoa.next();
//			if (p.getId() == 1) {
//				// somente é possivel remover usando o proprio iterator
//				iteratorPessoa.remove();
//				// não é recomendado 
////				pessoas.remove(p);
//			}
//			System.out.println(p);
//		}
		// removeIf  -- usando expressões Lambda
//		pessoas.removeIf(p -> p.getId() == 1);
//		System.out.println(pessoas);
		// for-each  -- ele utiliza Iterator
//		System.out.println("Usando For-Each");
//		for (Pessoa p : pessoas) {
//			System.out.println(p);
//		}
		

}
}