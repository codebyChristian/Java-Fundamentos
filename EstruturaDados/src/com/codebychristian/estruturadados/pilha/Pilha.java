package com.codebychristian.estruturadados.pilha;

import com.codebychristian.estruturadados.listaligadas.ListaDuplaLigada;

public class Pilha<T> {
	private ListaDuplaLigada<T> elementos;
	
	public Pilha() {
		this.elementos = new ListaDuplaLigada<T>();
	}
	
	public boolean estaVazio() {
		return this.elementos.listaVazia();
	}
	
	public void empilhar(T elemento) {
		this.elementos.insere(elemento);
	}
	
	public T desempilhar() {
		if(estaVazio()) {
			return null;
		}
		T resultado = this.elementos.recuperar(this.elementos.tamanho() - 1);
		this.elementos.remover(this.elementos.tamanho() - 1);
		return resultado;
	}
}


