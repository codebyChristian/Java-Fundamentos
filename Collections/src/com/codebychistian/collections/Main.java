package com.codebychistian.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.codebychristian.collections.comparadores.PessoaTamanhoNomeComparator;
import com.codebychristian.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		// List , ArrayList , Collections podem ser instanciados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(2, "DoqDohgbbquinhauinha"));
		pessoas.add(new Pessoa(1, "Japinha;;;"));
		pessoas.add(new Pessoa(3, "Rambo"));
		
//		System.out.println("Loop com For:");
//		pessoas.remove(new Pessoa(1, "Chris"));
//		System.out.println(pessoas); 
//		System.out.println(pessoas.contains(new Pessoa(2, "Japinha")));
		
		// print sem sort
		System.out.println(pessoas);
		
		// Comparator com expressão lambda
//		Collections.sort(pessoas, (Comparator<Pessoa>)(o1 ,o2) -> {;
//			if (o1.getName().length() == o2.getName().length()) {
//				return 0;
//			} else if (o1.getName().length() < o2.getName().length()) {
//				return -1;
//			} 
//			return 1;
//			
//		});
		
		// usando sort passando método da Collenctions  -- recomendado --
		pessoas.sort((o1, o2) -> {
			if (o1.getName().length() == o2.getName().length()) {
				return 0;
			} else if (o1.getName().length() < o2.getName().length()) {
				return -1;
			} 
			return 1;
		});
		
		// interface comparable: usando nome
//		Collections.sort(pessoas, new PessoaTamanhoNomeComparator());
		
		// sort 
//		Collections.sort(pessoas);
		// usando método sort
		System.out.println(pessoas);
		

		
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