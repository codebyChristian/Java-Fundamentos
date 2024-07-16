package com.codebychristian.tabelaespanhamento;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;

public class TabelaEspalhamento<T> {   // tipo: T = generico
	// Uma lista ligada para criar os indexedores: 0, 1, 2....
	// 0: p1, p2, p7   --->  Cada elemento terá uma lista ligada
	// 1: p3, p5, p6   --->  Cada elemento terá uma lista ligada
	// 3: p4           --->  Cada elemento terá uma lista ligada
	
	
	// Implementando explicação acima
	private ListaLigada<ListaLigada<T>> elementos;
	private int numeroCatagorias = 16;
	
	public TabelaEspalhamento() {
		// Isso inicializa a lista ligada dos indexadors
		this.elementos = new ListaLigada<ListaLigada<T>>();
		for (int i = 0; i < this.numeroCatagorias; i++) {
			this.elementos.insere(new ListaLigada<T>());
		}
	}
	
	
	
}
