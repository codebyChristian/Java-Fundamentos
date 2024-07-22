package com.codebychristian.map;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;

public class Maps<K, V> {

	private ListaLigada<ListaLigada<Associativa<K, V>>>  elemento;
	private int quantidadeCategoria = 16;
	
	// inicializar construtor
	Maps() {
		this.elemento = new ListaLigada<ListaLigada<Associativa<K,V>>>();
		for (int i = 0; i < quantidadeCategoria; i++) {
			this.elemento.insere(new ListaLigada<Associativa<K,V>>());
		}
	}
	
	private int gerarHashEspalhamento(K chave) {
		return Math.abs(chave.hashCode() % this.quantidadeCategoria);
	}
	
	
}
