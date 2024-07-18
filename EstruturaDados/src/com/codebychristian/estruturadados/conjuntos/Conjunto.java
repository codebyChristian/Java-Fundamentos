package com.codebychristian.estruturadados.conjuntos;

import com.codebychristian.tabelaespanhamento.TabelaEspalhamento;

public class Conjunto<T> {
	// Estruturas que não permiti dados duplicados
	// Como alteramos para TabelaEspalhamento devemos apagar alguns métodos que são inviaveis
	private TabelaEspalhamento<T> elementos;

	public Conjunto() {
		this.elementos = new TabelaEspalhamento<T>();
	}

	public boolean insere(T elemento) {
		// Refatorando usando a tabela de espalhamento
		return this.elementos.insere(elemento);
	}

	public boolean estaVazio() {
		return this.elementos.tamanho() == 0;
	}

	public int tamanho() {
		return this.elementos.tamanho();
	}

	public boolean contem(T elemento) {
		return this.elementos.contem(elemento);
	}

	public void remove(T elemento) {
		this.elementos.remover(elemento);
	}

	/*
	 * @SuppressWarnings("unused") private boolean contemOtimizado(T elemento) { for
	 * (int i = 0; i < this.elementos.tamanho(); i++) { T el =
	 * this.elementos.recuperar(i); if (el.hashCode() == elemento.hashCode()) {
	 * return true; } } return false; }
	 */

	@Override
	public String toString() {
		return "Conjunto [elementos = " + elementos + "]";
	}

}
