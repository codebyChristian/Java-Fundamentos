package com.codebychristian.estruturadados.conjuntos;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;

public class Conjunto<T> {
	// Estruturas que não permiti dados duplicados

	private ListaLigada<T> elementos;

	public Conjunto() {
		this.elementos = new ListaLigada<T>();
	}

	public boolean insere(T elemento) {
		// Implementar elementos não repetidos
		if (elemento != null && !this.elementos.contem(elemento)) {
			this.elementos.insere(elemento);
			return true;
		}
		return false;
	}

	public boolean insereEm(int posicao, T elemento) {
		if (elemento != null && !this.elementos.contem(elemento)) {
			this.elementos.inserirEm(posicao, elemento);
			return true;
		}
		return false;
	}

	public void recuperar(int posicao) {
		this.elementos.recuperar(posicao);
	}

	public boolean estaVazio() {
		return this.elementos.listaVazia();
	}

	public int tamanho() {
		return this.elementos.tamanho();
	}

	public boolean contem(T elemento) {
		return this.elementos.contem(elemento);
	}

	public int indeci(T elemento) {
		return this.elementos.indeci(elemento);
	}

	public void remove(int posicao) {
		this.elementos.remover(posicao);
	}

	public void remove(T elemento) {
		this.elementos.remover(elemento);
	}

	@Override
	public String toString() {
		return "Conjunto [elementos = " + elementos + "]";
	}
	

}
