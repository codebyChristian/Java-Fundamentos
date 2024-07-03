package com.codebychistian.collections;

import java.util.HashSet;
import java.util.Set;

import com.codebychristian.models.Pessoa;

public class MainSet {

	public static void main(String[] args) {
		// 
		Set<Pessoa> set = new HashSet<Pessoa>();
		set.add(new Pessoa(1, "Primeiro"));
		set.add(new Pessoa(2, "Segundo"));
		System.out.println(set);
		

	}

}
