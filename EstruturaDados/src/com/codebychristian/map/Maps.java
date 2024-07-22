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
	
	// verificar chave, varrendo a categoria e se a chave está nela
	public boolean contemChave(K chave) {
		int numeroEspalhamento = this.gerarHashEspalhamento(chave);
		ListaLigada<Associativa<K, V>> categoria = this.elemento.recuperar(numeroEspalhamento);
		for (int i = 0; i < categoria.tamanho(); i++) {
			Associativa<K, V> associacao = categoria.recuperar(i);
			if (associacao.getChave().equals(chave)) {
				return true;
			}
		}
		return false;
	}
	
	// revomer usando chave
	public void remover(K chave) {
		int numeroEspalhamento = this.gerarHashEspalhamento(chave);
		ListaLigada<Associativa<K, V>> categoria = this.elemento.recuperar(numeroEspalhamento);
		for (int i =0; i < categoria.tamanho(); i++) {
			Associativa<K, V> associativa = categoria.recuperar(i);
			if(associativa.getChave().equals(chave)) {
				categoria.remover(associativa);
				return;         // para interroper o laço
			}
		}
	}
	
	private int gerarHashEspalhamento(K chave) {
		return Math.abs(chave.hashCode() % this.quantidadeCategoria);
	}
	
	
	
	
}
