package com.codebychistian.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import com.codebychristian.models.Pessoa;

public class MainSet {

	public static void main(String[] args) {
		//  HashSet tem ordem abrirtária, não sequindo ordem de inserção
		Set<Pessoa> set = new HashSet<Pessoa>();
		set.add(new Pessoa(1, "Primeiro"));
		set.add(new Pessoa(2, "Segundo"));
		set.add(null);
		//	iterador
		for (Pessoa p : set) {
			System.out.println(p);
		}
		System.out.println(set);
		
		System.out.println("----------------------");
		// LinkedHashSet mantém a ordem de exerção
		Set<Pessoa> link = new LinkedHashSet<Pessoa>();
		link.add(new Pessoa(4, "Quarto"));
		link.add(new Pessoa(5, "Quinto"));
		link.add(new Pessoa(6, "Sexto"));
		link.add(null);
		// iterator
		for (Pessoa p : link ) {
			System.out.println(p);
		}
		System.out.println(link); 
		
		System.out.println("------------------------------");
		// Treeset: mesmo sendo adicionado na ordem diferente, ele organiza e colocar na ordem
		// Mais custoso, obrigado usar método Comparable
		
		// usar lambda, para implementar Comparator, substituindo o Comparable
		// O lambda abaixo compara pela ordem alfabética
		Set<Pessoa> tree = new TreeSet<Pessoa>( (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});
		
		//tree.add(null);  --- não aceita null
		tree.add( new Pessoa (8, "Oitavo"));
		tree.add(new Pessoa(7, "Sétimo"));
		tree.add(new Pessoa(10, "Décimo"));
		// iterator
		for (Pessoa p : tree) {
			System.out.println(p);
		}
		System.out.println(tree);
		System.out.println("----------------------");
		// O maior custo computacional
		System.out.println("NavigatorSet");
		NavigableSet<Pessoa> navigator = new TreeSet<Pessoa>();
		navigator.add(new Pessoa(11, "onze"));
		navigator.add(new Pessoa(12, "doze"));
		navigator.add(new Pessoa(13, "treze"));
		// método da Interface NavigableSet: lower
		Pessoa teste = navigator.lower(new Pessoa(12, "doze"));
		System.out.println(teste);

	}

}
