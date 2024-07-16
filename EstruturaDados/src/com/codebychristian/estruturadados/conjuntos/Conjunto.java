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
		if (elemento != null && !contemOtimizado(elemento)) {
			this.elementos.insere(elemento);
			return true;
		}
		return false;
	}

	public boolean insereEm(int posicao, T elemento) {
		if (elemento != null && !contemOtimizado(elemento)) {   // contemOtimizado(elemento) - alternativa para this.elemento
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

	@SuppressWarnings("unused")
	private boolean contemOtimizado(T elemento) {
		for (int i = 0; i < this.elementos.tamanho(); i++) {
			T el = this.elementos.recuperar(i);
			if (el.hashCode() == elemento.hashCode()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conjunto [elementos = " + elementos + "]";
	}

}
