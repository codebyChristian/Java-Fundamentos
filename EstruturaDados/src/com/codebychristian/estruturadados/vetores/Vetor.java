package com.codebychristian.estruturadados.vetores;

public class Vetor<T> {
	
	private Object[] elementos;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}
	
	public void inserirArrey(int posicao, T element) {
		this.elementos[posicao] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T recuperarArrey(int posicao) {
		return (T)this.elementos[posicao];
	}

}
         