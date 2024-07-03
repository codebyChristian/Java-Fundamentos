package com.codebychistian.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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

	}

}
