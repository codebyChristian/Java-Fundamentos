package com.codebychristian.estruturadados.vetores;

public class Vetor<T> {
	
	private Object[] elementos;
	private int posicao;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
		this.posicao = 0;
	}
	
	public Vetor() {
		this.elementos = new Object[3];         // 4 indices
		this.posicao = 0;
	}
	
	public void inserir(T element) {
		this.elementos[this.posicao] = element;
		posicao++;
	}
	
	public void inserirArrey(int posicao, T element) {
		if(posicao < this.elementos.length) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		this.elementos[posicao] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T recuperarArrey(int posicao) {
		return (T)this.elementos[posicao];
	}

}
         