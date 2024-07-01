package com.codebychristian.collections.comparadores;

import java.util.Comparator;

import com.codebychristian.models.Pessoa;

public class PessoaTamanhoNomeComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		// comparando pelo tamanho do nome
		// 0: o1 == o2
		if (o1.getName().length() == o2.getName().length()) {
			return 0;
		}
		// -1: o1 < o2
		if (o1.getName().length() < o2.getName().length()) {
			return -1;
		}
		// -2: o1 > o2
		return 1;
	}

}
